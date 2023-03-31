package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BranchManager {

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
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"branch\"]/ul/li[2]/a")).click();
		WebElement m = driver.findElement(By.xpath("//*[@id=\"branch\"]/ul/li[2]/a"));
	      //JavascriptExecutor to click element
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", m);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div[2]/a/i")).click();
		driver.findElement(By.name("code")).sendKeys("BM1");
		driver.findElement(By.name("name")).sendKeys("Mahroof");
		driver.findElement(By.name("cluster_id")).click();
		Select dropdownSelect=new Select(driver.findElement(By.name("cluster_id")));
		dropdownSelect.selectByVisibleText("MALAPPURAM 1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select dropdownSelect1=new Select(driver.findElement(By.name("branch_id")));
		dropdownSelect1.selectByVisibleText("KAKKAD");	    
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("place")).sendKeys("Kottakkal");
		driver.findElement(By.name("address")).sendKeys("hdshd");
		driver.findElement(By.name("mobile")).sendKeys("4789625");
		driver.findElement(By.name("username")).sendKeys("mahroof@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/button")).click();
	}

}
