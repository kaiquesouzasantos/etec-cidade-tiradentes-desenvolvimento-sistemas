package VeiculoPolimorfismo.Interface;

@FunctionalInterface
public interface Imposto<T> {
    T calculaIPVA(T valorVeiculo);
}
