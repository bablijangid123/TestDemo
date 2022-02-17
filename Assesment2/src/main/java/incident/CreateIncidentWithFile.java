package incident;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIncidentWithFile {
	@Test
	public void CreateIncidentWithFile11()  {
		// TODO Auto-generated method stub
	
		// Endpoint for Get All Incidents
		RestAssured.baseURI="https://dev122567.service-now.com/api/now/table/change_request";
		//Authentication
		RestAssured.authentication=RestAssured.basic("admin", "wh6lopV6BXNG");
		//Initiate Request
		 Response response = RestAssured.given().contentType(ContentType.JSON)
		 .body("{\r\n" + 
		 		"    \"description\": \"Via rest Assured\",\r\n" + 
		 		"    \"short_description\": \"first incident via Rest assured\"\r\n" + 
		 		"}")
		 .post();
		
		//Print Status code
		System.err.println(response.statusCode());
		
		//Print response
		response.prettyPrint();
		
		
		

	}

}
