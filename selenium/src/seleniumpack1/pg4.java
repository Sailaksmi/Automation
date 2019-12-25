package seleniumpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class pg4 extends baseclass
{
	
	public void testtoursdemo()
	{
		
		  driver.get("http://www.newtours.demoaut.com");
		  
		 
		  
		  driver.findElement(By.linkText("REGISTER")).click();
		  driver.findElement(By.name("firstName")).sendKeys("abcd");
		  driver.findElement(By.name("lastName")).sendKeys("defg");
		  driver.findElement(By.name("phone")).sendKeys("1234567891");
		  driver.findElement(By.id("userName")).sendKeys("abc1234@gmail.com");
		  driver.findElement(By.name("address1")).sendKeys("astgvgvugajj");
		  driver.findElement(By.name("address2")).sendKeys("sjvkhbckbcc");
		  driver.findElement(By.name("city")).sendKeys("hyd1");
		  driver.findElement(By.name("state")).sendKeys("AP1");
		  driver.findElement(By.name("postalCode")).sendKeys("5226111");
		  driver.findElement(By.name("email")).sendKeys("sai12345");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		  driver.findElement(By.name("register")).click();
		  
		 
		  driver.findElement(By.linkText("Home")).click();
		  driver.findElement(By.name("userName")).sendKeys("abc");
		  driver.findElement(By.name("password")).sendKeys("def");
		  driver.findElement(By.name("login")).click();
		 
		  driver.findElement(By.name("userName")).sendKeys("sai12345");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  driver.findElement(By.name("login")).click();
		 
		 
		  driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		 WebElement d1= driver.findElement(By.name("passCount"));
         Select s2=new Select(d1);
         s2.selectByVisibleText("2");
         
        
		 WebElement d2= driver.findElement(By.name("fromPort"));
		 Select s3=new Select(d2);
		 s3.selectByVisibleText("New York");
		 
		 
		 WebElement d3= driver.findElement(By.name("fromMonth"));
		 Select s4=new Select(d3);
		 s4.selectByIndex(9);
		 
		 
		 WebElement d4= driver.findElement(By.name("fromDay"));
		 Select s5=new Select(d4);
		 s5.selectByVisibleText("11");
		 
		 
		 WebElement d5= driver.findElement(By.name("toPort"));
		 Select s6=new Select(d5);
		 s6.selectByVisibleText("London");
		 
		 WebElement d6= driver.findElement(By.name("toMonth"));
		 Select s7=new Select(d6);
		 s7.selectByVisibleText("October");
		 
		 WebElement d7= driver.findElement(By.name("toDay"));
		 Select s8=new Select(d7);
		 s8.selectByVisibleText("15");
		 
		 driver.findElement(By.xpath("//input[@value='Business']")).click();
		 
		 
		 WebElement d8=driver.findElement(By.name("airline"));
		 Select s9=new Select(d8);
		 s9.selectByVisibleText("Blue Skies Airlines");
		 
		 driver.findElement(By.name("findFlights")).click();
		 //radio
		 driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		 
		 
		 driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		 
		 driver.findElement(By.name("reserveFlights")).click();
		 
		 driver.findElement(By.name("passFirst0")).sendKeys("sai");
		 
		 driver.findElement(By.name("passLast0")).sendKeys("lakshmi");
		 
		 
		 
		 WebElement d9= driver.findElement(By.name("pass.0.meal"));
		 Select s10=new Select(d9);
		 s10.selectByVisibleText("Hindu");
		 
		 WebElement d10=driver.findElement(By.name("creditCard"));
		 Select s11=new Select(d10);
		 s11.selectByVisibleText("MasterCard");
		 
		 
		 driver.findElement(By.name("creditnumber")).sendKeys("1234567890123456");
		 

		 WebElement d11=driver.findElement(By.name("cc_exp_dt_mn"));
		 Select s12=new Select(d11);
		 s12.selectByVisibleText("12"); 
		 WebElement d12= driver.findElement(By.name("cc_exp_dt_yr"));
		 Select s13=new Select(d12);
		 s13.selectByIndex(5);
		 
		 
		 driver.findElement(By.name("cc_frst_name")).sendKeys("sai");
		 
		 driver.findElement(By.name("cc_mid_name")).sendKeys("lakshmi");
		 
		 driver.findElement(By.name("cc_last_name")).sendKeys("ramisetty");
		 
		 
	WebElement c1=driver.findElement(By.name("billAddress1"));
	     c1.clear();
		c1.sendKeys("qwertyuiop");
		 
		WebElement c2=driver.findElement(By.name("billAddress2"));
	     c2.clear();
		c2.sendKeys("asdfghjkl");
		 
		WebElement c3=driver.findElement(By.name("billCity"));
	     c3.clear();
		c3.sendKeys("hyd"); 
		 
		WebElement c4=driver.findElement(By.name("billState"));
	     c4.clear();
		c4.sendKeys("AP"); 
		 
		WebElement c5=driver.findElement(By.name("billZip"));
	     c5.clear();
		c5.sendKeys("5222111");
		
		 
		WebElement d13= driver.findElement(By.name("billCountry"));
		 Select s14=new Select(d13);
		 s14.selectByValue("6");
		 
		 
		WebElement c6= driver.findElement(By.name("delAddress1"));
		c6.clear();
		 c6.sendKeys("gdagga");
		 
		 
			WebElement c7= driver.findElement(By.name("delAddress2"));
			c7.clear();
			 c7.sendKeys("jjitjitji");
		 
			 
			 WebElement c8= driver.findElement(By.name("delCity"));
				c8.clear();
				 c8.sendKeys("banglore");
				 
				 
				 WebElement c9=driver.findElement(By.name("delState"));
					c9.clear();
					 c9.sendKeys("karnataka");	
					 
					 WebElement c10= driver.findElement(By.name("delZip"));
						c10.clear();
						 c10.sendKeys("54764866");	
						 
					 WebElement d14= driver.findElement(By.name("delCountry"));
					 Select s15=new Select(d14);
					 s15.selectByValue("7");
				
					 Alert a1=driver.switchTo().alert();
					 a1.accept();
					 
					 
					 driver.findElement(By.name("buyFlights")).click();
		 
		 
		 
		 
		 
	}

}
