// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        //int count = (N*M/gcd(N,M))/M;
        int count = N/gcd(N,M); 
        return count;
    }
    
    //get gcd, here a>=b
    public int gcd(int a, int b){
        while (b!=0){
            int temp = b; 
            b = a%b;
            a = temp;
        }
        return a;
    }
}