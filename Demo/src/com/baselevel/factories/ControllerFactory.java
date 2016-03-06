package com.baselevel.factories;

import com.baselevel.patterns.Controller;

public abstract class ControllerFactory {

	protected ControllerFactory() {
		
	}
	
	public static ControllerFactory returnInstance(){ return null;}

	protected static ControllerFactory instance = null;
	
	public abstract Object buildController();
}
