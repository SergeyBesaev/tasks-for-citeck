package Task1;

import java.util.*;

/**
 * Пояснение: первой мыслью было решить через Map, но по условию нужно получить Список вида.
 * Поэтому решил сделать List объектов
 */
public class Task1 {
    public static void main(String[] args) {
        int[] exampleArray = {1, 1, 2, 3, 4, 4, 4, 2, 6, 1, 5, 5, 4, 9};
        System.out.println(solution(exampleArray));
    }

    private static List<NumOccurrenceDTO> solution(int[] numbers) {
        List<NumOccurrenceDTO> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int j : numbers) {
            set.add(j);
        }

        for (Integer num : set) {
            int count = 0;
            for (int number : numbers) {
                if (number == num) {
                    count++;
                }
            }
            list.add(new NumOccurrenceDTO(num, count));
        }

        list.sort(Comparator.comparingInt(numOccurrenceDTO -> numOccurrenceDTO.occurrences));
        return list;
    }
}
