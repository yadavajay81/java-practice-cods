package java17;

public class SingltonClassIggerWay {
	
	private static final SingltonClassIggerWay singltonClassIggerWay = new SingltonClassIggerWay();
	
	private SingltonClassIggerWay() {
		
	}
	
	public static SingltonClassIggerWay getSingltonClassIggerWay() {
		return singltonClassIggerWay;
		
	}

}
