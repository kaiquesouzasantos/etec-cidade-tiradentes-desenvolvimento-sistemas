package com.springcadastro.Controller;

import com.springcadastro.Component.*;
import com.springcadastro.Component.Security.LoginSecurity;
import com.springcadastro.Model.*;
import com.springcadastro.Pattern.FornecedorPattern;
import com.springcadastro.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @RequestMapping("/formulario")
    public String getFormularioFornecedor(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        return "formularios/formulario-fornecedor";
    }

    @RequestMapping("/lista")
    public ModelAndView getListaFornecedor(){
        ModelAndView view = new ModelAndView("listas/lista-fornecedor");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        return view;
    }

    @RequestMapping("/download-lista")
    public String getDownloadListaFornecedor(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        new GeradorListagem().geraArquivoListagemFornecedor(fornecedorService.getListaFornecedor());
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/cadastro")
    public String save(Fornecedor fornecedor){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new FornecedorPattern(fornecedor).verifica()){
            fornecedorService.save(fornecedor);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;
        fornecedorService.delete(id);
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/edita")
    public String edit(Fornecedor fornecedor){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new FornecedorPattern(fornecedor).verifica()){
            fornecedorService.save(fornecedor);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/form-edita")
    public ModelAndView getFormularioEditaFornecedor(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-fornecedor.html");
        view.addObject("fornecedor", this.fornecedorService.getFornecedor(id));
        return view;
    }
}
