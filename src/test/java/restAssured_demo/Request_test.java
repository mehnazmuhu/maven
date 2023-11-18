package restAssured_demo;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
public class Request_test {
	RequestSpecification requestSpecification;
	Response response;
	ValidatableResponse validatableResponse;
	
	
@Test
	public void getRequestTest() {
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	//create a request specification
	requestSpecification = given();
		//calling get method
	response=requestSpecification.get();
	//print response body
	String restString =response.prettyPrint();
	System.out.println(restString);
	//to perform the validation on response, we need to get the validatable response
	validatableResponse=response.then();
	ResponseBody resbody=response.getBody();
	System.out.println(resbody.asString());
	System.out.println("Status line of this response is: "+response.getStatusLine());
//get status code
	validatableResponse.statusCode(200);
	//check the status line is as expected
	validatableResponse.statusLine("HTTP/1.1 200 OK");
	
	}
@Test
   public void testcase_BDD() {
	given().baseUri("https://reqres.in/api/users?page=2")
	.when().get().then().statusCode(200).statusLine("HTTP/1.1 200 OK");
	   
   }
@Test
public void testcase1_postrequest() {
	String jsonstring="{\"username\":\"admin\","+"\"password\":\"password123\"}";
	requestSpecification = given();
	requestSpecification.contentType(ContentType.JSON);
	requestSpecification.baseUri("https://restful-booker.herokuapp.com/auth");
	requestSpecification.body(jsonstring);
	response=requestSpecification.post();
	System.out.println(response.asString());
	validatableResponse=response.then();
	validatableResponse.statusCode(200);
	validatableResponse.statusLine("HTTP/1.1 200 OK");
}
@Test(enabled=false)
   public void BDDstyle_PostRequest() {
	String jsonstring="{\"username\":\"admin\","+"\"password\":\"password123\"}";
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com/auth").contentType(ContentType.JSON)
	.body(jsonstring)
	.when().post().then().assertThat().body("token",Matchers.notNullValue()).body("token.length()", Matchers.is(15))
	.body("token",Matchers.matchesRegex("^[a-zA-Z0-9]+$"));
	   
   }
@Test
public void put_request() {
	/*String jsonstring="{\"\"name\": \"morpheus\","
			+ " \"job\": \"zion resident\"}";
	requestSpecification = given();
	requestSpecification.contentType(ContentType.JSON);
	requestSpecification.baseUri("https://reqres.in/api/users/2");
	requestSpecification.body(jsonstring);
	response=requestSpecification.put();
	System.out.println(response.asString());
	validatableResponse=response.then();
	validatableResponse.statusCode(200);
	validatableResponse.statusLine("HTTP/1.1 200 OK");*/
	
	String jsonstring = "{\"name\": \"morpheus\","
            + " \"job\": \"zion resident\"}";

    RequestSpecification requestSpecification = given();
    requestSpecification.contentType(ContentType.JSON);
    requestSpecification.baseUri("https://reqres.in/api/users/2");
    requestSpecification.body(jsonstring);

    Response response = requestSpecification.put();
    System.out.println(response.asString());

    ValidatableResponse validatableResponse = response.then();
	validatableResponse.statusCode(200);
	validatableResponse.statusLine("HTTP/1.1 200 OK");
	}

}
