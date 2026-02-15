package RestAssured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetPetbyID {

    
    String ROOT_URI = "https://petstore.swagger.io/v2/pet/";
    @Test(dataProvider = "petIdProvider")
    public void simple_get_test(String id) {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when().get(ROOT_URI + id); // Send GET request
 
        // Print response
        String responseBody = response.getBody().prettyPrint();
        System.out.println("response" + responseBody);
        System.out.println("Status" + response.getStatusCode());


    }        
    @Test
    public void AddNewPet() {
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().delete(ROOT_URI + "/8588"); // Send DELETE request
        String body = response.getBody().asPrettyString();
        System.out.println(body);
    }
@DataProvider
public Object[][] petIdProvider() {
    // Setting parameters to pass to test case
    Object[][] testData = new Object[][] { { "3634" }, { "3634" } };
    return testData;
}
}
