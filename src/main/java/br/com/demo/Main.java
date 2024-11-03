package br.com.demo;

import br.com.demo.list.ListExample;
import br.com.demo.map.MapExample;
import br.com.demo.queue.QueueExample;
import br.com.demo.set.SetExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Exemplo de List ====");
        ListExample.demonstrarListas();

        System.out.println("==== Exemplo de Map ====");
        MapExample.demonstrarMapas();

        System.out.println("==== Exemplo de Set ====");
        SetExample.demonstrarConjuntos();

        System.out.println("==== Exemplo de Queue ====");
        QueueExample.demonstrarFilas();
    }
}