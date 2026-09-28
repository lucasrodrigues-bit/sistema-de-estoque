package core.usecase.repository;

import core.domain.Produto;

import java.util.Optional;

public interface ProdutoRepository {
    public void criar(Produto produto);
    public void deletar(Produto produto);
    public Optional<Produto> buscarPorId(Long id);
    public void atualizar(Produto produto);
    public void listar(Produto produto);
    public void categorizar(Produto categoria);
}
