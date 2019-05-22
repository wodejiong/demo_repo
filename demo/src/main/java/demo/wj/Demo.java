package demo.wj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
       List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.forEach(x -> System.out.println(x));
    }
}
