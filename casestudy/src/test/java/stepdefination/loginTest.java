package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {
	public static WebDriver driver;
        @Given("^user open TestMeApp$")
        public void useropenTestMeApp() {
        	System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    		driver.get("http://10.232.237.143:443/TestMeApp");
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        @When("^user click signup$")
        public void userclicksignup() {
        	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
        }
        @And("^enter username as \"([^\"]*)\"$")
        public void enterusername(String uname) {
        	driver.findElement(By.name("userName")).sendKeys(uname);
        	
        }
        @And("^enter firstname as \"([^\"]*)\"$")
        public void enterfirstname(String fname){
        	driver.findElement(By.name("firstName")).sendKeys(fname);
        }
        @And("^enter lastname as \"([^\"]*)\"$")
        public void enterlastname(String lname) {
        	driver.findElement(By.name("lastName")).sendKeys(lname);
        }
        @And("^enter password as \"([^\"]*)\"$" )
        public void enterpassword(String pwd) {
        	driver.findElement(By.name("password")).sendKeys(pwd);
        }
        @And("^enter confirm password as \"([^\"]*)\"$")
        public void enterconfirmpassword(String cpwd) {
        	driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
        }
        @And("^user select gender as \"([^\"]*)\"$")
        public void userselectgenderas(String gender) {
        	if(gender.equalsIgnoreCase("male")) {
        		driver.findElement(By.xpath("//input[@value='Male']")).click();
        	}
        	else if(gender.equalsIgnoreCase("female")) {
        		driver.findElement(By.xpath("//input[@value='Female']")).click();
        	}
        }
        @And("^enter email as \"([^\"]*)\"$")
        public void  enteremailas(String email) {
        	driver.findElement(By.name("emailAddress")).sendKeys(email);
        }
        @And("^enter mobile number as \"([^\"]*)\"$")
        public void entermobilenumberas(String mob) {
        	driver.findElement(By.name("mobileNumber")).sendKeys(mob);
        }
        @And("^enter dob as \"([^\"]*)\"$")
        public void enterdobas(String dob) {
        	driver.findElement(By.name("dob")).sendKeys(dob);
        }
        @And("^address as \"([^\"]*)\"$")
        public void addressas(String add) {
        	driver.findElement(By.name("address")).sendKeys(add);
        }
        @And("^select security question \"([^\"]*)\"$")
        public void security(String s) {
        	driver.findElement(By.name("securityQuestion")).click();
        }
        @And("^enter answer \"([^\"]*)\"$")
        public void answer(String ans) {
        	driver.findElement(By.name("answer")).sendKeys(ans);
        }
        @Then("^click Register$")
        public void  clickRegister() {
        	driver.findElement(By.name("Submit")).click();
        }
        
        
        @When("^user click signin$")
        public void signin() {
        	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
        }
        @When("^user enter credentials as$")
        public void credentials(DataTable dt) {
        	List<String> cred=dt.asList(String.class);
        	driver.findElement(By.name("userName")).sendKeys(cred.get(0));
        	driver.findElement(By.name("password")).sendKeys(cred.get(1));
        	driver.findElement(By.name("Login")).click();
        	
        }
        
       
        @And("^enters item as$")
        public void find(DataTable dt1) {
        	List<String> cred1=dt1.asList(String.class);
        	for(String st:cred1)
        	driver.findElement(By.name("products")).sendKeys(st);
        	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
        }
        @Then("^click add to cart$")
        public void add() {
        	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
        }
        
        
        
}
