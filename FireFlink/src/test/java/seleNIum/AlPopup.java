package seleNIum;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlPopup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions a = new Actions(driver);
		a.contextClick(e).perform();

		driver.findElement(By.xpath("//span[text()='Edit']")).click();

		Alert al = driver.switchTo().alert();
		al.accept();

		driver.close();

	}

}
