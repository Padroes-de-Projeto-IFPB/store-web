package br.edu.ifpb.padroes.model;

public class CarrinhoNulo extends Carrinho {
    public String getNomeUsuario() {
        return "anônimo";
    }

    public int getTamanho() {
        return 0;
    }

    public double getValor() {
        return 0.0;
    }

}
