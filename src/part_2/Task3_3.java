package part_2;
import utils.*;

import java.util.Scanner;

/*
3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class Task3_3 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");
        str = scanner.nextLine();
        String newStr = StringUtils.deleteAllSpeces(str);
        boolean res;
        res = StringUtils.checkPalindrom(newStr);
        System.out.println(res);
    }
}
