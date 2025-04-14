package prova1;

import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero para calcular a tabuada: ");
        int numero = leitor.nextInt();
        int vetor[] = {1,2,3,4,5,6,7,8,9,10,11};
        Tabuada a1 = new Tabuada(numero, vetor);
        a1.tamanhoNum();
        a1.calcTabuada();
        a1.escrever();
    }
    
}
