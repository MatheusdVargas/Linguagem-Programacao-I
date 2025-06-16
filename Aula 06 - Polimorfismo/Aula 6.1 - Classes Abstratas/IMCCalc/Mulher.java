package calculoimc;

public class Mulher extends PessoaIMC {

    public Mulher(double peso, double altura, String nome, String data) {
        super(peso, altura, nome, data);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 19) {
            return "Abaixo do peso ideal";
        } else if (imc < 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
