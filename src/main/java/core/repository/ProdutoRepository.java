package core.repository;

import core.entidades.Produto;


import java.util.List;
import java.util.UUID;

import java.util.Optional;

public interface ProdutoRepository {
    public void salvar(Produto produto);
    public void deletar(UUID id);
    public Optional<Produto> buscarPorId(UUID id);
    public List<Produto> buscarPorNome(String nome);
    public void atualizar(Produto produto);
    public List<Produto> listar();
}
