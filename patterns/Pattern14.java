/*
    Pattern -14
    A 
    A B 
    A B C 
    A B C D 
    A B C D E 
 */


public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 65;i<65+n;i++ ){
            for(int j = 65;j<=i;j++){
                System.out.print((char)j + " ");
            }System.out.println();
        }
    }
}
