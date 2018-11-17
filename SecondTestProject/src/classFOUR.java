import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classFOUR {

	public static void main(String[] args) {
		// Test
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		driver.manage().window().maximize();


		 WebElement startButton;  
		 startButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[1]/a[1]"));
		 startButton.click(); 
		 
		 WebElement firstName;
		 firstName = driver.findElement(By.id("input-firstname"));
		 firstName.sendKeys("Nauman");
		 
		 WebElement lastName;
		 lastName = driver.findElement(By.id("input-lastname"));
		 lastName.sendKeys("Naseer");
		 
		 WebElement userEmail;
		 userEmail = driver.findElement(By.id("input-email"));
		 userEmail.sendKeys("nomi.naseer@gmail.comaaa");
		 
		 WebElement phoneNumber;
		 phoneNumber = driver.findElement(By.id("input-telephone"));
		 phoneNumber.sendKeys("02136565666");
		 
		 WebElement password;
		 password = driver.findElement(By.id("input-password"));
		 password.sendKeys("password");
		 
		 WebElement reconfirmPassword;
		 reconfirmPassword = driver.findElement(By.id("input-confirm"));
		 reconfirmPassword.sendKeys("password");
		 
		 WebElement subscribeCheckbox;
		 subscribeCheckbox = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"));
		 subscribeCheckbox.click();
		 
		 WebElement privacyPolicy;
		 privacyPolicy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		 privacyPolicy.click();
		 
		 try {
				Thread.sleep(5000);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
		 
		 WebElement submitButton;
		 submitButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		 submitButton.click();
		 
		 String actualpagetitle = driver.getTitle();
		 String expectedTitle = "Your Account Has Been Created!";
		 
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	       
	        }
		 
		
		 try {
			Thread.sleep(5000);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } 
		 
			driver.close();
			
			driver.quit();
		
			System.out.println("Test GIT");	
		// TODO Auto-generated method stub

	}

}
