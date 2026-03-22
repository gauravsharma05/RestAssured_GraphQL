
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import  static  io.restassured.RestAssured.*;  // To import the static packages from rest assured
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

//import files.ReUsableMethods;
//import files.payload;


public class GraphQLTest {

	@Test
	public void newTest() {
	
	// A Rest Assured test that runs a simple query from https://countries.trevorblades.com graphQL explorer that queries continents and countries
		
		String response = given().log().all().header("Content-Type","application/json")
	      .body(payload.AddBody())
	      .when().post("https://countries.trevorblades.com/")
	      .then().extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);

		String countryName = js.getString("data.countries[0].name");
		Assert.assertEquals(countryName,"Andorra");
	}
}