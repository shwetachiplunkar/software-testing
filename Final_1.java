package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Final_1 {

	public static void main(String[] args) throws InterruptedException {
		
	    //1. launch browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		
		//2. open URL
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		//3. register
		w.findElement(By.linkText("REGISTER")).click();                                      
		w.findElement(By.name("firstName")).sendKeys("aaaa");
		w.findElement(By.name("lastName")).sendKeys("bbbb");
		w.findElement(By.name("phone")).sendKeys("11111111");
		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("address1")).sendKeys("cccc");
		w.findElement(By.name("city")).sendKeys("dddd");
		w.findElement(By.name("state")).sendKeys("eeee");
		w.findElement(By.name("postalCode")).sendKeys("222222");
		
		Select s=new Select(w.findElement(By.name("country")));
		s.selectByIndex(5);
		
		w.findElement(By.name("email")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("confirmPassword")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		System.out.println(w.findElement(By.xpath("//tbody/tr[3]/td[1]/p[2]/font[1]")).getText());
		
		w.navigate().back();
		Thread.sleep(2000);
		w.navigate().back();
		
		//4. sign on                                                               //D1. login successful with invaild data
		w.findElement(By.linkText("SIGN-ON")).click();                                     
		w.findElement(By.name("userName")).sendKeys("project");
		w.findElement(By.name("password")).sendKeys("project");
		w.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		System.out.println(w.findElement(By.xpath("//tbody//tr//td//h3")).getText());
		
		w.navigate().back();
		Thread.sleep(2000);
		w.navigate().back();
		
		 //5. support
		w.findElement(By.linkText("SUPPORT")).click();                                              
		w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		
		//6. contact
		w.findElement(By.linkText("CONTACT")).click();                                               
		w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		
		//7. flights
		w.findElement(By.linkText("Flights")).click();                                                   
		w.findElement(By.name("tripType")).click();
		
		Select s1=new Select(w.findElement(By.name("passCount")));
		s1.selectByVisibleText("2");
		
		Select s2=new Select(w.findElement(By.name("fromPort")));
		s2.selectByValue("New York");
		
		Select s3=new Select(w.findElement(By.name("fromMonth")));
	    s3.selectByIndex(2);
	    
	    Select s4=new Select(w.findElement(By.name("fromDay")));
		s4.selectByValue("10");
		
		Select s5=new Select(w.findElement(By.name("toPort")));
		s5.selectByValue("Paris");
		
		Select s6=new Select(w.findElement(By.name("toMonth")));
		s6.selectByVisibleText("August");
		
		Select s7=new Select(w.findElement(By.name("toDay")));
		s7.selectByVisibleText("23");
	    
	    w.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[2]")).click();
	    
	    Select s8=new Select(w.findElement(By.xpath("//tbody/tr[10]/td[2]/select[1]")));
	    s8.selectByIndex(1);
	    
	    w.findElement(By.xpath("//tbody/tr[14]/td[1]/input[1]")).click();
	    Thread.sleep(2000);
	    
	    //8. hotels
	    w.findElement(By.xpath("//a[contains(text(),'Hotels')]")).click();   
	    Thread.sleep(2000);
	    
	    //9. car rentals
	    w.findElement(By.xpath("//a[contains(text(),'Car Rentals')]")).click();   
	    Thread.sleep(2000);
	    
	    //10. cruises
	    w.findElement(By.xpath("//a[contains(text(),'Cruises')]")).click();   
	    Thread.sleep(2000);
	    
	    //11. destinations
	    w.findElement(By.xpath("//a[contains(text(),'Destinations')]")).click();   
	    Thread.sleep(2000);
	    
		//12. vacations
	    w.findElement(By.xpath("//a[contains(text(),'Vacations')]")).click();   
	    Thread.sleep(2000);
	    
	    //13. back to home
	    w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();	    
	    Thread.sleep(2000);
	    
	    //14.your destination                                                             //D2. next page not opening
	    w.findElement(By.xpath("//a[contains(text(),'your destination')]")).click(); 
	    Thread.sleep(2000); 
	    
	    //15. featured vacation destinations                                              //D3. next page not opening
	    w.findElement(By.xpath("//a[contains(text(),'featured vacation destinations')]")).click(); 
	    Thread.sleep(2000);
	    
	    //16. register here
	    JavascriptExecutor js=(JavascriptExecutor) w;
	    js.executeScript("window.scrollBy(0,3000)");
	    w.findElement(By.xpath("//a[contains(text(),'here')]")).click(); 
	    Thread.sleep(2000);
	    w.navigate().back();
	    
	    //17. business travel@about.com
	    w.findElement(By.xpath("//a[contains(text(),'Travel @ About.com')]")).click(); 
	    Thread.sleep(2000);
	    w.navigate().back();
	    
	    //18. salon travel
	    w.findElement(By.xpath("//a[contains(text(),'Vacations')]")).click(); 
	    Thread.sleep(2000);
	    w.navigate().back();
	    
	    
	 
	  
		
	w.quit();
	}

}
