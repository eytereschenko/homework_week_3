package utils;

public class IntUtils {

    public static int[][] createRandomIntMatrix(int a, int b) {
        if(a<=0||b<=0) {
            System.out.println("enter valid borders!");
            return null;
        }
        int[][] res = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                res[i][j] = (int) (Math.random()*200 - 100);
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
                System.out.printf("%5d",array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] replaceSomeValues(int[][] array, int replace) {
        if (array == null) return null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%5==0){
                    array[i][j]=replace;
                }
            }
        }
        return array;
    }
}
