package Basics;


// Given a number N. Count the number of digits in N which evenly divide N.
// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(Solution.evenlyDivides(num));
        obj.close();
    }
}

class Solution{
    static int evenlyDivides(int N){
        int count = 0;
        int num = N;
        while(N > 0){
            int last = N%10;
            N = N / 10;
            if(last != 0 && num%last==0)
            count++;
        }
        return count;
    }
}