package com.PagesObjets;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.MapsObjets.MapObjetDemoAdvantageAddCar;

public class PageObjetDemoAdvantageAddCar extends MapObjetDemoAdvantageAddCar{
 
	public PageObjetDemoAdvantageAddCar(WebDriver driver) {
		super(driver);
		
	}
	
	//METODO DETERMINAR HORA
	
		public void addCarrito(File rutaCarpeta,String generarEvidencia) 
		{
			try {
			
			click(btnAddCar,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			
			}catch(Exception e) {
			System.out.println("Error="+e);
			}
		}
}
