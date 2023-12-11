package practice;

import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        CalcPeri calc = new CalcPeri();
        int result = calc.calcp(length, breadth);
        System.out.println("Perimeter of rectangle: "+ result);


    }
}

class CalcPeri{
    int calcp(int length, int breadth){
        int perimeter;
        perimeter = 2*(length + breadth);
        
        return perimeter;

    }
     
}
