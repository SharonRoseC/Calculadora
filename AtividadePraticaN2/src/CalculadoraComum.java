import java.util.Scanner;
public class CalculadoraComum extends Calculadora {
	Scanner in = new Scanner (System.in);

	public double soma ()  {
		return getNum1()+getNum2();
	}

	public double subtracao () {
		return getNum1()-getNum2();
	}
	public double multiplicacao() {
		return getNum1()*getNum2();
	}
	public double dividir() {

		double Num2 = 0;
		if (getNum2() == 0) {
			while (Num2 ==0) {
				System.out.printf("Digite um numero diferente de zero");
				Num2 = in.nextDouble();
			}
			setNum2(Num2);

		}

		return getNum1()/getNum2();


	}



}