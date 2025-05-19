package calculoimc;
public class Pessoa {
    protected String nome;
    protected String data;

    public Pessoa(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\ndata de nascimento = " + data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
