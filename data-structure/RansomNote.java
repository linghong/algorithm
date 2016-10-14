import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        String result = getResult(magazine, ransom);
        System.out.println(result);
    }
    
    private static String getResult(String[] m, String[] n){
        String result = "Yes";
        Map<String, Integer> magazineWords =new HashMap<>();
        for (int i=0; i<m.length; i++){
            if(magazineWords.containsKey(m[i])){
                magazineWords.put(m[i], magazineWords.get(m[i])+1);
            }else{
                magazineWords.put(m[i], 1);
            }
        }; 
        for (int i=0; i<n.length; i++){
            if(magazineWords.containsKey(n[i])&& magazineWords.get(n[i])>0 ){
                magazineWords.put(n[i], magazineWords.get(n[i])-1);
            }else{
                result = "No";
                break;
            }
        }
        return result;
    }
}
