package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial :");
        int numask = sc.nextInt();

        CalcFact calc = new CalcFact();
        int result = calc.calcfact(numask);
        System.out.println("Factorial of " + numask + " is: " + result);
    }
}

class CalcFact {
    int calcfact(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
