package part_1;

import utils.*;

/*
3. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»(не используя метод replaceAll()).
 */
public class Task3 {
    public static void main(String[] args) {
        String[] arr = StringUtils.scanStringAndCreateStringArray();
        String word = "бяка";
        String newWord = "вырезано цензурой";
        StringUtils.replaceWordInString(arr, word, newWord);
        String res = StringUtils.createStringFromArray(arr);
        System.out.printf("Censored array is:\n%s", res);
    }
}
