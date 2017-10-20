public class Product {
	private String name;
	private int id;
	private double price;
	private String vendor;
	private double tax;
	private double weight;

	public Product() {
		name = "";
		id = 0;
		price = 0.0;
		vendor = "";
		tax = 0.0;
		weight = 0.0;
	}

	public Product(String _name, int _id, double _price, String _vendor, double _tax,  
		double _weight) {
		name = _name;
		id = _id;
		price = _price;
		vendor = _vendor;
		tax = _tax;
		weight = _weight;
	}

	public String getInfo() {
		return name + "" + id + "" + price;
	}

}
