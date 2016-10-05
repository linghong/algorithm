//https://codility.com/demo/results/training6N6F7Z-3XW/
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result=0;
        sort(A);

        for (int i=0; i<A.length-2;i++){
            //avoid the sum is large than integer's maxium value, here we use minus instead of plus
            if(A[i]>A[i+2]-A[i+1]){
                result =1;
                break;
            } else {
                result=0;
            }
        }
        return result;
    }
    
   
    public  int[] sort (int [] array){
        int len = array.length;

        if (len >=2) {
            int middle;            
            if(len%2==0){
                middle = len/2;               
            } else{
                middle = (len+1)/2;
            }
            
            int [] leftArr = new int[middle];
            int [] rightArr = new int[len-middle];
            
            //leftArr index from (0 to middle-1; 
            for (int i= 0; i<middle; i++){
                leftArr[i]=array[i];
             }
            //rightArr 
            for (int i= 0; i< len-middle; i++){
               rightArr[i]=array[middle+i];
            }
      
            sort(leftArr); 
            sort(rightArr);
            mergeArr(leftArr, rightArr, array);
        }
        return array;
     
    };
    
    private static void mergeArr(int[] leftArr, int [] rightArr, int[]mergedArr){

        int leftIndex =0;
        int rightIndex =0;
        int len = mergedArr.length;
        int k=0;
        while(leftIndex<leftArr.length&&rightIndex<rightArr.length){
           if (leftArr[leftIndex]<rightArr[rightIndex]){
               mergedArr[k]=leftArr[leftIndex];
               leftIndex++;
           }else {
               mergedArr[k]=rightArr[rightIndex];
               rightIndex++;
           }
           k++;
        }

       while(leftIndex<leftArr.length){
            mergedArr[k]=leftArr[leftIndex];
            leftIndex++;
            k++;
        }
 
        while (rightIndex<len-leftArr.length){
            mergedArr[k]=rightArr[rightIndex];
            rightIndex++;
            k++;
       }           
    }
}