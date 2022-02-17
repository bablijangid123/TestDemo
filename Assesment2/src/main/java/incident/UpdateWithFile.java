package incident;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateWithFile {
	@Test
	public void Updatefile() {
		// TODO Auto-generated method stub
		// Endpoint for Get All Incidents
		RestAssured.baseURI="https://dev122567.service-now.com/api/now/table/change_request";
		//Authentication
		RestAssured.authentication=RestAssured.basic("admin", "wh6lopV6BXNG");
		//Initiate Request
		 Response response = RestAssured.given().contentType(ContentType.JSON)
		 .body(new File("./data/updateincident.json"))
		 .pathParam("sysID", "b17fcf0207610110dbbef48f7c1ed03e")
		 .put("/{sysID}");
		
		//Print Status code
		System.err.println(response.statusCode());
		
		//Print response
		response.prettyPrint();
		
		
		

	}

}
