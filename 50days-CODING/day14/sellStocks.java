
import java.util.Scanner;
public class sellStocks {
    public static void main(String[] args) {
        int prices[];
        System.out.println("Enter the size of prices");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prices=new int[n];
        System.out.println("Enter the prices of Stocks");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        System.out.println("Profit is equals to "+profit);
        sc.close();
    }
}