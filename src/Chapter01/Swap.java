package Chapter01;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
       if(n1 < n2) {
    	   int temp = n2;
    	   n2 = n1;
    	   n1 = temp;
       }
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		 int a1 = 20;
		 int a2 = 10; 
		 int a3 = 50;
		
		if(a1>= a2) {
			if(a1 > a3) {//  a1 > a3 and a1 >= a2
				System.out.println("�ִ밪" + a1 + "�Դϴ�.");
			} else { // a3>= a1 and a1>- a2
				System.out.println("�ִ밪" + a3 + "�Դϴ�.");
			} 
		
		}
		else {// a2 > a1 
			if(a2 > a3) { // a2 > a3 and a2 > a1
				System.out.println("�ִ밪" + a2 + "�Դϴ�.");
			}else { // a3 >= a2 and a2 > a1
				System.out.println("�ִ밪" + a3 + "�Դϴ�.");
			}
		}
	}
}
