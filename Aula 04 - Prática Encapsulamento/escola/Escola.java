package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno Matheus = new Aluno("001", "Matheus", 2008, 04, 10, 9.7);
        Aluno Nicolas = new Aluno("002", "Nicolas", 2008, 07, 4, 2.3);
        Aluno Phelipe = new Aluno("003", "Phelipe", 2008, 02, 5, 3.8);
        
        Matheus.escrever();
        Nicolas.escrever();
        Phelipe.escrever();
    }
    
}
