package com.projeto.atribuicaoreferencias;

public class Main {
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;
        System.out.println("intA= "+ intA+" intB= "+ intB);
intA=2;
        System.out.println("intA= "+ intA+" intB= "+ intB);

        MeuObj objtA = new MeuObj(1);
        MeuObj objtB =objtA;

        System.out.println("objtA = "+ objtA + " objtB = " + objtB);

        objtA.setNum(2);

        System.out.println("objtA = "+ objtA + " objtB = " + objtB);
    }


}
