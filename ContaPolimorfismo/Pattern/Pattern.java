package ContaPolimorfismo.Pattern;

public class Pattern {
    public static boolean verificaCPF(String cpf){
        int d1 = 0, d2 = 0, digito_01, digito_02, resto, digitoCPF;
        String ultimosDigitos;

        cpf = cpf.replace("-", "");
        cpf = cpf.replace(".", "");

        if(cpf.length() != 11) return false;

        String[] sequencias = {
                "11111111111", "22222222222", "33333333333", "44444444444", "555555555555",
                "66666666666", "77777777777", "88888888888", "99999999999", "000000000000"
        };

        for(String sequencia:sequencias){
            if(sequencia.equals(cpf)){
                return false;
            }
        }

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

        return verificacaoUltimosDigitos.equals(ultimosDigitos);
    }

    public static boolean verificaTitular(String titular){
        for(int digito = 0; digito < titular.length(); digito++){
            char caracter = titular.charAt(digito);

            if(!Character.isAlphabetic(caracter))
                return false;
        }

        return true;
    }

    public static boolean verificaSenha(int senha){
        return String.valueOf(senha).length() == 4;
    }
}
