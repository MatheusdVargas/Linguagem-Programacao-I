package banco;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numero = leitor.nextInt();
        String limpar = leitor.nextLine();
        System.out.print("Digite o nome do dono da conta: ");
        String dono = leitor.nextLine();
        System.out.print("Digite o valor do saldo: ");
        double saldo = leitor.nextDouble();
        System.out.print("Digite o valor do limite da conta: ");
        double limite = leitor.nextDouble();
        
        Conta c1 = new Conta(numero, dono, saldo, limite);
        Conta c2 = new Conta(002, "Nicolas", 108, 200);
        
        System.out.println("[1] Sacar\n[2] Depositar");
        int resposta = leitor.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Quanto voce deseja sacar?");
                double valor = leitor.nextDouble();
                c1.sacar(valor);
                break;
            case 2:
                System.out.println("Quanto deseja depositar?");
                double deposito = leitor.nextDouble();
                c1.depositar(deposito);
                break;
        }
        
        c2.depositar(1700);
        
        c1.escrever();
        c2.escrever();
    }
}
