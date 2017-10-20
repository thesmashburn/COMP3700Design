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
                        con.close();
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
			
			if (order != null) {
				return new Order(order.getInt(1), order.getString(2), order.getString(3), order.getDouble(4), order.getString(5), order.getString(6));
			}
                        con.close();
			
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




	public static Boolean updateProduct(String _name, int _id, double _price, String _vendor, double _tax,  
		double _weight) {
		try {
                    Class.forName(jbdc);
                    Connection con = DriverManager.getConnection(hostDB, user, pass);
			
                    String query = "UPDATE product_table set Name = ?, Price = ?, Vendor = ?, Tax = ?, Weight = ?" +
                    " WHERE ID = ?";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString(1, _name);
                    preparedStmt.setDouble(2, _price);
                    preparedStmt.setString(3, _vendor);
                    preparedStmt.setDouble(4, _tax);
                    preparedStmt.setDouble(5, _weight);
                    preparedStmt.setInt(6, _id);

                    if (preparedStmt.executeUpdate() != 0) {
                            return true;
                    }
                    con.close();
			
		} catch (Exception e) {System.out.println(e);}

		return false;
	}

	public static Boolean addProduct(String _name, int _id, double _price, String _vendor, double _tax,  
		double _weight) {
		try {
                    Class.forName(jbdc);
                    Connection con = DriverManager.getConnection(hostDB, user, pass);
			
                    String query = "INSERT INTO product_table(Name, ID, Price, Vendor, Tax, Weight) " +
                    "VALUES(?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString(1, _name);
      		    preparedStmt.setInt(2, _id);
     	            preparedStmt.setDouble(3, _price);
      		    preparedStmt.setString(4, _vendor);
     	            preparedStmt.setDouble(5, _tax);
     	            preparedStmt.setDouble(6, _weight);

                    if (preparedStmt.execute()) {
                        return true;
                    }
                    con.close();
		} catch (Exception e) {System.out.println(e);}
		return false;
	}

	public static Boolean addOrder(int _id, String _date, String _payMethod, double _total, String _items, String _quantities) {
		try {
                    Class.forName(jbdc);
                    Connection con = DriverManager.getConnection(hostDB, user, pass);
			
                    String query = "INSERT INTO order_table(ID, Date, PaymentMethod, Total, Items, Quantities) " +
                    "VALUES(?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setInt(1, _id);
                    preparedStmt.setString(2, _date);
                    preparedStmt.setString(3, _payMethod);
                    preparedStmt.setDouble(4, _total);
                    preparedStmt.setString(5, _items);
                    preparedStmt.setString(6, _quantities);

                    if (preparedStmt.execute()) {
                        return true;
                    }

                    con.close();
		} catch (Exception e) {System.out.println(e);}

		return false;
	}

	public static void main(String args[]){  
		System.out.println("booty");
		ArrayList<Product> test = DataBaseManager.getProducts();
		for (Product i : test) {
			System.out.println(i.getInfo());
		}


	}

}  



