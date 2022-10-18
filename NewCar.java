package vengat1;

public class NewCar {
	public static void main (String []args) {
		Car car1 = new Car ();
		car1.brand ="BMW";
		car1.color ="Blue";
		car1.price =5800000;
		car1.taxAmount=500000;
		car1.discountAmount=100000;
		car1.netPrice=car1.price+car1.taxAmount-car1.discountAmount;
		
		Car car2 = new Car ();
		car2.brand ="Toyato";
		car2.color ="Black";
		car2.price =2800000;
		car2.taxAmount=100000;
		car2.discountAmount=50000;
		car2.netPrice=car2.price+car2.taxAmount-car2.discountAmount;
				
		System.out.println( " Brand="+ car1.brand + " Color="+car1.color + " Netprice="+ car1.netPrice);
		System.out.println( " Brand="+ car2.brand + " Color="+car2.color + " Netprice="+ car2.netPrice);
	}

}
