package part_2;
import utils.*;

import java.util.Scanner;

/*
3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean[][] arr = BooleanUtils.createBooleanArray(a,b);
        BooleanUtils.printBooleanArray(arr);
        BooleanUtils.trueDiagonal(arr);
        System.out.println("Now your matrix is:");
        BooleanUtils.printBooleanArray(arr);
    }
}
