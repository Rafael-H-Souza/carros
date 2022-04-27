package Fundamentos.OO.Composicao.Carros; 

import java.util.ArrayList;

public class Compra {

	String Cliente;
	ArrayList<Item> cadastro = new ArrayList<Item>();
	
	void AdicionarItem(String nome, int quatidade,double preco) {
		this.AdicionarItem(new Item(nome, quatidade, preco));
	}
	void AdicionarItem(Item item) {
		this.cadastro.add(item);
		item.compra = this;
	}
	String getItemCompra() {
		String todas = "";
		double total = 0;
		for(Item item: cadastro) {
			total =item.quantidade *item.preco;
			todas +="Produto  "+ item.nome+"              "+item.quantidade
					+"    Preço   "+item.preco+"\n"+total+"\n";
						}
		return todas;
	}
	String getValorTotal() {
		String total = " ";
	    	for(Item item : cadastro) {
		    	total +=item.quantidade *item.preco;
		}
		return total;
	}
}
