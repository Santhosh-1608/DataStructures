package Basics;
// Given two numbers A and B. The task is to find out their LCM and GCD.
import java.util.*;
public class GCDandLCM {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long a = A;
        Long b = B;
        Long[] res = new Long[2];
        while(A>0 && B>0) {
            if(A > B){
                A = A%B;
            }
            else{
                B = B%A;
            }
            if(A==0){
                res[1] =  B;
            }
            else{
                res[1] =  A;
            }
        }
        res[0] = a*b/res[1];
        return res;
    
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Long n1 = obj.nextLong();
        Long n2 = obj.nextLong();
        Long[] res = lcmAndGcd(n1, n2);
        System.out.println(res[0]+" "+res[1]);
        obj.close();
    }
}
