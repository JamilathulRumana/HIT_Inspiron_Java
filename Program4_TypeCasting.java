
public class Program4_TypeCasting {
	public static void main(String[] args) {
		//automatic type casting
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(l);
		
		//type casting 
		long ll = 120;
		int ii = (int)ll;
		short ss = (short)ii;
		byte bb = (byte)ss;
		System.out.println(bb);
		
		//type casting needed for arithmatic operation
		byte num1 = 2, num2 = 8;
		byte multiply = (byte) (num1 * num2);
		System.out.println(multiply);
		
		byte num3 = 8, num4 = 2;
		int division = num3/num4;
		System.out.println(division);
		
		short num5 =8, num6 = 80;
		short addition = (short) (num5 + num6);
		System.out.println(addition);
		
		int num7 =88, num8 = 80;
		int sub = num7 - num8;
		System.out.println(sub);
		
		long num9 =89, num10 = 80;
		long mod = num9 % num10;
		System.out.println(mod);
		
	}
}
