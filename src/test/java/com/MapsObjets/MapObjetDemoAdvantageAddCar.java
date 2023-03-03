package com.MapsObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ClasesBase.ClaseBase;

public class MapObjetDemoAdvantageAddCar extends ClaseBase{
	
	public MapObjetDemoAdvantageAddCar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//ELEMENTOS MAPEDOS DE WIDGETS
	protected By btnAddCar=By.xpath("//button[normalize-space()='ADD TO CART']");
	}
