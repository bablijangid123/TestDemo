package incident;

import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class GetAllIncidentswithxmlpath {

	@Test
	public void validateincidentwithxmlpath() {
		// TODO Auto-generated method stub

		// Endpoint for Get All Incidents
		RestAssured.baseURI = "https://dev122567.service-now.com/api/now/table/incident";
		// Authentication
		RestAssured.authentication = RestAssured.basic("admin", "wh6lopV6BXNG");
		// Initiate Request
		
		 Response response = RestAssured.given().accept(ContentType.XML).get();

		// Print Status code
		// System.err.println(response.statusCode());

		// Print response
		// response.prettyPrint();
		// parse json
		XmlPath path = response.xmlPath();
		java.util.List<String> list = path.getList("response.result.number");
		//in xml starting with response when we are starting 
		System.out.println(list);

		String num = list.get(0);
		System.err.println(num);

	}

}
