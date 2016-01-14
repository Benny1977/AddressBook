package com.pa.address;

import java.io.*;
import java.util.ArrayList;

import com.pa.address.menu.Action;
import com.pa.address.ConsoleAddressManager;
public class LoadAddressBook  implements Action {

	public LoadAddressBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean executeAction() {
		try   {
			      InputStream file = new FileInputStream("c:\\runFiles\\addressList.ser");
			      InputStream buffer = new BufferedInputStream(file);
			      ObjectInput input = new ObjectInputStream (buffer);
			      ArrayList<Address> list =  (ArrayList<Address>)input.readObject();
			      AddressBookMain.manager.setMyAddressList(list);
			      //
			   
			      
			    }
			    catch(Exception ex){
			      ex.printStackTrace();
			    }
			
		return false;
	}



}
