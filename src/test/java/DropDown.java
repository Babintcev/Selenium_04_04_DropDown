import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/dmitr/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown1 = driver.findElement(By.id("dropdownMenuButton"));
        dropDown1.click();
        Thread.sleep(1000);

        WebElement dropDownItem1 = driver.findElement(By.id("autocomplete"));
        dropDownItem1.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
