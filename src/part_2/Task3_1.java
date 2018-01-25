package part_2;
import utils.*;
/*

3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.

	3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Enter matrix borders: ");
        int replace = 8;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = IntUtils.createRandomIntMatrix(a, b);
        IntUtils.printIntMatrix(array);
        System.out.println("Now your replaced matrix is:");
        int[][] res = IntUtils.replaceSomeValues(array, replace);
        IntUtils.printIntMatrix(res);
    }
}
