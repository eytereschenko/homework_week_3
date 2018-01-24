package part_1;
import utils.*;
/*
4. Верхний регистр.

   		Напишите программу, которая позволяет пользователю ввести в консоли строку,
   		переводит первый символ слов в верхний регистр и результат выводит в консоль

   		Вход:
   		иван васильевич

   		Выход:
   		Иван Васильевич
 */

public class Task4 {
    public static void main(String[] args) {
        String[] arr = StringUtils.scanStringAndCreateStringArray();
        StringUtils.replaceAllFirstCharsToUpper(arr);
        String result = StringUtils.createStringFromArray(arr);
        System.out.printf("Your result is:\n%s",result);
    }
}
