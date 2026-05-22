package programming.interfaces;


class MyRunnable implements Runnable{
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i+" Chield class");
		}
	}
	
}



class ThreadDemo {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<=10; i++) {
			System.out.println(i+" Main class");
		}

	}

}
