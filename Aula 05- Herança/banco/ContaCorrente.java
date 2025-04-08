package banco;

public class ContaCorrente extends Conta {
    private double limite;
    // construtor
    public ContaCorrente(int numero, String dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
        this.limite = limite;
    }
    //acessor
    public double getLimite() {
        return this.limite;
    }
    // mutantes
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
