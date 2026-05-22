package javatest;

public class Stringtest {

	public static void main(String[] args) {
	StringBuffer str1 = new StringBuffer("Value1");
	String str2 = "Value2";
		
	for(int i=0; i<=5; i++) {
		str1.append(str2+" - "+i);
		System.out.println(str1+"\n");
	}
	//System.out.println(str1);
		
	}

}
