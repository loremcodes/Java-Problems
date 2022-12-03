// Top 50 common interview programs -> 2. Check Prime Numbers

import java.util.Scanner;

public class CheckPrimeNumbers {
    static boolean isPrime(int integer) {
        int flag = 0;

        // By defination
        if (integer == 0 || integer == 1)
            return false;

        // Check if integer is div by other numbers
        for (int index = 2; index <= integer / 2; index++) {
            if (integer % index == 0) {
                flag++;
            }
        }

		// if flag is greater than 0 then integer isn't a prime number
        if (flag == 0) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();

        System.out.println(isPrime(integer));

        sc.close();
    }
}