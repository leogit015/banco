package entities;

public class Conta {
    public int numeroConta;
    public String nomeTitular;
    public double deposito;
    public static final double TAXA_SAQUE = +5;

    public void Depositar(double valorDeposito) {
        this.deposito += valorDeposito;
    }

    public void Sacar(double valorSaque) {
        this.deposito -= valorSaque + TAXA_SAQUE;
    }
}




