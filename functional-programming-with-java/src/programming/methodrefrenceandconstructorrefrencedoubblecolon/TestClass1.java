package programming.methodrefrenceandconstructorrefrencedoubblecolon;

/**
 * use method refrence ::
 * :: use for code reusability
 * @author yadav
 *
 */
public class TestClass1 {
	
	public static void m2() {
		String s1 = "Ajay";
		String s2 = "Yadav";
		String s3 = s1+" "+s2;
		System.out.println(s3);
	}

	/**
	 * don't implement m1 only refer m1 to m2
	 * if m2 have same argument and implementation
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceTest1 i = TestClass1::m2;
		i.m1();

	}

}
