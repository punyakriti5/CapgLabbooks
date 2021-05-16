package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1FileProgram {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fi = new FileInputStream("C:\\Users\\Pallu'S - PC\\eclipse-workspace\source.txt");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Pallu'S - PC\\eclipse-workspace\\target.txt");
		Ex1CopyDataThread c = new Ex1CopyDataThread(fi, fo);
		c.start();
	}
}