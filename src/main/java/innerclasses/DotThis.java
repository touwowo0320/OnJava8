package innerclasses;// innerclasses/DotThis.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Accessing the outer-class object

public class DotThis {
  void f() { System.out.println("DotThis.f()"); }
  public class Inner {
    public DotThis outer() {
      return DotThis.this;
      // A plain "this" would be Inner's "this"
    }
  }
  public Inner inner() { return new Inner(); }
  public static void main(String[] args) {
    DotThis dt = new DotThis();
    Inner dti = dt.inner();
    DotThis outer = dti.outer();
    outer.f();
    System.out.println(dt == outer);
  }
}
/* Output:
DotThis.f()
*/
