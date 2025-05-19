package calculoimc;

public class Homem extends PessoaIMC {

    public Homem(double peso, double altura, String nome, String data) {
        super(peso, altura, nome, data);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc < 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
