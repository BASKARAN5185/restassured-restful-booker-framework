package endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthAPI {

    public static final String AUTH_ENDPOINT = "/auth";
     
    public static  Response createAuthToken(String username, String password) {
        @SuppressWarnings("static-access")
        String requestBody = """
        {
            "username": "%s",
            "password":"%s"
    }""".format(username, password);
        
        Response response = RestAssured.given()
                .body(requestBody)
                .post(AUTH_ENDPOINT);
        
        return response;
        
    }
    
}
