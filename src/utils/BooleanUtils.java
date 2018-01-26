package utils;

public class BooleanUtils {
    public static boolean[][] createBooleanArray(int a, int b) {
        int c;
        boolean[][] res = new boolean[a][b];
        if (a < 0 || b < 0) {
            System.out.println("Enter valid data! ");
            return null;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                c = (int) (Math.random() * 2);
                res[i][j] = c == 1;
            }

        }
        return res;
    }

    public static void printBooleanArray(boolean[][] arr) {
        if (arr == null) {
            System.out.println("Your array is null!");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%8s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean[][] trueDiagonal(boolean[][] arr) {
        if (arr == null) return null;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = true;
        }
        return arr;


    }
}
