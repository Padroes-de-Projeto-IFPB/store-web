package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.model.Carrinho;
import br.edu.ifpb.padroes.model.CarrinhoNulo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/carrinho")
public class PreparaCarrinhoServletOptional extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Carrinho c = CarrinhoFactory.criarCarrinhoOptional(req).orElse(new CarrinhoNulo());
        req.setAttribute("valor", c.getValor());
        req.setAttribute("qtd", c.getTamanho());
        req.setAttribute("usuario", Optional.ofNullable(req.getAttribute("nomeUsuario")).orElse(c.getNomeUsuario()));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("carrinho.jsp");
        requestDispatcher.forward(req, resp);
    }
}
