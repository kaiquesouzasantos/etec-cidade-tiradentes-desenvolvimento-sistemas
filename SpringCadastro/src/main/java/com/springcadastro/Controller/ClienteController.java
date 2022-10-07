package com.springcadastro.Controller;

import com.springcadastro.LoginSecurity;
import com.springcadastro.Model.Cliente;
import com.springcadastro.Pattern.ClientePattern;
import com.springcadastro.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/cliente")
    public String getForm(){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        return "formularios/formulario-cliente";
    }

    @RequestMapping("/cliente/lista")
    public ModelAndView getList(){
        ModelAndView view = new ModelAndView("listas/lista-cliente.html");
        view.addObject("listaCliente", this.clienteService.getListaCliente());
        return view;
    }

    @PostMapping("/cliente/cadastro")
    public String save(Cliente cliente){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new ClientePattern(cliente).verificacao()){
            clienteService.save(cliente);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/cliente/deleta")
    public String delete(String id){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        clienteService.delete(id);
        return "avisos/aviso-sucesso";
    }

    @PostMapping("/cliente/edita")
    public String edit(Cliente cliente){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        if(new ClientePattern(cliente).verificacao()){
            clienteService.save(cliente);
            return "avisos/aviso-sucesso";
        }

        return "avisos/aviso-falha";
    }

    @PostMapping("/cliente/form-edita")
    public ModelAndView getFormEdit(String id){
        ModelAndView view = new ModelAndView("formularios/formulario-alter-cliente.html");
        view.addObject("cliente", this.clienteService.getCliente(id));
        return view;
    }
}
