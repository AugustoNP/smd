import java.util.Scanner;
public class DivideTab{
	public static void main (String[] args){

		Scanner inputScanner = new Scanner(System.in);
	
		System.out.println("\nQuantas pessoas irão dividir a conta?");
		int numberOfPeople = inputScanner.nextInt();
	
		System.out.println("Qual foi o valor total da conta?");
		float totalPrice = inputScanner.nextFloat();
		
		float result = DivideTab(totalPrice, numberOfPeople);
		System.out.println("Para: " +numberOfPeople+ " Pessoas, com o valor : " +totalPrice+ ". o valor por pessoa foi : " +result);
	}
	
	static float DivideTab(float price, int divisor){
		float dividedTab = price/divisor;
		return dividedTab;
	}
}
