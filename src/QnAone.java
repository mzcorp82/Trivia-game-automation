import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAone {
	
	public static void QnAone (WebDriver driver) throws InterruptedException {
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("startB")).click();
		driver.findElement(By.name("question")).sendKeys("a");
		driver.findElement(By.id("nextquest")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		driver.findElement(By.id("nextquest")).click();
		
		
		
	}

}
