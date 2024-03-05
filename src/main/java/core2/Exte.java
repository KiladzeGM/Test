package core2;

import java.util.*;

public class Exte {
    public void g(List<? extends Number> list) {
        Number integer = list.get(0);
        System.out.println(list.get(0));
    }

    public void s(List<? super Number> list) {
        list.add(3);
        Object object = list.get(1);
        System.out.println(list.get(1));
    }
}
