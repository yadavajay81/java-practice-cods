package java24;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class StreamGatherers {

	public static void main(String[] args) {
		Stream<String> result = Stream.of("a", "b", "c")
			    .gather(Gatherers.windowFixed(2));

	}

}
