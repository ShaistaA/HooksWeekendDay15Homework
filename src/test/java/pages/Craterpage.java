package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.Driver;

public class Craterpage {

		
	public Craterpage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (name="email")
	public WebElement emailField;
	
	@FindBy (name="password")
	public WebElement passwordField;
	
	@FindBy (xpath="//button[text()='Login']")
	public WebElement loginBtn;
	
	@FindBy (xpath="//a[@href='/admin/items']")
	public WebElement itemsTab;
	
	@FindBy (xpath="//button[text()=' Add Item']")
	public WebElement addItemBtn;
	
	@FindBy (xpath="//h3[text()='New Item']")
	public WebElement onItemPage;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	public WebElement name;
	
	@FindBy (id = "0")
	public WebElement price;
	
	@FindBy (xpath="//div[@tabindex='-1']")
	public WebElement unit;
	
	@FindBy (xpath="//span[text()='box']")
	public WebElement unitBox;
	
	@FindBy (xpath="//textarea[@name='description']")
	public WebElement description;
	
	@FindBy (xpath="//button[text()=' Save Item']")
	public WebElement saveBtn;
	
	@FindBy (xpath="//a[text()='Name']")
	public WebElement nameitemselected;
	
	@FindBy (xpath="//h3[text()='Edit Item']")
	public WebElement editItemPage;
	
	@FindBy (xpath="//button[text()=' Update Item']")
	public WebElement updateItemBtn;
			
}
