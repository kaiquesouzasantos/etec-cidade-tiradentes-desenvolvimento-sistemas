package com.springcadastro.Controller;

import com.springcadastro.LoginSecurity;
import com.springcadastro.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getIndex(){
        if(!LoginSecurity.getInstance().isLogado())
            return "redirect:/login";
        return "index";
    }

    @RequestMapping("/login")
    public String loginForm(){
        return "formularios/formulario-login";
    }

    @RequestMapping("/logout")
    public String logout(){
        LoginSecurity.getInstance().setLogado(false);
        return "redirect:/login";
    }

    @PostMapping("/login-validation")
    public String login(Usuario usuario){
        if(
                usuario.getUsuario().equalsIgnoreCase("adm") &&
                usuario.getSenha().equalsIgnoreCase("123")
        ){
            LoginSecurity.getInstance().setLogado(true);
            return "redirect:/";
        }

        return "redirect:/login";
    }
}
