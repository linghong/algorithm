#Sort
## I. Solve the problem without using sorting Method
-Find largest or smallest number:

###MaxProductOfThree-codility
#### Code: MaxProductOfThree.java 
#### Key Point:
##### 1.When the smallest two numbers are negative
  1).get the result of the two negative numbers and the largest number
  2).get the result for the product of the largest three number   
##### 2.When no more than one smallest number is negative
   get the product of the largest three number

-Use a HashSet or a HashMap to rearrange the data
###Dinstinct-codility
#### Code: Distinct.java 
#### Key Point: 
	rearrange the data in a HashSet

##Merge sort
#### Code: Triangle.java 
#### Key Point:
##### 1.sort the array first
##### 2.when a<b<c, ==> b+c>a, a+c>b, hence, we only need to look for a+b>c
##### 3.if A[i]+A[i+1>A[i+2] does not exist, the answer is negative.