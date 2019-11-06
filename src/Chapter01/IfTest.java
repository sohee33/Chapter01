package Chapter01;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 10;
      int b = 15;
      
      
      //===============
      int diff = 0;
      
      if(a > b) {
		   diff = a - b;
	} else {
	       diff = b - a ;
	}
      
      System.out.println(diff);

	}
}