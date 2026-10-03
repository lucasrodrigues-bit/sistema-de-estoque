import core.DTO.CadastroProdutoDTO;
import java.util.Scanner;
import core.DTO.BuscaProdutoDTO;

import core.repository.ProdutoRepository;
import core.usecase.BuscarProdutoUseCase;
import core.usecase.CadastrarProdutoUseCase;

public class Aplplication {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Bem Vindo ao sistema de cadastro");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("==================================");
        int decisao;
        int opcoes = 5;

        do {
            System.out.println("[1]Cadastrar Novo Produto");
            System.out.println("[2]Excluir Produto");
            System.out.println("[3]Atualizar Produto");
            System.out.println("[4]Buscar Produto");
            System.out.println("[5]Listar Todos os Produtos");
            System.out.println("[0]Sair do sistema");
            decisao = input.nextInt();
            if (decisao > opcoes) {
                System.out.println("===================");
                System.out.println("Opção Inválida");
                System.out.println("===================");
            }
            switch (decisao) {
                case 1:
                    System.out.println("Nome:");
                    String nomeCadastro = input.nextLine();
                    System.out.println("Preço:");
                    float preco = input.nextInt();
                    input.nextFloat();
                    System.out.println("Categoria:");
                    String categoria = input.nextLine();
                    System.out.println("Estoque:");
                    int estoque = input.nextInt();
                    input.nextInt();
                     new CadastroProdutoDTO(
                            nomeCadastro,
                            categoria,
                            preco,
                            estoque);
                    break;
                case 4:
                    System.out.println("Qual produto deseja procurar?");
                    String nomeBusca = input.nextLine();
                    new BuscaProdutoDTO(
                            nomeBusca
                    );
                    break;
            }


        }while(decisao != 0);
        System.out.println("Sistema Fechado");

    }


}
