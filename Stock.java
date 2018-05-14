package domain;

public abstract class Stock {
	private String catagory;
	private String productId;

	public Stock(String catagory, String productId) {
		this.catagory = catagory;
		this.productId = productId;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
