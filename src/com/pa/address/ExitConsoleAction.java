package com.pa.address;

import com.pa.address.menu.Action;

public class ExitConsoleAction implements Action {

	@Override
	public boolean executeAction() {
		System.exit(0);
		return false;
	}

}
