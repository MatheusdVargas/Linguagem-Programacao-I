package empresa;

public class Gerente extends Funcionario {

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public boolean autenticar(int senha) {
        if (this.getSenha() == senha) {
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
