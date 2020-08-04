class Stack {

  int capacity; 
  public int top;
  int size = 0; 
  int[] list; 

  Stack(int capacity) {
    list = new int[capacity];
    top = -1;
    size = capacity; 
   
  }

  public int pop() {
    
    if (top == -1) {
      System.out.println("Error \n Too few elements in the list to return the topmost element");
      return -1; 
  } else {
       return list[top--];
    }
  }

  public void push(int item) {

    if (top == (size - 1)) {
      System.out.println("Overflow Error\n Too many elements in the stack currently"); 
  } else {
      list[++top] = item; 
  }

} 

  public int peek() {
    
    if (top == -1) {
      System.out.println("Error \n Too few elements in the list to return the topmost element");
      return -1; 
  } else {
      return list[top];
  }
}


  public void printArray() {
      System.out.println(" ");

      for (int x = 0; x < size; x++) {
        if (x == 0) 
          System.out.print(" " + list[x]);
        else
          System.out.print(", " + list[x]);
      }

    }
  



}