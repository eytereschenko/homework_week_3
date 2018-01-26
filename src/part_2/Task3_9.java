package part_2;
/*
3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
3.9*. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
 */

import utils.IntUtils;

import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        System.out.println("enter matrix size");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = IntUtils.createRandomIntMatrix(a, b);
        System.out.println("Your random matrix is:");
        IntUtils.printIntMatrix(arr);
        System.out.println("Now enter angle:");
        int angle = scanner.nextInt();
        int[][] newArr = IntUtils.moveMatrix(arr, angle);
        System.out.printf("Moved on %d degree matrix is:\n", angle);
        IntUtils.printIntMatrix(newArr);
    }
}
