package interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bca");
        list.add("ab");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list);
    }
}
