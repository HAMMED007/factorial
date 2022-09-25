package NumberFactorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int theNumber = sc.nextInt();
        System.out.println("the factorial of "+ theNumber + " is " + factorial(theNumber));


    }
    public static int factorial(int number){
        int result = 1;

        for (int i = 1; i <= number ; i++) {


            result = result * i;

        }


        return result;
    }
}
