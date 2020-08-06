import java.util.Arrays;

class Graph {

  int[][] graph;  
  int count = 0; 
  
  Graph(int max) { 
    graph = new int[max][max];
  }

//the visited array of integers 
  public void add_edge(int from, int to) {
    graph[from][to] = 1;
  }

  public void remove_edge(int from, int to) {
    graph[from][to] = 0; 
  } 

  public boolean checkList(int[] x, int value) {
    boolean t = true; 
    boolean f = false; 
    
    for (int i = 0; i < x.length; i++) {
      if (x[i] == value && value != 0) {
        return f;
    }
   }
    return t;
  }


  public void bfs(int start, int[] p) {

    int temp = start; 
    int r = 0; 

    do {
      if (count == 0) {
        p[0] = temp; 
        count++;
    }

      for (int x = 0; x < 10; x++) {
        if (graph[temp][x] == 1) {
          p[count] = x; 
          count = count + 1;
      }
  }
       r = r + 1; 
       temp = p[r];

  } while (count - 1 > r);

    printList(p);
    System.out.println("r:  " + r);
    System.out.println("temp: " + temp);
    System.out.println("count: " + count);
}









  public void printList(int[] p) {
    System.out.println(Arrays.toString(p));
    System.out.println(" ");
    System.out.println(Arrays.toString(graph[0]));
    System.out.println(Arrays.toString(graph[1]));
    System.out.println(Arrays.toString(graph[2]));
    System.out.println(Arrays.toString(graph[3]));
    System.out.println(Arrays.toString(graph[4]));
    System.out.println(Arrays.toString(graph[5]));
  }

}

































