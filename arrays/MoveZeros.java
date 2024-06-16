package arrays;
import java.util.*;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeros {
    
    
    public static void solution(int[] arr) {
        int j=-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
            j=i;
            break;
            }
        }
        if(j==-1) return;
        for(int a = j+1;a<arr.length;a++){
            if(arr[a]!=0){
                int temp = arr[a];
                arr[a] = arr[j];
                arr[j] = temp;
                j++;
            } 
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,2,0,2,7};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
