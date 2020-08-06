import java.util.Arrays;

class Graph {

  int[][] graph;  
  int count = 0; 
  int r = 0; 
  int prevCount = 0; 
  int tempMax;
  
  Graph(int max) { 
    graph = new int[max][max];
    tempMax = max; 
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
      if (x[i] == value) {
        return f;
    }
   }
    return t;
  }


  public void bfs(int start, int[] p) {

    for (int y = 0; y < 10; y++) {

      if (count == 0) {
        p[0] = start; 
        count++;
    }
   
      if (count == prevCount || r + 1 > count ) { 
       return; 
    }

      prevCount = count; 
    

      for (int x = 0; x < 10; x++) {
        if (graph[start][x] == 1 ) {
        p[count] = x; 
        count = count + 1;
      }
  }

       start = p[r + 1];

    
  }
    printList(p, count);
    System.out.println(graph[start][3]);
}

  public void printList(int[] p, int count) {
    System.out.println(Arrays.toString(p));
    System.out.println(count);
  }

}

































