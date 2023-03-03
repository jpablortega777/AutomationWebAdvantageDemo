package com.PagesObjets;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.MapsObjets.MapObjetDemoAdvantageOrderPayment;

public class PageObjetDemoAdvantageOrderPayment extends MapObjetDemoAdvantageOrderPayment{

	public PageObjetDemoAdvantageOrderPayment(WebDriver driver) {
		super(driver);
		
	}
		//METODO checkOut
		public void checkOut(File rutaCarpeta,String generarEvidencia) 
			{
				try {
				
				click(btnCheckout,rutaCarpeta,generarEvidencia);
				tiempoEspera(2000);
				
				
				}catch(Exception e) {
				System.out.println("Error="+e);
				}
			}
			  //METODO login
				public void login(File rutaCarpeta,String generarEvidencia,String user,String pass) 
					{
						try {
							tiempoEspera(2000);
							sendkey(user, campoUsername, rutaCarpeta, generarEvidencia);
							tiempoEspera(2000);
							sendkey(pass, campoPassword, rutaCarpeta, generarEvidencia);
							tiempoEspera(2000);
							click(btnLogin,rutaCarpeta,generarEvidencia);
							tiempoEspera(2000);
							click(btnNextPayMethod,rutaCarpeta,generarEvidencia);
							tiempoEspera(2000);
							click(btnPayNow,rutaCarpeta,generarEvidencia);
						
						}catch(Exception e) {
						System.out.println("Error="+e);
						}
					}
				//METODO login
				public void validarValores(File rutaCarpeta,String generarEvidencia) 
					{
						try {
							tiempoEspera(2000);
							
							String resultado1 = driver.findElement(textValor1).getText();
							tiempoEspera(2000);
							String resultado2 = driver.findElement(textValor2).getText();
							tiempoEspera(2000);
							String resultadoTotal = driver.findElement(textValorTotal).getText();
							tiempoEspera(2000);
							resultado1=resultado1.replace("$", "");
							resultado2=resultado2.replace("$", "");
							resultadoTotal=resultadoTotal.replace("$", "");
							
							double res1=Double.parseDouble(resultado1);
							double res2=Double.parseDouble(resultado2);
							double resTotal=Double.parseDouble(resultadoTotal);
							double total=res1+res2;
							System.out.println(resTotal +"="+total);
						    assertEquals(resTotal, total);
						    captureScreen(localizadorVariable(confirmacion, String.valueOf(total)),rutaCarpeta,"Validacion",generarEvidencia);

						}catch(Exception e) {
						System.out.println("Error="+e);
						}
					}
}
