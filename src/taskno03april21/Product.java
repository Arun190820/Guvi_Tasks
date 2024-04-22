package taskno03april21;
//Question no.02

public class Product implements Taxable {
	
	private int id;
	private double price;
	private double quantity;

	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void calcTax(double a) {
		double netPrice = a*saleTax;
		System.out.println("The sales Tax: "+ netPrice);
	
	}

}
