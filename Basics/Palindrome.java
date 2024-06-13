package Basics;

// Given an integer x, return true if x is a palindrome, and false otherwise.


import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        if(x<0) return false;
        while(x != 0){
            int last = x % 10;
            reverse = (reverse*10) + last;
            x = x / 10;
        }
        if(temp==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(isPalindrome(num));
        obj.close();
    }
}
