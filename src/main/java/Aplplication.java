import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Scanner;

public class Aplplication {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Bem Vindo ao sistema de cadastro");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("==================================");
        int decisao;

        do{
            System.out.println("[1]Cadastrar Novo Produto");
            System.out.println("[2]Excluir Produto");
            System.out.println("[3]Atualizar Produto");
            System.out.println("[4]Buscar Produto");
            System.out.println("[5]Listar Todos os Produtos");
            System.out.println("[0]Sair do sistema");
            decisao = input.nextInt();
        }while( decisao != 0);
        System.out.println("Sistema Fechado");

    }


}
