package empresa;

public class Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jose Antonio", "111111111", 1000);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cpf: " + f1.getCpf());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Bonificacao: " + f1.getBonificacao());
        Gerente f2 = new Gerente("Pedro Henrique", "222222222", 5000, 4321, 20);
        if (f2.autenticar(4321)) {
            System.out.println("\nGerente");
            System.out.println("Nome: " + f2.getNome());
            System.out.println("Cpf: " + f2.getCpf());
            System.out.println("Salario: " + f2.getSalario());
            System.out.println("Bonificacao: " + f2.getBonificacao());
            System.out.println("Funcionarios ministrados: " + f2.getNumeroDeFuncionariosGerenciados());
        } else {
            System.out.println("A senha esta incorreta");
        }
        ControlBonificacoes controle = new ControlBonificacoes();
        controle.registra(f1);
        controle.registra(f2);
        System.out.println("O total de bonificacoes e:" + controle.getTotalDeBonificacoes());
    }

}
