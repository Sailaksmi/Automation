package mod1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class geturl {
	@Test
	public void Testgeturl()
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai Lakshmi\\Desktop\\drivers/chromedriver.exe");
	  ChromeDriver rv1=new ChromeDriver();
	  rv1.get("http://127.0.0.1:81/login.do");
	  rv1.findElement(By.name("username")).sendKeys("admin");
	  rv1.findElement(By.name("pwd")).sendKeys("manager");
	rv1.findElement(By.xpath("//input[@type='submit']")).click();
	
	String s=rv1.getCurrentUrl();
	System.out.println(s);
}

}
