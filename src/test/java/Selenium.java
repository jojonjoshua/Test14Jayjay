import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Selenium {

    @Test
    public void helloJayjay() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://jayjay.co/");
        String text = driver.findElement(By.className("first-course")).getText();
        assertEquals("Gebrakan Kursus Online yang Siap Meroketkan Kariermu", text);
    }
}
