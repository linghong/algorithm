#Dynamic Programming

##I. Using queue
###NumberSolitaire-codility
#### Code: [NumberSolitaire.java](/data-structure/NumberSolitaire.java) 
#### Key Point:
##### 1.The die has number 1-6, hence, the most distant position for a person to make one jump is 6 squares away, thus the queue window only has 6 items, representing the 6 positions the player can jump.
##### 2. Each of the 6 items in the queue window records the possible largest sum that position can accumulate. 
##### 3. When looping through the position from A[i] to A[i+1], the queue window also moves one position right, thus removes one queue from the left, adds one new queue to the right. 
##### 4.To make the newly added queue being the possible largest sum for that position, the player should jump from the position that has largest sum in the original queue window. 
