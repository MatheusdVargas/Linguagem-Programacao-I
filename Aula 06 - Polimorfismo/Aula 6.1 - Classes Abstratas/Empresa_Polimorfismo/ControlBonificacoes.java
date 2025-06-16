package empresa;

public class ControlBonificacoes  {

    private double totalDeBonificacoes = 0;

    public ControlBonificacoes() {
    }

    
    public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
