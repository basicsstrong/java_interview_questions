//Identifiers

L1-00:35 What are identifiers in java?
    Name used to identify the class or a variable or A label or a method or a package.. such things
    is called an identifier

      package com.basicsstrong.fundamentals;
      class Demo{
      	int a;
      	public void display(){}

      }

    Here
    Package name 'com.basicsstrong.fundamentals',
    Class name 'Demo',
    Variable name 'a',
    Method name 'display()' are identifiers.

    -> Identifiers are case-sensitive, and we can define identifiers of any length. (preferred 4-15)

L1-01:44 In below example, how many identifiers are there?
public class Demo{
	public static void main(String[] args){
		int a = 20;
	}
}
      There are 5 identifiers.
      1. ClassName 'Demo',
      2. MethodName 'main',
      3. Predefined ClassName 'String',
      4. Variable name 'args',
      5. Variable name 'a'.

L1-02:53 which characters are allowed for identifiers?
    Identifiers can have all the-
    -> alphanumeric characters [A-Z],[a-z],[0-9],
    -> '$' dollar sign and the underscore '_'

L1-03:22 Can we have an identifier starting with a digit?
    Answer is No, any identifier starting with digit is not a valid java identifier.
    -> We cannot have '1stVariable' as identifier.

L1-03:49 Can we use reserved word as identifier? ⭐️
    No, we can not use reserved words as identifiers. for example,
        String final = "final string";      //invalid statement

//Reserved Words

L2-00:07 What are reserved words? ⭐️
    Any programming language reserves some words to represent some functionalities defined by that
    particular language, such words are called reserved words.
    It consists of Keywords and literals.

L2-00:35 How many keywords are there in java?
    For defining some functionalities, There are around 50 keywords in java,
    which includes data types, modifiers, keywords related to flow control, and many more.

L2-03:34 What are unused keywords? ⭐️
    Goto and const are the keywords which are reserved by java but have not used until now.

L2-04:21 Can we use predefined Class name as identifier?
    Answer is Yes, we can use predefined Class name as identifier.
	     String String = "Basics";

    But it is not recommended to, because it reduces the readability and creates complexity in code.

L2-04:56 Explain var keyword in java?
    'var' is a keyword which is added in java 10, which allows us to declare a variable without defining
    their type.

      String str = "my string";   ->    var str = "my String"; var i = 10;

L2-05:41 Is null a keyword?
    No, null is not a keyword. It is a literal.

L2-05:50 What are literals? ⭐️
    Literals are the constant values which can be assigned to the variable.
    For example,

    String s = "BasicsStrong";
      -> BasicsStrong is a literal.

    And java provides 3 literals, which are null, true, false.

    1. Integral Literals for byte, short, int, long.
    2. Floating-Point Literals for float and double.
    3. Char Literals for char.
    4. String Literals for strings.
    5. Boolean Literals which are true and false.

//Data types

L3-00:05 What are various primitive data type in java?⭐️
    There are 8 primitive data types:
    1. byte
	       The byte data type is an 8-bit signed Two-s complement integer.
         Size : 8 bit
         Value : -128 to 127.

    2. short
	       The short data type is 16-bit signed two-s complement integer.
         Size : 16 bit
         Value : -32768 to 32767.

	  👉🏻 Both byte and short are useful for saving memory in large arrays.

    3. int      [int i = 100;]
	       It is a 32-bit signed two-s compliment integer.
         Size : 32 bit
         Value : -2^31 to (2^31)-1

    👉🏻 int data type is generally used for numeric values.

    👉🏻 In java SE8 and later, we can also use int data type as unsigned 32-bit integer which has value
    in range [0,2^31 - 1]. and for that we use Integer class.

    4. long
	       Long data type is 64-bit two-s compliment integer.
         Size : 64 bit.
         Value : -2^63 to 2^63 -1.

    👉🏻 The Long Class can be used to represent an unsigned 64-bit long.

    5. float
	       Float data type is a 32-bit floating point. And to define a float data type
         we use f or F suffix.
	        like this,
	         float f = 10.7f;

    6. double
	       double is a 64-bit floating point. It is the default data type for decimal values.
	        double d = 7.34456

    👉🏻 Float and double are used for scientific calculations.

    7. boolean
	       boolean data type represents only one bit of information, it can be either true or false.

    8. char
	       The char data type is a single 16-bit Unicode character. Note that it is a single character.
            char c = 'B';

L3-03:14 What is difference between double and float variables?
    -> Float takes 4 bytes in memory whereas double takes 8 bytes in memory.
    So float is single precision floating point and double is double precision decimal number..

    -> If we want to save memory in large arrays of floating point numbers, then we should use a
    float instead of double.

L3-03:49 What is implicit conversion in java?⭐️
    Type conversion in java is converting a type into another type.
      Two type of type casting in java,
      -> Implicit
      -> Explicit

    Implicit type conversion wides the range of any type.
      In this, one primitive is converted into another one.
      It is automatic type conversion which happens only when both type are compatible and target
      type is larger than source type. for example,

      int a = 50;
      long b = a;

      Here int a will be converted into long type without any explicit casting.

L3-07:14 How to make any variable constant so that it cannot get changed through out the program?
    We can declare any variable final, with final keyword.
    -> a final value can never be changed.

    final double a = 2.4;

L3-08:06 What are the default values for all primitive types?
    For boolean -> false
    For byte -> 0
    short -> 0
    int -> 0
    long -> 0l
    char -> /u0000
    float -> 0.0f
    double -> 0.0d
    And when it comes to any object, the default value is -> null

L3-08:37 What are the Wrapper classes available for primitive types?
    Wrapper classes are the wrappers to primitive data types.
    👉🏻 By using wrapper classes we are allowed to access primitives as objects.
      For every primitive type there is a Wrapper Class present in java:
          boolean  - java.lang.Boolean
          byte - java.lang.Byte
          char - java.lang.Character
          double - java.lang.Double
          float - java.lang.Float
          int - java.lang.Integer
          long - java.lang.Long
          short - java.lang.Short
          void - java.lang.Void

L3-09:26 How primitive variable passed to methods? By value or by reference?⭐️
    In java, primitives are passed to methods by value.
    So that, when the passed value changes in the method, it does not change the original value.

L3-00:00 Is it correct to say that Classes and interfaces are data types or data structure?
    We can consider a Class as Data type but interfaces can not be seen as data types because they
    do not hold anything.

//Main method

L4-00:13 What is main method?
    main method is a method which is entry point of execution of any java program.

    public class Exercise{
    	public static void main(String[] args){
    		int a = 10;
    		byte b = 2;
    		char c = 'A';
    		double d = 2.4;
    		//lets add these values,
    		System.out.println(a+b+c+d);

    	}
    }

    So main method is an standard method which is used by JVM to start executing the program.

L4-00:58 What is String args[] in main method?
    Main method has an argument, 'args array' of type string.
    However we can name it anything in place of args but mostly programmers prefer to name it args.

    -> When we run the program from command prompt we can pass some input to our java program.
    That input will get stored in String args array.

    -> We can also specify String argument for main method using run configuration in eclipse.

L4-02:51 Why the main method is public static?
    -> Any method of any Class can be accessed only by creating its instance unless it is static method.

    👉🏻 Java uses the main() method as the entry point of execution, so if main() method is
    declared non-static then JVM would not be able to call it without creating the instance of that Class.

    JVM cannot create instance of the main Class as there is no standard constructor defined in
    main class.

    👉🏻 Main method is public so that it is visible to every class. If its not public,
    then JVM classes might not be able to access it.

    These are the reasons why main method is public and static.
    And as it does not return anything so it is void.⭐️

L4-04:33 Can we run any java program without main method?
    We can not. Before JDK7 we had static initialisers as an alternative approach for main method but
    from JDK 7 we cannot do so.

          //static initialiser:
          public class Demo{
          	static{
          		sysout();
          		System.exit(0);
          	}
          }

    It is mandatory to write main method because it is the entry point of java application in case of
    core Java.
    In case of other container managed environment like Servlet, EJB etc, java programs have their
    own life-cycles. so we do not need to write main method in such environments.

L4-05:36 Can we change signature of main method?⭐️
    No, we can not change anything while defining the standard main method in java.
    We cannot define it non-static, private - protected, or we can not change its return type which is
    void.

    If we change anything then JVM will consider that method as any other ordinary method, and will
    continue to search for the standard main method.
    If it does not find that, the runtime error will occur.

L5-07:10 Can we make main method final in java?⭐️
    Answer is yes, we can declare main method as final.
    This makes its implementation final; any other Class would not be able to change it.
