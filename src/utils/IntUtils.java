package utils;

public class IntUtils {

    public static int[][] createRandomIntMatrix(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("enter valid borders!");
            return null;
        }
        int[][] res = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                res[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        return res;
    }

    public static void printIntMatrix(int[][] array) {
        if (array == null) {
            System.out.println("Enter valid data");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] replaceSomeValues(int[][] array, int replace) {
        if (array == null) return null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 5 == 0) {
                    array[i][j] = replace;
                }
            }
        }
        return array;
    }

    public static void printIntMatrix(int[] array) {
        if (array == null) {
            System.out.println("Enter valid data");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i]);
        }
    }

    public static int[] createDiagonalMatrix(int[][] arr) {
        if (arr == null) return null;
        int min = arr.length;
        if (min > arr[0].length) min = arr[0].length;
        int[] newArray = new int[min];
        for (int i = 0; i < min; i++) {
            newArray[i] = arr[i][i];
        }
        return newArray;
    }

    public static String showPrimitiveFibonachi(int number) {
        if (number < 0) {
            System.out.println("Number should be non-negative and non null");
            return null;
        }
        String buffer;
        String previous = "1";
        String current = "(0 + 1)";
        String res = "(1 + (0 + 1))";
        if (number == 0) return previous;
        if (number == 1) return previous;
        if (number == 2) return current;
        for (int i = 1; i < number - 2; i++) {
            buffer = res;
            res = "(" + current + " + " + res + ")";
            current = buffer;
        }
        return res;
    }

    public static int[][] moveMatrix(int[][] arr, int angle) {
        if (arr == null) return null;
        int count = ((angle % 360) / 90);
        int buffer;
        int[][] arrResult = new int[arr[0].length][arr.length];
        for (int k = 0; k < count; k++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arrResult[i][j] = arr[j][i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = arrResult[i][arrResult.length - 1 - j];
                }
            }
        }
        return arr;
    }

}
