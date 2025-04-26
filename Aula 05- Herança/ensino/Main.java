package ensino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(leitor.nextLine());

        System.out.print("Digite a matricula do aluno: ");
        aluno.setMatricula(leitor.nextLine());

        System.out.print("Digite o curso do aluno: ");
        aluno.setCurso(leitor.nextLine());

        String[] materias = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da materia " + (i + 1) + ": ");
            materias[i] = leitor.nextLine();
        }
        aluno.setMaterias(materias);

        double[] notas1 = new double[4];
        System.out.println("Digite as 4 notas da disciplina 1:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas1[i] = leitor.nextDouble();
        }
        aluno.setNotas1(notas1);

        double[] notas2 = new double[4];
        System.out.println("Digite as 4 notas da disciplina 2:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas2[i] = leitor.nextDouble();
        }
        aluno.setNotas2(notas2);

        double[] notas3 = new double[4];
        System.out.println("Digite as 4 notas da disciplina 3:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas3[i] = leitor.nextDouble();
        }
        aluno.setNotas3(notas3);

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 1; i <= 3; i++) {
            double media = aluno.calcMedia(i);
            System.out.println("Media da disciplina " + i + ": " + media);
            boolean aprovado = aluno.situacao(i);
            System.out.println("Situacao: " + (aprovado ? "Aprovado" : "Reprovado"));
        }
    }
}
