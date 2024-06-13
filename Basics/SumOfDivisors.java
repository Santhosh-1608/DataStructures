package Basics;

// Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.
import java.util.Scanner;

public class SumOfDivisors {
    
        static long sumOfDivisors(int N){
            // code here
            long sum = 0;
            for(long i = 1;i<=N;i++){
                sum+=(N/i)*i;
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(sumOfDivisors(num));
        obj.close();
    }
}
