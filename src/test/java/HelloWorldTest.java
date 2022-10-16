import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/hello")
                .andReturn();
        response.prettyPrint(); //распечатываем
    }

    @Test
    public void testHelloWorldForEx3() {
        System.out.println("Hello from Yana");
    }
}
