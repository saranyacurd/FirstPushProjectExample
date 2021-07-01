package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskBase {
	static  WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\TaskProject\\driver1\\chromedriver.exe" );
		driver=new ChromeDriver();


	}
	public static void launchUrl(String url) {
		//WebDriver driver=new ChromeDriver();                       
		driver.get(url);

	}
	public static void maximizeWindow() {
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static String getUrl() {
		//WebDriver driver=new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();

	}

	public static String getData(int i,int j) throws IOException {
		File f=new File("C:\\Users\\91950\\eclipse-workspace\\TaskProject\\ExcelData\\TestData2.xlsx");
		FileInputStream fs= new FileInputStream(f);
		Workbook ws =new XSSFWorkbook(fs);
		Sheet s = ws.getSheet("Data");
		Cell cell = s.getRow(i).getCell(j);
		int Type=cell.getCellType();
		if(Type==1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		}else if(Type==0) {
			if(DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
				String format = sim.format(dateCellValue);
				return format;
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				//System.out.println(numericCellValue);
				long l=(long)numericCellValue;
				String valueOf = String.valueOf(l);
				return valueOf;
			}
		}
		return null;


	}
	public static void insertType(WebElement ele, String s) {
		ele.sendKeys(s);
	}
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	public static void selectbyIndex(WebElement ele, int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);

	}
	public static void selectbyValue(WebElement ele, String index) {
		Select s=new Select(ele);
		s.selectByValue(index);

	}
	public static String getValues(WebElement ele,String value) {
		return ele.getAttribute(value);

	}
	public static void ExcelWrite(String s) throws IOException {
		File f=new File("C:\\Users\\91950\\eclipse-workspace\\TaskProject\\ExcelData\\TestData.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sheet = w.createSheet("Data");
		Row r = sheet.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue(s);
		FileOutputStream fs=new FileOutputStream(f);
		w.write(fs);
	}

}
