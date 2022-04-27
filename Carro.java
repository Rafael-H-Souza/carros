package Fundamentos.OO.Composicao.Carros;

public class Carro {

	final Motor motor;
	Carro(){
		this.motor = new Motor(this);
	}
	
	
	void acelerar() {
		if(motor.fatorInjecao > 3.6) {
		motor.fatorInjecao+= 0.4;
		}
	}
	void frear () {
		if(motor.fatorInjecao > 0.2) {
		motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	void Desligar () {
		motor.ligado = false;
	}
	boolean estaLigado () {
		return motor.ligado;
	}
}
