package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.lang.reflect.*;

import com.baselevel.factories.*;
import com.baselevel.highlevel.*;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("/Users/jameswillby/Documents/workspace/resources/demo.properties");
		props.load(in);
		Brain brain = (Brain) Class.forName(props.getProperty("brain")).newInstance();
		brain.speak();
		ControllerFactory factory = brain.generateFactory();
		
	}

}
