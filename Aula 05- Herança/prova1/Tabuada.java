package prova1;
// classe
public class Tabuada {
    private int numero;
    private int vetor[];
    // construtor
    public Tabuada(int numero, int[] vetor) {
        this.numero = numero;
        this.vetor = vetor;
    }
    // metodo 1
    public void tamanhoNum () {
        if(numero < 4) {
            System.out.println("Tabuada de numeros pequenos");
        } else {
            if( numero >= 4 && numero <= 10) {
                System.out.println("Tabuada de numeros medios");
            } else {
                if( numero > 10) {
                    System.out.println("Tabuada de numeros grandes");
                }
            }
        } 
    }
    // metodo 2
    public void calcTabuada() {
        for(int i = 1; i < 11; i++) {
            vetor[i] = numero * i;
        }
    }
    // metodo 3
    public void escrever() {
        for(int i = 1; i < 11; i++) {
            System.out.println(i + "x" + numero + " = " + vetor[i]);
        }
    }
    // acessores
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    // mutantes
    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
}
