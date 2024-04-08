package com.Spring.AnnotationBean;

import org.springframework.beans.factory.annotation.Required;

//taeget class
public class Flifkart {
	
	private BlueDart dart;
	private String biiAmnt;
	
	@Required
	public void setDart(BlueDart dart) {
		this.dart = dart;
	}
	
	@Required
	public void setBiiAmnt(String biiAmnt) {
		this.biiAmnt = biiAmnt;
	}
	
	public void trackOrder() {
		dart.trackShippment();
	}
	
	public void AmountCalculate() {
		
		System.out.println("Your total Amount is: "+ biiAmnt);
	}
	

}
