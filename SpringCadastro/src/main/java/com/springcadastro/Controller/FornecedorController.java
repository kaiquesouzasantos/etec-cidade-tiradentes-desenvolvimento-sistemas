package com.springcadastro.Controller;

import com.springcadastro.LoginSecurity;
import com.springcadastro.Model.*;
import com.springcadastro.Pattern.FornecedorPattern;
import com.springcadastro.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @RequestMapping("/fornecedor")
    public String getForm(){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        return "formularios/formulario-fornecedor";
    }

    @RequestMapping("/fornecedor/lista")
    public ModelAndView getFormAdd(){
        ModelAndView view = new ModelAndView("listas/lista-fornecedor");
        view.addObject("listaFornecedor", this.fornecedorService.getListaFornecedor());
        return view;
    }

    @PostMapping("/fornecedor/cadastro")
    public String save(Fornecedor fornecedor){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new FornecedorPattern(fornecedor).verifica()){
            fornecedorService.save(fornecedor);
            return "avisos/aviso-sucesso";
        }
        return "avisos/aviso-falha";
    }

    @PostMapping("/fornecedor/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        fornecedorService.delete(id);
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/fornecedor/edita")
    public String edit(Fornecedor fornecedor){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new FornecedorPattern(fornecedor).verifica()){
            fornecedorService.save(fornecedor);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/fornecedor/form-edita")
    public ModelAndView getFormEdit(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-fornecedor.html");
        view.addObject("fornecedor", this.fornecedorService.getFornecedor(id));
        return view;
    }
}
