package com.pa.address.menu;


import com.pa.address.AddressBookMain;
import com.pa.address.ConsoleAddressManager;
import com.pa.address.DisplayAddressList;
import com.pa.address.ExitConsoleAction;
import com.pa.address.LoadAddressBook;
import com.pa.address.ReadAddressAction;
import com.pa.address.RemoveItemAction;
import com.pa.address.SaveAddressBookAction;

public class AddressBookMenu extends ConsoleMenu{
	
	public AddressBookMenu(){
		super("My Address book Menu ") ;
		ConsoleMenuItem exitItem =  new ConsoleMenuItem("Exit Applicatin" , 0 , new ExitConsoleAction() );
		ConsoleMenuItem printList = new ConsoleMenuItem("Print The Addresses List" , 1 , new DisplayAddressList());		
		ConsoleMenuItem addItem = new ConsoleMenuItem("Add Address" , 2 , new ReadAddressAction());
		ConsoleMenuItem removeItem = new ConsoleMenuItem("Remove Address" , 3 , new RemoveItemAction(AddressBookMain.manager.getMyAddressList()));
		ConsoleMenuItem loadList = new ConsoleMenuItem("Load List" , 4 , new LoadAddressBook());
		
		
		ConsoleMenuItem saveItem = new ConsoleMenuItem("Save Address book" , 10 , new SaveAddressBookAction());
		
		addMenuItem(addItem).addMenuItem(saveItem).addMenuItem(exitItem).addMenuItem(printList).addMenuItem(removeItem).addMenuItem(loadList);
	
	}
}
