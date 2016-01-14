package com.pa.address;

import java.util.Scanner;
import com.pa.address.menu.Action;
import com.pa.address.ConsoleAddressManager;
public class ReadAddressAction implements Action {

	@Override
	public boolean executeAction() {
		Scanner scanner = new Scanner(System.in) ;
		Address addr = new Address();
		
		try {
			System.out.println("Please Type the Street");			
			addr.setStreet(scanner.nextLine());     
			System.out.println("Please Type the Address");
			addr.setAddress(scanner.nextLine());
			addr.setId(AddressBookMain.manager.getMyAddressList().size());
			
			AddressBookMain.manager.getMyAddressList().add(addr);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		
		
		
	}

}
