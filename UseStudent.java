package vengat1;

public class UseStudent {
	public static void main(String[]args) {
		Student student1 = new Student();
		student1. name ="VengadaPrasath";
		student1.rollNumber = 1215256;
		student1.tamil=95;
		student1.english=88;
		student1.maths= 95;
		student1.science=95;
		student1.socialScience=84;
		student1.Avg= (student1.tamil+student1.english+student1.maths+student1.science+student1.socialScience)/5;
		
		System.out.println("Name="+student1.name + " RollNumber="+ student1.rollNumber+" Average="+student1.Avg);
				
		
				
		
		
	}

}
