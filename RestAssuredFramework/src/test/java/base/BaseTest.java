package base;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {
    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;

    @BeforeClass
    public static void setup() {
        //  request and response specifications
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .setContentType(ContentType.JSON)
                .build();
                
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)      
                .expectContentType(ContentType.JSON)
                .build();        
    }

    
}