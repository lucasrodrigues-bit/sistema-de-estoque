package infra.repository;

import core.domain.Produto;
import core.usecase.repository.ProdutoRepository;

import java.util.*;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private Map<UUID, Produto>produtos = new HashMap<>();

    @Override
    public void salvar(Produto produto){
        if(produtos.containsKey(produto.getId())){
            System.out.println("Produto já cadastrado");
            return;
        }
        produtos.put(produto.getId(),produto);

    }
    @Override
    public void deletar(UUID id){

    };
    public Optional<Produto> buscarProduto(UUID id) {
    @Override
    @Override
        return null;
    }
    @Override
    public void atualizar(Produto produto){

    };
    @Override
    public List listar(){
    return null;
    };
}
