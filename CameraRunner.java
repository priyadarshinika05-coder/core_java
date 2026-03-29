class CameraRunner{

    public static void main(String []args){
	
	Camera c1 = new Camera("Wide Angle",56,"Canon EOS 1500D",(byte)9,"Black","Lithium-ion");
	c1.lensType = "Wide Angle";
    c1.megapixel = 24;
    c1.model = "Canon EOS 1500D";
    c1.zoom = 8;                 
    c1.color = "Black";
    c1.batteryType = "Lithium-ion";
	
	c1.getCameraData();
	}
	}