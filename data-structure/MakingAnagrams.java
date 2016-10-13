import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      
        int[] firstChrs=new int[26];
        int[] secondChrs=new int[26];
		
		for(int i=0;i<first.length();i++){
				firstChrs[first.charAt(i)-'a']++;
		}
        for(int i=0;i<second.length();i++){
				secondChrs[second.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0;i<26;i++){
			count=count+Math.abs(firstChrs[i]-secondChrs[i]);
		}
		return count;
    }
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String first =a;
        String second =b;
        System.out.println(numberNeeded(first, second));
    }
}