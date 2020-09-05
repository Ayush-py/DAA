Analysis and Complexity:
/a)	Worst Case
For Binary Search the middle element is looked to check if it is greater than or less than the key element and accordingly, the array is divided into half. Therefore, for the worst case, i.e. when the element is not present in the array, the array will be divide into n/2^k parts.
Time Complexity: O(log n)
b)	Average Case
After 1st iteration length of array is n/2.
After 2nd iteration length of array is n/4.
After k iterations the length of the array becomes n/2^k, i.e. 1.
n/2^k = 1
n = 2^k
log2n = k log22,  taking log on both sides.
k = log n
Time Complexity: O(log n)
c)	Best Case
For Binary Search best case occurs when element is found in the middle of array in the first iteration, i.e. one operation is carried out.
Time Complexity: O(1)
Space Complexity: No extra data structure is required. The start, middle and last element needs to be maintained after every iteration which takes up constant space. Hence, space complexity is O(1).   

