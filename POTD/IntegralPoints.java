package POTD;

// Given three non-collinear points whose co-ordinates are p(p1, p2), q(q1, q2) and r(r1, r2) in the X-Y plane. Return the number of integral / lattice points strictly inside the triangle formed by these points.
// Note: - A point in the X-Y plane is said to be an integral / lattice point if both its coordinates are integral.

public class IntegralPoints {
    static long InternalCount(long p[], long q[], long r[]) {
        // code here
        long area = Math.abs(p[0] * (q[1] - r[1]) + q[0] * (r[1] - p[1]) + r[0] * (p[1] - q[1]))/2;
        long b1 = gcd(Math.abs(p[0]-q[0]), Math.abs(p[1]-q[1]));
        long b2 = gcd(Math.abs(q[0]-r[0]), Math.abs(q[1]-r[1]));
        long b3 = gcd(Math.abs(p[0]-r[0]), Math.abs(p[1]-r[1]));
        long bp = b1+b2+b3;
        return area + 1 - (bp/2);
        
    }
    
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        long[] p = {0,0};
        long[] q = {0,5};
        long[] r = {5,0};
        System.out.println(InternalCount(p, q, r)); // 6

    }
}
