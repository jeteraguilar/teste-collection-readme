package br.com.demo.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void demonstrarListas() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();

        arrayList.add("Elemento1");
        arrayList.add("Elemento2");
        System.out.println("ArrayList: " + arrayList);

        linkedList.add("Elemento1");
        linkedList.add("Elemento2");
        System.out.println("LinkedList: " + linkedList);

        vector.add("Elemento1");
        vector.add("Elemento2");
        System.out.println("Vector: " + vector);
    }
}
