import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Понял так, что задача о том, чтобы проверить верно ли закрываются скобки
 * (из условия неочевидно, но слышал про такую задачу ранее)
 * Есть ощущение, что решил неоптимально. Подумаю еще и, если придумаю, пушну еще вариант решения
 */
public class Task2 {
    public static void main(String[] args) {
        String expression0 = "([][[]()])"; // true
        String expression1 = "([][]()])"; // false
        System.out.println("s0: " + isValid(expression0));
        System.out.println("s1: " + isValid(expression1));
    }

    private static boolean isValid(String expression) {
        boolean result = false;
        int ind = 1;
        List<String> list = new ArrayList<>(List.of(expression.split("")));
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");

        if (list.size() % 2 != 0 || !map.containsKey(list.get(0)) || !map.containsValue(list.get(expression.length() - 1))) {
            return false;
        }

        while (ind < list.size()) {
            if (map.containsKey(list.get(ind-1)) && map.get(list.get(ind-1)).equals(list.get(ind))) {
                list.remove(ind);
                list.remove(ind-1);
                ind = 1;
                result = true;
            } else {
                ind++;
                result = false;
            }
        }

        return result;

    }
}
