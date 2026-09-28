package core.usecase;

import core.Model.CadastroInput;
import core.domain.Produto;
import core.usecase.repository.ProdutoRepository;

import java.util.UUID;

public class CadastrarProdutoUseCase {
    private final ProdutoRepository repository;

    public CadastrarProdutoUseCase(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto cadastrarProduto(CadastroInput inputUser) {
        Produto novoProduto = new Produto(
                UUID.randomUUID(),
                inputUser.getNome(),
                inputUser.getCategoria(),
                inputUser.getPreco(),
                inputUser.getEstoque()
        );
        repository.salvar(novoProduto);
        return novoProduto;
    }
}

