import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	@Test

	public void tc1() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RequestSpecification httprequest = RestAssured.given();//request object
		Response r = httprequest.request(Method.GET, "/employees");//response object
		String responsebody = r.getBody().asString();
		System.out.println("responsebody is: " + responsebody);
		int statuscode = r.getStatusCode();
		System.out.println("statuscode is: " + statuscode);
		Assert.assertEquals(statuscode, 200);
		String Statusline = r.getStatusLine();
		System.out.println("Statusline is: " + Statusline);
		Assert.assertEquals(Statusline, "HTTP/1.1 200 OK");

	}
	@Test

	public void tc2() {
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employee/2";
		RequestSpecification httpsrequest=RestAssured.given();
		Response response=httpsrequest.request(Method.GET);
		String body=response.getBody().asPrettyString();
		System.out.println("body is : "+body);
		 Headers header = response.getHeaders();
		 for (Header header2 : header) {
			System.out.println("headers is : "+header2);
		}
//		 System.out.println("headerValue is : "+headerValue);
		 String cookieValue = response.getCookie("cookieName");
		 System.out.println("cookieValue is : "+cookieValue);
     
	}
}
