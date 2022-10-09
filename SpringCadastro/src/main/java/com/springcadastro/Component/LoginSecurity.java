package com.springcadastro.Component;

public class LoginSecurity {
    private boolean logado = false;
    private static LoginSecurity loginSecurity;
    public static final String REDIRECT = "redirect:/login";

    public static LoginSecurity getInstance(){
        if(loginSecurity == null)
            loginSecurity = new LoginSecurity();
        return loginSecurity;
    }

    public boolean isLogado(){
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
