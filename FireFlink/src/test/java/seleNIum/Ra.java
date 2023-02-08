package seleNIum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ra {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));

		// 1st shadow root
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		String text = shadowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText();
		System.out.println(text);

		// 2nd shadow root
		WebElement nestedShadowHost = shadowHost.findElement(By.cssSelector("#nested_shadow_host"));
		
		SearchContext nestedShadowRoot = nestedShadowHost.getShadowRoot();
		String test1 = nestedShadowRoot.findElement(By.cssSelector("div[id='nested_shadow_content'] > div")).getText();
		System.out.println(test1);

	}

}
