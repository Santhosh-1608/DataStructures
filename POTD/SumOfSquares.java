package POTD;
// Given a non-negative integer c, decide whether there're two integers a and b such that a*a + b*b = c
public class SumOfSquares {
    public static  boolean judgeSquareSum(int c) {
        long start =0;
        long end = (long)(Math.sqrt(c));
        while(start<=end){
         long target = start*start + end*end;
         if(target > c) end = end - 1;
         else if(target<c) start = start + 1;
         else return true;
        }
        return false;
     }
     public static void main(String[] args) {
        System.out.println(judgeSquareSum(5)); // true 1*1 + 2*2 = 5
     }
}
