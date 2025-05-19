package calculoimc;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String opcao;
        
        do {
            System.out.println("[1] Criar Homem\n[2] Criar mulher\n[3] Sair");
            opcao = leitor.next();
            if("1".equals(opcao)) {
                System.out.println("-----Homem-----");
                System.out.println("Nome: ");
                String nome = leitor.next();
                System.out.println("Data de Nascimento: ");
                String data = leitor.next();
                System.out.println("Peso: ");
                double peso = leitor.nextDouble();
                System.out.println("Altura (m): ");
                double altura = leitor.nextDouble();
                Homem h1 = new Homem(peso, altura, nome, data);
                
                System.out.println("------IMC------");
                System.out.println(h1.calculaIMC());
                System.out.println(h1.resultIMC());
                System.out.println(h1.toString());
            }
            if("2".equals(opcao)) {
                System.out.println("-----Mulher-----");
                System.out.println("Nome: ");
                String nome = leitor.next();
                System.out.println("Data de Nascimento: ");
                String data = leitor.next();
                System.out.println("Peso: ");
                double peso = leitor.nextDouble();
                System.out.println("Altura (m): ");
                double altura = leitor.nextDouble();
                Mulher m1 = new Mulher(peso, altura, nome, data);
                
                System.out.println("------IMC------"); 
                System.out.println(m1.calculaIMC());
                System.out.println(m1.resultIMC());
                System.out.println(m1.toString());
            }       
        } while(!"3".equals(opcao));
    }
    
}
