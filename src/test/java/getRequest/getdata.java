package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//https://www.youtube.com/watch?v=aqrxDxumKZQ - URL to the tutorial about RESTAssure framework; In the tutorial there is 8 APIs URLs for test usage.

public class getdata {

	@Test

	public void testResponseCode() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		int code = resp.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertEquals(code, 200);
	}

	@Test

	public void testBody() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		String data = resp.asString();

		System.out.println("Data is is " + data);

		System.out.println("response time " + resp.getTime());
		System.out.println("FISNISH");
	}
}
