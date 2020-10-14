import java.util.Arrays;
class Prims{

  static public void Prim(int G[][], int V) {

    int INF = 9999999;
    int min_cost=0;
    int no_edge; 
    boolean[] selected = new boolean[V];
    Arrays.fill(selected, false);
    no_edge = 0;
    selected[0] = true;
    System.out.println("Edge : Weight");

    while (no_edge < V - 1) {
      int min = INF;
      int x = 0; 
      int y = 0; 

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            if (!selected[j] && G[i][j] != 0) {
              if (min > G[i][j]) {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println((x+1) + " - " + (y+1) + " :  " + G[x][y]);
      selected[y] = true;
      min_cost+=G[x][y];
      no_edge++;
    }
    System.out.println("Minimum Cost: " + min_cost);
  }

  public static void main(String[] args) {
    int V = 7;

    int[][] G = { { 0, 28, 0, 0, 0, 10, 0 }, 
    { 28, 0, 16, 0, 0, 0, 14 }, 
    { 0, 16, 0, 12, 0, 0, 0 }, 
    { 0, 0, 12, 0, 22, 0, 18 }, 
    { 0, 0, 0, 22, 0, 25, 24 },
    { 10, 0, 0, 0, 25, 0, 0 },
    { 0, 14, 0, 18, 24, 0, 0}  };

    Prim(G, V);
  }
}