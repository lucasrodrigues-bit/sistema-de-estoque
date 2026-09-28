package infra.repository;

import core.domain.Produto;
import core.usecase.repository.ProdutoRepository;

import java.util.Optional;
import java.util.UUID;
import core.usecase.CadastrarProdutoUseCase;
public class InMemoryProdutoRepository implements ProdutoRepository {

    public void criar(Produto produto){
    }
    public void deletar(Produto produto){

    };
    public Optional<Produto> buscarPorId(Long id) {
        return null;
    };
    public void atualizar(Produto produto){

    };
    public void listar(Produto produto){

    };

    public void categorizar(Produto produto){
    }
}
