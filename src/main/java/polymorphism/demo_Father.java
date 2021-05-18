package polymorphism;

public class demo_Father {
    public static void main(String[] args) {
        Father f = new son ();
        System.out.println(f.num);
        son s = new son();
        System.out.println(s.num);
    }

}
class Father{
    int num = 10 ;
}
class son extends Father {
    int num = 20 ;
}

