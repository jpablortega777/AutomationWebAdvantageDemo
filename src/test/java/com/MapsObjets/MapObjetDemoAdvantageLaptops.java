package com.MapsObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ClasesBase.ClaseBase;

public class MapObjetDemoAdvantageLaptops extends ClaseBase{
	
	public MapObjetDemoAdvantageLaptops(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By pcLaptops=By.xpath("//a[normalize-space()='{0}']");
	
}
