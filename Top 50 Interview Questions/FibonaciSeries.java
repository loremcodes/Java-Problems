// Top 50 common interview programs -> 1. Fibonaci Series

import java.util.Scanner;

public class FibonaciSeries {
    static void Series(int integer) {
        // for frist two numbers
        int num1 = 0, num2 = 1, num3;
        System.out.print(num1 + " " + num2);

        for (int index = 2; index < integer; ++index) {
            num3 = num2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String arsg[]) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();

        Series(integer);

        sc.close();
    }
}