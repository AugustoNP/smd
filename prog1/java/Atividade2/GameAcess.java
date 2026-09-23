//Leia a largura e a altura de uma imagem e informe:
//● largura > altura → 'Paisagem'
//● altura > largura → 'Retrato'
//● largura == altura → 'Quadrada'

//package Atividade2;

import java.util.Scanner;

public class GameAcess {
  public static void main(String[] args) {
     
    Scanner inputScanner = new Scanner(System.in);
   
     


    System.out.println ("Por favor insira a largura de sua imagem!");
    float width = inputScanner.nextFloat();
    System.out.println ("Por favor insira a altura de sua imagem!");
    float height = inputScanner.nextFloat();
    
    String aspectratio = CheckAspectRatio(width, height);

    System.out.println ("A imagem de input com largura: " +width+ " e altura: " +height+ " é "+ aspectratio);

   
   
  }
 
 
  static String CheckAspectRatio (float largura, float altura){
        if (largura > altura) {
            return "Paisagem";
        } else if (largura < altura) {
            return "Retrato";
        } else {
            return "Quadrada";
        }
  }
}
