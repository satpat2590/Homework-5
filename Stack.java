class Stack {

  int capacity; 
  public int top;
  int size = 0; 
  int[] list; 
  int count; 

  Stack(int capacity) {
    list = new int[capacity];
    top = -1;
    size = capacity; 
   
  }

  public int pop() {
    
    if (top == -1) {
      System.out.println("Error\n Too few elements in the list to return the topmost element");
      return -1; 
  } else {
       count--; 
       return list[top--];
    }
  }

  public void push(int item) {

    if (count == size) {
      System.out.println("Overflow Error\n Too many elements in the stack currently"); 
  } else {
      list[++top] = item; 
      count++; 
  }

} 

  public int peek() {
    
    if (top == -1) {
      System.out.println("Error\n Too few elements in the list to return the topmost element");
      return -1; 
  } else {
      return list[top];
  }
}


  public void printArray() {
      System.out.println(" ");

      for (int x = 0; x < count; x++) {
        if (x == 0) 
          System.out.print(" " + list[x]);
        else
          System.out.print(", " + list[x]);
      }

    }

  public void printCount() {
    System.out.println("\n " + count);
  }
  



}