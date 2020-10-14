class Kruskals  
{ 
static int V = 7; 
static int[] parent = new int[V]; 
static int INF = Integer.MAX_VALUE; 
  
static int find(int i) 
{ 
    while (parent[i] != i) 
        i = parent[i]; 
    return i; 
} 
  
static void union1(int i, int j) 
{ 
    int a = find(i); 
    int b = find(j); 
    parent[a] = b; 
} 
  
static void kruskalMST(int cost[][]) 
{ 
    int mincost = 0; 
    for (int i = 0; i < V; i++) 
        parent[i] = i; 
    int edge_count = 0; 
    while (edge_count < V - 1) 
    { 
        int min = INF, a = -1, b = -1; 
        for (int i = 0; i < V; i++) 
        { 
            for (int j = 0; j < V; j++)  
            { 
                if (find(i) != find(j) && cost[i][j]!=0)  
                { 
                    if(cost[i][j] < min){
                        min = cost[i][j]; 
                        a = i; 
                        b = j; 
                } 
            }
            } 
        } 
  
        union1(a, b); 
        System.out.printf("Edge %d:(%d, %d) cost:%d \n", 
            edge_count++, (a+1), (b+1), min); 
        mincost += min; 
    } 
    System.out.printf("\n Minimum cost= %d \n", mincost); 
} 
public static void main(String[] args)  
{ 
    int cost[][] = { 
        { 0, 28, 0, 0, 0, 10, 0 }, 
    { 28, 0, 16, 0, 0, 0, 14 }, 
    { 0, 16, 0, 12, 0, 0, 0 }, 
    { 0, 0, 12, 0, 22, 0, 18 }, 
    { 0, 0, 0, 22, 0, 25, 24 },
    { 10, 0, 0, 0, 25, 0, 0 },
    { 0, 14, 0, 18, 24, 0, 0} 
    }; 
  
    kruskalMST(cost); 
    } 
} 
  