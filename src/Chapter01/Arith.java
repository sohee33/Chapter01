package Chapter01;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ���������(���׿�����)
		 */
       int a = 3;
       int b = 7;
       
       int r1 = a + b;
       System.out.println(r1);
     		  
       int r2 = a + b;
       System.out.println(r2);
       
       int r3 = a * b;
       System.out.println(r3);

       int r4 = a / b;
       System.out.println(r4);
       
       int r5 = a % b;
       System.out.println(r5);

	// int op int => int
       System.out.println(10 / 3);
       
    // int op double => double
       System.out.println(10 / 3.);
       
     // ����
       System.out.println((double)10 / 3);
       System.out.println((double)(10 / 3));
       
     /*
      * ++,--
      * ���������ڴ�(���Կ�����)
      */
       int n = 1;
	   n++; // n = n + 1 : ����
	   System.out.println(n);
	   
	   n--; // n = m - 1
	   System.out.println(n);
	   
	   ++n; // n + n + 1: ���� 
	   System.out.println(n);
	   
	   
	   
	   
	   
	   
	   
	   //���� (��������ڴ� ������ ���� �࿵���� �� �� �ִ�)
	   n += 10; // n = n + 10
	   System.out.println(n);
	   
	   n-= 10; // n = n - 10
	   System.out.println(n);
	   
	   n *= 10; // n = n * 10
	   System.out.println(n);
	   
	   
	}

}
