package part_2;
import utils.*;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Enter matrix borders: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = IntUtils.createRandomIntMatrix(a, b);
        IntUtils.printIntMatrix(array);
    }
}
