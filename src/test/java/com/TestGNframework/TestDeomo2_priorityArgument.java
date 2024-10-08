package com.TestGNframework;

import org.testng.annotations.Test;

public class TestDeomo2_priorityArgument {
  @Test
  public void openBrowser() 
  {
	  System.out.println("Open the browser application");
  }
  @Test
  public void testLogin() 
  {
	  System.out.print("Test the Login funcationaliy");
  }
  @Test
  public void testaddtocart() 
  {
	  System.out.print("Test the cart functionality");
  }
  public void Logout()
  {
	  System.out.print("Test Logout Functionality");
  }
}
