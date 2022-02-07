package seleniumPackage;
import static io.restassured.RestAssured.given;

public class Rest_Assured_Test {
    public static void main(String[] args) {
            given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);
            //System.out.println(response.getTime);
            System.out.println("hello");


        }
}
