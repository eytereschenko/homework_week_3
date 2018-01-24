package utils;

import java.util.Scanner;

public class StringUtils {

    public static String[] scanStringAndCreateStringArray() {
        System.out.println("Enter your sentence ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str[] = s.split(" ");
        return str;
    }

    public static String findMaxLengthWordInArra(String[] arr) {
        int l = arr.length;
        if (l == 0) return "";
        String max = arr[0];
        for (int i = 1; l != 0 && i < l; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String findMinLengthWordInArra(String[] arr) {
        int l = arr.length;
        if (l == 0) return "";
        String min = arr[0];
        for (int i = 1; l != 0 && i < l; i++) {
            if (arr[i].length() < min.length()) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void replaceAllFirstCharsToUpper(String[] arr) {
        int l = arr.length;
        if (l == 0) {
            System.out.println("Enter valid sentence");
        } else {
            for (int i = 0; i < l; i++) {
                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            }
        }
    }

    public static String createStringFromArray(String[] arr) {
        String res = "";
        int l = arr.length;
        if(l==0) return "";
        for (int i = 0; i < l; i++) {
            res = res + arr[i] + " ";
        }
        return res;
    }
}