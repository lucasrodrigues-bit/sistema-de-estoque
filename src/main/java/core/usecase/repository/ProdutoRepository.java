package core.usecase.repository;

import core.domain.Produto;
import core.usecase.CadastrarProdutoUseCase;
import java.util.UUID;

import java.util.Optional;

public interface ProdutoRepository {
    public void salvar(Produto salvar);
    public void deletar(UUID id);
    public Optional<Produto> buscarPorId(UUID id);
    public void atualizar(Produto produto);
    public void listar();
}
