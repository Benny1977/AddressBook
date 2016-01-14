package com.pa.address;


import com.pa.address.menu.Action;

public class DisplayAddressAction implements Action {
	
	private Address address;
	public DisplayAddressAction(Address address) {
		super();
		this.address = address;
	}
	@Override
	public boolean executeAction() {
		if(address != null)
		{
			System.out.println(address.getId() + ": " + address.getAddress() + ": " + address.getStreet());
			return true;
		}else
		return false;
	}

}
