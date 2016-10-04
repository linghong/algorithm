//https://codility.com/demo/results/trainingVHQA6A-E94/
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        Set<Integer> intSet= new HashSet<>();
        for (int i=0; i<len; i++){
            if(!intSet.contains(A[i])){
                intSet.add(A[i]);
            }
        }
        return intSet.size();
    }
}