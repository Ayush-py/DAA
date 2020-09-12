Merge Sort (3-way merge sort) Algorithm:

1. We take a variable p and store the starting index of our array in this. And we take another variable r and store the last index of array in it.

2. Then we find two middle values of the array using the formula - 

•	low + ((high - low) / 3); 

•	low + 2 * ((high - low) / 3) + 1; 

 and mark the middle indexes as mid1 and mid2, and break the array into three subarrays, from p to mid1, from mid1 to mid2 and from mid2+1 to r index.

3. Then we divide these 3 subarrays again, just like we divided our main array and this continues.

4. Once we have divided the main array into subarrays with single elements, then we start merging the subarrays.

In case of 3-way Merge sort we get the equation:

T(n) = 3T(n/3) + O(n)

By solving it using Master method, we get its complexity as O(n log 3n).
