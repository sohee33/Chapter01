package Chapter01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//blocking
		
		
		int result = number % 3;
		
		if(result == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
		System.out.println("3�� ����ƴմϴ�");
	}

	}
}
