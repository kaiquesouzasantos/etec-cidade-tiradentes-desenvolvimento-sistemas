package com.springcadastro.Controller;

import com.springcadastro.Component.*;
import com.springcadastro.Component.Security.LoginSecurity;
import com.springcadastro.Model.Cliente;
import com.springcadastro.Pattern.ClientePattern;
import com.springcadastro.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/formulario")
    public String getFormularioCliente(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        return "formularios/formulario-cliente";
    }

    @RequestMapping("/lista")
    public ModelAndView getListaCliente(){
        ModelAndView view = new ModelAndView("listas/lista-cliente.html");
        view.addObject("listaCliente", this.clienteService.getListaCliente());
        return view;
    }

    @RequestMapping("/download-lista")
    public String getDownloadListaCliente(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        new GeradorListagem().geraArquivoListagemCliente(clienteService.getListaCliente());
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/cadastro")
    public String save(Cliente cliente){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new ClientePattern(cliente).verificacao()){
            clienteService.save(cliente);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        clienteService.delete(id);
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/edita")
    public String edit(Cliente cliente){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;

        if(new ClientePattern(cliente).verificacao()){
            clienteService.save(cliente);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/form-edita")
    public ModelAndView getFormularioEditaCliente(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-cliente.html");
        view.addObject("cliente", this.clienteService.getCliente(id));
        return view;
    }
}
