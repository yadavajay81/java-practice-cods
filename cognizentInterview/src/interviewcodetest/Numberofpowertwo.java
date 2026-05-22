package interviewcodetest;

public class Numberofpowertwo {

	public static void main(String[] args) {
		numberpower();

	}
	
	public static void numberpower() {
		
		int num = 1;
		
		System.out.print("Series: ");
		for(int i=1; i<=8; i++) {
			System.out.print(num);
			if(i<8)
			System.out.print(",");
			num *=2;
			
		}
		
	}
	

}
