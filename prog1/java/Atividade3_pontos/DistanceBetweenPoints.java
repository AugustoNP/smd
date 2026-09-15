package Atividade3_pontos;

import java.util.Scanner;
import Atividade3_pontos.Point;

public class DistanceBetweenPoints{
	public static void main (String[] args){

	Scanner inputScanner = new Scanner(System.in);
	
	Point Point1 = Point.CreatePoint(inputScanner, "Primeiro");
	Point Point2 = Point.CreatePoint(inputScanner, "Segundo");

	double distance = CalculateDistance(Point1, Point2);
		System.out.println("A distância entre os pontos é : " + distance);
	}


	public static double CalculateDistance (Point Point1, Point Point2){
		double distance = Math.sqrt((Math.pow((Point2.x - Point1.x),2) + Math.pow((Point2.y - Point1.y), 2)));
		return distance;
	}

}

	
