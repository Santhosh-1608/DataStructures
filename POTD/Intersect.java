package POTD;

 // Given the coordinates of the endpoints(p1,q1, and p2,q2) of the two line segments. Check if they intersect or not. If the Line segments intersect return true otherwise return false.
public class Intersect {
    static int orientation(int a[] , int b[] , int c[]) {
        long val = (long)(b[1] - a[1])*(c[0]-b[0])-(long)(b[0]-a[0])*(c[1]-b[1]);
        if(val==0) return 0;
        return (val>0)?1:2;
     }
     static boolean onSegment(int a[] , int b[] , int c[]) {
         if(b[0]<=Math.max(a[0],c[0]) && b[0]>=Math.min(a[0],c[0])&&
         b[1]<=Math.max(a[1],c[1])&&b[1]>=Math.min(a[1],c[1])) 
         return true;
     return false;
     }
     static String doIntersect(int p1[], int q1[], int p2[], int q2[]) {
         // code here
         int o1 = orientation(p1,q1,p2);
         int o2 = orientation(p1,q1,q2);
         int o3 = orientation(p2,q2,p1);
         int o4 = orientation(p2,q2,q1);
         if(o1!=o2&&o3!=o4) return "true";
     
     if(o1==0&&onSegment(p1, p2, q1)) return "true"; 
   
     if(o2==0&&onSegment(p1, q2, q1)) return "true"; 
   
     if(o3==0&&onSegment(p2, p1, q2)) return "true"; 
   
     if(o4==0&&onSegment(p2, q1, q2)) return "true"; 
   
     return "false"; 
         
     }
     public static void main(String[] args) {
        int p1[] = {1,1};
        int p2[] = {10,1};
        int p3[] = {1,2};
        int p4[] = {10,2};
        System.out.println(doIntersect(p1, p3, p2, p4)); // false
     }
}
