package calculadoraPackage;
import java.lang.Math;
import java.util.Scanner;

public class CalculadoraCientifica extends Calculadora {
	Scanner input = new Scanner(System.in);
	
	private double expoente;
	
	public double exponenciar() {
		return Math.pow(getNum1(), getExpoente());
	}

	public void setExpoente(double expoente) {
		this.expoente = expoente;
	}
	
	public double getExpoente() {
		return expoente;
	}
	
	public double calcularRaizQuadrada() {
		return Math.sqrt(getNum1());
	}
	
	public double calcularSeno() {
		return Math.sin(getNum1());
	}
	
	public double calcularCosseno() {
		return Math.cos(getNum1());
	}
	
	public double calcularTangente() {
		return Math.tan(getNum1());
	}
	
	public double calcularLogaritmo() {
		return Math.log10(getNum1());
	}
}
