package core.DTO;


import core.usecase.CadastrarProdutoUseCase;

public class CadastroProdutoDTO {
    private String nome,categoria;
    private float preco;
    private int estoque;

    public CadastroProdutoDTO(String nome, String categoria, float preco, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public float getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }
}
