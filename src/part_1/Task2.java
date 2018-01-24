package part_1;
/*
2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
    Вывести найденные слова и их длину.
 */
public class Task2 {
    public static void main(String[] args) {
        String arr[] = utils.StringUtils.scanStringAndCreateStringArray();
        String max = utils.StringUtils.findMaxLengthWordInArra(arr);
        String min = utils.StringUtils.findMinLengthWordInArra(arr);
        System.out.printf("The longest word is: %s; its length is %d." +
                "\nThe smallest word is %s with %d chars.", max, max.length(), min, min.length());
    }
}
