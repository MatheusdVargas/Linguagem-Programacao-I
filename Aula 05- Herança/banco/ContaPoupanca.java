package banco;

public class ContaPoupanca extends Conta {
    private double juros;
    public ContaPoupanca(int numero, String dono, double saldo, double limite, double juros) {
        super(numero, dono, saldo, limite);
        this.juros = juros;
    }
    public double getJuros() {
        return this.juros;
    }
    // mutantes
    public void setJuros(double juros) {
        this.juros = juros;
    }
}
