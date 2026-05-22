package javatest;

 class Animal {
	 String name;
	 String type;
	 
	 public Animal(String name, String type) {
		 this.name = name;
		 this.type = type;
	 }

	/*@Override
	public String toString() {
		return String.format("Animal [name=%s, type=%s]", name, type);
	}*/

	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=").append(name).append(", type=").append(type).append("]");
		return builder.toString();
	}*/

	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}*/

	/*@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}*/
	
	 
	 
}



public class ToStringExample {

	public static void main(String[] args) {
		Animal animal = new Animal("Tommy","Dog");
		System.out.println(animal);

	}

}
