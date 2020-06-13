package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F -32) X 5/9 = °C
		double fahrenheit = 126;
		double celsios;
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double resultado = (fahrenheit - AJUSTE ) * FATOR;
		
		celsios = resultado;
		
		System.out.println(" o valor é de "+ celsios);
		
	}
}
