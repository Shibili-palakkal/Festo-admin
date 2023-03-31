package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowroomManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a")).click();
		WebElement m = driver.findElement(By.xpath("//*[@id=\"showroom\"]/ul/li[2]/a"));
	      //JavascriptExecutor to click element
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", m);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div[2]/a/i")).click();
		driver.findElement(By.name("code")).sendKeys("SHM1");
		driver.findElement(By.name("name")).sendKeys("Manaf");
		driver.findElement(By.name("showroom_id")).click();
		driver.findElement(By.name("place")).sendKeys("Kottakkal");
		driver.findElement(By.name("address")).sendKeys("shuisdfhu");
		driver.findElement(By.name("mobile")).sendKeys("84759");
		driver.findElement(By.name("username")).sendKeys("manaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/button")).click();
		driver.navigate().to("http://festo-admin.yes45.in/dashboard");
		driver.quit();

	}

}
