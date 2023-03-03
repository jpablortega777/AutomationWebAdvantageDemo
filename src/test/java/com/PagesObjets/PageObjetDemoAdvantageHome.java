package com.PagesObjets;

import java.io.File;

import org.openqa.selenium.WebDriver;


import com.MapsObjets.MapObjetDemoAdvantageHome;

public class PageObjetDemoAdvantageHome extends MapObjetDemoAdvantageHome{
 
	//CONSTRUCTOR
		public PageObjetDemoAdvantageHome(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		//METODO CARGA DE URL
		public void urlAcceso(String url)
		{
					driver.get(url);
		}
		//METODO ACESSO laptops 
		public void optLaptops(File rutaCarpeta,String generarEvidencia) throws  Exception
		{
			try {
				
			tiempoEspera(2000);
			moverScroll(100, 1);
			tiempoEspera(2000);
			click(optLaptops, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		//METODO ACESSO headphones
			public void headphones(File rutaCarpeta,String generarEvidencia) throws  Exception
			{
				try {
					
				click(optHeadphones, rutaCarpeta,generarEvidencia);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			//METODO ACESSO mice 
			public void mice(File rutaCarpeta,String generarEvidencia) throws  Exception
			{
				try {
					tiempoEspera(2000);	
					moverScroll(100, 1);
				click(optMice, rutaCarpeta,generarEvidencia);
				tiempoEspera(2000);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			//METODO ACESSO tablets 
			public void tablets(File rutaCarpeta,String generarEvidencia) throws  Exception
			{
				try {
					
				click(optTablets, rutaCarpeta,generarEvidencia);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			//METODO ACESSO tablets 
			public void irHome(File rutaCarpeta,String generarEvidencia) throws  Exception
			{
				try {
					
				click(linkHome, rutaCarpeta,generarEvidencia);
				tiempoEspera(2000);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
}
