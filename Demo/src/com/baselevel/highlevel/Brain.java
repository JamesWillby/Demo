package com.baselevel.highlevel;

import com.baselevel.factories.*;

public interface Brain {

	public void think();
	public void sleep();
	public void speak();
	public ControllerFactory generateFactory();
}
