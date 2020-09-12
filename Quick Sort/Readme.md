Quick Sort Pseudocode:

    function partitionFunc(left, right, pivot)

       leftPointer = left

       rightPointer = right - 1

       while True do

          while A[++leftPointer] < pivot do

             //do-nothing            

          end while

          while rightPointer > 0 && A[--rightPointer] > pivot do

             //do-nothing         

          end while

          if leftPointer >= rightPointer

             break

          else                

             swap leftPointer,rightPointer

          end if

       end while 	

       swap leftPointer,right

       return leftPointer	

    end function

    procedure quicksort (left, right)

       if right-left <= 0

          return

       else     

          pivot = A[right]

          partition = partitionFunc (left, right, pivot)

          quickSort(left,partition-1)

          quickSort(partition+1,right)    

       end if		

    end procedure
    
Worst Case: The worst case in quick sort occurs when the pivot selected by partition, is the largest or the smallest element in the array. 
Thus, worst case would occur if we enter an array that is already sorted in an increasing or decreasing order.

The time complexity is of order O(n2).
 
Best case: The best case occurs when partition selects the middle element to be the pivot.

The time complexity is of order O(nlogn).
 
Average Case: The time complexity is of order O(nlogn).

