package polymorphism;

public class A {
    public void test(){
        System.out.println("A -----Test");
    }
}
class B extends A {
}
class C {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
