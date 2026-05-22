package cognizentInterview;

public class Books {
	
	String name;
	String author;
	
	
	public Books(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + "]";
	}
	
	
	
	

}
