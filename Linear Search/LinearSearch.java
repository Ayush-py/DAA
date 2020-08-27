import java.util.*;

class LinearSearch{
static void search(int[] ar, int key){
    int i=0;
    int flag=0;
    while(i<ar.length){
        if(ar[i]==key){
            System.out.println("Element found at " + (i+1));
            flag++;
        }
        i++;
    }
    if(flag==0){
        System.out.println("Element not found.");
    }

}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n= sc.nextInt();
    int[] ar = new int[n];
    System.out.print("Enter elements of array: ");
    for(int i=0; i<n; i++){
        ar[i]=sc.nextInt();
    }
    System.out.print("Enter Key to be found: ");
    int key = sc.nextInt();
    sc.close();
    search(ar,key);
}
}