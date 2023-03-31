package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Showroom {

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
		driver.findElement(By.xpath("//*[@id=\"showroom\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div[2]/a/i")).click();
		driver.findElement(By.name("code")).sendKeys("SH1");
		driver.findElement(By.name("name")).sendKeys("Fezto");
		driver.findElement(By.name("place")).sendKeys("Calicut");
		driver.findElement(By.name("address")).sendKeys("Fezto-Showroom");
		driver.findElement(By.name("contact")).sendKeys("145289");
		driver.findElement(By.name("description")).sendKeys("huhdehd");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/button")).click();

	}

}
