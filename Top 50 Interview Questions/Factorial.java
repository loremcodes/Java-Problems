// Top 50 common interview programs -> 7. Factorial Program

import java.util.Scanner;

public class Factorial {
    static int factorial(int integer){
        int result = 1;

        // By defination
		if (integer == 0 || integer == 1)
            return 1;

        // for other numbers
        for (int index = 2; index <= integr; index++){
            result = result * index;
        }

		return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();

        System.out.println(factorial(5));
    }
}