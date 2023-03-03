package com.PagesObjets;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.MapsObjets.MapObjetDemoAdvantageLaptops;

public class PageObjetDemoAdvantageLaptops extends MapObjetDemoAdvantageLaptops{
  
	public PageObjetDemoAdvantageLaptops(WebDriver driver) {
		super(driver);
		
	}

	//METODO  hpChromebook14G1ES
	public void laptops(String pc,File rutaCarpeta,String generarEvidencias)throws  Exception
	{
		try
		{
		
		//INVOCAMOS METODO CLICK
			tiempoEspera(2000);
			moverScroll(100, 1);
		click(localizadorVariable(pcLaptops, pc),rutaCarpeta,generarEvidencias);
		tiempoEspera(2000);
		
		
		}catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		
		
	}
	//METODO 
	public void hpEnvy17tTouch(String pc,File rutaCarpeta,String generarEvidencias)throws  Exception
	{
		try
		{
		
		//INVOCAMOS METODO CLICK
		click(localizadorVariable(pcLaptops, pc),rutaCarpeta,generarEvidencias);
		tiempoEspera(2000);
		
		
		}catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		
		
	}
}
