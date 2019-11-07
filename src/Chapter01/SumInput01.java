package Chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      int number = scanner.nextInt(); //blocking 멈춰 사용자 입력을 받아야해
		
		
	  //int number = 10;
      int sum = 0;
      
      int i = 0;
      while(i < number) {
    	  i++;
    	  sum = sum + i;
    	  System.out.println(sum);
      }
      
      
      
      
      
      System.out.println(number + "까지 합은" + sum +" 입니다.");
      scanner.close();
      
      
	}

}
