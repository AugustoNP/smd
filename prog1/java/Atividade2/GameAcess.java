//Um jogo permite acesso a determinada área
//somente quando o jogador possui nível 20
//ou superior E pelo menos 50 moedas.
//Receba o nível e a quantidade de moedas
//e informe se o acesso foi permitido ou negado.
package Atividade2

import java.util.Scanner;

public class GameAcess {
  public static void main(String[] args) {
    
    Scanner inputScanner = new Scanner(System.in);
    
    System.out.println("por favor escreva o seu número de moedas!!!");
    int coins = inputScanner.nextInt();
  
    System.out.println("por favor escreva a seu nível!!!");  
    int level = inputScanner.nextInt();
    
    if (level >= 20 && coins >= 50){
        System.out.println("Você pode jogar!!");
    } else {
        System.out.println("Você não é bom o suficiente...");
    }

    
  }
}
