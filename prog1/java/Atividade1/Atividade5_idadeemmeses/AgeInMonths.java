package Atividade5_idadeemmeses;

import java.util.Scanner;
public class AgeInMonths{

	public static void main (String[] args){
		Scanner inputScanner = new Scanner(System.in);


		System.out.println("\nQual é o seu nome?");
		String name = inputScanner.nextLine();

		System.out.println("Qual é a sua idade em anos?");
		int age = inputScanner.nextInt();

		int result = CalculateAgeInMonths(age);
		System.out.println("\n" + name + ", você tem " + age + " anos, o que equivale a aproximadamente " + result + " meses de vida.");
		}

	static int CalculateAgeInMonths(int age){
		int result = age * 12;
		return result;
	}
}
