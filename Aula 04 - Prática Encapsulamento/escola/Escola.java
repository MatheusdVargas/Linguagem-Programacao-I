package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno Matheus = new Aluno("001", "Matheus", 2008, 4, 28, 10.0, 9.7);
        Aluno Nicolas = new Aluno("002", "Nicolas", 2001, 9, 11, 4.0, 2.3);
        Aluno Phelipe = new Aluno("003", "Phelipe", 2015, 6, 22, 5.0, 3.8);
        
        Matheus.escrever();
        Nicolas.escrever();
        Phelipe.escrever();
    }  
}
