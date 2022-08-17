import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.asynchttpclient.Request;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {
	@Test
	public void tc1() {
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/create";
		RequestSpecification httpsrequest=RestAssured.given();
//				RestAssured.given().body("	{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}")
//				
//				.post().then()
//				.log().all();
		
		
		
		JSONObject js=new JSONObject();
		js.put("name","test");
		js.put("salary",123225);
		js.put("age",23);
		httpsrequest.headers("Content-Type","application/json");
//		httpsrequest.contentType(ContentType.JSON);
		httpsrequest.body(js.toJSONString());
		Response response=httpsrequest.request(Method.POST);
		String body = response.getBody().toString();
		System.out.println("body is: "+body);
		System.out.println(response.getStatusCode());
		Headers h=response.getHeaders();
		for (Header header : h) {
			System.out.println(header.getName()+"   "+header.getValue());
		}
	}

}
