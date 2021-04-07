package demo;

import com.intuit.karate.junit5.Karate;

public class DemoRunner {

	@Karate.Test
	Karate testTags() {
		return Karate.run("arrayPractice").tags("@second").relativeTo(getClass());
	}

}
