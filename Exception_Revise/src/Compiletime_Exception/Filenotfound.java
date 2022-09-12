package Compiletime_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfound {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileInputStream apple = new FileInputStream("D:\\Selenium_class\\notes SELENIUM\\Selenium 1_jan15.txt");
	System.out.println("welcome to world");
	}
	catch(Exception e) {
	e.printStackTrace();
		}

}
}
