package com.tech.doks.mule.components;

public class MuleJavaComponent {
	String result = null;

	public String sayHello(String message) {
		if (message.equals(null)) {
			result = "Not provide any value";
		} else {
			result = "Hello " + message.substring(0,1).toUpperCase() + message.substring(1)+ " you are getting message from Mule ESB";
		}
		return result;
	}
}
