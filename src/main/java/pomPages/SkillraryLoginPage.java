package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name = "q")
	private WebElement searchtab;
	
	@FindBy(xpath = "//input[@value='go']")
	private WebElement gobtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void gerasbutton()
	{
		gearsbtn.click();
	}
	
	public void Skilrarydemoappapplication() 
	{
		skillraryDemoapp.click(); 
	}
	
	public void searchtextbox(String name)
	{
		searchtab.sendKeys(name );
	}
	
	public void searchbutton()
	{
		gobtn.click();
	}
}
 