package Chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
		System.out.print("�¼�:");
		int power = scanner.nextInt(); //blocking ���� ����� �Է��� �޾ƾ���
		
	
	
		  long resulf = 1;
	      int i = 0;
	      while(i < power) {
	    	  
	    	 resulf = resulf * 2;
	    	 System.out.println(resulf);
	    	 
	    	  i++;
	    	  System.out.println("2��" + power + "����" + resulf + " �Դϴ�.");
	    	  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
		
	      scanner.close();
	}

}
