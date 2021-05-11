package api;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class Test02_Post {
	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("name", "Salatiel");
		request.put("job", "QA");

		System.out.println(request);
		System.out.println(request.toString());

		given().body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);

	}
}
