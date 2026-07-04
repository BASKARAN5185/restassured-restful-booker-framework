package com.company.api;

// rest assured imports given, when, then, equals, etc.
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import base.BaseTest;

public class AppTest extends BaseTest {

    // google api 200 status code check
    @Test
    public void requiresstatus() {
    // all the value hard coded request and response specifications
        given().log().all()
        .when().get("https://restful-booker.herokuapp.com/booking/1")
        .then().log().all()
        .statusCode(200);
    }
  } 



    