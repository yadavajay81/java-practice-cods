package java17;

public class SingltonClassLazyWay {

	private static SingltonClassLazyWay singltonClassLazyWay;

	private SingltonClassLazyWay() {

	}

	// Lazy way
	public static SingltonClassLazyWay getSingltonClass() {

		if (singltonClassLazyWay == null) {

			synchronized (SingltonClassLazyWay.class) {
				if (singltonClassLazyWay == null) {
					singltonClassLazyWay = new SingltonClassLazyWay();
				}
			}

		}

		return singltonClassLazyWay;

	}
}
