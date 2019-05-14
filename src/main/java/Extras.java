import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Extras {

        public static void main(String[] args) {


        WebDriver driver = new SafariDriver();

        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.name("q")).sendKeys("123456");
        driver.findElement(By.name("btnK")).submit();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.quit();

    }

}
