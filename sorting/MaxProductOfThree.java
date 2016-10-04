//https://codility.com/demo/results/trainingSABUQ7-23B/
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result;
        int minus1 = 0;
        int minus2 = 0;
        int large1 =Integer.MIN_VALUE;
        int large2 =Integer.MIN_VALUE;
        int large3 =Integer.MIN_VALUE;
        
        for (int i=0; i< A.length; i++){
            //find largest three numbers
            if(A[i]<large2&& A[i]>=large3){ 
                large3=A[i];
            }else if(A[i]<large1 && A[i]>=large2){                
                large3=large2;
                large2=A[i];
            }else if (A[i]>=large1){
                large3=large2;
                large2=large1;
                large1=A[i];
            } 
            //find smallest two negative numbers
            if(A[i]<0 && A[i]<=minus1){
                minus2 =minus1;
                minus1=A[i];
            }else if(A[i]<0 && A[i]>minus1 && A[i]<=minus2){
                minus2 =A[i]; 
            }
        }
               
       int result2 =large1*large2*large3;
       // when the smallest two numbers are negative
       if(minus1<0 && minus2 <0){
           int result1=minus1*minus2*large1;
           result = Math.max(result1, result2);
           
       } else {
           result =result2;            
       } 
       return result;
    }
}