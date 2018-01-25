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
        if (arr == null) System.out.println("Enter correct data");
        int l = arr.length;
        if (l == 0) {
            System.out.println("Enter valid sentence");
        } else {
            for (int i = 0; i < l; i++) {
                if (arr[i].length()>1) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                }else {
                    arr[i] = arr[i].substring(0, 1);
                }
            }
        }
    }

    public static String createStringFromArray(String[] arr) {
        if (arr == null) System.out.println("Enter correct data");
        String res = "";
        int l = arr.length;
        if (l == 0) return "";
        for (int i = 0; i < l; i++) {
            res = res + arr[i] + " ";
        }
        return res;
    }

    public static void replaceWordInString(String[] arr, String word, String newWord) {
        int l = arr.length;
        if(arr == null || word == null) System.out.println("Try to enter correct data");
        for (int i = 0; i < l; i++) {
            if (word.equals(arr[i])) {
                arr[i] = newWord;
            }
        }
    }

    public static String deleteEvenChar(String s) {
        if (s == null) return s;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                res = res + String.valueOf(s.charAt(i));
            }
        }
        s = res;
        return s;
    }

    public static String invertWord(String s) {
        if (s == null) return s;
        String res = "";
        char[] arr = s.toCharArray();
        char buffer;
        for (int i = 0; i < arr.length / 2; i++) {
            buffer = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buffer;
        }
        for (int i = 0; i < arr.length; i++) {
            res = res + String.valueOf(arr[i]);
        }
        return res;
    }

}