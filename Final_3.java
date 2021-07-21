package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Final_3 {

	public static void main(String[] args) throws InterruptedException {
		       
		//---------------------------- Agile project--------------------------------------------------- 
		
		// launch browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		
		// open URL
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		//37. Agile project button
		w.findElement(By.linkText("Agile Project")).click();
		Thread.sleep(2000);
		
		//38. login using valid userID and password
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		System.out.println(w.findElement(By.className("heading3")).getText());
		w.navigate().back();
		
		//39. login using invalid userID and valid password
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("0000");
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		 Alert a=w.switchTo().alert();
		 a.accept();
		 Thread.sleep(2000);
		
		//40. login using valid userID and invalid password
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("123");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		 a.accept();
		 Thread.sleep(2000);
			 
	    //41. login using valid userID and blank password
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		 a.accept();	 
		 Thread.sleep(2000);
		 
		//42. login using invalid userID and invalid password
			w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("0000");
			w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("123");
			Thread.sleep(2000);
			w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
			Thread.sleep(2000);
		    a.accept();
		    Thread.sleep(2000);
			 
		//43. login using blank userID and valid password
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		 a.accept();	 
		Thread.sleep(2000);	 
		
		//44. login using blank userID and blank password
		
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		 a.accept();	 
		Thread.sleep(2000);
		
		//45. to check reset button
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[2]")).click();
		Thread.sleep(2000);
		
		//46. to login with valid UserID and password and check customer button                //D5. next page is not opened
		w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		Thread.sleep(2000);
		w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		System.out.println(w.findElement(By.className("heading3")).getText());
		w.findElement(By.xpath("//body/div[3]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		//47. to click on mini statement button
		Thread.sleep(3000);
		w.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		 //48. select no account number and click on submit
		
		w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		
	/*	//49. select 3308 account number and click on submit                                  //D6- the dropdown is not working
		Select s1= new Select(w.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")));
		s1.selectByValue("3308");
		w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		//50. select 3309 account number and click on submit
		Select s2= new Select(w.findElement(By.xpath("//tbody/tr[6]/td[2]/select[1]")));
		s2.selectByValue("3309");
		w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		*/		
	  
	
	  //51. to check reset button
				w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[2]")).click();
				Thread.sleep(2000);		
				
	 //52. click on logout	
				w.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
				Thread.sleep(2000);
				a.accept();
				System.out.println("logout successfull");
				Thread.sleep(2000);
				
				w.quit();
		
		
	}

}
