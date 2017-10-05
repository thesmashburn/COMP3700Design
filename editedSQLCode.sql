CREATE TABLE product_table (
	Name TEXT,
	ID INT,
	Price DEC,
	Vendor TEXT,
	Tax DEC,
	Weight TEXT
);

CREATE TABLE order_table (
	ID INT,
	Date TEXT,
	PaymentMethod TEXT,
	Total DEC,
	Items TEXT,
	Quantities TEXT
);

INSERT INTO product_table(Name, ID, Price, Vendor, Tax)
VALUES("Apple", 13875, 3.50, "XYSTEM", .09);

INSERT INTO product_table(Name, ID, Price, Vendor, Tax)
VALUES("Orange", 13872, 2.75, "XYSTEM", .09);

INSERT INTO product_table(Name, ID, Price, Vendor, Tax)
VALUES("Yam", 12759, 3.00, "XYSTEM", .09);

INSERT INTO product_table(Name, ID, Price, Vendor, Tax)
VALUES("Biscuit", 12675, 5.20, "BYRON", .1);

INSERT INTO product_table(Name, ID, Price, Vendor, Tax)
VALUES("TV", 15680, 300.00, "SAMSUNG", .1);

INSERT INTO order_table
VALUES(13546,"9/22/2017", "CASH", 50.29, "51436, 65870, 24567", "1, 3, 1");

INSERT INTO order_table
VALUES(15468,"2/2/2016", "Visa *4689", 89.99, "51556, 12370, 33567", "10, 1, 13");

INSERT INTO order_table
VALUES(12759,"1/30/2017", "CASH", 232.50, "13999", "1");

INSERT_INTO order_table
VALUES(15780,"3/27/2017", "MasterCard *9609", 67.33, "12345, 32546", "5, 3");

INSERT_INTO order_table
VALUES(10989,"10/11/2017", "Visa *8909 ", 47.68, "85689", "2");

