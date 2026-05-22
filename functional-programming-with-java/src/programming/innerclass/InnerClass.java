package programming.innerclass;


interface Intrf{
	public void m1();
	
}


public class InnerClass {
	
	int x=888; //instance variable of outer class 'InnerClass'
	
	public void m2() {
		Intrf i = new Intrf() {
		int x = 999; //instance variable of inner class
		public void m1() {
			System.out.println(this.x);//999
			
			
		}
		
		};
		
		i.m1();
		
	}
	
	

	public static void main(String[] args) {
		
		InnerClass t = new InnerClass();
		t.m2();  //output 999
		System.out.println(t.x); //output 888
		

	}

}
