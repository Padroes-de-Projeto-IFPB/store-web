package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.model.Carrinho;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/carrinho-old")
public class PreparaCarrinhoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Carrinho c = CarrinhoFactory.criarCarrinho(req);
        if (c != null) {
            req.setAttribute("valor", c.getValor());
            req.setAttribute("qtd", c.getTamanho());
        } else {
            req.setAttribute("valor", 0.0);
            req.setAttribute("qtd", 0);
        }
        if(req.getAttribute("nomeUsuario") == null) {
            if (c != null) {
                req.setAttribute("usuario", c.getNomeUsuario());
            } else {
                req.setAttribute("usuario", req.getAttribute("nomeUsuario"));
            }
        } else {
            req.setAttribute("usuario", req.getAttribute("nomeUsuario"));
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("carrinho.jsp");
        requestDispatcher.forward(req, resp);
    }
}
