import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classThree {

	public static void main(String[] args) {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\qatestid12\\Chrome drivers\\New folder\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://qatestid12.wixsite.com/qaspecialist");	
		driver.manage().window().maximize();


		 WebElement username;
		 username = driver.findElement(By.id("comp-jhrgftz1input"));
		 username.sendKeys("Nauman");

		 WebElement password;
		 password = driver.findElement(By.id("comp-jhrggrufinput"));
		 password.sendKeys("nomi.naseer@gmail.com");
		 
		 WebElement subText;
		 subText = driver.findElement(By.id("comp-jhrgh32ainput"));
		 subText.sendKeys("Test Subject");
		 
		 WebElement messageText;
		 messageText = driver.findElement(By.id("comp-jhrgk2pstextarea"));
		 messageText.sendKeys("This is test message");
		 
		 WebElement submitButton;  
		 submitButton = driver.findElement(By.xpath("//*[@id=\"comp-jhrgemmllink\"]"));
		 submitButton.click(); 
		 
		 /*
		 String actualpagetitle = driver.getTitle();
		 String expectedTitle = "Contact Us";
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	    
		 
		 WebElement continueButton;  
		 continueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		 continueButton.click(); 
		 */
		 
			driver.close();
			
			driver.quit();
		
	}

}
