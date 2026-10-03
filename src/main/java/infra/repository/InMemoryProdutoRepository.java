package infra.repository;


import core.entidades.Produto;
import core.exception.CadastroInvalidoException;
import core.repository.ProdutoRepository;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private Map<UUID, Produto>produtos = new HashMap<>();

        @Override
        public void salvar(@NotNull Produto novoProduto) {
            if (produtos.containsKey(novoProduto.getId())) {
                throw new CadastroInvalidoException("Produto já cadastrado");
            }
        }
                @Override
                public void deletar( @NotNull String nome){
                    produtos.remove(nome);
                };

                @Override
                    public Optional<Produto> buscarPorId(@NotNull UUID id) {
                        Produto produto = produtos.get(id);
                        return Optional.ofNullable(produto);
                    }
                        @Override
                        public List<Produto> buscarPorNome(@NotNull String nome){
                            List<Produto> encontrados = new ArrayList<>();
                            for(Produto produto : produtos.values()){
                                if(produto.getNome().equalsIgnoreCase(nome)){
                                    encontrados.add(produto);
                                }
                            }
                            return encontrados;
                        }
                        @Override
                            public void atualizar(@NotNull Produto produto){

                            };
                            @Override
                            public List<Produto> listar(){
                                return new LinkedList<>(produtos.values());
                            }
                        }