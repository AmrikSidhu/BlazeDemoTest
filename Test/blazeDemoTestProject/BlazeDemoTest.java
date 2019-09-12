package blazeDemoTestProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BlazeDemoTest {
	final String CHROMEDRIVER_LOCATION = "/Users/zangrazyjatt/Desktop/chromedriver";
	final String URL_TO_Test ="http://blazedemo.com/";
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_LOCATION);
		 driver = new ChromeDriver();
			String baseUrl = URL_TO_Test;
			driver.get(baseUrl);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void departureCities() {
		WebElement departureCities = driver.findElement(By.name("fromPort"));
		int count = 0;
		List<WebElement> departureCitiesList = departureCities.findElements(By.tagName("option"));
		int total = departureCitiesList.size();
		assertEquals(7,total);
	}

}
