package pageFactoryObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class practicePageObjects {
	public WebDriver driver=null;
	public practicePageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	WebElement enterNameBoxObj;
	@FindBy(id="alertbtn")
	WebElement alertBtnObj;
	@FindBy(id="confirmbtn")
	WebElement confirmBtnObj;
	@FindAll({@FindBy(name="radioButton")})
	List<WebElement> rBtnGrpObjs;
	@FindBy(id="autocomplete")
	WebElement autocompleteDropDownObj;
	@FindBy(id="dropdown-class-example")
	WebElement selectDropDownObj;
	@FindBy(id="mousehover")
	WebElement mouseHoverBtnObj;
		
	public WebElement getEnterNameBoxObj() {
		
		return enterNameBoxObj;
	}
	public WebElement getAlertBtnObj()
	{
		return alertBtnObj;
	}
	public WebElement getConfirmBtnObj()
	{
		return confirmBtnObj;
	}
	public List<WebElement> getRadioGrpObj()
	{
		return rBtnGrpObjs;
	}
	public WebElement getautocompleteDropDownObj()
	{
		return autocompleteDropDownObj;
	}
	public Select getSelectDropDownObj()
	{
		return new Select(selectDropDownObj);
	}
	public WebElement getMouseHoverBtnObj()
	{
		return mouseHoverBtnObj;
	}
	
}
