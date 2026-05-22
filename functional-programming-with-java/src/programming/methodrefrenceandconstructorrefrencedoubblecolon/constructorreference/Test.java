package programming.methodrefrenceandconstructorrefrencedoubblecolon.constructorreference;

public class Test {

	public static void main(String[] args) {
		Intruf i = Sample::new;
		Sample s = i.get();

	}

}
