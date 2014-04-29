package org.apodhrad.testday;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MyBean2 {

	public void foo2(String data) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(
				"/home/apodhrad/Temp/tx.log", true));
		out.write(new Date() + "\t" + data);
		out.newLine();
		out.flush();
		out.close();
	}
}
