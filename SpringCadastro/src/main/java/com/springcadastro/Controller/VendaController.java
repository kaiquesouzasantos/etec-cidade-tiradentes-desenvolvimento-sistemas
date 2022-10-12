package com.springcadastro.Controller;

import com.springcadastro.Component.*;
import com.springcadastro.Component.Security.LoginSecurity;
import com.springcadastro.Model.Venda;
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

    @RequestMapping("/download-lista")
    public String getDownloadListaVenda(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        new GeradorListagem().geraArquivoListagemVenda(vendaService.getListaVenda());
        return "avisos/aviso-sucesso";
    }
}
