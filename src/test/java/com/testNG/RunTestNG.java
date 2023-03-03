package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import com.ClasesBase.ClaseBase;

import com.PagesObjets.PageObjetDemoAdvantageAddCar;
import com.PagesObjets.PageObjetDemoAdvantageHome;
import com.PagesObjets.PageObjetDemoAdvantageLaptops;
import com.PagesObjets.PageObjetDemoAdvantageMice;
import com.PagesObjets.PageObjetDemoAdvantageOrderPayment;
import com.utilidades.GenerarReportePdf;
import com.utilidades.MyScreenRecorder;
import com.utilidades.Utilidades;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;


import org.openqa.selenium.WebDriver;


public class RunTestNG 
{
 
	WebDriver driver;
	
	ClaseBase claseBase;
	
	PageObjetDemoAdvantageHome pagDemoHome;
	PageObjetDemoAdvantageLaptops pagDemoLaptops;
	PageObjetDemoAdvantageAddCar pagDemoAddCar;
	PageObjetDemoAdvantageMice pagDemoMice;
	PageObjetDemoAdvantageOrderPayment pagDemoOrder;
	GenerarReportePdf generarReportePdf;
	String rutaImgEncabezadoML,rutaImgEncabezadoMT,rutaImgEncabezadoTQA;
	
  @BeforeClass
  @Parameters({"rutaImgML"})
  public void beforeClass(@Optional("default") String rutaImgDA
		  				  ) throws Exception
  {
			 System.out.println(rutaImgDA);
			
			 driver= ClaseBase.chromeDriverConnection();
			 //INSTANCIA LA CLASEBASE
			 claseBase = new ClaseBase(driver);

			 //INSTANCIAR LA CLASE PageObjetDemoAdvantageHome
			 pagDemoHome= new PageObjetDemoAdvantageHome(driver);
			 //INSTANCIAR LA CLASE PageObjetDemoAdvantageLaptops
			 pagDemoLaptops= new PageObjetDemoAdvantageLaptops(driver);
			 //INSTANCIAR LA CLASE PageObjetDemoAdvantageAddCar
			 pagDemoAddCar= new PageObjetDemoAdvantageAddCar(driver);
			//INSTANCIAR LA CLASE PageObjetDemoAdvantageMice
			 pagDemoMice= new PageObjetDemoAdvantageMice(driver);
			//INSTANCIAR LA CLASE PageObjetDemoAdvantageOrderPayment
			 pagDemoOrder= new PageObjetDemoAdvantageOrderPayment(driver);
			 //INSTANCIAR CLASE REPORTES
			 generarReportePdf = new GenerarReportePdf();
			 //GRABAR EN LA VARIABLE LA RUTA
			 rutaImgEncabezadoML=rutaImgDA;
			 
  }
  
  @DataProvider(name="DemoAdvantage")
  public Object[][] datos() throws Exception
  {
	  try {
		  Object[][] arreglo=Utilidades.getTableArray("./Data/DataDemo.xlsx", "demo");
		  return arreglo;
	} catch (Exception e) {
		System.out.println(e);
	}
	return null;
	  
  }
  
 

  @Test(dataProvider = "DemoAdvantage",priority=1)
  public void DemoAdvantageTestNG(String laptops,String url,String generarReporte,String run,String responsable,String mouse,String user,String pass) throws Exception 
  {
	  	if(run.equals("On")) {
	  		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			//CREAR CARPETA PARA ALMACENAMIENTO DE IMAGENES
			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			if(generarReporte.equals("Si")) {
				    //GUARDA LA RUTA DE LA IMAGEN PARA EL ENCABEZADO DEL PDF
				    generarReportePdf.setRutaImagen(rutaImgEncabezadoML);
				    //URL ACCESO ALA PAGINA
				    pagDemoHome.urlAcceso(url);
					//INICIO DE LA GRABACION DEL VIDEO
					MyScreenRecorder.startRecording(nomTest, rutaCarpeta);
					//INICIA CREACION DE REPORTE PDF
					generarReportePdf.crearPlantilla(nomTest, rutaCarpeta,responsable);
					//CREAR UNA CUENTA
					pagDemoHome.optLaptops(rutaCarpeta, generarReporte);
					pagDemoLaptops.laptops(laptops, rutaCarpeta, generarReporte);
					pagDemoAddCar.addCarrito(rutaCarpeta, generarReporte);
					pagDemoHome.irHome(rutaCarpeta, generarReporte);
					pagDemoHome.mice(rutaCarpeta, generarReporte);
					pagDemoMice.mice(mouse, rutaCarpeta, generarReporte);
					pagDemoAddCar.addCarrito(rutaCarpeta, generarReporte);
					pagDemoOrder.checkOut(rutaCarpeta, generarReporte);
					pagDemoOrder.validarValores(rutaCarpeta,generarReporte );
					pagDemoOrder.login(rutaCarpeta, generarReporte, user, pass);
					
					//CREAR UNA CUENTA
					
					//FINALIZA GRABACION DE VIDEO
					MyScreenRecorder.stopRecording();
					//INICIA CREACION DE REPORTE PDF
					generarReportePdf.cerrarPalntilla();
			}else {
				//URL ACCESO A LA PAGINA
				pagDemoHome.urlAcceso(url);
			  	
			}
	  	}else {
	  		//URL ACCESO ALA PAGINA
		  	//pagHomeML.urlAcceso(url);
	  		System.out.println("No a Seleccionado esta automatizacion");
	  	}
  }
  
 
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
