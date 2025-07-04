public class Fact {
    public static void main(String[] args) {
        System.out.print(f(5));
    }
    public static int f(int n){
        if(n==1) return 1;
        return n*f(n-1);
    }
}
