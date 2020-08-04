class Queue {
  int[] list; 
  int front = 0; 
  int back; 
  int count = 0; 
  int size; 

  Queue(int capacity) {
    list = new int[capacity]; 
    size = capacity; 
    back = -1;
  }

  public int pop() {
    if (count == 0) {
      System.out.println("System Error\n Not enough elements in list");
      return -1;
  } else { 
      front = (front + 1) % size; 
      count--; 
      return list[front];
      
  }
  }


  public void push(int item) {
    if ( count == size ) {
      System.out.println("System Error\n Overflow Error");
  } else {
      list[++back] = item; 
      count++; 
  } 
}


  public int peek() {
    if (front == -1) {
      System.out.println("System Error\n Not enough elements in list");
      return -1; 
  } else {
      return list[front]; 
  }
}

  

   public void printArray() {

    int temp = front + 1; 

    System.out.print("\n " + list[front]);

    while(temp != front) {
      System.out.print(", " + list[temp]);
      temp = (temp + 1) % size; 
    }
    
  }
  


}
