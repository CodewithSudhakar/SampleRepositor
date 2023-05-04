package Selenium.checks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.edge.driver","G:\\msedgedriver.exe");
        
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.spicejet.com/"); 
        
        Thread.sleep(300);
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'][1]/div[@style='position: relative; z-index: 1;'][2]")).click();
        Assert.assertTrue(true);
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
      
//  String text=    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][2]/div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']")).getText();
//        System.out.println(text);
       //Select Source city 
List<WebElement>list=       driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']/div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']"));
        		
java.util.Iterator<WebElement> it= list.iterator();
while(it.hasNext())
{	
WebElement ele=	it.next();
if(ele.getText().equals("AMD"))
	{
	System.out.println(ele.getText());
	break;
	}
}
//Destination city
    
    }
	
}
