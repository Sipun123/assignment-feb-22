package com.monami.java;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("example of autoboxing");// int to Integer
		int a = 10;
		Integer b = Integer.valueOf(a);
		Integer c = a + b;
		System.out.println("a:" + a + "b:" + b + "c:" + c);
		System.out.println("=================");
		System.out.println("example of unboxing");// Integer to int
		Integer d = new Integer(20);
		int e = d.intValue();
		int f = d * e;
		System.out.println(" d : " + d + "e :" + e + "f :" + f);
		System.out.println("===========================");

		System.out.println("char to Character conversion");
		char g = 'g';
		Character h = Character.valueOf(g);
		Character i = 'g' + 'h';
		System.out.println(" g: " + g + "  h :" + h + "  i:" + i);
		System.out.println("============================");

		System.out.println("Character to char conversion");
		Character j = new Character('j');
		char k = j.charValue();
		char l = 'j' * 'k';
		System.out.println(" j: " + j + "  k : " + k + " l : " + l);

		System.out.println("===========================");

		System.out.println("byte to Byte conversion:");
		byte m = 20;
		Byte n = Byte.valueOf(m);
		Byte o = (byte) (m + n);
		System.out.println(" m: " + m + " n: " + n + " o: " + o);
		System.out.println("================================");

		System.out.println("Byte to byte conversion:");
		Byte p = new Byte((byte) 10);
		byte q = p.byteValue();
		byte r = (byte) (p * q);
		System.out.println("p: " + p + " q :" + q + " r :" + r);

		System.out.println("==============================");
		System.out.println("short to Short conversion");
		short s = 20;
		Short t = Short.valueOf((short) 20);
		Short u = (short) (s / t);
		System.out.println(" s: " + s + " t :" + t + " u :" + u);
		System.out.println("===================================");
		System.out.println("Short to short conversion:");
		Short v = new Short((short) 12);
		short w = v.shortValue();
		short x = (short) (v * w);
		System.out.println(" v : " + v + " w : " + w + " x : " + x);
		System.out.println("============================");

		System.out.println("float to Float conversion:");
		float f1 = 20.30f;
		Float f2 = Float.valueOf(f1);
		Float f3 = f1 + f2;
		System.out.println(" f1 : " + f1 + " f2 : " + f2 + " f3 :" + f3);
		System.out.println("==============================");

		System.out.println("Float to float conversion :");
		Float fl = new Float(20.3f);
		float fl1 = fl.floatValue();
		float fl2 = fl - fl1;
		System.out.println(" fl : " + fl + " fl1 :" + fl1 + " fl2: " + fl2);
		System.out.println("================================");

		System.out.println("double to Double conversion");
		double salary = 50000.00;
		Double insentive = Double.valueOf(salary);
		Double total = salary + insentive;
		System.out.println("salary : " + salary + " insentive :" + insentive + " total: " + total);
		System.out.println("==================================");

		System.out.println("Double to double conversion");
		Double sal = new Double(20000.00);
		double insntv = sal.doubleValue();
		double totall = sal + insntv;

		System.out.println("sal : " + sal + " insntv :" + insntv + " totall :" + totall);
		System.out.println("=========================================");

		System.out.println("long to Long conversion");
		long ll = 100000L;
		Long ll2 = Long.valueOf(ll);
		Long ll3 = ll + ll2;
		System.out.println(" ll :" + ll + " ll2 : " + ll2 + " ll3 :" + ll3);
		System.out.println("========================================");
		System.out.println(" Long to long conversion :");
		Long lm = new Long(200000L);
		long lm1 = lm.longValue();
		long lm2 = lm + lm1;
		System.out.println(" lm :" + lm + " lm1: " + lm1 + " lm2 :" + lm2);
		System.out.println("=========================================");
		System.out.println("boolean to Boolean conversion:");
		boolean b1 = false;
		Boolean b2 = Boolean.valueOf(b1);
		Boolean b3 = b1 & b2;
		System.out.println("b1: " + b1 + " b2 :" + b2 + " b3 :" + b3);
		System.out.println("===========================================");
		System.out.println("Boolean to boolean conversion:");
		Boolean bb1 = new Boolean(true);
		boolean bb2 = bb1.booleanValue();
		boolean bb3 = bb1 || bb2;
		System.out.println("bb1: " + bb1 + " bb2 :" + bb2 + " bb3 :" + bb3);
		System.out.println("=============================================");
	}
}
