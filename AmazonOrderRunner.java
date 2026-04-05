class AmazonOrderRunner {

public static void main(String[] args) {

AmazonOrder a1 = new AmazonOrder();
AmazonOrder a2 = new AmazonOrder("Mobile");
AmazonOrder a3 = new AmazonOrder("Headphones", 602);
AmazonOrder a4 = new AmazonOrder("Tablet", 703, false);
AmazonOrder a5 = new AmazonOrder("Camera", 804, true, 3);
}
}