package com.pages;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Utility;
import junit.*;
public class SearchHotel extends Utility {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id="location")
	private WebElement dDnlocation;

	@FindBy(id="hotels")
	private WebElement dDnhotels;

	@FindBy(id="room_type")
	private WebElement dDnroom_type;

	@FindBy(id="room_nos")
	private WebElement dDnroom_nos;

	@FindBy(id="datepick_in")
	private WebElement datepick;

	@FindBy(id="datepick_out")
	private WebElement dateout;

	@FindBy(id="adult_room")
	private WebElement dDnAdultNo;

	@FindBy(id="child_room")
	private WebElement dDnChildNo;
 
	@FindBy(id="Submit")
	private WebElement serchBtn;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement txtselect;
	
	public WebElement getTxtselect() {
		return txtselect;
	}


	


	public WebElement getdDnlocation() {
		return dDnlocation;
	}


	public WebElement getdDnhotels() {
		return dDnhotels;
	}


	public WebElement getdDnroom_type() {
		return dDnroom_type;
	}


	public WebElement getdDnroom_nos() {
		return dDnroom_nos;
	}


	public WebElement getDatepick() {
		return datepick;
	}


	public WebElement getDateout() {
		return dateout;
	}


	public WebElement getdDnAdultNo() {
		return dDnAdultNo;
	}


	public WebElement getdDnChildNo() {
		return dDnChildNo;
	}


	public WebElement getSerchBtn() {
		return serchBtn;
	}


	
	
		
		public void searchfields(String location,String hotel,String roomType,String roomno,String datePick,String dateOut,String adult,String child )
		{
			selectVisible(getdDnlocation(), location);
		selectVisible(getdDnhotels(), hotel);
		selectVisible(getdDnroom_type(), roomType);
		selectValue(getdDnroom_nos(),roomno );
		typeInput(datepick, datePick);
		typeInput(dateout, dateOut);
		selectValue(getdDnAdultNo(), adult);
		selectValue(getdDnChildNo(), child);
	    btnClick(getSerchBtn());
	    
	   
}
	public void selectverify() {
			
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals("Verified", "http://adactinhotelapp.com/SelectHotel.php", currentUrl);
		}
	
	
	public void mandatoryfields(String location,String roomno,String datePick,String dateOut,String adult) {
		selectVisible(getdDnlocation(),location);
		selectVisible(getdDnroom_nos(),roomno );
		typeInput(datepick, datePick);
		typeInput(dateout, dateOut);
		selectVisible(getdDnAdultNo(),adult);
		btnClick(getSerchBtn());
	}
	
	public void checkDate(String datePick,String dateOut) {
		
		
		getDatepick().clear();
		typeInput(datepick, datePick);
		getDateout().clear();
		typeInput(dateout, dateOut);
		
		//selectVisible(getdDnlocation(), location);
		btnClick(getSerchBtn());
		
	}
	
	public void checkinErrmsg() {
		WebElement errCheckin = driver.findElement(By.id("checkin_span"));
		String k = errCheckin.getText();
		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", k);
	}
	
	public void checkoutErrmsg() {
		WebElement errCheckOut = driver.findElement(By.id("checkout_span"));
		String q = errCheckOut.getText();
		Assert.assertEquals("Check-Out Date shall be after than Check-In Date", q);
	}
	
	public void WithoutValues() {
		
		btnClick(getSerchBtn());
	  WebElement txterr = driver.findElement(By.id("location_span"));
	    String withoutvalues = txterr.getText();
	   Assert.assertEquals("Please Select a Location",withoutvalues );
}

}









