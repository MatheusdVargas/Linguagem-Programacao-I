package supermercado;

public class Supermercado {

    public static void main(String[] args) {
        // Cria objeto item (tipo + nome = new construtor + atributos)
        Item i1 = new Item("001", "Pizza", 1, 0.05, 20.0);
        
        Item i2 = new Item("002", "Refrigerante", 2, 0.02, 8.0);
        
        Item i3 = new Item("003", "Bolo", 1, 0.12, 80.0);
        
        Item i4 = new Item("004", "Cerveja", 12, 0.08, 6.0);
        
        double totalCupom = i1.calcularValorTotalItem() + i2.calcularValorTotalItem() + i3.calcularValorTotalItem() + i4.calcularValorTotalItem();
        
        System.out.println("------------------------------------- Cupom fiscal -------------------------------------");
        System.out.println("Codigo\tDescricao\tQuantidade\tValor\t\tDesconto\tValor Total Item");
        System.out.println(i1.getCodigo() + " \t " + i1.getDescricao() + " \t \t" + i1.getQuantidade() + " \t\t " + i1.getPrecUnd() +  "\t\t" + i1.getDesconto() + "\t\t" + i1.calcularValorTotalItem());
        System.out.println(i2.getCodigo() + " \t " + i2.getDescricao() + " \t" + i2.getQuantidade() + " \t\t " + i2.getPrecUnd() +  "\t\t" + i2.getDesconto() + "\t\t" + i2.calcularValorTotalItem());
        System.out.println(i3.getCodigo() + " \t " + i3.getDescricao() + " \t \t" + i3.getQuantidade() + " \t\t " + i3.getPrecUnd() +  "\t\t" + i3.getDesconto() + "\t\t" + i3.calcularValorTotalItem());
        System.out.println(i4.getCodigo() + " \t " + i4.getDescricao() + " \t" + i4.getQuantidade() + " \t\t " + i4.getPrecUnd() +  "\t\t" + i4.getDesconto() + "\t\t" + i4.calcularValorTotalItem());
        System.out.println("\nValor total do cupom fiscal: " + totalCupom);
        
        i1.setPrecUnd(40.0);
        i2.setPrecUnd(5.0);
        i3.setPrecUnd(55.0);
        i4.setPrecUnd(9.0);
        totalCupom = i1.calcularValorTotalItem() + i2.calcularValorTotalItem() + i3.calcularValorTotalItem() + i4.calcularValorTotalItem();
        
        System.out.println("--------------------------------- Cupom fiscal Alterado ---------------------------------");
        System.out.println("Codigo\tDescricao\tQuantidade\tValor\t\tDesconto\tValor Total Item");
        System.out.println(i1.getCodigo() + " \t " + i1.getDescricao() + " \t \t" + i1.getQuantidade() + " \t\t " + i1.getPrecUnd() +  "\t\t" + i1.getDesconto() + "\t\t" + i1.calcularValorTotalItem());
        System.out.println(i2.getCodigo() + " \t " + i2.getDescricao() + " \t" + i2.getQuantidade() + " \t\t " + i2.getPrecUnd() +  "\t\t" + i2.getDesconto() + "\t\t" + i2.calcularValorTotalItem());
        System.out.println(i3.getCodigo() + " \t " + i3.getDescricao() + " \t \t" + i3.getQuantidade() + " \t\t " + i3.getPrecUnd() +  "\t\t" + i3.getDesconto() + "\t\t" + i3.calcularValorTotalItem());
        System.out.println(i4.getCodigo() + " \t " + i4.getDescricao() + " \t" + i4.getQuantidade() + " \t\t " + i4.getPrecUnd() +  "\t\t" + i4.getDesconto() + "\t\t" + i4.calcularValorTotalItem());
        System.out.println("\nValor total do cupom fiscal: " + totalCupom);
    }
}