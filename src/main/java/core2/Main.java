package core2;

import core1.St;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Typ<RuntimeException> typ = new Typ<>();
//        typ.nani();

        List<Number> list = new ArrayList<>();
        list.add(13);

        Set set = new HashSet<>();
        set.add(null);
        set.add(null);

        Exte exte = new Exte();
        exte.s(list);

        System.out.println("St");
        St.put();
        System.out.println("St");


    }
}
