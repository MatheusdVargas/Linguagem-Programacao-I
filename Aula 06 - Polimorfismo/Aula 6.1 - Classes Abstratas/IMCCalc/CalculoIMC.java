package calculoimc;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String opcao;
        Homem[] homens = new Homem[20];
        int i = 0;

        do {
            System.out.println("\n------------------------MENU------------------------");
            System.out.println("[1] Cadastrar Homem\n[2] Buscar Homem por Nome\n[3] Listar Homens\n[4] Sair");
            opcao = leitor.next();
            // ler os dados
            switch (opcao) {
                case "1":
                    System.out.println("-----Cadastro de Homem-----");
                    System.out.print("Nome: ");
                    String nome = leitor.next();
                    System.out.print("Data de Nascimento: ");
                    String data = leitor.next();
                    System.out.print("Peso (kg): ");
                    double peso = leitor.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = leitor.nextDouble();
                    // instanciar
                    Homem h1 = new Homem(peso, altura, nome, data);
                    // colocar no array
                    homens[i] = h1;
                    i++;
                    System.out.println("Homem cadastrado com sucesso");
                    
                case "2":
                    System.out.print("Digite o nome a ser buscado: ");
                    String nomeBusca = leitor.next();
                    boolean encontrado = false;
                    // busca por nome
                    for (int j = 0; j < i; j++) {
                        if (homens[j].getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Homem encontrado:");
                            System.out.println(homens[j]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("Homem com nome: " + nomeBusca + " nao encontrado.");
                    }
                    break;
                    
                case "3":
                    // print dos cadastrados
                    System.out.println("----- Lista de Homens Cadastrados -----");
                    for (int j = 0; j < i; j++) {
                        System.out.println("\n" + homens[j]);
                    }
                    break;
            }
        } while (!"4".equals(opcao));
    }
}
