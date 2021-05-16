package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1CopyDataThread {
	FileInputStream fIn = null;
	FileOutputStream fOp = null;

	public Ex1CopyDataThread(FileInputStream fi, FileOutputStream fo) {
		super();
		this.fIn = fIn;
		this.fOp = fOp;
	}

	public void start() {
		int a = 0;
		int count = 0;
		try {
			while ((a = fIn.read()) != -1) {
				char c = (char) a;
				fOp.write((byte) c);
				fOp.flush();
				count++;
				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
