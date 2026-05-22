package java11;

public class ByteExample implements Runnable {

	public static void main(String[] args) {
		
		
		
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;   compilation error
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		
		int a1=10;
		int a2=20;
		int a3=a1+a2;
		System.out.println(a3);
		
		
		boolean a = true;
		boolean b = false;
		
		if (a || (b = true)) {
		    System.out.println(b);
		}
		
		
		int i = 0;
		while (i < 5) {
		    if (i == 3) break;
		    System.out.print(i);
		    i++;
		}
		
		
		checkNumber(4);  // Positive and even
		checkNumber(3);  // Positive and odd
		checkNumber(-2); // Negative
		checkNumber(0);  // Zero
		checkNumber(1);
		

	}
	
	public static void checkNumber(int num) {
		
		String msg = "Hellow";
		
		
		if(num==0) {
			System.out.println("Zero");
		}else if(num>0) {
			if(num%2==0) {
				System.out.println("Positive and even");
			}else {
				System.out.println("Positive and odd");
			}
			
			
		}else {
			System.out.println("Negative");
		}
		
		msg = "Ram";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
