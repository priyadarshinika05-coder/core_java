class Watch{
     
	 String brandName;
	 double price;
	 float screenSize;
	 boolean isSmartWatch;
	 int batteryLife;
	 long serialNumber;
	 
	 public Watch(){
	 }
	 public Watch(String brandName,double price,float screenSize,boolean isSmartWatch,int batteryLife,long serialNumber){
	this.brandName=brandName;
	this.price=price;
	this.screenSize=screenSize;
	this.isSmartWatch=isSmartWatch;
	this.batteryLife=batteryLife;
	this.serialNumber=serialNumber;
	}
	public void displayWatchDetails(){
		 System.out.println("brandName:"+ brandName);
		 System.out.println("price:"+ price);
		 System.out.println("screenSize:"+ screenSize);
		 System.out.println("isSmartWatch:"+ isSmartWatch);
		 System.out.println("batteryLife:"+batteryLife);
		 System.out.println("serialNumber:"+serialNumber);
		 }
		 }