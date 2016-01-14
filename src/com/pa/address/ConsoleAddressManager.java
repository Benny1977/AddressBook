package com.pa.address;



import java.util.ArrayList;

import com.pa.address.menu.AddressBookMenu;
public class ConsoleAddressManager {
	private  ArrayList<Address> myAddressList = new ArrayList<Address>();
	
	public void run(){
		AddressBookMenu menu = new AddressBookMenu() ;
		while (true) {
			menu.startMenu();
		}
	}
	
	public  ArrayList<Address> getMyAddressList() {
		return myAddressList;
	}
	public  void setMyAddressList(ArrayList<Address> myAddressList) {
		this.myAddressList = myAddressList;
	}

	
}
