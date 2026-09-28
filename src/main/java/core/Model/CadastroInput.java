package core.Model;



public class CadastroInput {
    private String nome,categoria;
    private float preco;
    private int estoque;

    public CadastroInput(String nome, String categoria, float preco, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }
}
