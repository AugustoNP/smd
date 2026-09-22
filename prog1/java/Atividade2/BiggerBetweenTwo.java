package Atividade2;

import java.util.Scanner;

public class BiggerBetweenTwo {
  public static void main(String[] args) {
     
    Scanner inputScanner = new Scanner(System.in);

    System.out.println ("Por favor insira seu primeiro número!");
    float number1 = inputScanner.nextFloat();
    
    System.out.println ("Por favor insira seu segundo número!");
    float number2 = inputScanner.nextFloat();
    
    Boolean issame = CheckIfSameNumber(number1,number2);

    if (issame == true){
        System.out.println("os números " +number1+ " e " +number2+ " são os mesmos!");
    } else{
        float biggernumber = CheckBiggerNumber(number1, number2);
        System.out.println("entre os números " +number1+ " e " +number2+ ", " +biggernumber+ " é maior!");
    }
   
   
  }

  //retorna o maior entre dois números
    static float CheckBiggerNumber (float firstnumber, float secondnumber){
         
         if (firstnumber > secondnumber){
             return firstnumber;
         } else {
             return secondnumber;
         }
    }

//verifica se o número é o mesmo
    static Boolean CheckIfSameNumber (float firstnumber, float secondnumber){
        float remaining = firstnumber - secondnumber;
        
        if (remaining == 0)
        {
            return true;
        } else {
            return false;
            
        }
    
 
  }
}
