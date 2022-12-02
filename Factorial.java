import java.util.Scanner;

public class Factorial {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 1;

        if (input == 0 || input == 1){
            System.out.println(1); // By defination
        } else {
            for (int index = 2; index < input; index++){
                result = result * index;
            }
            System.out.println(result);
        }

        sc.close();
    }
}