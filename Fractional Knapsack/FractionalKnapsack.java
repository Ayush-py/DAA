import java.util.Scanner;

class FractionalKnapsack {
    private static int capacity;
    private static int[] w;
    private static int[] v; 
    static void setKnap(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Capacity of Knapsack:  ");
        capacity = in.nextInt();
        System.out.print("Enter number of items: ");
        int num = in.nextInt();
        System.out.println();
        w = new int[num];
        v = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter Weight of Item "+(i+1)+" :  ");
            w[i]=in.nextInt();
            System.out.print("Enter Value of Item "+(i+1)+" :  ");
            v[i]=in.nextInt();
            System.out.println();
        }
        in.close();
    }
    static void sort(){
        for(int i=0; i<w.length; i++){
            for(int j=i; j<w.length-i-1; j++){
                double p1 = (double) v[j]/w[j];
                double p2 = (double) v[j+1]/w[j+1];
                if(p1<p2){
                    int temp = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp;
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }    
        }
        System.out.println();
    }
    static void FKnap(){
    int currweight=0;
    int currval=0;
    int i=0;
    while(capacity>=0){
        if(currweight+w[i]<=capacity){
            currweight+=w[i];
            currval+=v[i];
        }
        else{
            double remaining=capacity-currweight;
            currval += v[i] * (remaining/w[i]);
            System.out.println("Added "+remaining+"/"+w[i]+" of Weight of Item.");
            System.out.println("Knapsack Full.");
            break;
        }
        i++;
        System.out.println("Current Weight of Knapsack: "+currweight+" out of "+capacity);
        System.out.println("Current Value of Knapsack: "+currval);
        System.out.println();
    }
        System.out.println("Maximum Profit of Knapsack: "+currval);
    }
    public static void main(String[] args) {
      setKnap();
      sort();
      FKnap();
    } 
        
    
}
