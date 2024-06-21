package arrays;
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveSequence {
        public static int longestConsecutive(int[] nums) {
        int longest = 0;
       
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
        }
        for(int it:st) {
            if(!st.contains(it-1)){
                int count = 1;
                int element = it;
                while(st.contains(element+1)){
                count+=1;
                element+=1;
            }
            longest = Math.max(longest,count);
            }
            
            
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr)); // 4

    }
}
