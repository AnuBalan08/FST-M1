import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;

public class Activity2 {
	
	
	private String baseURI;
	
	@Test (priority = 1)
	public void postUser() throws IOException {
		
//		String baseURI = "https://petstore.swagger.io/v2/user";
		
		FileInputStream inputjson = new FileInputStream("C:\\Users\\AnuBalan\\eclipse-workspace\\fst-m1-RestAssured\\src\\test\\resources\\InputJSON.json");
		
		Response res = given().baseUri("https://petstore.swagger.io/v2/user")
				.header("Content-Type", "application/json")
				.body(inputjson).when().post();
		
		
		inputjson.close();
		res.prettyPrint();
		res.then().statusCode(200);
		res.then().body("code", equalTo(200));
		res.then().body("message", equalTo("21"));
	}
	
	@Test (priority =2)
	public void getUser() {
		
		baseURI = "https://petstore.swagger.io/v2/user/{username}";
		
		Response res = given().contentType(ContentType.JSON)
				.pathParam("username", "AnuBalan")
				.when().get(baseURI);
		
		res.prettyPrint();
		res.then().statusCode(200);			
	}

	@Test (priority =3)
	public void deleteUser() {
		
		baseURI = "https://petstore.swagger.io/v2/user/{username}";
		
		Response res = given().contentType(ContentType.JSON)
				.pathParam("username", "AnuBalan")
				.when().delete(baseURI);
		
		res.prettyPrint();
		res.then().statusCode(200);			
	}
}
