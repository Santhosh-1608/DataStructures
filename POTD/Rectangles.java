package POTD;

// Given a circular sheet of radius, r. Find the total number of rectangles with integral length 
// and width that can be cut from the sheet that can fit on the circle, one at a time.
public class Rectangles {
    static int rectanglesInCircle(int r) {
        // code here
        int count =0;
        for(int i=1;i<2*r;i++){
            for(int j=1;j<2*r;j++){
               if(i*i+j*j<=4*r*r)
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int radius  = 2;
        System.out.println(rectanglesInCircle(radius)); // 8
    }
}
