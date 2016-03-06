package com.baselevel.factories;

import com.baselevel.patterns.Controller;

public class FatControllerFactory extends ControllerFactory {

	private FatControllerFactory() {
		super();
	}

	public static ControllerFactory returnInstance(){
		if (instance != null)
			return instance;
		return instance = new FatControllerFactory();
	}
	
	@Override
	public Object buildController() {
		// TODO Auto-generated method stub
		return null;
	}

}
