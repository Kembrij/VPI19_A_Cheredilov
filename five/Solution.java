package five;

/*
5. Есть строка в camelCase надо вывести все подстроки начинающиеся на загланую букву
        пример:
        ILoveJavaProgramming
        result:
        I
        Love
        Java
        Programming
*/

import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        String s1 = "ILoveJavaProgramming";
        solution(s1);

    }

    static void solution(String s1) {
        boolean flag = false;
        int ii = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                System.out.print(s1.charAt(i));
                while ((Character.isLowerCase(s1.charAt(++ii)))) {
                    System.out.print(s1.charAt(ii));
                    if (ii == s1.length() - 1) {
                        break;
                    }
                }
                System.out.println();
            }


        }
    }
}
