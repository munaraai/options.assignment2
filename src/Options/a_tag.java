package Options;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_tag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		Thread.sleep(3000);
		List <WebElement> options=driver.findElements(By.tagName("option"));
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		

		
	}

}
