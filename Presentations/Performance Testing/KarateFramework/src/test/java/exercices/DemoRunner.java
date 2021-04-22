package exercices;

import com.intuit.karate.junit5.Karate;

public class DemoRunner {

	@Karate.Test
	Karate learntTest() {
		return Karate.run("search").relativeTo(getClass());
	}

	/*
	 * @Karate.Test Karate testTags() { return
	 * Karate.run("tags").tags("@regression").relativeTo(getClass()); }
	 */
	
}
