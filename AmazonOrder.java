class AmazonOrder {

String productName;
int orderId;

public AmazonOrder() {
this("Laptop", 501, true);
}
public AmazonOrder(String productName) {
System.out.println("Product Name: " + productName);
}
public AmazonOrder(String productName, int orderId) {
System.out.println("Product Name: " + productName);
System.out.println("Order ID: " + orderId);
}
public AmazonOrder(String productName, int orderId, boolean isShipped) {
this(productName); 
System.out.println("Order ID: " + orderId);
}
public AmazonOrder(String productName, int orderId, boolean isShipped, int quantity) {
this(productName, orderId);  
System.out.println("Shipped: " + isShipped);
}
}