
public class Type_Casting {
	public static void main(String[] args) {
		System.out.println("Implicit Type casting:");
		System.out.println("The Character given is 'A' ");
		byte a='A';
		System.out.println("The byte value is "+a);
		short b=a;
		System.out.println("The short value is "+b);
		int c=a;
		System.out.println("The int value is "+c);
		long d=a;
		System.out.println("The long value is "+d);
		float e=a;
		System.out.println("The float value is "+e);
		double f=a;
		System.out.println("The double value is " +f);
		
		System.out.println("\n");
		
		System.out.println("Explicit Type casting:");
		System.out.println("The Character given is 'B' ");
		double l='B';
		System.out.println("The value(double) is "+l);
		float m=(float)l;
		System.out.println("The value(float) is "+m);
		long n=(long)l;
		System.out.println("The value(long) is "+n);
		int o=(int)l;
		System.out.println("The value(int) is "+o);
		short p=(short)l;
		System.out.println("The value(short) is "+p);
		byte q=(byte)l;
		System.out.println("The value(byte) is "+q);
	}
}
