package calculoimc;

abstract class PessoaIMC extends Pessoa {

    protected double peso;
    protected double altura;

    public PessoaIMC(double peso, double altura, String nome, String data) {
        super(nome, data);
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC() {
        return peso / (Math.pow(altura, 2));
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return "Nome = " + nome + "\nData de nascimento = " + data
                + "\nPeso = " + peso + "\nAltura = " + altura ;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
