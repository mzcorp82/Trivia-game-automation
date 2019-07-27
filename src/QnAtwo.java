import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAtwo {
	
	public static void QnAtwo(WebDriver driver) {
		
		
		driver.findElement(By.name("question")).sendKeys("b");
		driver.findElement(By.id("nextquest")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("g");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("r");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("u");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input")).click();
		driver.findElement(By.id("nextquest")).click();
		
		
	}
	
}
