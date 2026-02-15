package RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestQuery {

    String ROOT_URI = "http://ip-api.com/json/";

    @Test
    public void getIPInformation() {

        Response response =
            given()
                .contentType(ContentType.JSON)
                .pathParam("ipAddress", "107.218.134.107")
                .when().queryParam("fields", "query,country,city,timezone")
                .get("/125.219.5.94");

        System.out.println(response.getBody().asPrettyString());
    }
}

