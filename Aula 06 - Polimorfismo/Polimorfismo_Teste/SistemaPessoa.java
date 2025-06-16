package sistemapessoa;

public class SistemaPessoa {

    public static void main(String[] args) {
        // Superclasse Pessoa
        Pessoa p1 = new Pessoa("Henrique", "Rua Campos Salles, 14", "2512-4099");
        System.out.println("Nome: " + p1.getNome() + "\nEndereco: " + p1.getEndereco() + "\nNumero: " + p1.getTelefone() + "\n ");

        p1.setNome("Pedro");
        p1.setEndereco("Rua America, 178");
        p1.setTelefone("3712-2691");
        System.out.println("Nome: " + p1.getNome() + "\nEndereco: " + p1.getEndereco() + "\nNumero: " + p1.getTelefone() + "\n");

        // Classe filha Fornecedor
        Fornecedor f1 = new Fornecedor("Maria", "Rua Getulio Vargas, 55", "3512-5544", 5000, 1500);

        System.out.println("Nome: " + f1.getNome() + "\nEndereco: " + f1.getEndereco() + "\nNumero: " + f1.getTelefone()
                + "\nCredito: " + f1.getValorCredito() + "\nDivida: " + f1.getValorDivida());

        System.out.println("Saldo: " + f1.obterSaldo() + "\n");

        // Classe filha Empregado
        Empregado e1 = new Empregado("Jose ", "Avenida Do Patrocinio, 799", "5231-7563", 23, 2500, 15);

        System.out.println("Nome: " + e1.getNome() + "\nEndereco: " + e1.getEndereco() + "\nNumero: " + e1.getTelefone()
                + "\nCodigo Setor: " + e1.getCodigoSetor() + "\nSalario Base: " + e1.getSalarioBase() + "\nPorcentagem imposto: " + e1.getImposto() + "%");

        System.out.println("Salario: " + e1.calcularSalario());
    }

}
