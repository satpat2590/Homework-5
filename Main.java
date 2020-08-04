class Main {
  public static void main(String[] args) {
   Stack stacky = new Stack(8);

   stacky.push(9);
   stacky.push(8);
   stacky.push(7);
   stacky.push(6);
   stacky.push(5);
   stacky.push(4);
   stacky.push(3);
   stacky.pop();
   stacky.push(2);

   stacky.printArray();

   Queue k = new Queue(8);

   k.push(9);
   k.push(8);
   k.push(7);
   k.push(6);
   k.push(5);
   k.push(4);
   k.push(3);
   k.pop();
   k.push(2);
   k.push(1);

   k.printArray();

 
  }
}