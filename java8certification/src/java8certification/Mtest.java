package java8certification;

import java.util.ArrayList;
import java.util.List;

class Message {
    String msg = "Happy New Year!";
    
    public void print() {
        System.out.println(msg);
    }
}
 
public class Mtest {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }
    
    public static void main(String[] args) {
    	
    	
    	List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1,list2);

        System.out.println(list1);
    	
    	
    	String awiftcode = "ICICINBBRT4";
    	System.out.println(awiftcode.substring(4,6));
    	
    	String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
    	
    	
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}