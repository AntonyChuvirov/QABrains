package TestsOlgaVerom;

import TestsOlgaVerom.GameModel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRestAssured {
    @Test
    public void checkGamesPositive() {
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
                .when()
                .get("/app/videogames/10");

        GameModel gameModel = response.as(GameModel.class);
        Assert.assertTrue(gameModel.id == 10);
        Assert.assertTrue(gameModel.reviewScore > 80);
        Assert.assertTrue(gameModel.category.equals("Driving"));
        Assert.assertTrue(gameModel.name.equals("Grand Theft Auto XII"));
        Assert.assertTrue(gameModel.rating.equals("Mature"));
        Assert.assertTrue(gameModel.releaseDate.equals("2001-04-23"));
    }
    @Test
    public void checkGame7(){
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
                .when()
                .get("/app/videogames/7");
        GameModel gameModel = response.as(GameModel.class);
        Assert.assertTrue(gameModel.id == 7);
        Assert.assertTrue(gameModel.reviewScore == 77);
        Assert.assertTrue(gameModel.category.equals("Puzzle"));
        Assert.assertTrue(gameModel.name.equals("Minecraft"));
        Assert.assertTrue(gameModel.rating.equals("Universal"));
        Assert.assertTrue(gameModel.releaseDate.equals("2011-12-05"));
    }
    @Test
    public void checkGame3(){
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
                .when()
                .get("/app/videogames/3");
        GameModel gameModel = response.as(GameModel.class);
        Assert.assertTrue(gameModel.id == 3);
        Assert.assertTrue(gameModel.reviewScore == 88);
        Assert.assertTrue(gameModel.category.equals("Puzzle"));
        Assert.assertTrue(gameModel.name.equals("Tetris"));
        Assert.assertTrue(gameModel.rating.equals("Universal"));
        Assert.assertTrue(gameModel.releaseDate.equals("1984-06-25"));
    }

}