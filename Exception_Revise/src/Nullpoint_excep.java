public class Nullpoint_excep {
int x=10;
@SuppressWarnings("null")
public static void main(String[] args) {
// TODO Auto-generated method stub
//Nullpoint_excep car = new Nullpoint_excep();
//car.x=null;
Nullpoint_excep car = null;  //not creating object and kept null so exception
System.out.println(car.x);
}
}