class Queue {
  int[] list; 
  int front = -1; 
  int back; 
  int count = 0; 
  int size; 

  Queue(int capacity) {
    list = new int[capacity]; 
    size = capacity; 
    back = -1;
  }

  public void pop() {
    if (count == 0) {
      System.out.println("System Error\n Not enough elements in list");
  } else { 
      if (front == -1) 
        front = (front + 1) % size; 

      front = (front + 1) % size; 
      count--; 
  }
}


  public void push(int item) {
    if (back != front || back == -1) {
      back = (back + 1) % size; 
      list[back] = item;  
      count++; 
  } else {
      System.out.println("System Error\n Overflow Error");
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

    if (front == -1) {
       front += 1;
    }

    int temp = front; 

    if (back > front) {
      while (temp < back) {
        System.out.print(", " + list[temp]);
        temp += 1; 
      }
      System.out.print(", " + list[back]);
    }

    if (front > back) {
      while (temp > back) {
        System.out.print(", " + list[temp]);
        temp = (temp + 1) % size; 
      }
      while (temp <= back) {
        System.out.print(", " + list[temp]);
        temp = (temp + 1) % size; 
      }
    }
  }
  
  public void printCount() {
    System.out.println("\n " + count);
  }

}
