package part_1;

import utils.StringUtils;

import java.util.Scanner;
/*
5. Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
    Результат выводить на консоль.

    Ввод:
    Как решить это задание и не сломать себе голову?

    Вывод:
    каК еиь отэ ааи и е ьтамолс ее ?уволог
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = StringUtils.invertWord(strArr[i]);
            } else {
                strArr[i] = StringUtils.deleteEvenChar(strArr[i]);
            }
        }
        str = StringUtils.createStringFromArray(strArr);
        System.out.printf("Now your array is:\n%s", str);

    }
}
