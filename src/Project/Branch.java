package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Branch {

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
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"branch\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div[2]/a/i")).click();
		driver.findElement(By.name("code")).sendKeys("B2");
		driver.findElement(By.name("name")).sendKeys("new branch");
		driver.findElement(By.name("cluster_id")).click();
		driver.findElement(By.name("place")).sendKeys("Kottakkal");
		driver.findElement(By.name("address")).sendKeys("abcd");
		driver.findElement(By.name("contact")).sendKeys("254763");
		driver.findElement(By.name("description")).sendKeys("uddhde");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/button")).click();
		driver.navigate().to("http://festo-admin.yes45.in/dashboard");  

	}

}
