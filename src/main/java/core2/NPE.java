package core2;

import java.util.*;

public class NPE {

    public static void npe(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("It's empty");
        } else {
            System.out.println("It's not empty");
        }
    }
    public static void main(String[] args) {
        List<String> list = null;
        npe(list);
    }
}
