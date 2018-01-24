package part_1;
import utils.*;
/*
2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
    Вывести найденные слова и их длину.
 */
public class Task2 {
    public static void main(String[] args) {
        String arr[] = utils.StringUtils.scanStringAndCreateStringArray();
        String max = StringUtils.findMaxLengthWordInArra(arr);
        String min = StringUtils.findMinLengthWordInArra(arr);
        System.out.printf("The longest word is: %s; its length is %d." +
                "\nThe smallest word is %s with %d chars.", max, max.length(), min, min.length());
    }
}
