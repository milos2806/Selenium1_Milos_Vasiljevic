
import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebElement navBarCat = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTagsCat = navBarCat.findElements(By.tagName("li"));
        liTagsCat.get(2).click();

        System.out.println("Page title is: " + driver.getTitle());

        WebDriverWait waitCat = new WebDriverWait(driver, 7);
        WebElement addCategoryButton = waitCat.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addCategoryButton.click();

        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys(Helper.getRandomTextCat());

        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();
        
        

        // REGIONS 
        WebElement navBarReg = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTagsReg = navBarReg.findElements(By.tagName("li"));
        liTagsReg.get(3).click();

        System.out.println("Page title is: " + driver.getTitle());

        WebDriverWait waitReg = new WebDriverWait(driver, 6);
        WebElement addRegionsButton = waitReg.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addRegionsButton.click();

        WebElement titleField1 = driver.findElement(By.id("title"));
        titleField1.sendKeys(Helper.getRandomTextReg());

        WebElement saveRegionButton = driver.findElement(By.id("save-region-button"));
        saveRegionButton.click();
        
        

        //PORTALS 
        WebElement navBarPor = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTagsPor = navBarPor.findElements(By.tagName("li"));
        liTagsPor.get(4).click();

        // print title of web page in console
        System.out.println("Page title is: " + driver.getTitle());

        WebDriverWait waitPor = new WebDriverWait(driver, 5);
        WebElement addPortalButton = waitPor.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addPortalButton.click();

        WebElement titlePortalField = driver.findElement(By.id("title"));
        titlePortalField.sendKeys(Helper.getRandomTextPor());

        WebElement urlField = driver.findElement(By.id("url"));
        urlField.sendKeys("http://test.rs");

        WebElement savePortalButton = driver.findElement(By.id("save-portal-button"));
        savePortalButton.click();

        Thread.sleep(5000);
        driver.quit();
    }

}
