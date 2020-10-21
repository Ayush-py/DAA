Algorithm:

currweight = 0
currvalue = 0
i = 0
while (capacity >= 0)
	if (currweight + weight[i] <= capacity)
		currweight += weight[i]
		currval += value[i]
		
  else	//Knapsack Full
	  remaining = capacity – currweight
	  currval += value[i]*(remaining/weight[i])
 	break
i += 1

print(currval) //Maximum Profit

##Time Complexity:
If the array of ratios is sorted in a descending manner, the time taken to run the while loop will give a time complexity of O(n).
In case the array is not sorted in descending order of profit to weight ratios, we need to implement a sorting algorithm. Based on the complexity of this sorting algorithm the total time complexity of the algorithm is calculated.
For Example:
Using Quick Sort will set a time complexity of O(nlogn). Thus, the whole problem can be solved in O(nlogn). 
