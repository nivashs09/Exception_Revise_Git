package Compiletime_Exception;
import java.io.FileNotFoundException;
public class Interrupted_Excep {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//FileInputStream apple = new FileInputStream("D:\\Selenium_class\\notes SELENIUM\\Selenium 1_jan15.txt");
		//FileInputStream mango = new FileInputStream("D:\\sidhu\\Template.docx");
	//Thread.sleep(0);
	System.out.println("statement 1");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("statement 2");
	System.out.println("statement 3");
	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("statement 4");
		System.out.println("statement 5");
		}
}
