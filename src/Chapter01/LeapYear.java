package Chapter01;

public class LeapYear {

	public static void main(String[] args) {
		// 1. 4�� ����� �������� 0�� �ƴ� �ش� ������ �ƴϴ� ex) 2019,2018,2017
		// 2. 4�� ����� �������� 0�� �� �߿� 100���� ����� �������� 0�� �ƴ� �ش� �����̴� ex) 2000
		// 3. 4�� ����� �������� 0�� �� �߿� 100���� ����� �������� 0�� ���߿�
		//    400���� ����� �������� 0�� �ش� �����̴�
		// 4. 4�� ����� �������� 0�� �� �߿� 100���� ����� �������� 0�� �ƴ� ���߿�
		//    400���� ����� �������� 0�ƴ� �ش� ������ �ƴϴ�

		int year = 2016;
		
		if( year % 4 != 0) {
		   System.out.println("������ �ƴմϴ�.");
	    } else { 
           if(year % 100 != 0) {
    	       System.out.println("���� �Դϴ�.");
           } else {
        	   if(year % 400 == 0) {
    		   System.out.println("�����Դϴ�.");
    	   } else {
    		   System.out.println("���� �ƴմϴ�.");
           }
       }
	  }     
     }	//
}

//if(year%4!=0){System.out.println("������ �ƴմϴ�.");}else if(year%100!=0){System.out.println("���� �Դϴ�.");}else if(year%400==0){System.out.println("�����Դϴ�.");}}}