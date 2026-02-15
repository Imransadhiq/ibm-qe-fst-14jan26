package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestAddNewPet {

    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    // -------- POST: Add New Pet --------
    @Test
    public void addNewPet() {

        String reqBody = """
        {
            "id": 8589,
            "name": "Tiger",
            "photoUrls": [],
            "tags": [],
            "status": "available"
        }
        """;
        File file = new File("src/test/resources/input.json");
        Response response =
            given().contentType(ContentType.JSON).body(file).when().post(ROOT_URI);

        response.then()
            .statusCode(200)
            .body("name", equalTo("Tiger"));

        System.out.println(response.asPrettyString());
    }

    // -------- GET: Fetch Pet Info --------
    @Test
    public void getPetInfo() {

        File resJSONFile = new File("src/test/resources/resLog.json");

        Response response =
            given()
                .contentType(ContentType.JSON)
            .when()
                .get(ROOT_URI + "/8589");

        String resBody = response.asPrettyString();

        try {
            resJSONFile.createNewFile();
            FileWriter writer = new FileWriter(resJSONFile);
            writer.write(resBody);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
