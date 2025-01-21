import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Activity1 {
	
	private String baseURI;
	
	
	@Test (priority =1)
	public void postPet() {
		
		baseURI = "https://petstore.swagger.io/v2/pet";
		
		String petBody = """
			{
					  "id": 23,
					  "category": {
					    "id": 0,
					    "name": "string"
					  },
					  "name": "doggie",
					  "photoUrls": [
					    "string"
					  ],
					  "tags": [
					    {
					      "id": 0,
					      "name": "string"
					    }
					  ],
					  "status": "available"	
			}
				
				""";
		
		Response res = given().baseUri(baseURI).contentType(ContentType.JSON)
				.body(petBody)
				.when().post();
		
		res.prettyPrint();
		res.then().statusCode(200);
		
	}
	
	@Test(priority =2)
	public void getPet() {
		
		baseURI = "https://petstore.swagger.io/v2/pet/{petId}";
		
		Response res = given().contentType(ContentType.JSON)
				.when().pathParam("petId", "23").get(baseURI);
		
		res.prettyPrint();
		res.then().statusCode(200);
		
	}
	
	@Test(priority =3)
	public void deletePet() {
		
		baseURI = "https://petstore.swagger.io/v2/pet/{petId}";
		
		Response res = given().contentType(ContentType.JSON)
				.when().pathParam("petId", "23").delete(baseURI);
		
		res.prettyPrint();
		res.then().statusCode(200);
		
	}

}
