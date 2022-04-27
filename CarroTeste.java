package Fundamentos.OO.Composicao.Carros;

public class CarroTeste {
public static void main(String[] args) {
	
	Carro civic = new Carro ();
	
	System.out.println(civic.estaLigado());
	civic.ligar();
	System.out.println(civic.estaLigado());
	
	System.out.println(civic.motor.giros());
	civic.acelerar();
	civic.acelerar();
	civic.acelerar();
	civic.acelerar();
	System.out.println(civic.motor.giros());
	civic.frear();
	civic.frear();
	civic.frear();
	//Relação bidirecinal
	//System.out.println(civic.motor.carro.motor.carro.motor.giros());
	System.out.println(civic.motor.giros());
}
}
