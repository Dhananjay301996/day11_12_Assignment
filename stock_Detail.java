package assignment1;

public class stock_Detail {
	private String stockName;
	private int numOfShare;
	private int sharePrice;

	public stock_Detail(String stockName, int numOfShare, int sharePrice) {
		super();
		this.stockName = stockName;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}
	
	public stock_Detail() {
		// TODO Auto-generated constructor stub
	}
	
	public void addStock() {
		// TODO Auto-generated method stub
		
	}


	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "stockDetails [stockName=" + stockName + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}

	
	


}
