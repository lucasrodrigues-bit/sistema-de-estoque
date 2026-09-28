package core.usecase.repository;

import core.domain.Produto;


import java.util.Map;
import java.util.UUID;

import java.util.Optional;

public interface ProdutoRepository {
    public void salvar(Produto produto);
    public void deletar(UUID id);
    public Optional<Produto> buscarProduto(UUID id);
    public void atualizar(Produto produto);
    public Map listar();
}
