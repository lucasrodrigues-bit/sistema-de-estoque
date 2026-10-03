package core.DTO;

import java.util.UUID;

public class BuscaProdutoDTO {
    String nome;
    UUID id;

    public BuscaProdutoDTO(String nome) {
        this.nome = nome;
    }

    public BuscaProdutoDTO(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public UUID getId() {
        return id;
    }
}
