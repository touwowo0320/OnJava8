package innerclasses;// innerclasses/DotNew.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creating an inner class directly using .new syntax

public class DotNew {
    class Inner {
        public DotNew outer() {
            // 如果只是 this，指的就是 Inner
            return DotNew.this;
        }
    }
    public static void test(){
        // -Inner dni = new Inner();
    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner dni1 = dn.new Inner();
        Inner dni2 = dn.new Inner();
        System.out.println(dni1 == dni2);
        System.out.println(dni1.outer() == dni2.outer());
    }
}
