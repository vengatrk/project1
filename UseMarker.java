 package vengat1;

public class UseMarker {
	public static void main (String[]args) {
		Marker m1 = new Marker();
		m1.color ="Black";
		m1.size = 2.5f;
		m1.price =45;
		m1.brand ="fabric";
		m1.isRefillable = true;
		
		Marker m2 = new Marker ();
		m2.brand ="Camlin";
		m2.color = "Red";
		m2.price =50;
		m2.size =2.6f;
		m2.isRefillable =false;
		
		
		System.out.println("Color="+m1.color + " Size="+m1.size + " Price="+m1.price+ " Brand="+ m1.brand + " Refillable="+ m1.isRefillable);
		System.out.println("Color="+m2.color + " Size="+m2.size + " Price="+m2.price+ " Brand="+ m2.brand + " Refillable="+ m2.isRefillable);
	}

}
