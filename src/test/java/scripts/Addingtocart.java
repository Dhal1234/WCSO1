package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkilraryDemoLogin;

public class Addingtocart extends BaseClass
{
	 @Test
	 public void tc1() throws FileNotFoundException, IOException
	 {
		 SkillraryLoginPage s=new SkillraryLoginPage(driver);
		 s.gerasbutton();
		 s.Skilrarydemoappapplication();
		 
		 utilits.switchingTab(driver);
		 
		 SkilraryDemoLogin d=new SkilraryDemoLogin(driver);
		 utilits.mouseHover(driver, d.getCoursebtn());
		 d.seleniumtrqainingbtn();
		 
		 AddToCartPage a=new AddToCartPage(driver);
		 utilits.doubleClick(driver, a.getAddbtn());
		 a.addingtocart();
		 utilits.alartPopup(driver);
		 
		 Assert.assertEquals(driver.getTitle(), p.getData("srtitle"));
	 }
}
 