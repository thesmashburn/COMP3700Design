import java.sql.*; 
import java.io.IOException;
import java.util.ArrayList; 

class DataBaseManager {  
	private static String jbdc = "com.mysql.jdbc.Driver";
	private static String user = "smashburn";
	private static String pass = "helloworld";
	private static String hostDB = "jdbc:mysql://maindbinstance.cn7ucsyosm9y.us-east-2.rds.amazonaws.com/smashburnMain";



	//This is a function to get a product item by ID
	public static Product getProductByID(int _id) {
		try {
			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM product_table WHERE ID = " + _id;
			ResultSet product = stmt.executeQuery(query);
			
			if (product != null) {
				return new Product(product.getString(1), product.getInt(2), product.getDouble(3), product.getString(4), product.getDouble(5), product.getDouble(6));
			}
		} catch (Exception e) {System.out.println(e);}
		con.close();
		return null;
	}

	//This is a function to get an order by ID
	public static Order getOrderByID(int _id) {
		try {

			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM order_table WHERE ID = " + _id;
			ResultSet order = stmt.executeQuery(query);
			
			if (order != null) {
				return new Order(order.getInt(1), order.getString(2), order.getString(3), order.getDouble(4), order.getString(5), order.getString(6));
			}
			
		} catch (Exception e) {System.out.println(e);}
		con.close();
		return null;
	}

	//This is a function to get a product item by ID
	public static ArrayList<Product> getProducts() {
		ArrayList<Product> result = new ArrayList<Product>();
		try {
			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM product_table";
			ResultSet product = stmt.executeQuery(query);
			
			
			if (product != null) {
				while (product.next()) {
					result.add(new Product(product.getString(1), product.getInt(2), product.getDouble(3), product.getString(4), product.getDouble(5), product.getDouble(6)));
				}
			}
			con.close();
		} catch (Exception e) {System.out.println(e);}

		return result;
	}

	//This is a function to get an order by ID
	public static ArrayList<Order> getOrders() {
		ArrayList<Order> result = new ArrayList<Order>();
		try {

			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM order_table";
			ResultSet order = stmt.executeQuery(query);
			
			if (order != null) {
				while (order.next()) {
					result.add(new Order(order.getInt(1), order.getString(2), order.getString(3), order.getDouble(4), order.getString(5), order.getString(6)));
				}
			}
			con.close();
		} catch (Exception e) {System.out.println(e);}

		return result;
	}




	public static Boolean updateProduct(int _id) {
		return true;
	}

	public static Boolean addProduct(String _name, int _id, double _price, String _vendor, double _tax,  
		double _weight) {
		return true;


	}

	public static void main(String args[]){  
		System.out.println("booty");
		ArrayList<Product> test = DataBaseManager.getProducts();
		for (Product i : test) {
			System.out.println(i.getInfo());
		}


	}

}  



