package arrays;


// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
import java.util.Arrays;

public class RotateMatrix {
    static void reverse(int[] arr, int start ,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        //int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<row;i++){
            reverse(matrix[i],0,matrix[i].length-1);
        }
    }
    public static void main(String[] args) {
    int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
    rotate(matrix);
    System.out.println(Arrays.toString(matrix[0])); // [7,4,1]
    System.out.println(Arrays.toString(matrix[1])); // [8,5,2]
    System.out.println(Arrays.toString(matrix[2])); // [9,6,3]
    }
}
