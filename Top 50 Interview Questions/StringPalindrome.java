// Top 50 common interview programs -> 3. String Palindrome

import java.util.Scanner;

public class StringPalindrome {
    static boolean isPalindrome(String str) {
        String reversedString = "";
        int strLength = str.length();

        for (int index  = (strLength -1); index >= 0; index--){
            reversedString = reversedString + str.charAt(index);
        }

		if (str.equals(reversedString)) return true;

        return false;
    }

    public static void main(String arsg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(strPalindrome(str));
        sc.close();
    }
}
