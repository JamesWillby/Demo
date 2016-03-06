package com.baselevel.highlevel;

import com.baselevel.factories.ControllerFactory;

public class MiserableBrain implements Brain {

	public MiserableBrain() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void think() {
		System.out.println("I'm thinking about death");
	}

	@Override
	public void sleep() {
		System.out.println("Sleep? Never!!!!");
		
	}

	@Override
	public void speak() {
		System.out.println("Meh and pfft");
		
	}

	@Override
	public ControllerFactory generateFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
