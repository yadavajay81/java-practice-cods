package programming.innerclass;


interface Infr {
 public void m1();
}


public class InnerClassWithLambdaExpression {
	int x = 888;
	
	public void m2() {
		Infr I = ()->{
			@SuppressWarnings("unused")
			int x = 999;
			System.out.println(this.x); //888
		};
		I.m1();
		
	}

	
	
	
	public static void main(String[] args) {
		InnerClassWithLambdaExpression t = new InnerClassWithLambdaExpression();
		t.m2(); //output 888

	}

}
