package Basics;
import java.util.*;
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

public class ReverseNum {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();
    Solution2 ab = new Solution2();
    System.out.println(ab.reverse(num));
    obj.close();
}
    
}

class Solution2 {
    public int reverse(int x) {
        long reversednum = 0;
        
        while(x!=0){
            int last = x%10;
            reversednum = (reversednum*10) + last;
            x= x/10;
           
            if(reversednum >Integer.MAX_VALUE || reversednum<Integer.MIN_VALUE ) 
            return 0;
        }
        return (int)reversednum;
    }
}