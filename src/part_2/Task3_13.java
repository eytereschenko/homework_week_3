package part_2;
import utils.*;

import java.util.Scanner;

/*
 3.13** Создать метод, который будет принимать как входящий аргумент - номер числа Фибоначчи,
        и выводить на экран низкоуровневое уравнение числа Фибоначчи, которое находится под этим номером.

         Вход:               Выход:
                3        		        (1 + (0 + 1))

                6                      (((0 + 1) + (1 + (0 + 1))) + ((1 + (0 + 1)) + ((0 + 1) + (1 + (0 + 1)))))

 */
public class Task3_13 {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String res = IntUtils.showPrimitiveFibonachi(number);
        System.out.printf("fibonachi equation is \n%s", res);
    }
}
