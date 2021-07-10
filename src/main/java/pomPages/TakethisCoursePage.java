package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakethisCoursePage 
{
	@FindBy(xpath = "//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath = "//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath = "//a[text()=' TAKE THIS COURSE ']")
	private WebElement takecourse;
	
	public TakethisCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void playbtn()
	{
		play.click();
	}
	public void pusebtn()
	{
		pause.click();
	}
	public void takethiscourse()
	{
		takecourse.click();
	}
}
