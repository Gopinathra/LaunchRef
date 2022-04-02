package org.ample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\gopin\\eclipse-workspace\\SelfPrepr\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=17112807308007330129&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040217&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjw_4-SBhCgARIsAAlegrWtYtCzwuNIHEf48MGlGZi86EBmLP_-piN_hFjanxuQS9rxnRIYOPUaAuToEALw_wcB");
	WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchTextBox.sendKeys("iphone",Keys.ENTER);

	}
	}


