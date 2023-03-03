package com.MapsObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.ClasesBase.ClaseBase;

public class MapObjetDemoAdvantageHome extends ClaseBase
{

	public MapObjetDemoAdvantageHome(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//ELEMENTO MAPEADOS DE LA WEB AdvantageDemo
	protected By optLaptops=By.xpath("//div[@id='laptopsImg']");
	protected By optHeadphones=By.xpath("//div[@id='headphonesImg']");
	protected By optMice=By.xpath("//div[@id='miceImg']");
	protected By optTablets=By.xpath("//div[@id='miceImg']");
	protected By linkHome=By.xpath("//a[normalize-space()='HOME']");
}
