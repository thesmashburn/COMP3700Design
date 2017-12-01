import java.io.IOException;
import java.util.ArrayList; 
import java.util.Date;
import java.text.*;


public class UserSystem {
	private ArrayList<Product> currentProductList;
	private ArrayList<Order> currentOrderList;
        private ArrayList<User> currentUserList;
        private MainFrame mainJFrame;
        private int orderIDAssign = 0;
        private Order currentCheckoutOrder;
        private int currentProductID;
        private User mainUser;

	public UserSystem() {
		currentProductList = DataBaseManager.getProducts();
		currentOrderList = DataBaseManager.getOrders();
                currentUserList = DataBaseManager.getUsers();
                for (Order order : currentOrderList) {
                    if (order.getID() > orderIDAssign) orderIDAssign = order.getID();
                    orderIDAssign++;
                }
	}

	public ArrayList<Product> getProductList() {
		return currentProductList;
	}
        
        public Boolean isAdmin() {
            if (mainUser.getUserType() == 1) return true;
            return false;
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
        
        public void initiateGUI() {
            mainJFrame = new MainFrame();
            
            System.out.print("heydo");
            mainJFrame.setVisible(true);
        }
        
        public void setUser(User userIn) {
            mainUser = userIn;
        }
        
        public User getUser() {
            return mainUser;
        }
        public Boolean authenticateUser(String usernameIn, String passwordIn) {
            for (User userCheck : currentUserList) {
                System.out.print(userCheck.getName());
                System.out.print(userCheck.getPassword());
                System.out.print(passwordIn);
                if ((userCheck.getName().equals(usernameIn)) && (userCheck.getPassword().equals(passwordIn))) {
                    mainUser = userCheck;
                    System.out.print("boi");
                    return true;
                }
            }
            return false;
        }
        
        public void checkoutOrder() {
            currentCheckoutOrder = new Order();
            currentCheckoutOrder.setID(orderIDAssign++);    
        }
        
        public CheckoutItem addItemToCheckout(int productID, int quantity) {
            for (Product prod : currentProductList) {
                if (prod.getID() == productID) {
                    CheckoutItem temp = new CheckoutItem(prod.getName(), prod.getID(),
                    prod.getPrice(), prod.getVendor(), prod.getTax(), prod.getWeight(), quantity);
                    currentCheckoutOrder.addCheckoutItem(temp);
                    
                    double itemTotal = (temp.getPrice() * temp.getTax() * quantity) + (temp.getPrice() * quantity);
                    itemTotal += currentCheckoutOrder.getTotal();
                    currentCheckoutOrder.setTotal(itemTotal);
                    currentCheckoutOrder.setSubTotal(currentCheckoutOrder.getSubTotal() + (temp.getPrice() * quantity));
                    return temp;
                }
            }
            return new CheckoutItem();
        }
        
        public Boolean pushCurrentCheckoutOrder() {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            currentCheckoutOrder.setDate(timeStamp);
            currentCheckoutOrder.setPay("CASH");
            String itemStr = "";
            String quanStr = "";
            ArrayList<CheckoutItem> list = currentCheckoutOrder.getItemList();
            for (CheckoutItem check : list) {
                itemStr += check.getID() + ",";
                quanStr += check.getQuantity() + ",";
            }
            itemStr = itemStr.substring(0, itemStr.length() - 1);
            quanStr = quanStr.substring(0, quanStr.length() - 1);
            currentCheckoutOrder.setItemQuantity(itemStr, quanStr);
            return currentCheckoutOrder.pushOrder();
        }
        
        public Product findProductUpdate(int idIn) {
            for (Product prod : currentProductList) {
                if (prod.getID() == idIn) {
                    currentProductID = prod.getID();
                    return prod;
                }
            }
            currentProductID = 0;
            return new Product();
        }
        
        public Boolean pushProductUpdate(String nameIn, double priceIn, String vendorIn,
                double taxIn, double weightIn) {
            if (DataBaseManager.updateProduct(nameIn, currentProductID, priceIn, vendorIn, taxIn, weightIn)) {
                orderIDAssign = 0;
                currentProductList = DataBaseManager.getProducts();
                return true;
            }
            return false;
        }
        
        public void updateLists() {
             currentProductList = DataBaseManager.getProducts();
             currentOrderList = DataBaseManager.getOrders();
            
        }
        
        public int getCurrentCount() {return currentCheckoutOrder.getCount();}
        public double getCurrentTotal() {return currentCheckoutOrder.getTotal();}
        public double getCurrentSubTotal() {return currentCheckoutOrder.getSubTotal();}
        
       

}