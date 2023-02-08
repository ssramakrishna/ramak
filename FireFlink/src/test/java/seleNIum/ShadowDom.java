package seleNIum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext ShadowRoot = expandShadowRoot(shadowHost);

		String text = ShadowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText();
		System.out.println(text);

		// driver.quit();
	}

	private static SearchContext expandShadowRoot(WebElement shadowHost) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
		return shadowRoot;
	}
}
