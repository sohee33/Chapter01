package Chapter01;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // �������ڴ� ���׿������ε�..
     // �� ���� true, false�� ������ �����̿��� �Ѵ�.
		
	  int a = 7;
      int b = 3;
      
      // || : or(����)
      // true || false => true
      //  1    +   0   =>   1
      // true  || true => true
      // false || false => false
         
      // && : and(����)
      // true || false => false
      //  1    *   0   =>   0
      // true  || true => true
      // false || true => false
      // false || false => false
      
      
      System.out.println(a == b|| a > b);
      System.out.println(a == b&& a > b);
	
      System.out.println(a != b|| a > b);
      System.out.println(a != b&& a > b);
      
      // ! : not : ���׿����� �������� �ݴ�
      System.out.println(!(a > b));	
	
	}

}
