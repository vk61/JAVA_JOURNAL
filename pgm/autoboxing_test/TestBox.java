public class TestBox {
  private Integer i;
  private int j;
 
  public static void main(String[] args) {
    TestBox t = new TestBox();
    t.go();
  }
  
  public void go() {
    j = i;
    System.out.println(j);
    System.out.println(i);
  }
 }

// Null Pointer exception 

//  Exception in thread "main" java.lang.NullPointerException: 
//  Cannot invoke "java.lang.Integer.intValue()" because "this.i" is null
//         at TestBox.go(TestBox.java:11)    
//         at TestBox.main(TestBox.java:7) 

