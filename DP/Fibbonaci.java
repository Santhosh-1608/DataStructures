public class Fibbonaci {
    public static void main(String[] args) {
       int  curr =1 ;
       int prev = 0;
       int n = 40;
       int res = 0;
       for(int i=2;i<=n;i++){
            res = prev + curr;
            prev = curr;
            curr = res;
       }
       System.out.println(res);
    }
}
