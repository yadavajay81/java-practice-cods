package programming.innerclass;

@FunctionalInterface
interface Inf{
	public void m1();
}



public class InnerClassWithLambdaExpressionFinalVariable {

	int x = 888;
	
	
	public void m2() {
		int y=999;
		
		Inf I = ()->{
			
			x=111;
			//y=2222; //Compile Error Local variable y defined in an enclosing scope must be final or effectively final
			
			System.out.println(x);
			System.out.println(y);
			
		};
		I.m1();
	}
	
	
	
	public static void main(String[] args) {
		InnerClassWithLambdaExpressionFinalVariable i = new InnerClassWithLambdaExpressionFinalVariable();
		i.m2();

	}

}
