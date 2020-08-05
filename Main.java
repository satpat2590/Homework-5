import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    Stack s = new Stack(10); 
    s.push(9);
    s.push(8);
    System.out.println(Arrays.toString(s.list));

    Queue q = new Queue(10);
    q.push(0);
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);
    q.push(7);
    q.push(8);
    q.push(9);

    int[][] newG = new int[10][10];

    Graph g = new Graph(newG);

    



    
 



 
  }
}