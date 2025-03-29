package escola;
public class Aluno {
    private String codigo;
    private String nome;
    private int anoNasc;
    private int mesNasc;
    private double nota1;
    private double nota2;
    
    // Construtor
    public Aluno(String codigo, String nome, int anoNasc, int mesNasc, double nota1, double nota2) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    // anos de vida
    public int calcAnos(int anoNasc) {
        return 2025 - anoNasc;
    }
    // meses de vida (idade*12)
    public int calcMeses(int mesNasc) {
        return calcAnos(anoNasc) * 12;
    }
    // media
    public double calcMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    public void escrever() {
        System.out.println(
        "Código:" + codigo + 
        "\nNome: " + nome + 
        "\nAno de nascimento: " + anoNasc +
        "\nMes de nascimento: " + mesNasc + 
        "\nNota 1: " + nota1 + 
        "\nNota 2: " + nota2 +
        "\nAnos de vida: " + calcAnos(anoNasc) + 
        "\nMeses de vida: " + calcMeses(mesNasc) +
        "\nMedia: " + calcMedia(nota1, nota2));
    }
}

