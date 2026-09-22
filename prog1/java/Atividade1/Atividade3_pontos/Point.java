package Atividade3_pontos;
import java.util.Scanner;

public class Point{
	double x;
	double y;
	
	public Point (double x, double y){
		this.x = x;
		this.y = y;
	}
	public static Point CreatePoint (Scanner scanner, String label){
		System.out.println("Escreva os pontos x e y para o ponto" + label);
		return new Point (scanner.nextDouble(), scanner.nextDouble());
	}
}

