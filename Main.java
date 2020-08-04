class Main {
  public static void main(String[] args) {
   Stack stacky = new Stack(8);

   stacky.push(9);

   Queue kyuwwy = new Queue(10);

   kyuwwy.push(12);
   kyuwwy.push(9);
   kyuwwy.push(8);
   kyuwwy.pop();
   kyuwwy.push(10);
   kyuwwy.push(8);
   kyuwwy.push(5);
   kyuwwy.push(1);
   kyuwwy.push(2);
   kyuwwy.push(3);
   kyuwwy.push(4);


   kyuwwy.printArray();

  }
}