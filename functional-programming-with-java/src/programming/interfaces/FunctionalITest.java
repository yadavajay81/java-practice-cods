package programming.interfaces;

@FunctionalInterface
interface Intrf
{
	public void m1(int i);
	
	
}
public class FunctionalITest {

	public static void main(String[] args) {
		
		Intrf I = (i)->System.out.println(i*i);
		I.m1(4);

	}

}
