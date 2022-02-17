package incident;

import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAllIncidentswithJsonPath {

	@Test
	public  void  validateIncidentswithJsonPath() {
		// TODO Auto-generated method stub

		// Endpoint for Get All Incidents
		RestAssured.baseURI = "https://dev122567.service-now.com/api/now/table/change_request";
		// Authentication
		RestAssured.authentication = RestAssured.basic("admin", "wh6lopV6BXNG");
		// Initiate Request
		// Print Status code
		// System.err.println(response.statusCode());
		Response response = RestAssured.given().accept(ContentType.JSON).get();
		// Print response
		// response.prettyPrint();
		// parse json
		JsonPath path = response.jsonPath();
		java.util.List<String> list = path.getList("result.number");
		System.out.println(list);

		String num = list.get(0);
		System.err.println(num);

	}

}
