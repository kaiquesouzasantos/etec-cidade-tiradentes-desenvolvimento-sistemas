package FuncionarioSobrecarga;

public class Funcionario {
    private String nome, cpf;
    private double salario;

    public Funcionario() {}

    // GET's
    public String getNome() {return this.nome;}
    public String getCpf(){
        int d1 = 0, d2 = 0, digito_01, digito_02, resto, digitoCPF;
        String ultimosDigitos;

        cpf = cpf.replace("-", "");
        cpf = cpf.replace(".", "");

        if(cpf.length() != 11) return "CPF INVALIDO!";

        for (int k = 1; k < cpf.length() - 1; k++) {
            digitoCPF = Integer.parseInt(cpf.substring(k - 1, k));

            d1 += (11 - k) * digitoCPF;
            d2 += (12 - k) * digitoCPF;
        }

        resto = (d1 % 11);

        if (resto < 2){digito_01 = 0;
        }else{digito_01 = 11 - resto;}

        d2 += 2 * digito_01;
        resto = (d2 % 11);

        if (resto < 2){digito_02 = 0;
        }else {digito_02 = 11 - resto;}

        String verificacaoUltimosDigitos = cpf.substring(cpf.length() - 2);
        ultimosDigitos = digito_01+""+digito_02;
        if(verificacaoUltimosDigitos.equals(ultimosDigitos)){
            return this.cpf;
        } return "CPF INVALIDO";
    }

    // --> SALARIO
    public double getSalario() {return this.salario;}

    public String getSalario(String tipoMoeda) {
        if(tipoMoeda.equals("US")) {
            return "US$ "+(this.salario * 4.96);
        }
        return "R$ "+this.salario;
    }

    // SET's
    public void setSalario(double salario) {this.salario = salario;}
    public void setCpf(String cpf){this.cpf = cpf;}

    // SET NOME
    public void setNome(String nome) {this.nome = nome;}

    public void setNome(String nome, boolean caixaAlta) {
        if(caixaAlta) {this.nome = nome.toUpperCase();
        }else {this.nome = nome.toLowerCase();}
    }

    public void setNome(String nome, String primeiraPalavra) {
        if(primeiraPalavra.equals("S")) {this.nome = nome.split(" ")[0];}
    }

    public void setNome(String nome, boolean caixaAlta, String primeiraPalavra) {
        if(caixaAlta) {this.nome = nome.toUpperCase();
        }else {this.nome = nome.toLowerCase();}

        if(primeiraPalavra.equals("S")) {this.nome = nome.split(" ")[0];}
    }

}
