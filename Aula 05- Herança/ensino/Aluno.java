package ensino;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String materias[];
    private double notas1[];
    private double notas2[];
    private double notas3[];

    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.curso = "";
        this.materias = new String[3];
        this.notas1 = new double[4];
        this.notas2 = new double[4];
        this.notas3 = new double[4];
    }

    public double calcMedia(int disciplina) {
        double soma = 0;
        double media = 0;

        switch (disciplina) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    soma += notas1[i];
                }
                media = soma / notas1.length;
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    soma += notas2[i];
                }
                media = soma / notas2.length;
                break;
            case 3:
                for (int i = 0; i < 4; i++) {
                    soma += notas3[i];
                }
                media = soma / notas3.length;
        }

        return media;
    }

    public boolean situacao(int disciplina) {
        boolean aprovado = false;
        double media = calcMedia(disciplina);
        if (media >= 7) {
            aprovado = true;
        }
        return aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double[] getNotas1() {
        return notas1;
    }

    public void setNotas1(double[] notas1) {
        this.notas1 = notas1;
    }

    public double[] getNotas2() {
        return notas2;
    }

    public void setNotas2(double[] notas2) {
        this.notas2 = notas2;
    }

    public double[] getNotas3() {
        return notas3;
    }

    public void setNotas3(double[] notas3) {
        this.notas3 = notas3;
    }

}
