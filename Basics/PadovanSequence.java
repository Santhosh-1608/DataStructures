package Basics;
import java.util.*;

// Given a number n, find the nth number in the Padovan Sequence.

// A Padovan Sequence is a sequence which is represented by the following recurrence relation
// P(n) = P(n-2) + P(n-3)
// P(0) = P(1) = P(2) = 1

public class PadovanSequence {
    public static int padovanSequence(int n)
    {
        //code here.

        if(n==0 || n==1 || n==2) return 1;
        int[] p = new int[n+1];
        p[0] = p[1] = p[2] = 1;
        for(int i = 3; i<=n; i++) {
            p[i] = (p[i-2] + p[i-3]) % 1000000007;
        }
        return p[n];
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(padovanSequence(num));
        obj.close();

        
    }
}
