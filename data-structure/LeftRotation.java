import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        String result = rotateDigits(a, k);
        System.out.print(result);
    }
    
    public static String rotateDigits(int[]A, int k){
		int n= A.length;
		int[] newA = new int[n];
		for(int i=0; i<n; i++){
			if(i<n-k){
				newA[i]=A[k+i];
			}else{
				newA[i]=A[i-(n-k)];
			}
		}

        String result="";
		for(int i=0; i<n; i++){
            result+= newA[i]+" ";			
		}
		return result;
	}
}

