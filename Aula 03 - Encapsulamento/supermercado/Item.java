package supermercado;
// classe
public class Item {
    // Encapsulamento com private
    private String codigo;
    private String descricao;
    private int quant;
    private double desconto;
    private double prec_und;
    
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
    
    // metodos acessores
    public String getCodigo() {
        return this.codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public double getDesconto() {
        return this.desconto;
    }
    public int getQuantidade() {
        return this.quant;
    }
    public double getPrecUnd() {
        return this.prec_und;
    }
    
    // metodos mutantes
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public void setQuantidade(int quant) {
        this.quant = quant;
    }
    public void setPrecUnd(double prec_und) {
        this.prec_und = prec_und;
    }
}
