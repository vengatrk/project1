package vengat1;

public class UseLaptop {
	public static void main (String[]args) {
		Laptop l1 = new Laptop();
	l1.brand ="hp";
	l1.color ="grey";
	l1.price =55000;
	l1.isTouchScreen=false;
	
	Laptop l2 = new Laptop();
	l2.brand ="Dell";
	l2.color ="Black";
	l2.price =56000;
	l2.isTouchScreen=false;
	
	Laptop l3 = new Laptop();
	l3.brand ="acer";
	l3.color ="Black";
	l3.price =60000;
	l3.isTouchScreen=true;
	
	System.out.println(" Color="+l1.color + " Brand="+ l1.brand + " Price="+ l1.price + " Touchscreen="+l1.isTouchScreen);
	System.out.println(" Color="+l2.color + " Brand="+ l2.brand + " price="+ l2.price + " Touchscreen="+l2.isTouchScreen);
	System.out.println(" Color="+l3.color + " Brand="+ l3.brand + " price="+ l3.price + " Touchscreen="+l3.isTouchScreen);
	}                              
 
}

