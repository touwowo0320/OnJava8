package housekeeping;// housekeeping/OverloadingVarargs2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

public class OverloadingVarargs2 {
  private static void f(float i, Character... args) {
    System.out.println("first");
  }
  private static void f(char c,Character... args) {
    System.out.print("second");
  }
  public static void main(String[] args) {
    f(1, 'a');
    f('a', 'b');
  }
}
