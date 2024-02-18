package com.springcadastro.Controller;

import com.springcadastro.Component.Factory.GeradorListagem;
import com.springcadastro.Component.Security.LoginSecurity;
import com.springcadastro.Model.*;
import com.springcadastro.Pattern.ProdutoPattern;
import com.springcadastro.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private FornecedorService fornecedorService;

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/formulario")
    public ModelAndView getFormularioProduto(){
        ModelAndView view = new ModelAndView("formularios/formulario-produto.html");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        return view;
    }

    @RequestMapping("/lista")
    public ModelAndView getListaProduto(){
        ModelAndView view = new ModelAndView("listas/lista-produto.html");
        view.addObject("listaProduto", this.produtoService.getListaProduto());
        return view;
    }

    @RequestMapping("/download-lista")
    public String getDownloadListaProduto(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        new GeradorListagem().geraArquivoListagemProduto(produtoService.getListaProduto());
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/cadastro")
    public String save(Produto produto){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new ProdutoPattern(produto).verifica()){
            produtoService.save(produto);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        produtoService.delete(id);
        return "redirect:/produto/lista";
    }

    @PostMapping("/edita")
    public String edit(Produto produto){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new ProdutoPattern(produto).verifica()){
            produtoService.save(produto);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/form-edita")
    public ModelAndView getFormularioEditaProduto(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-produto.html");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        view.addObject("produto", this.produtoService.getProduto(id));
        return view;
    }

    @PostMapping("/form-venda")
    public ModelAndView getFormularioVenda(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-venda.html");
        view.addObject("produto", this.produtoService.getProduto(id));
        view.addObject("listaCliente", this.clienteService.getListaCliente());
        return view;
    }
}