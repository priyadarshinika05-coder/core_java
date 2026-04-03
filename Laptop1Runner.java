class Laptop1Runner{
	
	public static void main(String []args){
    Laptop L1=new Laptop("dell",55000,15.6f,8,"Intel i5",512);
    L1.displayLaptopDetails();
	
	Laptop L2 = new Laptop("HP", 62000, 14.0f, 16, "Intel i7", 512);
	L2.displayLaptopDetails();
	
    Laptop L3 = new Laptop("Lenovo", 48000, 15.6f, 8, "Ryzen 5", 256);
	L3.displayLaptopDetails();
		
    Laptop L4 = new Laptop("Asus", 75000, 16.0f, 16, "Intel i7", 1024);
	L4.displayLaptopDetails();
	
    Laptop L5 = new Laptop("Acer", 43000, 14.0f, 8, "Intel i3", 512);
	L5.displayLaptopDetails();
	
    Laptop L6 = new Laptop("Apple", 120000, 13.3f, 8, "M1", 256);
	L6.displayLaptopDetails();
	
    Laptop L7 = new Laptop("MSI", 98000, 17.3f, 32, "Intel i9", 1024);
	L7.displayLaptopDetails();
	
    Laptop L8 = new Laptop("Samsung", 68000, 15.0f, 16, "Intel i5", 512);
	L8.displayLaptopDetails();
	
    Laptop L9 = new Laptop("Microsoft", 105000, 13.5f, 16, "Intel i7", 512);
	L9.displayLaptopDetails();
	
    Laptop L10 = new Laptop("Razer", 150000, 15.6f, 32, "Intel i9", 1024);
	L10.displayLaptopDetails();
    }
}