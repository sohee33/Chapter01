package Chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// implicity(�Ϲ���) Type Cast
		int i = 10;
		long l = i;
		
		System.out.println(i+":"+l);
		
		// explicity(�����) Type Cast
		long l2 = 1234567890L;
		//int i2 = l2;
		int i2 = (int)l2;
		

	}

}
