package escola;

import java.util.Calendar;

public class Aluno {

    private String codigo;
    private String nome;
    private int anoNasc;
    private int mesNasc;
    private int diaNasc;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String codigo, String nome, int anoNasc, int mesNasc, int diaNasc, double nota1, double nota2) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // anos de vida
    public int calcAnos() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1; // Janeiro é 0
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int idadeAno;
        if (mesNasc > mesAtual || (mesNasc == mesAtual && diaNasc > diaAtual)) {
            idadeAno = anoAtual - anoNasc - 1;
        } else {
            idadeAno = anoAtual - anoNasc;
        }
        return idadeAno;
    }

    // meses de vida 
    public double calcMeses() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1; // Janeiro é 0
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int anosDiferenca = anoAtual - anoNasc;
        int mesesDiferenca = mesAtual - mesNasc;
        int idadeMeses = anosDiferenca * 12 + mesesDiferenca;
        if (diaAtual < diaNasc) {
            idadeMeses--; // Se o dia atual é antes do dia de nascimento, subtrai um mês
        }
        return idadeMeses;
    }

    // media
    public double calcMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public void escrever() {
        System.out.println(
                "Codigo: " + codigo
                + "\nNome: " + nome
                + "\nAno de nascimento: " + anoNasc
                + "\nMes de nascimento: " + mesNasc
                + "\nDia de nascimento: " + diaNasc
                + "\nNota 1: " + nota1
                + "\nNota 2: " + nota2
                + "\nAnos de vida: " + calcAnos()
                + "\nMeses de vida: " + calcMeses()
                + "\nMedia: " + calcMedia(nota1, nota2) + "\n");
    }

    // acessores
    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAno() {
        return this.anoNasc;
    }

    public int getMeses() {
        return this.mesNasc;
    }

    public int getDias() {
        return this.diaNasc;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    // mutantes
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
