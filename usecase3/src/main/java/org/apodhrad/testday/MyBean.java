package org.apodhrad.testday;

public class MyBean {

	public void foo(String data) {
		System.out.println("MyBean: " + data);
		if (data.contains("fail")) {
			throw new RuntimeException("Failed because you said '" + data + "'");
		}
	}
}
