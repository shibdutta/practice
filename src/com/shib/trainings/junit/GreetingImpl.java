package com.shib.trainings.junit;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		
		if(name == null || name.length() == 0 )
		{
			throw new IllegalArgumentException("blank name");
		}
		return "Hello " + name;
	}

}
