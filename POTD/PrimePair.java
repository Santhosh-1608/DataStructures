package POTD;

import java.util.ArrayList;

public class PrimePair {
    public static boolean isPrime(boolean[] arr , int num){
      arr[0] = arr[1] = false;
      for(int i=2;i*i<=num;i++){
          if(arr[i]==true) {
              for(int j=i*i;j<=num;j+=i){
                  arr[j] = false;
              }
          }
         
      }
       return false;
        
    }
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer>res = new ArrayList<>();
        boolean isPrime[] = new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i] = true;
        }
        isPrime(isPrime,n);
        int y =0;
        for(int i=2;i<=n/2;i++){
            y = n-i;
            if(isPrime[i] && isPrime[y]){
                res.add(i);
                res.add(y);
                break;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
            res.add(-1);
            return res;
        }
       
        return res;
        
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(getPrimes(num)); // [7,3]
    }
}
