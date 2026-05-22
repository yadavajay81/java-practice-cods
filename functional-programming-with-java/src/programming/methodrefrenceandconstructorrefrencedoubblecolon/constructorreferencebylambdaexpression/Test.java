package programming.methodrefrenceandconstructorrefrencedoubblecolon.constructorreferencebylambdaexpression;

public class Test {

	public static void main(String[] args) {
		Intruf i = ()->{
			Sample s = new Sample();
			return s;
		};
		
		Sample s1 = i.get();
		
		

	}

}
