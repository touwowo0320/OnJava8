package innerclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public void test(){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
    public static void main(String[] args) {
        //以下操作显然时错误的
        //DotNew.Inner inner = new DotNew.Inner();
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
