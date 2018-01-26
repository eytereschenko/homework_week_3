package part_2;

import utils.*;

import java.util.Scanner;

/*
3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
3.4. Создать массив, который будет состоять из диагонали матрици

		1 3 5
		4 5 7  -  1 5 6
		4 5 6
 */
public class Task3_4 {
    public static void main(String[] args) {
        System.out.println("Enter Matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = IntUtils.createRandomIntMatrix(a, b);
        System.out.println("original matrix:");
        IntUtils.printIntMatrix(arr);
        int[] res = IntUtils.createDiagonalMatrix(arr);
        System.out.println("diagonal matrix:");
        IntUtils.printIntMatrix(res);

    }
}
