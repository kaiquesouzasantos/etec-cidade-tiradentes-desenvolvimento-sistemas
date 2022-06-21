package ClienteHeranca.Teste;
import ClienteHeranca.Entidades.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        cliente(new Cliente(), "cliente_01", "cliente_01", 20, 200);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        cliente(new Cliente(), "cliente_02", "cliente_02", 16, 5454.4);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        cliente(new Cliente(), "cliente_03", "cliente_03", 36, 10000);

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void cliente(Cliente cliente, String nome, String endereco, int idade, double valor){
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setIdade(idade);
        cliente.setValorPedido(valor);
        cliente.calculaDesconto();

        System.out.println("NOME: "+cliente.getNome());
        System.out.println("ENDERECO: "+cliente.getEndereco());
        System.out.println("IDADE: "+cliente.getIdade()+" anos");
        System.out.println("PEDIDO: R$"+(int) cliente.getValorPedido());
        System.out.println("DESCONTO: R$"+(int) cliente.getDesconto());
    }
}
