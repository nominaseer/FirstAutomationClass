import org.ini4j.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second class
		System.out.println("Hello World");
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\qatestid12\\Chrome drivers\\New folder\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.addArguments("start-maximized");
		
		Options.addArguments("disable-infobars");
		Options.addArguments("--incognito");
		Options.addArguments("--ignore-certificate-errors");
		Options.addArguments("--disable-popup-blocking");
		
		WebDriver driver = new ChromeDriver(Options);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		driver.manage().window().maximize();


		 WebElement username;
		 username = driver.findElement(By.id("input-email"));
		 username.sendKeys("nomi.naseer@gmail.com");

		 WebElement Password;
		 Password = driver.findElement(By.id("input-password"));
		 Password.sendKeys("pass");

		 
		 //input type="submit" value="Login" class="btn btn-primary"
		 WebElement loginButton;  
		// loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		 loginButton = driver.findElement(By.xpath("//input type=\"submit\" value=\"Login\" class=\"btn btn-primary\""));
		 loginButton.click(); 
		 
		
		 WebElement searchProduct;
		 searchProduct = driver.findElement(By.xpath("//*[@id=\"search\"]/input[1]"));
		 searchProduct.sendKeys("hp lp3065");
		 
		 WebElement searchProductbutton;
		 searchProductbutton = driver.findElement(By.xpath("//*[@id=\"search\"]/span[1]/button[1]"));
		 searchProductbutton.click();
		 
		 WebElement addToCart1;
		 addToCart1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		 addToCart1.click();
		 
		 try {
				Thread.sleep(5000);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
		 
		 
		 
		 WebElement addToCart2;  
		 addToCart2 = driver.findElement(By.id("button-cart"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView()", addToCart2);
		 addToCart2.click(); 
		 
	
		 WebElement clickOnitem = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"cart\"]/button"))));
		 clickOnitem.click();
		 
		 WebElement clickOncheckout = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"))));
		 clickOncheckout.click();
		 
		}

}
