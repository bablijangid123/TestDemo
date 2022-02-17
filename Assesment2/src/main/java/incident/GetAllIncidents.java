package incident;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidents {

	@Test
	public void getincidents() {
		// TODO Auto-generated method stub
	
		// Endpoint for Get All Incidents
		RestAssured.baseURI="https://dev122567.service-now.com/api/now/table/change_request";
		//Authentication
		RestAssured.authentication=RestAssured.basic("admin", "wh6lopV6BXNG");
		//Initiate Request
		Response response = RestAssured.get();
		
		//Print Status code
		System.err.println(response.statusCode());
		
		//Print response
		//response.prettyPrint();
		
		
		

	}

}
