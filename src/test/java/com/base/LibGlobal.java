package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	
	 public static final String AUTOMATE_USERNAME = "rahulsigamani1";
	  public static final String AUTOMATE_ACCESS_KEY = "z8npZsPGwyqMBMacVMVr";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 
	public static WebDriver getDriverCloud() throws MalformedURLException {
		if(driver==null) {
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "85.0");
		    caps.setCapability("os", "Windows");  
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		}
		return driver;
		
	}
	
	public  WebDriver getChromeDriver() {
		if(driver == null) {
	        System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\rahul\\eclipse-workspace\\Cucumber1\\Driver\\chromedriver.exe");
	           driver=new ChromeDriver();
	           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	          return driver;
	}
	public WebDriver getFirefoxDriver() {	
        System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\rahul\\eclipse-workspace\\DataDriven\\Driver\\geckodriver.exe");
           driver=new FirefoxDriver();
          return driver;
}
	public WebDriver getIeDriver() {	
        System.setProperty("webdriver.ie.driver",
		"C:\\Users\\rahul\\eclipse-workspace\\DataDriven\\Driver\\IEDriverServer.exe");
           driver=new InternetExplorerDriver();
          return driver;
}
	public WebDriver getEdgeDriver() {	
        System.setProperty("webdriver.edge.driver",
		"C:\\Users\\rahul\\eclipse-workspace\\DataDriven\\Driver\\msedgedriver.exe");
           driver=new EdgeDriver();
          return driver;
}
	public String getData(int rowNo,int cellNo) throws IOException {
		String name = null;
		File loc=new File("C:\\Users\\rahul\\eclipse-workspace\\DataDriven\\ExcelSheet\\Task.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
	    int type=c.getCellType();
	    if(type==1) {
		         name=c.getStringCellValue();
	    }
	    else if(type==0){
	         boolean cellF =DateUtil.isCellDateFormatted(c);
	    	if(cellF==true) {
	    	Date date = c.getDateCellValue();
	    	SimpleDateFormat fr=new SimpleDateFormat("dd-MMM-yy");
	    	name=fr.format(date);
	    	 }
	    else {
	    	double d = c.getNumericCellValue();
	    	long l=(long)d;
	    	name=String.valueOf(l);
	    }
	}
	return name;
	   
	}
	public void print(int rowNo,int cellNo,String str) throws IOException {
		File loc=new File("C:\\Users\\rahul\\eclipse-workspace\\DataDriven\\ExcelSheet\\Task.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		XSSFWorkbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.createRow(rowNo);
		Cell c=r.createCell(cellNo);
		c.setCellValue(str);
		FileOutputStream out=new FileOutputStream(loc);
		w.write(out);
	}

	public void loadUrl(String url) {
		driver.get(url);
	    driver.manage().window().maximize();
	}
	public boolean isElementHidden(WebElement element) {
		boolean b = element.isDisplayed();
		return b;

	}
	public boolean isEditable(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}
	public void type(WebElement element,String data) {
		if(isElementHidden(element) && isEditable(element)){
		element.sendKeys(data);
	}
	}
	public void btnClick(WebElement element) {
		if(isElementHidden(element) && isEditable(element)){
		element.click();
	}
	}
	public String getTxt(WebElement element) {
		String text=element.getText();
	return text;
	}
	public String getAttribute(WebElement element,String data) {
		String attribute = element.getAttribute(data);
		return attribute;
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void moveToElement(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void dragandDrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	public void rightClick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void doubleClick(WebElement element) {
		Actions a=new Actions(driver);
	    a.doubleClick(element).perform();
	}
	public void robotcut() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	public void simple(WebElement element) {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public void confirm(WebElement elemnet) {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public void prompt(WebElement element,String data) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(data);
	}
	public void typeJs(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arugment[0].setAttribute('value','"+data+"')",element);
	}
	public void btnclickJs(WebElement element) {
		if(isElementHidden(element) && isEditable(element)){
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arugment[0].click()", element);
	}
	}
	public void scrollUp(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arugment[0].ScrollIntoView(false)", element);
	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arugment[0].ScrollIntoView(true)", element);
	}
	public void getAttributejs(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return arugment[0].getAttribute('value')",element);
	}
	public File screenShotDec(String data) {
		File dec=new File(data);
		return dec;
	}
	public void copyFile(File src,File dec)throws IOException {
		FileUtils.copyFile(src,dec);
	}
	public File screenShotSrc() {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		return src;
	}
	public void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void frameId(String data) {
		driver.switchTo().frame(data);
	}
	public void frameString(String data) {
	driver.switchTo().frame(data);
	}
	public void frameIndex(int num) {
		driver.switchTo().frame(num);
	}
	public void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public List<WebElement> findelementsID(String data) {
		List<WebElement> elementsId = driver.findElements(By.id(data));
		return elementsId;
	}
	public List<WebElement> findelementsName(String data) {
		List<WebElement> elementsName = driver.findElements(By.name(data));
		return elementsName;
	}
	public List<WebElement> findelementsClassName(String data) {
		List<WebElement> elementsClass = driver.findElements(By.className(data));
		return elementsClass;
	}
	public List<WebElement> findelementsXpath(String data) {
		List<WebElement> elementsXpath = driver.findElements(By.xpath(data));
		return elementsXpath;
	}
	public WebElement findelementtagName(String data) {
		WebElement tagnameElement = driver.findElement(By.tagName(data));
		return tagnameElement;
	}
	public WebElement findelementXpath(String data) {
		WebElement xpathElement = driver.findElement(By.xpath(data));
		return xpathElement;
	}
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void dismissAlert() {
	Alert a = driver.switchTo().alert();	
	a.dismiss();
	}
	public void getTextAlert() {
	Alert a = driver.switchTo().alert();	
	a.getText();
	}
	public void sendkeysAlert(String Data) {
		Alert a = driver.switchTo().alert();	
		a.sendKeys(Data);
	}
	public void closeBrowser() {
		driver.close();
	}
	public void selectByvalue(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByValue(data);
	}
	
	public void selectByVisibleText(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByVisibleText(data);
	}
	public void selectByIndex(WebElement element,int num) {
		Select s=new Select(element);
		s.selectByIndex(num);
	}
	public void getOptions(WebElement element) {
		Select s=new Select(element);
		s.getOptions();
	}
	public void getAllSelectedOptions(WebElement element) {
		Select s=new Select(element);
		s.getAllSelectedOptions();
	}
	public void getFirstSelectedOption(WebElement element) {
		Select s=new Select(element);
		s.getFirstSelectedOption();
	}
	public void isMultple(WebElement element) {
		Select s=new Select(element);
	    s.isMultiple();
	}
	public void deSelecteByIndex(WebElement element,int num) {
		Select s=new Select(element);
		s.deselectByIndex(num);
	}
	public void deSelecteByValue(WebElement element,String data) {
		Select s=new Select(element);
		s.deselectByValue(data);
	}
	public void deSelectByText(WebElement element,String data) {
		Select s=new Select(element);
		s.deselectByVisibleText(data);
	}
	public void deSelectAll(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	public String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public void windowUrl(String data) {
		driver.switchTo().window(data);
	}
	public void windowTitle(String title) {
		driver.switchTo().window(title);
	}



}
