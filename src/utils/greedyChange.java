
package utils;
public final class greedyChange {
	public static int greedyPickin(int[] currency, int total)
	{
		if(currency.length == 0)
		{
			throw new IllegalArgumentException("Array of size 0 is not allowed");
		}
		//Initially 0 coins used
		int totalCoins = 0;
		//Base Case
		if(total == 0)
		{
			return 0;
		}
		System.out.println("Here is my total: " + total);
		//while there still is a charge/total
		while(total != 0) {
			
			//for loop going through all the types of currency
			for(int i = 0; i < currency.length; i++)
			{
				//To get the maximum amount of possible coins
				if(currency[i] <= total)
				{
					//printing out which coins we are going to use
					System.out.print(currency[i] + ", ");
					//the total after picking which coinage we are going to use
					total = total-currency[i];
					//increasing the amount of coins used
					totalCoins++;
					i--;
					
				}
			}
		}
		System.out.println();
		System.out.println("Totals Coins needed: " + totalCoins);
		//return totalCoins;
		return total;
	}
}

