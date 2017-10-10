public class UserSystem {
	private  ArrayList<Product> currentProductList;
	private ArrayList<Order> currentOrderList;

	public UserSystem() {
		currentProductList = DataBaseManager.getProducts();
		currentOrderList = DataBaseManager.getOrders();
	}

	public ArrayList<Product> getProductList() {
		return currentProductList;
	}

	public ArrayList<Order> getOrderList() {
		return currentOrderList;
	}

	public void updateProductList() {
		currentProductList = DataBaseManager.getProducts();
	}

	public void updateOrderList() {
		currentOrderList = DataBaseManager.getOrders();
	}

}