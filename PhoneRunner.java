class PhoneRunner{
	
	public static void main(String [] args){
	Phone p1=new Phone("Samsung","Galaxy S23",74999.99,6.1f,128,234567897655L);
	p1.displayPhoneDetails();
	
	Phone p2 = new Phone("Apple","iPhone 14",79999.50,6.1f,128,987654321012345L);
    p2.displayPhoneDetails();
	
	Phone p3 = new Phone("OnePlus","OnePlus 11",56999.00,6.7f,256,456789123456789L);
    p3.displayPhoneDetails();
	
    Phone p4 = new Phone("Xiaomi","Redmi Note 12",19999.99,6.6f,128,741258963852741L);
    p4.displayPhoneDetails();
	
    Phone p5 = new Phone("Vivo","Vivo V27",32999.00,6.5f,256,852369741258963L);
	p5.displayPhoneDetails();

    Phone p6 = new Phone("Oppo","Oppo Reno 8",28999.00,6.4f,128,963258741852369L);
	p6.displayPhoneDetails();

    Phone p7 = new Phone("Realme","Realme Narzo 60",17999.00,6.6f,128,159753486258741L);
	p7.displayPhoneDetails();

    Phone p8 = new Phone("Motorola","Moto G73",18999.00,6.5f,128,753159852456123L);
	p8.displayPhoneDetails();

    Phone p9 = new Phone("Nokia","Nokia G21",14999.00,6.5f,64,321654987123456L);
	p9.displayPhoneDetails();

    Phone p10 = new Phone("Google","Pixel 7",59999.00,6.3f,128,654987321456123L);
	p10.displayPhoneDetails();
	}
}