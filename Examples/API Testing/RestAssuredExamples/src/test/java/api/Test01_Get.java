package api;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

@Listeners(ListenersTestNG.class)
public class Test01_Get {

	@BeforeClass
	public void setup() {
		String port = System.getProperty("server.port");
		if (port == null) {
			RestAssured.port = Integer.valueOf(443);
		} else {
			RestAssured.port = Integer.valueOf(port);
		}

		RestAssured.baseURI = "https://reqres.in/api/";

	}

	@Test
	public void basicPing() {
//		given().when().get("https://reqres.in/api/users").then().assertThat().statusCode(200);
		Response response = given()
				.contentType(ContentType.JSON)
				.when()
				.get("users")
				.then()
				.extract().response();
		
		Assert.assertEquals(200, response.statusCode());
	
	}

	@Test
	public void test() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void test1() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8))
				.body("data.first_name", hasItems("Michael", "Lindsay")).log().all();
	}
}
