package practice;

import java.util.Scanner;

public class FreqChar {
    public static void main(String[] args) {
        FreqCharChecker check = new FreqCharChecker();
        int result = check.freqchecker();
        System.out.println("The letter occurs " + result + " times");
    }
    
}

class FreqCharChecker{
    int freqchecker(){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check frequency of character: ");
        String str = sc.next();
        System.out.println("Enter the character to check the frequency: ");
        String let = sc.next();
        int n = str.length();
        for(int i=0; i<=n-1; i++){
            if(str.charAt(i)==let.charAt(0)){
                count++;     
            }
        }
        return count;
    }
}
