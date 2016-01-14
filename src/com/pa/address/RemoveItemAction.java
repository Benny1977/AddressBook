package com.pa.address;

import java.util.ArrayList;
import java.util.Scanner;


import com.pa.address.menu.Action;
public class RemoveItemAction implements Action {

	private  ArrayList<Address> list;
	private  int itemToRemove;
	
	public RemoveItemAction(ArrayList<Address> list){
		this.list = list;
		
	}

	@Override
	public boolean executeAction() {
		System.out.println("Type the index of the item you wish to remove.");
		Scanner scanner = new Scanner(System.in) ;
		itemToRemove = scanner.nextInt();
		
		
		try {
			list.remove(itemToRemove);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Item " + itemToRemove + "was not found");
			return false;
		}
		
	}

}
