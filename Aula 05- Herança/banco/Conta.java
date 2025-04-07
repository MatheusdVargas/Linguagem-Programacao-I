package banco;
public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private double limite;
    
    // construtor
    public Conta(int numero, String dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public void sacar(double valor) {
        if(valor <= (saldo+limite)) {
            saldo -= valor;
            System.out.println("Novo saldo (apos saque): " + saldo + "\n");
        } else {
            System.out.println("\nLimite excedido para o objeto.\n");
        }
        
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Novo saldo (apos deposito): " + saldo + "\n");
    }
    
    public void escrever() {
        System.out.println("Numero: " + getNumero()+
                "\n Dono: " + getDono() +
                "\n Saldo: " + getSaldo() +
                "\n Limite: " + getLimite());
    }
    // acessores
    public int getNumero() {
        return this.numero;
    }
    public String getDono() {
        return this.dono;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double getLimite() {
        return this.limite;
    }
    
    // mutantes
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}

