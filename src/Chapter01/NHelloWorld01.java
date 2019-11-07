package Chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt(); //blocking 멈춰 사용자 입력을 받아야해
      
      //System.out.println(number);
      
      int i = 0;
      while(i < number) {
         System.out.println("Hello World");        
    	  i++;
	}
      scanner.close();
}
}