import java.util.Arrays;
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    Graph g = new Graph(10);

    g.add_edge(3, 4);
    g.add_edge(0, 3);
    g.add_edge(0, 2);
    g.add_edge(2, 5);
    g.add_edge(2, 4);

    int[] p = new int[10];

    g.bfs(0, p);

    


    
 



 
  }
}