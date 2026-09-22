package Atividade2;

import javax.swing.JOptionPane;

public class OddOrEven{



public static void main(String[] args){
		String numberinput = JOptionPane.showInputDialog("Escreva um número! Vamos verificar se ele é par ou ímpar!");
		float number = Integer.parseInt(numberinput);

		String numberSignal = CheckNumberSignal(number);

		JOptionPane.showMessageDialog(null, "O seu número: (" +number+ ") é " + numberSignal);


}
	public static String CheckNumberSignal (float number)
	{	
		float remainder = number % 2;

		if (remainder == 0){
			return "par";
		}
		else
		{
			return "impar";
		}
	}

}
