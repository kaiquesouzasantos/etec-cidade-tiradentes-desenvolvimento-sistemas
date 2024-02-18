package com.springcadastro.Controller;

import com.springcadastro.Component.Factory.GeradorListagem;
import com.springcadastro.Component.Factory.GeradorRelatorio;
import com.springcadastro.Component.Security.LoginSecurity;
import com.springcadastro.Model.Venda;
import com.springcadastro.Service.ClienteService;
import com.springcadastro.Service.FornecedorService;
import com.springcadastro.Service.ProdutoService;
import com.springcadastro.Service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/venda")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private FornecedorService fornecedorService;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("")
    public String venda(Venda venda){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(vendaService.venda(venda))
            return "avisos/aviso-sucesso";

        return "avisos/aviso-falha";
    }

    @RequestMapping("/lista")
    public ModelAndView getListaVenda(){
        ModelAndView view = new ModelAndView("listas/lista-venda.html");
        view.addObject("listaVenda", this.vendaService.getListaVenda());
        return view;
    }

    @RequestMapping("/dashboard")
    public ModelAndView getDashboard(){
        ModelAndView view = new ModelAndView("dashboard.html");
        view.addObject("relatorio", new GeradorRelatorio(
                this.clienteService.getListaCliente(),
                this.fornecedorService.getListaFornecedor(),
                this.produtoService.getListaProduto(),
                this.vendaService.getListaVenda()
        ));
        return view;
    }

    @RequestMapping("/download-lista")
    public String getDownloadListaVenda(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        new GeradorListagem().geraArquivoListagemVenda(vendaService.getListaVenda());
        return "avisos/aviso-sucesso";
    }
}
