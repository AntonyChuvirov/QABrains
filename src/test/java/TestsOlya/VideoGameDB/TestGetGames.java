package TestsOlya.VideoGameDB;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class TestGetGames {
    @Test
    public void checkGamesPositive(){
            ResponseBody responseBody = given()
               .baseUri("http://localhost:8080")
                    .header("Accept","application/json")
            .when()
              .get("/app/videogames")
            .getBody();
            System.out.println(responseBody.prettyPrint());
    }
    @Test
    public void checkGamePositive(){
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept","application/json")
                .when()
                .get("/app/videogames/10");
        GameModel gameModel = response.as(GameModel.class);
        Assert.assertTrue(gameModel.id == 10);
        Assert.assertTrue(gameModel.name.equals("Grand Theft Auto XII"));
        Assert.assertTrue(gameModel.releaseDate.equals("2022-08-11"));
        Assert.assertTrue(gameModel.reviewScore == 60);
        Assert.assertTrue(gameModel.category.equals("study"));
        Assert.assertTrue(gameModel.rating.equals("Mature"));
  }
}
