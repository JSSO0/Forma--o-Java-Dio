public interface Iconta {
    void sacar(double saldo);
    void depositar(double saldo);
    void transferir(double saldo, Conta contadestino);
    void imprimirExtrato();
}
