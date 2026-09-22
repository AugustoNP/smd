package Atividade1_areaparede;

import java.util.Scanner;
public class WallArea{

	public static void main (String[] args){
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Por favor, escreva as medidas de sua parede em METROS");
        
		System.out.println("\nEscreva a altura de sua parede!");
		float height = inputScanner.nextFloat();
		
		System.out.println("Escreva a largura de sua parede!");
		float width = inputScanner.nextFloat();
		
		float result = CalculateWallArea(width, height);
		System.out.println("\nA área de sua parede é : " + result + " METROS");
		}
 
	static float CalculateWallArea(float width, float height){
		float result = width * height;
		return result;
	}
}
