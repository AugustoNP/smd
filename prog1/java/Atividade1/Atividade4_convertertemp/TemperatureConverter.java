package Atividade4_convertertemp;

import java.util.Scanner;
public class TemperatureConverter{

	public static void main (String[] args){
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Por favor, informe a temperatura em graus Celsius");

		System.out.println("\nDigite o valor:");
		float celsius = inputScanner.nextFloat();

		float result = CalculateFahrenheit(celsius);
		System.out.println("\n" + celsius + " °C equivalem a " + result + " °F");
		}

	static float CalculateFahrenheit(float celsius){
		float result = celsius * 9 / 5 + 32;
		return result;
	}
}
