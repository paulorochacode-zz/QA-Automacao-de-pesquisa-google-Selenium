package RoboquePesquisaSelenium;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RoboQuePesquisaSelenium {
	public static void main(String[] args) {
	//Criando interação com usuario:
	Scanner myObj = new Scanner(System.in);
	System.out.println("Olá, para evitar erros verifique a versão do seu Firefox/Webdriver(geckodriver)");
	System.out.println("Oque deseja pequisar?");
	String usersearch = myObj.nextLine();
	//Setando WebDriver
	System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//Abrindo navegador
	driver.get("https://www.google.com/");
	//Pesquisando
	driver.findElement(By.name("q")).sendKeys(usersearch + Keys.ENTER); //name locator for text box
	
	}
}
//Comandos extras não usados:

//WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
//searchbutton.click();
//driver.quit();
//driver.manage().window().maximize();
//driver.manage().deleteAllCookies();
//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

