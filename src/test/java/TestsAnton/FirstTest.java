package TestsAnton;

import org.testng.annotations.Test;


public class FirstTest extends TestInit {

    @Test
    public void firstTest() {
        openUrl("https://google.com/123");
    }
}
