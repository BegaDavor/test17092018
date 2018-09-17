package zadatak1;

public class Book {
	
	// atributi
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	// konstruktori
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + getName() + "\n" + "Author: \n" + getAuthor() + "\n" + "Price: " + getPrice() + "\n" + "Quantity in stock: " + getQtyInStock();
	}

}
