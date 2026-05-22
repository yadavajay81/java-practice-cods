package java8certification;

public class ThreadSafeSinglton {
	
	private ThreadSafeSinglton() {
		if(Holder.INSTANCE !=null) {
		throw new RuntimeException("Create Instance from getInstance()");
		}
	}
	
	private static class Holder {
		private static final ThreadSafeSinglton INSTANCE = new ThreadSafeSinglton();
	}
	
	public ThreadSafeSinglton getInstance() {
		return Holder.INSTANCE;
	}

}
