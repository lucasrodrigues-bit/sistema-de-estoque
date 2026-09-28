package core.usecase;

import core.Model.CadastroInput;
import core.domain.Produto;

import java.util.UUID;

public class CadastrarProdutoUseCase {
    public Produto CadastrarProduto(CadastroInput inputUser) {
        Produto novoProduto = new Produto(
                UUID.randomUUID(),
                inputUser.getNome(),
                inputUser.getCategoria(),
                inputUser.getPreco(),
                inputUser.getEstoque()
        );
        return novoProduto;
    }
}

