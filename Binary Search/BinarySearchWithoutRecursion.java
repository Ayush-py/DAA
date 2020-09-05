import java.util.*;
class BinarySearch {
    static void search(int[] ar, int key, int low, int high){
        int flag=0;
        while(low<high){
        int mid=(high+low)/2;
        if(ar[mid]==key){
            System.out.println("Element found at " + (mid+1));
            flag++;
            break;
        }
       else if(ar[mid]>key)
            high = mid-1;
       else if(ar[mid]<key)
            low=mid+1;
       }
       if(flag==0){
        System.out.println("Element not found");
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= sc.nextInt();
        int[] ar = new int[n];
        System.out.print("Enter elements of sorted array: ");
        for(int i=0; i<n; i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Enter Key to be found: ");
        int key = sc.nextInt();
        sc.close();
        search(ar,key,0,ar.length-1);
    }
}