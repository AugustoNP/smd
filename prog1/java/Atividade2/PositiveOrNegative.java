package Atividade2;

import javax.swing.JOptionPane;

public class PositiveOrNegative{



public static void main(String[] args){
		String numberinput = JOptionPane.showInputDialog("Escreva um número!");
		int number = Integer.parseInt(numberinput);

		String numberSignal = CheckNumberSignal(number);

		JOptionPane.showMessageDialog(null, "O seu número: (" +number+ ") é " + numberSignal);


}
	public static String CheckNumberSignal (int number)
	{
		if (number > 0){
			return "positivo";
		}
		else if (number < 0)
		{
			return "negativo";
		}
		else {
			return "zero";
		}
	}

}
