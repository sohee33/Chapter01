package Chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
		System.out.print("승수:");
		int power = scanner.nextInt(); //blocking 멈춰 사용자 입력을 받아야해
		
	
	
		  long resulf = 1;
	      int i = 0;
	      while(i < power) {
	    	  
	    	 resulf = resulf * 2;
	    	 System.out.println(resulf);
	    	 
	    	  i++;
	    	  System.out.println("2의" + power + "승은" + resulf + " 입니다.");
	    	  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
		
	      scanner.close();
	}

}
