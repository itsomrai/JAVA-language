/*Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/
public class timeToSellStock {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        int l=price.length;
        int buy=price[0];
        int profit=0;
        for(int i=0;i<l;i++){
            if(price[i]<buy){
                buy=price[i];
            }
            profit=Math.max(profit,price[i]-buy);
        }
            System.out.println(profit);
        }
    }
