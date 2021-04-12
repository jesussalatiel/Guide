package demo;

import com.intuit.karate.junit5.Karate;

public class DemoRunner {

	@Karate.Test
	Karate leartTest() {
		return Karate.run("search").relativeTo(getClass());
	}
}
