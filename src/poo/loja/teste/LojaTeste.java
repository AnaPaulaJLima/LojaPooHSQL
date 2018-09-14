package poo.loja.teste;

import java.util.Hashtable;
import java.util.Scanner;

import poo.loja.comando.AtualizarProduto;
import poo.loja.comando.BuscaProdutoNome;
import poo.loja.comando.BuscaProdutoPreco;
import poo.loja.comando.CadastrarProduto;
import poo.loja.comando.Comando;
import poo.loja.comando.ListarProdutos;
import poo.loja.comando.RemoverProduto;
import poo.loja.comando.Sair;


public class LojaTeste {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int escolha = 0;

		System.out.println("\n Escolha a ação que deseja realizar nos produtos");
		System.out.println("\n 1 - Inserir");
		System.out.println("\n 2 - Atualizar");
        System.out.println("\n 3 - Remover");
        System.out.println("\n 4 - Buscar por nome");
        System.out.println("\n 5 - Buscar por preço");
        System.out.println("\n 6 - Listar os produtos");
        System.out.println("\n 0 - Sair");
       
        Hashtable<Integer, Comando> comandos = new Hashtable<Integer, Comando>();
        
        comandos.put(0, new Sair());
        comandos.put(1, new CadastrarProduto());
        comandos.put(2, new AtualizarProduto());
        comandos.put(3, new RemoverProduto());
        comandos.put(4, new BuscaProdutoNome());
        comandos.put(5, new BuscaProdutoPreco());
        comandos.put(6, new ListarProdutos());
    
        while (escolha <= 6) {
        	
        	escolha = scanner.nextInt();
        	comandos.get(escolha).execute(scanner);
        	
        	System.out.println("\n Escolha a ação que deseja realizar nos produtos");
    		System.out.println("\n 1 - Inserir");
    		System.out.println("\n 2 - Atualizar");
            System.out.println("\n 3 - Remover");
            System.out.println("\n 4 - Buscar por nome");
            System.out.println("\n 5 - Buscar por preço");
            System.out.println("\n 6 - Listar os produtos");
            System.out.println("\n 0 - Sair");
          
        }

	}

}
