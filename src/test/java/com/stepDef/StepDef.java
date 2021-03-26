package com.stepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.BookingPage;
import com.pages.Login;
import com.pages.SearchHotel;
import com.reusable.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef extends Utility {
  Login l;
  
 SearchHotel s;
 BookingPage b;
  
 @Given("User is on login Page")
 public void user_is_on_login_Page() {
	 getDriver();
	 loadUrl("http://adactinhotelapp.com/SelectHotel.php");
	 maxWindow();
	 implicitwait();
 }    

 @When("User should enter {string} and {string}")
 public void user_should_enter_and(String string, String string2) {
	 l = new Login();
	 l.in(string, string2);
 }

 @When("User should enter the search hotel fields {string},{string},{string}, {string},{string},{string},{string},{string}")
 public void user_should_enter_the_search_hotel_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
s=  new SearchHotel();
   s.searchfields(string, string2, string3, string4, string5, string6, string7, string8);
 }

 @Then("User should verify the select hotel page")
 public void user_should_verify_the_select_hotel_page() {
	  s=new SearchHotel();
	 s.selectverify();
 }

 @When("User should enter the search hotel fields {string}, {string},{string},{string},{string}")
 public void user_should_enter_the_search_hotel_fields(String string, String string2, String string3, String string4, String string5) {
   s=new SearchHotel();
	 s.mandatoryfields(string, string2, string3, string4, string5);
   
 }


	 @When("User should enter the search hotel fields  {string},{string}")
	 public void user_should_enter_the_search_hotel_fields(String string, String string2) {
	 s= new SearchHotel();	 
	s.checkDate(string, string2);
 }

 @Then("User should verify the error messages")
 public void user_should_verify_the_error_messages() {
	  s=new SearchHotel();
    s.checkinErrmsg();
    s.checkoutErrmsg();
 }

 @When("should verify the error message")
 public void should_verify_the_error_message() {
	  s=new SearchHotel();
	 s.WithoutValues();
 }
  
 @When("User should enter all fields in search page {string},{string},{string},{string},{string},{string},{string},{string} and click hotel and click Continue")
 public void user_should_enter_all_fields_in_search_page_and_click_hotel_and_click_Continue(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
   b = new BookingPage();
  b.searchfields(string, string2, string3, string4, string5, string6, string7, string8);
 }

 @When("User should fill all mandatory fields on page {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}")
 public void user_should_fill_all_mandatory_fields_on_page(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	 b = new BookingPage();
	 b.Filldetails(string, string2, string3, string4, string5, string6, string7, string8);
 }

 @When("User should click Booknow button")
 public void user_should_click_Booknow_button() {
	 b = new BookingPage();
   b.booknowbtn();
 }

 @Then("User Should verify the Booking")
 public void user_Should_verify_the_Booking() {
	 b = new BookingPage();
	 b.verify();
 }

 @Then("User should verify the error message")
 public void user_should_verify_the_error_message() {
	 b= new BookingPage();
	 b.booknowbtn();
	 b.verificatioWithoutvalues();
 }

 @Then("User Should verify the Cancel Booking")
 public void user_Should_verify_the_Cancel_Booking() {
    
	 b= new BookingPage();
	b.cancelBooking();
 }

 @When("User should Booked Itinerary and select the orderno")
 public void user_should_Booked_Itinerary_and_select_the_orderno() {
    b= new BookingPage();
    b.cancelWithExisting();
 }

 @Then("User should click and verify the cancel")
 public void user_should_click_and_verify_the_cancel() {
    
 }


 




 
 
 
 
 
 
 
 
 
 
 
}