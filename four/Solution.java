package four;

/*
4. поместить строку в центр другой строки чтобы получилось другая строка
        пример
        s1 = "abceee";
        s2 = "vvvbbb";

        resulted sting is "abcvvvbbbeee";
*/

public class Solution {
    public static void main(String[] args) {
        String s1 = "abceee";
        String s2 = "vvvbbb";
        solution(s1, s2);

    }

    static void solution(String s1, String s2) {
        String result;
        result = s1.substring(0, s1.length() / 2) + s2 + s1.substring(s1.length() / 2, s1.length());
        System.out.println(result);
    }
}
