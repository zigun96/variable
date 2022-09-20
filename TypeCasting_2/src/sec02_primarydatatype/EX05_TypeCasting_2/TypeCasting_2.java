package sec02_primarydatatype.EX05_TypeCasting_2;

public class TypeCasting_2 {
	public static void main(String[] args) {
		//자동 타입 변환
		float value1 = 3; //int -> float(업케스팅)
		long value2 = 5; //int -> long(업케스팅)
		double value3 = 7; //int -> double(업케스팅)
		byte value4 = 9; //int -> byte
		short value5 = 11; //int -> short
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		//수동 타입 변환
		byte value6 = (byte)128; //int -> byte(다운케스팅)
		int value7 = (int)3.5; //double -> int(다운케스팅)
		float value8 = (float)7.5; //double -> float(다운케스팅)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}
}
