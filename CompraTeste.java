package Fundamentos.OO.Composicao.Carros;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra = new Compra();
		compra.Cliente = "João";
		compra.AdicionarItem(new Item("Borracha", 20, 7.45));
		compra.AdicionarItem("Caneta ", 2,3.89);
		compra.AdicionarItem("Caderno", 3, 18.79);

	System.out.println(compra.getItemCompra());
	
	}

}
