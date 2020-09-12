Merge Sort Pseudocode: 

procedure mergesort (var a as array)

   if (n == 1) return a

   var l1 as array = a[0] ... a[n/2]

   var l2 as array = a[n/2+1] ... a[n]

   l1 = mergesort (l1 )

   l2 = mergesort(l2 )

   return merge( l1, l2 )

end procedure

procedure merge( var a as array, var b as array )

   var c as array

   while ( a and b have elements )

      if ( a[0] > b[0] )

         add b[0] to the end of c

         remove b[0] from b

      else

         add a[0] to the end of c

         remove a[0] from a

      end if

   end while
   
   while ( a has elements )

      add a[0] to the end of c

      remove a[0] from a

   end while
   
   while ( b has elements )

      add b[0] to the end of c

      remove b[0] from b

   end while

      return c

end procedure

Analysis:

Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.

T(n) = 2T(n/2) + O(n)

It falls in case II of Master Method and solution of the recurrence is Θ(nlog2n).

Time complexity of Merge Sort is Θ(nlog2n) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
