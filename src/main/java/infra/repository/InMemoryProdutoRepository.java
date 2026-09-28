package infra.repository;

import core.domain.Produto;
import core.usecase.repository.ProdutoRepository;

import java.util.*;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private Map<UUID, Produto>produtos = new HashMap<>();

    @Override
    public void salvar(Produto produto){
        produtos.put(produto.getId(),produto);
        System.out.println(produtos.get(produto.getId()));

    }
    public void deletar(UUID id){

    };
    public Optional<Produto> buscarProduto(UUID id) {
        return null;
    };
    public void atualizar(Produto produto){

    };
    public Map listar(){
    return null;
    };

    public void categorizar(Produto produto){
    }
}
