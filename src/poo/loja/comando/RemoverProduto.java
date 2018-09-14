package poo.loja.comando;

import java.util.Scanner;

import poo.loja.dao.ProdutoDAO;

public class RemoverProduto implements Comando {
	
	public void execute (Scanner scanner) {
		ProdutoDAO DAO = new ProdutoDAO();
		
		System.out.println("Digite o ID do produto que deseja remover: ");   	  		
 		DAO.remove(scanner.nextInt());   
	}

}
