

package RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestIpAPI {

    String ROOT_URI = "http://ip-api.com/json/{ipAddress}";

    @Test
    public void getIPInformation() {

        Response response =
            given()
                .contentType(ContentType.JSON)
                .pathParam("ipAddress", "107.218.134.107")
                .when()
                .get(ROOT_URI);

        System.out.println(response.getBody().asPrettyString());
    }
}
