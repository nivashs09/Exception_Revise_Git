package Try_catch_Final;

public class Finally_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
try {
System.out.println("welcome");
System.out.println("first test");
System.out.println("second test");
int x=9/0;
System.out.println("third test");
System.out.println("test 4 to do");
	}
catch(Exception e) {
	e.printStackTrace();
}
finally{
	System.out.println("close DB");
}
	}

}
