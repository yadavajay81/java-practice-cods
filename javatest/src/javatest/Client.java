package javatest;

import java.util.Objects;

public class Client {
	
	private int id;
	
	public Client(int id) {
		this.id=id;
	}
	
	
	/*@Override
	public boolean equals(Object obj) {
		Client other = (Client) obj;
		if(id != other.id)
			return false;
		return true;
		
	}*/
	

	public static void main(String[] args) {
		
		
		
		
		Client client1 = new Client(25);
		Client client2 = new Client(25);
		Client client3 = client1;
		
		System.out.println(client1==client2);
		System.out.println(client1==client3);
		System.out.println(client1.equals(client2));
		System.out.println(client1.equals(client3));

	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}

}
