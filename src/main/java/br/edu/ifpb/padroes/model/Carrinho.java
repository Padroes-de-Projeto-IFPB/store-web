package br.edu.ifpb.padroes.model;

public class Carrinho {

    public Carrinho() {
    }

    public Carrinho(String nomeUsuario, int tamanho, double valor) {
        this.nomeUsuario = nomeUsuario;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    private String nomeUsuario;
    private int tamanho;
    private double valor;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
