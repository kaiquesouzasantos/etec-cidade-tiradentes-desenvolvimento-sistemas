package ContaInterface.Interface;

@FunctionalInterface
public interface Tributacao<T> {
    T calcularImposto(T valor);
}
