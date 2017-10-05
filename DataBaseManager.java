import java.sql.*; 
import java.io.IOException;
import java.util.ArrayList; 

class DataBaseManager {  
	private static String jbdc = "com.mysql.jdbc.Driver";
	private static String user = "smashburn";
	private static String pass = "Comp3700";
	private static String hostDB = "jdbc:mysql://maindbinstance.cn7ucsyosm9y.us-east-2.rds.amazonaws.com/smashburnMain";


	//This is a function to get a product item by ID
	public static Product getProductByID(int _id) {
		try {
			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM product_table WHERE ID = " + _id;
			ResultSet product = stmt.executeQuery(query);
			con.close();
			if (product != null) {
				return new Product(product(1), product(2), product(3), product(4), product(5), product(6));
			}
		} catch (Exception e) {System.out.println(e);}

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
			con.close();
			if (order != null) {
				return new Order(order(1), order(2), order(3), order(4), order(5), order(6));
			}
			
		} catch (Exception e) {System.out.println(e);}

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
			con.close();
			
			if (product != null) {
				while (product.next()) {
					result.add(new Product(product(1), product(2), product(3), product(4), product(5), product(6)));
				}
			}
		} catch (Exception e) {System.out.println(e);}

		return result;
	}

	//This is a function to get an order by ID
	public static Order[] getOrders() {
		ArrayList<Order> result = new ArrayList<Order>();
		try {

			Class.forName(jbdc);
			Connection con = DriverManager.getConnection(hostDB, user, pass);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM order_table";
			ResultSet order = stmt.executeQuery(query);
			con.close();
			if (order != null) {
				while (order.next()) {
					result.add(new Order(order(1), order(2), order(3), order(4), order(5), order(6)));
				}
			}
			
		} catch (Exception e) {System.out.println(e);}

		return result;
	}


	public static void main(String args[]){  
		System.out.println("booty");

	}

}  



