package com.MapsObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ClasesBase.ClaseBase;

public class MapObjetDemoAdvantageOrderPayment extends ClaseBase{

	public MapObjetDemoAdvantageOrderPayment(WebDriver driver) {
		super(driver);
		
	}
	//ELEMENTOS MAPEDOS DE WIDGETS
		protected By btnCheckout=By.xpath("//li[@data-ng-mouseenter='enterCart()']//ul//li//tfoot");
		protected By campoUsername=By.xpath("//input[@name='usernameInOrderPayment']");
		protected By campoPassword=By.xpath("//input[@name='passwordInOrderPayment']");
		protected By btnLogin=By.xpath("//button[@id='login_btnundefined']");
		protected By btnNextPayMethod=By.xpath("//button[@id='next_btn']");
		protected By btnPayNow=By.xpath("//button[@id='pay_now_btn_SAFEPAY']");
		protected By textValor1=By.xpath("(//p[@class='price roboto-regular ng-binding'])[3]");
		protected By textValor2=By.xpath("(//p[@class='price roboto-regular ng-binding'])[4]");
		protected By textValorTotal=By.xpath("//span[@class='roboto-medium totalValue ng-binding']");
		
		protected By confirmacion=By.xpath("Se valida la suma de los productos='{0}'");
		
}
