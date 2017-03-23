package com.chargesystem.endpoint;

import java.io.Serializable;

public class Response implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String sex;
	public int age;
	
	public String toString() {
		return "name="+name+" sex="+sex+" age="+age;
	}
};
