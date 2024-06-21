package arrays;

import java.util.ArrayList;
import java.util.List;

// Given an integer numRows, return the first numRows of Pascal's triangle.
public class PascalsPattern {
        static List<Integer> getRows(int row){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int val = 1;
        for(int col=1;col<row;col++){
            val = val * (row - col);
            val = val / col;
            ans.add(val);
        }
        return ans;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(getRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int row = 5;
        System.out.println(generate(row)); // [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }
}
