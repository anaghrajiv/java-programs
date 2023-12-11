package practice;

import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter two numbers a and b to swap ");
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped numbers are a: "+ a + " b: "+ b);





    }
}