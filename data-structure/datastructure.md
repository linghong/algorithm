#Data Structure

##I Array
### [LeftRotation-hackerrank](https://www.hackerrank.com/challenges/ctci-array-left-rotation)
#### Code: [LeftRotation.java](/data-structure/Leftrotation.java)

##II. Stack
###Nesting-codility
#### Code: [Nesting.java](/data-structure/Nesting.java) 
#### Key Point:
##### push all the '(' onto a stack, pop it up when a ')' is found.

###Fish-codility
#### Code [Fish.java](/data-structure/Fish.java)
#### Key Point:
##### 1.Loop through from upstream to downstream while pushing fishes swimming downstream onto a stack.
##### 2.when meeting a fish swimming upstream, compare their size and decide who will be eaten.
##### 3.if the stack is empty, that means fish swimming upstream win, increase count;

##III. Linked List
### Delete node -Leetcode
#### Code: [DeleteNode.java](/data-structure/Deletenode.java)
#### Key Point:
##### replace the current node value to the next node value, point the current node's next node to next.next, then remove the next node