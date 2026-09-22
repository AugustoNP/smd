package Atividade2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;

public class BiggerBetweenThree {
  public static void main(String[] args) {
     
    Scanner inputScanner = new Scanner(System.in);
    
    LinkedList<Float> numberslist = new LinkedList<Float>();

    System.out.println ("Por favor insira seu primeiro número!");
    float number1 = inputScanner.nextFloat();
    numberslist.add(number1);
    
    System.out.println ("Por favor insira seu segundo número!");
    float number2 = inputScanner.nextFloat();
    numberslist.add(number2);

    System.out.println ("Por favor insira seu terceiro número!");
    float number3 = inputScanner.nextFloat();
    numberslist.add(number3);
    

    
    Collections.sort(numberslist);
        
        System.out.println("Seus números em ordem \n (de menor pra maior)");
        for (int i = 0; i < numberslist.size(); i++){
            Float number = numberslist.get(i);
            int currentiteration = i + 1;
            
            System.out.println( currentiteration +" : " + number);
            }
   
  }

  }
