package endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BookingAPI {

    public static final String BOOKING_ENDPOINT = "/booking";

    public static Response GetBookingIds() {
        Response response = RestAssured.given().get(BOOKING_ENDPOINT);
        return response;
    }

    public static Response GetBookingById(int bookingId) {
        Response response = RestAssured.given().get(BOOKING_ENDPOINT + "/" + bookingId);
        return response;
    }

    public static Response CreateBooking(String requestBody) {
        Response response = RestAssured.given()
                .body(requestBody)
                .post(BOOKING_ENDPOINT);
        return response;
    }

    public static Response UpdateBooking(int bookingId, String requestBody, String token) {
        Response response = RestAssured.given()
                .header("Cookie", "token=" + token)
                .body(requestBody)
                .put(BOOKING_ENDPOINT + "/" + bookingId);
        return response;
    }

    public static Response DeleteBooking(int bookingId, String token) {
        Response response = RestAssured.given()
                .header("Cookie", "token=" + token)
                .delete(BOOKING_ENDPOINT + "/" + bookingId);
        return response;
    }

    public static Response PartialUpdateBooking(int bookingId, String requestBody, String token) {
        Response response = RestAssured.given()
                .header("Cookie", "token=" + token)
                .body(requestBody)
                .patch(BOOKING_ENDPOINT + "/" + bookingId);
        return response;
    }
}
