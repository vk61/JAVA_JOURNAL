class Foof {
 
 final int size = 3;
 
 final int whuffie;

  Foof() {
    whuffie = 42;  // now you can’t change whuffie
  }

  void doStuff(final int x) {
    // you can’t change x
  }
  void doMore() {
    final int z = 7;
    // you can’t change z
  }

  public static void main(String[] args) {
      
    Foof test = new Foof();
  }
 }