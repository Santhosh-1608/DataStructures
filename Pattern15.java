/*

    Pattern - 15
    A B C D E 
    A B C D 
    A B C 
    A B 
    A 
 */


public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 65+n;i>65;i--){
            for(int j=65;j<i;j++){
                System.out.print((char)j+" ");
            }System.out.println();
        }
    }
}
