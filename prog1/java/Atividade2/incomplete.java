//• Compra >= R$ 200: 15% de desconto
//• Compra >= R$ 100: 10% de desconto
//• Compra < R$ 100: sem desconto

package Atividade2;

import java.util.Scanner;

public class PositiveOrNegative{



public static void main(String[] args){
    
        System.out.println ("Por favor insira o valor de sua compra!!!!");
        float originalprice = inputScanner.nextFloat();

		float finalprice = CalculateFinalPrice(originalprice)
		System.out.println ("Por favor insira o valor de sua compra!!!!" + );

}
	public static String CalculateDiscount(int price)
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
        int discount = CalculateDiscount(pricebeforediscount)
        return pricebeforediscount - (pricebeforediscount * (discount/100));
    }

}
