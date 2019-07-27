import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAthree {
	
	public static void QnAthree (WebDriver driver) {
		
		
		driver.findElement(By.name("question")).sendKeys("c");
		driver.findElement(By.id("nextquest")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("w");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("j");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("q");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input")).click();
		driver.findElement(By.id("nextquest")).click();
		
	}

}
