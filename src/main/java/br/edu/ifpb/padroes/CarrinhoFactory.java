package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.model.Carrinho;
import br.edu.ifpb.padroes.model.CarrinhoNulo;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public class CarrinhoFactory {

    public static Carrinho criarCarrinho(HttpServletRequest request) {
        Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
        if (carrinho == null) {
            carrinho = new CarrinhoNulo();
        }
        return carrinho;
    }

    public static Optional<Carrinho> criarCarrinhoOptional(HttpServletRequest request) {
        Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
        return Optional.ofNullable(carrinho);
    }

}
