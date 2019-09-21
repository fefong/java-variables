Java Variables
===================================

Example Application: Variables

##		String
		String stringVal = "value";

##		String Array
		String[] stringArrayVal = new String[] { "value 1", "value 2"};

##		Char
		char charVal;
		charVal = 'A';
		charVal = '\u0001';

##		Char Array
		char[] charArrayVal = new char[] { 'A', 'B', 'C', '\u0001' };

##		Integer
		int intVal = 1;

##		Integer Array
		int[] intArrayVal = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, Integer.MIN_VALUE, Integer.MAX_VALUE };

##		Boolean
		boolean boolVal;
		boolVal = true;
		boolVal = false;

##		Long
		long longVal;
		longVal = (long) 10;
		longVal = 10L;

##		Long Array
		long[] longArrayVal = new long[] { 1L, 20L, Long.MIN_VALUE, Long.MAX_VALUE };

##		Byte
		byte byteVal;
		byteVal = 1;
		byteVal = 0x10;

##		Byte Array
		byte[] byteArrayVal = new byte[] { 0x10, 0x12, Byte.MIN_VALUE, Byte.MAX_VALUE };

##		Float
		float floatVal;
		floatVal = (float) 1.2;
		floatVal = 1.2F;

##		Float Array
		float[] floatArrayVal = new float[] { 1F, 1.2F, 4F, Float.MIN_VALUE, Float.MAX_VALUE };

##		Double
		double doubleVal;
		doubleVal = 1.5;

##		Double Array
		double[] doubleArrayVal = new double[] { 1.2, 3, 3.2, Double.MIN_VALUE, Double.MAX_VALUE };

##		Short
		short shortVal;
		shortVal = 1;

##		Short Array
		short[] shortArrayVal = new short[] { 1, 2, 3, 400, Short.MIN_VALUE, Short.MAX_VALUE };

##		Model Class | Custom Class
		Person p = new Person();
		p.setName("Name");
		p.setAge(30);
		Person person = new Person("Person", 20);
		Person[] persons = new Person[] { (new Person("Person 1", 20)), (new Person("Person 2", 22)) };
		
##		Model Class Array | Custom Class
		Person[] persons = new Person[] { (new Person("Person 1", 20)), (new Person("Person 2", 22)) };
		

## Java String Format Specifiers

|  Format Specifier | Data Type| ... |
|---|---|---|
|%a|	floating point (except BigDecimal)||
|%b|	Any type||
|%c|	character||
|%d|	integer (incl. byte, short, int, long, bigint)|usually used for int|
|%e|	floating point||
|%f|	floating point|usually used for float or double||
|%g|	floating point||
|%h|	any type||
|%n|	none||
|%o|	integer (incl. byte, short, int, long, bigint)||
|%s|	any type|usually used for string||
|%t|	Date/Time (incl. long, Calendar, Date and TemporalAccessor)||
|%x|	integer (incl. byte, short, int, long, bigint)||
		
## Some links for more in depth learning

* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);

		
