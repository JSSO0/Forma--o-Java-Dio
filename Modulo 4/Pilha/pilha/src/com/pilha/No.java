package com.pilha;

public class No {
    public No(int dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    public No(){

    }

    private int dado;
    private No reNo = null;
}
