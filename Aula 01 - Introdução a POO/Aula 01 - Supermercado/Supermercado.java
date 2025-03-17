package supermercado;

public class Supermercado {

    public static void main(String[] args) {
        // Cria objeto item (tipo + nome = new construtor + atributos)
        Item i1 = new Item("001", "Pizza", 1, 0.05, 20.0);
        
        Item i2 = new Item("002", "Refrigerante", 2, 0.02, 8.0);
        
        Item i3 = new Item("003", "Bolo", 1, 0.12, 80.0);
        
        Item i4 = new Item("004", "Cerveja", 12, 0.08, 6.0);
        
        double totalCupom = i1.calcularValorTotalItem() + i2.calcularValorTotalItem() + i3.calcularValorTotalItem() + i4.calcularValorTotalItem();
        
        System.out.println("------------------------------------ Cupom fiscal ------------------------------------");
        System.out.println("Codigo\tDescricao\tQuantidade\tValor Unitario\tDesconto\tValor Total Item");
        System.out.println(i1.codigo + " \t " + i1.descricao + " \t \t" + i1.quant + " \t\t " + i1.prec_und +  "\t\t" + i1.desconto + "\t\t" + i1.calcularValorTotalItem());
        System.out.println(i2.codigo + " \t " + i2.descricao + " \t" + i2.quant + " \t\t " + i2.prec_und +  "\t\t" + i2.desconto + "\t\t" + i2.calcularValorTotalItem());
        System.out.println(i3.codigo + " \t " + i3.descricao + " \t \t" + i3.quant + " \t\t " + i3.prec_und +  "\t\t" + i3.desconto + "\t\t" + i3.calcularValorTotalItem());
        System.out.println(i4.codigo + " \t " + i4.descricao + " \t" + i4.quant + " \t\t " + i4.prec_und +  "\t\t" + i4.desconto + "\t\t" + i4.calcularValorTotalItem());
        System.out.println("\nValor total do cupom fiscal: " + totalCupom);
    }
}