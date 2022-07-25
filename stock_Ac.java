package assignment1;
import java.util.*;

public class stock_Ac {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<stock_Detail> stockList = new ArrayList<stock_Detail>();

	public void addStock() {

		stock_Detail stock1 = new stock_Detail();

		System.out.println("Plase Enter Stock Details");
		System.out.println("Plase Enter Stock Name");
		stock1.setStockName(sc.next());
		System.out.println("Plase Enter Number of Shares ");
		stock1.setNumOfShare(sc.nextInt());
		System.out.println("Plase Enter Share Price");
		stock1.setSharePrice(sc.nextInt());
		stockList.add(stock1);
		System.out.println("The Stock Details Are ");
		System.out.println("The value of Each Stock : " + (stock1.getNumOfShare() * stock1.getSharePrice()));
        System.out.println(stockList);

	}

}
