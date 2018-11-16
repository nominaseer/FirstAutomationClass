import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classTWO {

	public static void main(String[] args) {
		
		
	System.out.println("Hello World");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\qatestid12\\Chrome drivers\\New folder\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.opencart.com/index.php?route=information/contact");	
		driver.manage().window().maximize();


		 WebElement username;
		 username = driver.findElement(By.id("input-name"));
		 username.sendKeys("Nauman");

		 WebElement password;
		 password = driver.findElement(By.id("input-email"));
		 password.sendKeys("nomi.naseer@gmail.com");
		 
		 WebElement queryText;
		 queryText = driver.findElement(By.id("input-enquiry"));
		 queryText.sendKeys("Hi , This is testing text for automation");
		 
				 
		 WebElement submitButton;  
		 submitButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/div[1]/div[1]/input[1]"));
		 submitButton.click(); 
		 
 
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
	
		 
		 
		
		driver.close();
		
		driver.quit();
	

	}

}
