package com.PagesObjets;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.MapsObjets.MapObjetDemoAdvantageMice;

public class PageObjetDemoAdvantageMice extends MapObjetDemoAdvantageMice{

	public PageObjetDemoAdvantageMice(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//METODO INICIAL
		public void urlAcceso(String url)
		{
			driver.get(url);
			
		}
		
		//METODO PRIMERA ETAPA DE ABRIR EL NAVEGADOR 
		public void mice(String Producto,File rutaCarpeta, String generarReporte) 
		{
			try {
				
			
			tiempoEspera(2000);
			moverScroll(100, 1);
			click(localizadorVariable(proMouses, Producto), rutaCarpeta, generarReporte);
			tiempoEspera(2000);
			} catch(Exception e) 
			{
				imprimirMensaje(e);
			}
		}
		

}
