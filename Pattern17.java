/*


    Pattern - 17
        A
      A B A       
    A B C B A     
  A B C D C B A   
A B C D E D C B A 
 */


public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
       
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            char a = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(a+" ");
                if(j<=breakPoint) a++;
                else a--;
            }
           
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
