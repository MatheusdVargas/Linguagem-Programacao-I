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
    public int calcAnos() {
        return 2025 - this.anoNasc;
    }
    // meses de vida (idade*12)
    public int calcMeses() {
        return calcAnos() * 12;
    }
    // media
    public double calcMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    public void escrever() {
        System.out.println(
        "Codigo: " + codigo + 
        "\nNome: " + nome + 
        "\nAno de nascimento: " + anoNasc +
        "\nMes de nascimento: " + mesNasc + 
        "\nNota 1: " + nota1 + 
        "\nNota 2: " + nota2 +
        "\nAnos de vida: " + calcAnos() + 
        "\nMeses de vida: " + calcMeses() +
        "\nMedia: " + calcMedia(nota1, nota2) + "\n");
    }
}

