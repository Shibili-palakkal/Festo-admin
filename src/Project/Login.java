package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		driver.manage().window().maximize();
		String expectedString="Fezto-Admin";
		String actualString=driver.getTitle();
		if(expectedString.equals(actualString)) {
			System.out.println("Verification Successfull-The correct title is displayed on webpage");
		}
		else {
			System.out.println("Verification Failed-An incorrect title is displayed on the webpage");
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,5000)");//Scrolling
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/i")).click();//Logout
		driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul[2]/li/div/a")).click();
	    //driver.quit();
	    

	}

}
