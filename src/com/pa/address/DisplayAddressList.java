package com.pa.address;
import java.util.ArrayList;
import com.pa.address.menu.Action;

public class DisplayAddressList implements Action {
	


	@Override
	public boolean executeAction() {
		System.out.println("======              The Address list               ======");
		
		for(Address i : AddressBookMain.manager.getMyAddressList()){
			DisplayAddressAction display = new DisplayAddressAction(i);
			display.executeAction();
			
		}
		System.out.println("====================                  =====================");
		return false;
	}


}
