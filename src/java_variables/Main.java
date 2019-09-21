package java_variables;

import java.util.Arrays;

import model.Person;

/**
 * Example Application: Variables
 * 
 * @author Felipe Fong
 */
public class Main {

	public static void main(String[] args) {

//		String
		String stringVal = "value";
		System.out.println(stringVal);

//		String Array
		String[] stringArrayVal = new String[] { "value 1", "value 2" };
		System.out.println(Arrays.toString(stringArrayVal));

//		Char
		char charVal;
		charVal = '\u0001';
		charVal = 'A';
		System.out.println(charVal);

//		Char Array
		char[] charArrayVal = new char[] { 'A', 'B', 'C', '\u0001' };
		System.out.println(Arrays.toString(charArrayVal));

//		Integer
		int intVal = 1;
		System.out.println(intVal);

//		Integer Array
		int[] intArrayVal = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, Integer.MIN_VALUE, Integer.MAX_VALUE };
		System.out.println(Arrays.toString(intArrayVal));

//		Boolean
		boolean boolVal;
		boolVal = true;
		boolVal = false;
		System.out.println(boolVal);

//		Long
		long longVal;
		longVal = (long) 10;
		longVal = 10L;
		System.out.println(longVal);

//		Long Array
		long[] longArrayVal = new long[] { 1L, 20L, Long.MIN_VALUE, Long.MAX_VALUE };
		System.out.println(Arrays.toString(longArrayVal));

//		Byte
		byte byteVal;
		byteVal = 1;
		byteVal = 0x10;
		System.out.println(byteVal);

//		Byte Array
		byte[] byteArrayVal = new byte[] { 0x10, 0x12, Byte.MIN_VALUE, Byte.MAX_VALUE };
		System.out.println(Arrays.toString(byteArrayVal));

//		Float
		float floatVal;
		floatVal = (float) 1.2;
		floatVal = 1.2F;
		System.out.println(floatVal);

//		Float Array
		float[] floatArrayVal = new float[] { 1F, 1.2F, 4F, Float.MIN_VALUE, Float.MAX_VALUE };
		System.out.println(Arrays.toString(floatArrayVal));
		
//		Double
		double doubleVal;
		doubleVal = 1.5;
		System.out.println(doubleVal);

//		Double Array
		double[] doubleArrayVal = new double[] { 1.2, 3, 3.2, Double.MIN_VALUE, Double.MAX_VALUE };
		System.out.println(Arrays.toString(doubleArrayVal));

//		Short
		short shortVal;
		shortVal = 1;
		System.out.println(shortVal);

//		Short Array
		short[] shortArrayVal = new short[] { 1, 2, 3, 400, Short.MIN_VALUE, Short.MAX_VALUE };
		System.out.println(Arrays.toString(shortArrayVal));

//		Model Class | Custom Class
		Person p = new Person();
		p.setName("Name");
		p.setAge(30);
		Person person = new Person("Person", 20);
		System.out.println(person);
		
//		Model Class Array | Custom Class
		Person[] persons = new Person[] { (new Person("Person 1", 20)), (new Person("Person 2", 22)) };
		System.out.println(Arrays.toString(persons));
		

	}

}
