package supermercado;
// classe
public class Item {
    String codigo;
    String descricao;
    int quant;
    double desconto;
    double prec_und;
    
    // metodo para calcular o valor de um item (não precisa de parâmetros pq os paramentros estão no construtor)
    public double calcularValorTotalItem() {
        double totalItem = this.prec_und * this.quant;
        double valDesconto = this.desconto * totalItem;
        return totalItem - valDesconto;
    }
    
    // metodo construtor
    public Item(String codigo, String descricao, int quant, double desconto, double prec_und) {
        this.codigo = codigo;
        this.desconto = desconto;
        this.descricao = descricao;
        this.prec_und = prec_und;
        this.quant = quant;
    }
}
