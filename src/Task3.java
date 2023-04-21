/**
 * Пояснение:
 * в main() вписал несколько примеров
 */
public class Task3 {
    public static void main(String[] args) {
        int a = solution(89605405);
        int b = solution(574);
        int c = solution(105);
        int d = solution(110);

        System.out.println(a); // 89605415
        System.out.println(b); // 574
        System.out.println(c); // 115
        System.out.println(d); // 111
    }

    private static int solution(int number) {
        StringBuilder str = new StringBuilder(String.valueOf(number));
        int index = str.lastIndexOf("0");
        if (index == -1) {
            return number;
        } else {
            str.setCharAt(index, '1');
            return Integer.parseInt(str.toString());
        }
    }
}
