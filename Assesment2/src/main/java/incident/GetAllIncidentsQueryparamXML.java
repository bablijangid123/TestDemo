package incident;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllIncidentsQueryparamXML {

	@Test
	public void GetIncidentsQueryparamXML() {
		// TODO Auto-generated method stub
	
		// Endpoint for Get All Incidents
		// Endpoint for Get All Incidents
		RestAssured.baseURI="https://dev122567.service-now.com/api/now/table/change_request";
		//Authentication
		RestAssured.authentication=RestAssured.basic("admin", "wh6lopV6BXNG");
		//Initiate Request
		//Initiate Request
		HashMap<String,String> querySysparams=new HashMap<String,String>();
		querySysparams.put("sysparm_limit", "5");
		querySysparams.put("sysparm_fields", "sys_id,description,short_description");
		 Response response = RestAssured.given().
		queryParams(querySysparams)
		.accept(ContentType.XML)
		  //queryParam("sysparm_limit", "5")
		// .queryParam("sysparm_fields", "sys_id,description,short_description")
		 .get();
		
		//Print Status code
		System.err.println(response.statusCode());
		
		//Print response
		response.prettyPrint();
		
		
		

	}

}
