package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.TakethisCoursePage;

public class Takecourse extends BaseClass 
{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryLoginPage s=new  SkillraryLoginPage(driver);
		s.searchtextbox(p.getData("name"));
		s.searchbutton();
		
		SeleniumPage sp=new SeleniumPage(driver);
		sp.corejavaselenium();
		
		TakethisCoursePage t=new TakethisCoursePage(driver);
		utilits.frameSwitchBack(driver);
		t.playbtn();
		Thread.sleep(10000);
		t.pusebtn();
		utilits.frameSwitchBack(driver);
		
		t.takethiscourse();
		
	}
}
