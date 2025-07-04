public class Palindrome {
    public static void main(String[] args) {
        String str = "santhosh";
        System.out.print(check(str, 0, str.length()-1));
    }
    public static boolean check(String s,int l,int r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            if(l<=r)
            check(s,l+1,r-1);
            return true;
    }
}
