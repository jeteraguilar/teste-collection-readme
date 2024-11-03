package br.com.demo.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void demonstrarConjuntos() {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        System.out.println("HashSet: " + hashSet);

        linkedHashSet.add("Elemento1");
        linkedHashSet.add("Elemento2");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        treeSet.add("Elemento1");
        treeSet.add("Elemento2");
        System.out.println("TreeSet: " + treeSet);
    }
}
