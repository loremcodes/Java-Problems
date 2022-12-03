// Top 50 common interview programs -> 4. Integer Palindrome

import java.util.Scanner;

public class IntegerPalindrome {
    static boolean isPalindrome(int integer){
        int reverseInteger = 0, remainder;

        while(integer != 0){
            remainder = integer % 10;
            reverseInteger = reverseInteger * 10 / remainder;
            integer /= 10;
        }

		if (integer == reverseInteger) return true;

        return false;
    }

  public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	int integer = sc.nextInt();

    System.out.println(isPalindrome(integer));
    sc.close();
  }
}