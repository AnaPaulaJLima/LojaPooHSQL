package poo.loja.comando;

import poo.loja.dao.ProdutoDAO;
import poo.loja.modelo.Produto;

import java.util.Scanner;

public class ListarProdutos implements Comando {
	
	public void execute(Scanner entrada) {
		ProdutoDAO DAO = new ProdutoDAO();
		
		System.out.println("Lista de produtos:");
		for(Produto prod : DAO.getProdutos()) {
			System.out.println(prod);
		} 
	}
}
