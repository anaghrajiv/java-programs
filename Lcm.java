package practice;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        int a, b, lcm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate the lcm: ");

        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            lcm = a;
        }else{
            lcm = b;
        }

        while (true) {
            if (lcm%a==0 && lcm%b==0){
                System.out.println("Lcm : "+ lcm);
                break;
            }
            else{
                lcm++;
            }
            
        }

    }
}
