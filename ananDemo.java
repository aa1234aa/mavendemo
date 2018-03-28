import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ananDemo {
    public WebDriver driver;
    public String baeUrl;
    @Test
    public void Initfirfox  ()throws Exception{
        System.setProperty("webNoSuchElementExceptiondriver.firefox.bin", "C:\\Program Files (x86)\\mozilla firefox\\firefox.exe");
        driver=new FirefoxDriver();
        baeUrl="http://172.19.19.205:8080/scBOSS/login/toLogin.action";
        driver.get(baeUrl);
        driver.findElement(By.id("username")).sendKeys("test");
        driver.findElement(By.id("password")).sendKeys("1");
        driver.findElement(By.xpath(".//*[@id='f1']/button")).click();
        driver.findElement(By.cssSelector("div[class='navbarHover']")).click();
        //Select select =new Select(driver.findElement(By.id("AA")));下拉框
      //  WebElement element=driver.findElement(By.id("aa"));//除了下拉框以外的定位
        //element.click();   //div[@class="todotask-main"] /ul/li[3]

    }
}
