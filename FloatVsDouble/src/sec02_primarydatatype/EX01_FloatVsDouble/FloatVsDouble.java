package sec02_primarydatatype.EX01_FloatVsDouble;

public class FloatVsDouble {
	public static void main(String[] args) {
		//float�� ���е�(�뷫 �Ҽ� 7�ڸ�)
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		//double�� ���е�(�뷫 �Ҽ� 15�ڸ�)
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}
}
