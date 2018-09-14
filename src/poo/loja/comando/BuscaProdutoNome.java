package poo.loja.comando;

import java.util.Scanner;

import poo.loja.dao.ProdutoDAO;
import poo.loja.modelo.Produto;

public class BuscaProdutoNome implements Comando {
	
	public void execute(Scanner scanner) {
		ProdutoDAO DAO = new ProdutoDAO();
		
		System.out.println("Digite o nome do produto: ");
		scanner.nextLine();
     	String nome = scanner.nextLine(); 
     	
     	for(Produto prodto : DAO.buscaProdutos(nome)) {
     		System.out.println(prodto);
     	}  
     }
		
}