package com.springcadastro.Controller;

import com.springcadastro.Component.GeradorListagem;
import com.springcadastro.Component.LoginSecurity;
import com.springcadastro.Model.Produto;
import com.springcadastro.Pattern.ProdutoPattern;
import com.springcadastro.Service.FornecedorService;
import com.springcadastro.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private FornecedorService fornecedorService;

    @RequestMapping("")
    public ModelAndView getFormularioProduto(){
        ModelAndView view = new ModelAndView("formularios/formulario-produto.html");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        return view;
    }

    @GetMapping("/lista")
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
        return "avisos/aviso-sucesso";
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
}