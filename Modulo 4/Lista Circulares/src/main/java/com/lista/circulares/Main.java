package com.lista.circulares;


public class Main {
    public static void main(String[] args) {
        ListaCirculares<String> minhaListaCirculares = new ListaCirculares<>();

        minhaListaCirculares.add("c0");
        System.out.println(minhaListaCirculares);

        minhaListaCirculares.remove(0);
        System.out.println(minhaListaCirculares);

        minhaListaCirculares.add("c1");
        System.out.println(minhaListaCirculares);

        minhaListaCirculares.add("c2");
        minhaListaCirculares.add("c3");
        System.out.println(minhaListaCirculares);

        System.out.println(minhaListaCirculares.get(7));
        System.out.println(minhaListaCirculares.get(323));
    }
}