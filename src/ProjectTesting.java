import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ProjectTesting {
	
	WebDriver driver = new ChromeDriver();
//	@BeforeEach
//	public void beforeEachFunction(){
//		driver.get ("https://svcollegetest.000webhostapp.com/");
//	}
	
	//Sanity Test
	@Test
	void Gamesanity() {
		
		driver.get ("https://svcollegetest.000webhostapp.com/");
		QnAone.QnAone(driver);
		QnAtwo.QnAtwo(driver);
		QnAthree.QnAthree(driver);
		GameFrstRound.GameFrstRound(driver);
		GameSecondRound.GameSecondRound(driver);
		GameThirdRound.GameThirdRound(driver);
		
	}
	driver.quit();
	
	//Boundary Values Test
	@Test
	void QnABV() {
		
	}
	
	//Functionality Test
	@Test
	void PopUpMessage() {
		
	}

	@Test
	void IsWebPageTurn() {
		
	}
	
	@Test
	void IsQuestionSaved() {
		
	}
	
	@Test
	void TestWithNumbers() {
		
	}
	
	@Test
	void FaildQuastionTest() {
		
	}
	
	@Test
	void StartNewGame() {
		
	}
	
	@Test
	void CloseGame() {
		
	}
	
	@Test
	void RadioButtonTest() {
		
	}
	
	@Test
	void IfThePageIsCorrect() {
		
	}
	
	//Erroe Handling  
	void IncorrectInput() {
		
	}
	
	//Integration
	void FacebookIntegration() {
		
	}
	
	//Compatibility
	void FirefoxCompatibility() {
		
	}
	
	
	
	
	
	
	
}
