//https://codility.com/demo/results/trainingP496RZ-X52/
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution14 {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count=0;
        Stack<Integer> downstream = new Stack<Integer>();
        
        //from upstream to downstream
        for(int i=0; i< A.length; i++){
            if(B[i]==1){
                downstream.push(A[i]);
            }else{ 
                while(downstream.size()!=0 && A[i]>downstream.peek()){
                     downstream.pop();                        
                }
                if(downstream.size()==0){
                    count++;
                }
            }
        }
        return count+downstream.size();
    }
}