
import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args) throws InterruptedException {
        
        //open chrome in maximize mode
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://bvtest.school.cubes.rs/login");

        //fill the email and password fields and click login button
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");

        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();

        //CATEGORIES
        WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
        categoriesLink.click();
        
        System.out.println(driver.getTitle());
        
        // clickk on  add category button
        WebElement addCategoryButton = driver.findElement(By.className("pull-right"));
        addCategoryButton.click();
        
        //fill title
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys(Helper.getRandomText());
        
        // save new category
        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();

        // go to REGIONS page
        WebElement navBar = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTags = navBar.findElements(By.tagName("li"));
        liTags.get(3).click();

        System.out.println(driver.getTitle());

        // clickk on  add region button
        WebElement addRegionButton = driver.findElement(By.className("pull-right"));
        addRegionButton.click();
        
        //fill title
        WebElement titleField1 = driver.findElement(By.id("title"));
        titleField1.sendKeys(Helper.getRandomText());
        
        // save new region
        WebElement saveRegionButton = driver.findElement(By.id("save-region-button"));
        saveRegionButton.click();
        
        // go to PORTALS page
        WebElement portalsLink = driver.findElement(By.linkText("Portals"));
        portalsLink.click();

        // print title of web page in console
        System.out.println(driver.getTitle());

        // clickk on  add PORTAL button
        WebElement addPortalButton = driver.findElement(By.className("pull-right"));
        addPortalButton.click();
        
        //fill title
        WebElement titlePortalField = driver.findElement(By.id("title"));
        titlePortalField.sendKeys(Helper.getRandomText());
        
        //fill URL
        WebElement urlField = driver.findElement(By.id("url"));
        urlField.sendKeys("http://test.rs");
        
        // save new region and url
        WebElement savePortalButton = driver.findElement(By.id("save-portal-button"));
        savePortalButton.click();
        
        
        Thread.sleep(6000);
        driver.quit();
        
        
        
        

    }

}
