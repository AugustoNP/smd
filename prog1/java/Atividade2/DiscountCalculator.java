//• Compra >= R$ 200: 15% de desconto
//• Compra >= R$ 100: 10% de desconto
//• Compra < R$ 100: sem desconto

package Atividade2;

import java.util.Scanner;

public class DiscountCalculator{



public static void main(String[] args){
    
    
	Scanner inputScanner = new Scanner(System.in);
        
	System.out.println ("Por favor insira o valor de sua compra!!!!");
        float originalprice = inputScanner.nextFloat();

		float finalprice = CalculateFinalPrice(originalprice);
		int discount = CalculateDiscount(originalprice);
		System.out.println ("O preço final com desconto de " + discount + "% é de " + finalprice );

}
	public static int CalculateDiscount(float price)
	{
		if (price >= 200){
			return 15;
		}
		else if (price >= 100)
		{
			return 10;
		}
		else {
			return 0;
		}
	}
	
    public static float CalculateFinalPrice(float pricebeforediscount){
        int discount = CalculateDiscount(pricebeforediscount);
        return (pricebeforediscount - (pricebeforediscount * (discount/100.0f)));
    }

}
