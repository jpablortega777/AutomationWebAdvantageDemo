package com.MapsObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ClasesBase.ClaseBase;

public class MapObjetDemoAdvantageMice extends ClaseBase{
	//CONSTRUCTOR DE LA CLASE
		public MapObjetDemoAdvantageMice(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		//ELEMENTOS PAGINA PRINCIPAL
		protected By proMouses=By.xpath("//a[normalize-space()='{0}']");
		}
