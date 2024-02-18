package com.springcadastro.Controller;

import com.springcadastro.Component.Security.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getIndex(){
        if(!LoginSecurity.getInstance().isLogado())
            return LoginSecurity.REDIRECT;
        return "index";
    }

    @RequestMapping("/login")
    public String getFormularioLogin(){
        return "formularios/formulario-login";
    }

    @RequestMapping("/logout")
    public String logout(){
        LoginSecurity.getInstance().setLogado(false);
        return LoginSecurity.REDIRECT;
    }

    @PostMapping("/login-validation")
    public String login(UsuarioSecurity usuarioSecurity){
        if(
                usuarioSecurity.getUsuario().equalsIgnoreCase("adm") &&
                usuarioSecurity.getSenha().equalsIgnoreCase("123")
        ){
            LoginSecurity.getInstance().setLogado(true);
            return "redirect:/";
        }

        return LoginSecurity.REDIRECT;
    }
}
