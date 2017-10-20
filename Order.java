public class Order {
	private int id;
	private String date;
	private String payMethod;
	private double total;
	private String items;
	private String quantities;

	public Order() {
		id = 0;
		date = "";
		payMethod = "";
		total = 0.0;
		items = "";
		quantities = "";

	}

	public Order(int _id, String _date, String _payMethod, double _total, String _items, String _quantities) {
		id = _id;
		date = _date;
		payMethod = _payMethod;
		total = _total;
		items = _items;
		quantities = _quantities;
	}






}
