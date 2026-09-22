package Atividade2;

import java.util.Scanner;

public class StudentGrader {
  public static void main(String[] args) {
     
    Scanner inputScanner = new Scanner(System.in);
   
     


    System.out.println ("Por favor insira sua primeira nota!");
    float grade1 = inputScanner.nextFloat();
    System.out.println ("Por favor insira sua segunda nota!");
    float grade2 = inputScanner.nextFloat();
    Float finalmedian = EvaluateStudent(grade1, grade2);
    String finalgrade = GradeParser(finalmedian);

    System.out.println ("A média das notas: " +grade1+ " e " +grade2+ " é "+ finalmedian + ", " +finalgrade );

   
   
  }
 
  static Float EvaluateStudent (float grade1, float grade2){
      float gradeaverage = (grade1+grade2)/2;
      return gradeaverage;
     
  }
 
  static String GradeParser (float grade){
        if (grade > 7) {
            return "Aprovado";
        } else if (grade < 4) {
            return "Reprovado";
        } else {
            return "Avaliação Final";
        }
  }
}
