// https://codility.com/demo/results/trainingTF89MV-9SC/
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
     int len = S.length();
      Stack<Character> temp =new Stack<>();
      
      int result =1;
      for ( int i=0; i<len; i++){
         Character tempChr = S.charAt(i);
        
         if(tempChr=='('){
            temp.push('(');
         }else if(temp.size()!=0){
            temp.pop();           
        }else{
            result=0;
            break;
        }
      }
      
      if(temp.size()!=0){
            result=0;  
        }
      return result;
    }
}