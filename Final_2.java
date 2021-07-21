package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Final_2 {

	public static void main(String[] args) throws InterruptedException {
		 // launch browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		
		//  open URL
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		
		 //19. selenium ---> radio and check box
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]/a")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Radio & Checkbox Demo')]")).click();
		Thread.sleep(2000);
		
		//20. click on radio button and check boxes
		w.findElement(By.xpath("//input[@id='vfb-7-2']")).click();
		w.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		w.findElement(By.xpath("//input[@id='vfb-6-1']")).click();
		w.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
		Thread.sleep(2000);
		

		//21. selenium---> accesing link
		w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Accessing Link')]")).click();
		Thread.sleep(2000);
		
		//22. click on link 1
		w.findElement(By.xpath("//body/a[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		//23. click on link 2
		w.findElement(By.xpath("//body/a[2]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		
	   //24. selenium---> file upload                                                                           
		w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		
		//25. file upload page                                                 //D4 -file not selected but file uploaded successfully message displayed
		//w.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("");
		Thread.sleep(2000);
		w.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		w.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		
		//26. selenium---> drag and drop
		w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.linkText("Drag and Drop Action")).click();
		Thread.sleep(2000);
		
		//27.drag and drop page (debit side)
		Actions a=new Actions(w);
		a.dragAndDrop(w.findElement(By.xpath("//a[contains(text(),'BANK')]")),w.findElement(By.xpath("//ol[@id='bank']"))).build().perform();
		a.dragAndDrop(w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")),w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"))).build().perform();
		
		
		//27.drag and drop page (credit side)
		a.dragAndDrop(w.findElement(By.xpath("//a[contains(text(),'SALES')]")),w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"))).build().perform();
		a.dragAndDrop(w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")),w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"))).build().perform();
	
		
		//28. Flash Movie Demo
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Flash Movie Demo')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
	
		//29. Table Demo
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Table Demo')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		//30. Ajax Demo
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Ajax Demo')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		  
		
		//31. Yahoo
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Yahoo')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		
		//32. tooltip
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Tooltip')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		//33. Social Icon
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Social Icon')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		
		//34. Selenium Auto IT
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Selenium Auto IT')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
		
		//35. Guru99 Demo Page
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Guru99 Demo Page')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
	}

}
