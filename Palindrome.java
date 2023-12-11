package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker pal = new PalindromeChecker();
        pal.checkPalindrome();
    }
    
}


class PalindromeChecker{
    void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check: ");
        String str = sc.next();
        String rev = "";
        int n = str.length();
        for(int i = n-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
    }
}