package com.springcadastro;

public class LoginSecurity {
    private boolean logado;
    private static LoginSecurity loginSecurity;

    public static LoginSecurity getInstance(){
        if(loginSecurity == null)
            loginSecurity = new LoginSecurity();
        return loginSecurity;
    }

    private LoginSecurity() {
        this.logado = false;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
