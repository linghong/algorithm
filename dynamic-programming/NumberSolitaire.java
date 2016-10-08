// https://codility.com/demo/results/training7JR8VS-W5X/:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        
        //a queue 
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int j=0; j<6; j++){
            queue.add(A[0]); 
        }
        
        int max=A[0];
        for (int i =1; i<len-1; i++){
           max=Collections.max(queue);
           int remove= queue.remove();
           queue.add(A[i]+max);            
        }
        max= Collections.max(queue);
        return max+A[len-1];
    }
}