package ru.myRestStudy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {

    @Test
    void test1(){
        given().baseUri("http://localhost:8080")
                .when().get("test")
                .then().statusCode(200);
    }
}
