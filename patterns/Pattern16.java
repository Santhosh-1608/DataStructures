/*

    Pattern - 16
    A 
    B B
    C C C
    D D D D
    E E E E E


 */



public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 65;i<65+n;i++){
            for(int j = 65;j<=i;j++){
                System.out.print((char)i+ " ");
            }System.out.println();
        }
    }
}
