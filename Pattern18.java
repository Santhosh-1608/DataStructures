/*

    Pattern - 18;
    E 
    D E 
    C D E 
    B C D E 
    A B C D E 


 */


public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 65+n;i>=65;i--){
            for(int j = i;j<=65+n;j++){
                System.out.print((char)j+" ");
            }System.out.println();
    }
      
    }
}
