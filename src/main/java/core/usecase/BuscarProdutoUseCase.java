package core.usecase;
import core.entidades.Produto;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import core.exception.ProdutoNaoEncontradoException;
import core.repository.ProdutoRepository;

public class BuscarProdutoUseCase {
    private ProdutoRepository repository;

    public BuscarProdutoUseCase(ProdutoRepository repository) {this.repository = repository;}
    public List<Produto> buscarProduto(String nome) {
        List<Produto> produtos = repository.buscarPorNome(nome);

        if (produtos.isEmpty()) {
            throw new ProdutoNaoEncontradoException(
                    "Nenhum produto encontrado."
            );
        }
        return produtos;
    }
}
