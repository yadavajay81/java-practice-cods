package java8certification;

public class DoubleCheckLockingSinglton {
	
	private static volatile DoubleCheckLockingSinglton instance;
	
	private DoubleCheckLockingSinglton(){
		
	}
	
	public static DoubleCheckLockingSinglton getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckLockingSinglton.class) {
				if(instance == null) {
					instance = new DoubleCheckLockingSinglton();
				}
			}
		}
		return instance;
	}

}
