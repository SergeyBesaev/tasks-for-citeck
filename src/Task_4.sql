SELECT t1.num + 1 AS expected_num, MIN(t2.num - t1.num - 1) AS expected_count
FROM НАЗВАНИЕ_ТАБЛИЦЫ t1
         JOIN НАЗВАНИЕ_ТАБЛИЦЫ t2 on t1.num < t2.num
WHERE t1.num + 1 NOT IN (SELECT num FROM НАЗВАНИЕ_ТАБЛИЦЫ)
GROUP BY t1.num
ORDER BY expected_num
