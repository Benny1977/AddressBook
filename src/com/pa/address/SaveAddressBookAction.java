package com.pa.address;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import com.pa.address.AddressBookMain;
import com.pa.address.menu.Action;


public class SaveAddressBookAction implements Action {

	@Override
	public boolean executeAction() {
		System.out.println("Action invoked - save address");
		   //serialize the List
	    try (
	      OutputStream file = new FileOutputStream("c:\\runFiles\\addressList.ser");
	      OutputStream buffer = new BufferedOutputStream(file);
	      ObjectOutput output = new ObjectOutputStream(buffer);
	    ){
	      output.writeObject(AddressBookMain.manager.getMyAddressList());
	      output.flush();
	      output.close();
	    }  
	    catch(IOException ex){
	    	ex.printStackTrace();
	    }

		
		
		return false;
	}

}
