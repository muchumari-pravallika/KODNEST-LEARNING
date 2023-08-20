
public class Demo {

	public static void main(String[] args) {
		//float a=3.147  //error as 3.147 is treated as double
		float a=(float) 3.147; //no error
		System.out.println(a);
		System.out.println("=====================");
		//long d=2147483649; //error
		long d=2147483649L;
		System.out.println(d);
		long e=2147483647;
		System.out.println(e);
		long f=221l;
		System.out.println(f);
	}

}
