package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusable.Utility;

import junit.framework.Assert;

public class BookingPage extends Utility {
 
	public BookingPage() {
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

	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id = "first_name")
	private WebElement txtfstName;
	
	@FindBy(id = "last_name")
	private WebElement txtlstName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement CardNumber;

	@FindBy(id = "cc_type")
	private WebElement CardType;

	@FindBy(id = "cc_exp_month")
	private WebElement ExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement btnBooknow;
	
	@FindBy(id="first_name_span")
	private WebElement fsterr;
	
	@FindBy(id="last_name_span")
	private WebElement lsterr;
	
	@FindBy(id="address_span")
	private WebElement addresserr;
	
	@FindBy(id="cc_num_span")
	private WebElement cardno;
	
	@FindBy(id="cc_type_span")
	private WebElement cctypeerr;
	
	@FindBy(id="cc_expiry_span")
	private WebElement experr;
	
	@FindBy(id="cc_cvv_span")
	private WebElement cvverr;
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderno;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookItn;
	
	@FindBy(id="order_id_text")
	private WebElement searchBox;
	
	@FindBy(id="search_hotel_id")
	private WebElement btngo;
	
	@FindBy(xpath="(//table//tr[2]//td[3])[3]")
	private WebElement cancelBtn;
	
	@FindBy(id="search_result_error")
	private WebElement txterrorcancel;
	
	

	public WebElement getTxterrorcancel() {
		return txterrorcancel;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getBtnBookItn() {
		return btnBookItn;
	}

	public WebElement getOrderno() {
		return orderno;
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

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getTxtfstName() {
		return txtfstName;
	}

	public WebElement getTxtlstName() {
		return txtlstName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnBooknow() {
		return btnBooknow;
	}

	public WebElement getFsterr() {
		return fsterr;
	}

	public WebElement getLsterr() {
		return lsterr;
	}

	public WebElement getAddresserr() {
		return addresserr;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCctypeerr() {
		return cctypeerr;
	}

	public WebElement getExperr() {
		return experr;
	}

	public WebElement getCvverr() {
		return cvverr;
	}


		
		public void searchfields(String location,String hotel,String roomType,String roomno,String datePick,String dateOut,String adult,String child) 
				
		{
		
		selectVisible(getdDnlocation(), location);
		selectVisible(getdDnhotels(), hotel);
		selectVisible(getdDnroom_type(), roomType);
		selectVisible(getdDnroom_nos(),roomno );
		typeInput(datepick, datePick);
		typeInput(dateout, dateOut);
		selectVisible(getdDnAdultNo(), adult);
		selectVisible(getdDnChildNo(), child);
	    btnClick(getSerchBtn());
    
			btnClick(radioBtn);
			btnClick(continuebtn);
		}
		
		
			public void Filldetails(String Fstname,String lstname,String Address, String cardnum,  String cardtype, String expmnth, String expyr,String cvv )  {
			typeInput(getTxtfstName(), Fstname);
			typeInput(getTxtlstName(), lstname);
			typeInput(getTxtAddress(), Address);
			typeInput(getCardNumber(),cardnum );
			selectVisible(getCardType(), cardtype);
			selectValue(getExpMonth(), expmnth);
		//	selectVisible(getExpMonth(),expmnth);
			selectVisible(getExpYear(), expyr);
			typeInput(getCvv(),cvv );
			
			}
			
			public void booknowbtn() {
			btnClick(getBtnBooknow());
			webDriverWait(50);
		}
			public String verify() {
				String attr = getAttr(getOrderno());
				return attr;
				
				
			}
			
			
		public void cancelBooking() {
			String attr = getAttr(getOrderno());
			btnClick(getBtnBookItn());
			typeInput(getSearchBox(),attr);
			btnClick(getBtngo());
			btnClick(getCancelBtn());
			alert();
			String fetchText = fetchText(getTxterrorcancel());
			
			Assert.assertEquals("The booking has been cancelled.",fetchText );
			}
			
			public void cancelWithExisting() {
				btnClick(getBtnBookItn());
				
				btnClick(getCancelBtn());
				alert();
				String fetchText = fetchText(getTxterrorcancel());
				
				Assert.assertEquals("The booking has been cancelled.",fetchText );
				}
			
			
			
			
		
	     public void verificatioWithoutvalues(){
		
		WebElement fstnamerr2 = getFsterr();	
		String fstnameerr = fstnamerr2.getText();
		Assert.assertEquals("Please Enter your First Name",fstnameerr );
		
		WebElement lsterr2 = getLsterr();
		String lsterr = lsterr2.getText();
		Assert.assertEquals("Please Enter you Last Name", lsterr);

		WebElement addresserr2 = getAddresserr();
		String addresserr = addresserr2.getText();
		Assert.assertEquals("Please Enter your Address", addresserr);
		
		WebElement cardnoerr1 = getCardno();
		String cardnoerr  = cardnoerr1.getText();
		Assert.assertEquals("Please Enter your 16 Digit Credit Card Number", cardnoerr);
		
		WebElement cctypeerr2 = getCctypeerr();
		String cctypeerr = cctypeerr2.getText();
		Assert.assertEquals("Please Select your Credit Card Type", cctypeerr);
		
		WebElement experr2 = getExperr();
		String experr = experr2.getText();
		Assert.assertEquals("Please Select your Credit Card Expiry Month", experr);
		
		WebElement cvverr2 = getCvverr();
		String cvverr = cvverr2.getText();
		Assert.assertEquals("Please Enter your Credit Card CVV Number", cvverr);
		}
	
	
	
	
}
