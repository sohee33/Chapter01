package Chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");

		int i = 2;
	

		int num = scanner.nextInt();
		boolean isPrime = true;

		//while
		//������

		if (isPrime) {

		System.out.println(num + "�� �Ҽ��Դϴ�.");

		} else {

		System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		
		scanner.close();
		}
		
	}
}
       