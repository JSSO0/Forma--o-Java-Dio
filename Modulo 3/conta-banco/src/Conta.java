
public abstract class Conta implements Iconta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia=AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double gesaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo-= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
