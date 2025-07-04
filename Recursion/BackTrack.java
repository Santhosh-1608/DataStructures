public class BackTrack {
    public static void main(String[] args) {
        printNum(1,10);
    }
    public static void printNum(int i,int n){
        if(i>n) return;
       printNum(i+1,n);
       System.out.print(i+" ");
       
    }
}
