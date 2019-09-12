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
		List<WebElement> departureCities = driver.findElements(By.name("fromPort"));
		int count = 0;
		for(int i=0;i < departureCities.size();i++)
		{
			WebElement link = departureCities.get(i);
			int total = departureCities.size();
			String linkText = link.getText();
			
			System.out.println("cities: "+linkText);
			
			
			
	 		assertEquals(1, total);
	 		
	 		
	 	
		}
	}

}
