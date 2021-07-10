package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Facebookpage;
import pomPages.SkillraryLoginPage;
import pomPages.SkilraryDemoLogin;
import pomPages.TestingPage;

public class FacebookLike extends BaseClass 
{	
	@Test
	public void tc2() throws FileNotFoundException, IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasbutton();
		s.Skilrarydemoappapplication();
		
		utilits.switchingTab(driver);
		
		SkilraryDemoLogin d=new SkilraryDemoLogin(driver);
		utilits.dropDown(d.getCoursedd(), p.getData("coursename"));
		
		TestingPage t=new TestingPage(driver);
		utilits.dragDrop(driver, t.getSeleniumncourse(), t.getCart());
		
		Facebookpage f=new Facebookpage(driver);
		f.likebtn();
		
		
	}
}
