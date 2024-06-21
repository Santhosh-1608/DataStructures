package arrays;
 // Given an array of integers A and an integer B.
// Find the total number of subarrays having bitwise XOR of all elements equals to B.

import java.util.HashMap;

public class NoOfSubarr {
     public static int solve(int[] A, int B) {
    HashMap<Integer , Integer> mp = new HashMap<>();
    int val = 0;
    int count = 0;
    mp.put(0,1);
    for(int i=0;i<A.length;i++) {
        val = val ^ A[i];
        if(mp.containsKey(val^B)){
            count+=mp.get(val^B);
        }
        mp.put(val,mp.getOrDefault(val,0)+1);
    }
    return count;
 }
 public static void main(String[] args) {
    int[] arr =  {4, 2, 2, 6, 4};
    System.out.println(solve(arr, 6)); // 4
 }
}
