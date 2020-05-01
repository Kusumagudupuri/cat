import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class March 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\April\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement Course=driver.findElement(By.xpath("//a[test()='Course']"));
		
		Actions acc=new Actions(driver);
		
         acc.moveToElement(Course).perform();
		
		
		Thread.sleep(2000);
		acc.click().build().perform();
		
		WebElement Oracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
		acc.moveToElement(Oracle).perform();
		
		Thread.sleep(2000);
	
		WebElement sql=driver.findElement(By.xpath("//span[text()='oracle SQL and PSQL Training']"));
		
		sql.click();
	}
}
