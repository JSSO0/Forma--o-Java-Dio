package com.projeto.no;

public class No<T> {

private T conteudo;
    private String conteudo;
    private No<T> proximoNo;
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo +
                '}';
    }
}
//https://github.com/jrdutra/estruturaDeDadosJavaDio/tree/main/apresentacoes/Aula1
//LINK DO REPOSITORIO DA AULA
