package Chapter01;

import java.util.Scanner;

public class PrimeDetect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		
		
		int j = 1;
		while( j <= 1000) {
			
	    int num = j;
			
		int i = 2;
		boolean isPrime = true;
		while(i < num ) {
			int resulf = num % i;
			if(resulf == 0 ) {
				isPrime = false;
				break;
			}
			i++;
            
	    } 
		
		if (isPrime) {

			System.out.println(num);

			}
		j++;
		}
	}
}

