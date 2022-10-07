package com.springcadastro.Controller;

import com.springcadastro.LoginSecurity;
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
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private FornecedorService fornecedorService;

    @RequestMapping("/produto")
    public ModelAndView getProduto(){
        ModelAndView view = new ModelAndView("formularios/formulario-produto.html");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        return view;
    }

    @GetMapping("/produto/lista")
    public ModelAndView getFormAdd(){
        ModelAndView view = new ModelAndView("listas/lista-produto.html");
        view.addObject("listaProduto", this.produtoService.getListaProduto());
        return view;
    }

    @PostMapping("/produto/cadastro")
    public String save(Produto produto){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new ProdutoPattern(produto).verifica()){
            produtoService.save(produto);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/produto/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        produtoService.delete(id);
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/produto/edita")
    public String edit(Produto produto){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new ProdutoPattern(produto).verifica()){
            produtoService.save(produto);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/produto/form-edita")
    public ModelAndView getFormEdit(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-produto.html");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        view.addObject("produto", this.produtoService.getProduto(id));
        return view;
    }
}