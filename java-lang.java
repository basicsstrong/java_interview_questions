//java.lang Package

Why do not we need to Import java.lang Package in class?⭐️
		We do not need to Import java.lang Package. Because all the classes in this Package are imported
		by default.

		Like the printing statement-> System.out.println();
		-> System is java.lang.System class, while using it we do not need to write its fully qualified name
		because all the public types present inside this Package are already imported in every class.

Name few classes of Package java.lang?
		Object, String, All wrapper classes, Math, System, StringBuffer, StringBuilder, Thread, Throwable etc.

What is the base Class for every class?⭐️
		java.lang.Object Class is the base Class for every class.

Why java.lang.Object is the base class?
		Object Class contains the most common methods that are useful for any java object.
		equals(), hashCode() etc.
		-> To make those available for every object, Java made every Class to be child Class of object
		directly or indirectly.

What are the common methods provided by object class?

		equals() : used to compare two objects, returns true if any object is equals to this object.
							👉🏻 equals() method compares the references of object.

		toString(): The most useful method, returns a string representation of an object.

		hashCode(): this method returns the hash code value for the object.

		clone(): creates and returns a copy of the object.

		getClass(): this return the runtime Class of the object.

		wait(), notify(), notifyAll(): These methods do play a part in synchronizing the activities of
																	 independently running threads in any program.

		finalize(): This method is called by garbage collector on any object. This is deprecated since java 9.

What is a hashcode?⭐️
		For every Object, JVM generates a unique number which is actually the Hash code.
		This hash value can be used to search object in a collection.

		👉🏻 it is not the address of the object its a distinct number thats generated for every object.

Whats the difference between an object and an object reference?
		An object is an instance of a class, and an object reference is a pointer to the object.
		There may be many references to a single object.

Is String a datatype?
		String in java is not a primitive data type like int, long, char. It is a Class or can be
		considered as user defined type.

		👉🏻 String Class is defined inside java.lang Package.

Is String a Wrapper class?
		No, It is not.

How String is different from a char array?
		1. Both of them contains the sequence of characters, but String is represented as a single data type,
			 whereas char array is a collection of data type.

	  2. Strings are immutable and characters are mutable.
			 That means, once we created the string, we cannot modify it by any way. If we modify the string,
			 it will always result in creating a new string.

				String str = "John";
				str = "Rohn";	//this will create a new string in memory.

		3. Various built in functions like sustring(): used to get a part of string,
			 charAt(): used to get particular character.
			 These functions can be used with string, but with charArrays, we cannot use them.

		4. String can be stored in memory in any way, while elements of character array are stored contiguously
			 in increasing memory locations.

		5. String are stored in string pool whereas, Character array are stored in heap memory in java.

What is the String pool?⭐️
		The String constant pool is an area in java heap memory where Strings are stored.
		👉🏻 In String pool, there will be no String objects having the same content.

		    String s1 = "John";
				String s2 = "John";		//will point to same object

How these Statements are different?⭐️
1. String str = "Basic";		2. String strr = new String("Basics");

	 String newStr = "Basic";

		These are the two ways to create string object:
		1. using string literal  //Inside String Pool
		2. using 'new' keyword.	 //Inside Heap Area

		char[] arr = {'a','b'};
		String object = new String(arr);

		String s = "Hello";
		String newS = s.concat(" programmer!");

		//intern()

		String reUseThis = newS.intern();

What is String Interning?⭐️⭐️

what intern() method is used for?⭐️

How many objects will be created?
String s1 = "BasicsStrong";
String s2 = new String("BasicsStrong");
String s3 = "BasicsStrong";
String s4 = new String("Basics");
///String s5 = s4.concat(" here");

		Answer is 4, two object inside String constant pool.
		and two objects will be created inside heap Area.
		//SCP does not allow duplicate objects

Why String is Immutable and Final in java?
		There are many benefits of String because of its immutability:

		The concept of String constant pool is possible because String is immutable.
		This increases security because no one can change the string content.

		String are safe to use in multithreaded environment (where we work with multiple threads at a time),
		because we do not need any synchronization on Immutable objects.

		//All the Wrapper classes are immutable

Can we create an immutable class?⭐️
		Yes! We can create immutable class, for that We just need to define the Class as final.
		we can define all the fields as final.
		-> By not providing any method to change the state of the object, we can create an immutable class.

Is String a keyword in java?
		Answer is no, String is not a keyword.

Which of them is better to store password? String or Char array?
		String is not recommended to use as data type for passwords, because of their immutability.
		string are stored in String pool, so once its created it always stays in the pool until Garbage
		collector erase it.
		So even though we are done with password kind stuff, it will be available in memory for the very long
		duration. It is a security risk, because anyone who is having access to memory can find password easily.

		While, char array can be modified and we can set elements of char array to blank or null once we are
		done with it. This controls the duration of it of being available in memory.

Difference between String, StringBuffer, StringBuilder.⭐️
		StringBuilder and StringBuffer are another classes which are used to store strings.

		Strings are immutable and Final.
		Whenever we do String manipulation, it generates a new String and discards the older String for garbage
		collection.
		-> These generates a lot of garbage in heap, so java has provided String buffer and string builder
		classes that are mutable and can be used for string manipulation.

		StringBuffer vs StringBuilder:
		StringBuilder was introduced in java 1.5.
		StringBuffer operations are thread-safe and synchronized, whereas StringBuilder operations are not
		thread safe. That makes its performance faster than StringBuffer.

		Both StringBuffer and StringBuilder has not overriden the equals method
		so equals of object class gets executed which compares references.

How to check if two strings are equal?⭐️
		There are two ways:
		Using == and using equals() method.

		== checks for the reference of the string.
    equals() checks for Value of strings.

		👉🏻 equals() method of object Class checks for references, but String has different
		implementation of equals() method. It checks for the values of the string.

What will be the output of this code snippet?

String s1 = "Basics";
StringBuffer s2 = new StringBuffer("Basics");
System.out.println(s1.equals(s2));

		Both s1 and s2 have the same value, but this statement will print false.
		Because the s2 is not of string type.

How to convert String to charArray and byteArray?
		To get char array from string, we use toCharArray() method,
		getBytes() is used to get bytes from a string.

What does substring() method do?
		substring() creates and returns a new string object by taking a portion of original string.

Which one of them is final class. String, StringBuffer or StringBuilder.
		All of them are final classes.

What is the use of Math class?
		Math Class provides the mathematical functions. like,
		sqrt(), exp(), log(), abs().

Can we instantiate the Math class?
		No its cannot be instantiated, because it is final and constructor is private.

Without creating instance how can we use Math Class functions?⭐️
		All the methods of this Class are static. We can directly invoke them with classname.

What's Autoboxing and unboxing in java?⭐️⭐️
		Autoboxing and Unboxing : Introduced in Java 1.5 to automatically convert the primitive type into
		boxed primitive that is Object of Wrapper class.

		For example, when java automatically converts a primitive type like int, into respective wrapper
		Class Object, i.e, integer, then it is called Autoboxing.

		Unboxing is just the opposite case of it. Here, Integer object is converted into primitive int.

When do Autoboxing and Unboxing occur?⭐️⭐️
		Autoboxing and unboxing can occur wherever an object is expected and primitive is available.
		For example,
		A method expect an object argument but we pass primitive. In that case java automatically converts
		primitive into equal value object.

		-> The classic use of Autoboxing is in Collection. A collection is a group of objects.
		So auto boxing is used with collections to add primitive types..
