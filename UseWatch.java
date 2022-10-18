package vengat1;

public class UseWatch {
	public static void main (String[]args) {
		Watch watch1=new Watch();
		watch1.brand="TIMEX";
		watch1.color="Silver";
		watch1.price= 1500;
		watch1.taxAmount= watch1.price*18/100;
		watch1.discountAmount=watch1.price*5/100;
		watch1.netPrice=watch1.price+watch1.taxAmount-watch1.discountAmount;
		
		Watch watch2=new Watch();
		watch2.brand="FastTrack";
		watch2.color="Black";
		watch2.price= 5000;
		watch2.taxAmount= watch2.price*15/100;
		watch2.discountAmount=watch2.price*3/100;
		watch2.netPrice=watch2.price+watch2.taxAmount-watch2.discountAmount;
		
		System.out.println(" Brand="+ watch1.brand + " Color="+watch1.color +" NetPrice="+ watch1.netPrice);
		System.out.println(" Brand="+ watch2.brand + " Color="+watch2.color +" NetPrice="+ watch2.netPrice);
	}

}
