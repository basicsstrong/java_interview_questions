
Operators:

How many types of operators are present in java?
		There are :
		1. Arithmetic Operators
		2. Unary Operators
		3. Assignment Operator
		4. Relational Operators
		5. Logical Operators
		6. Bitwise Operators
		7. Shift Operators
		8. Ternary Operator

What are Arithmetic operators?
		Arithmetic operators are used to perform simple arithmetic operations on primitive data types.
		These are;
				+ Addition Operator
				- Subtraction Operator
				* Multiplication Operator
				/ Division
				% Modulo operator

Can we add two short values to a short type?
		No we cannot. Addition of two short type numbers will be int. If we Try to assign it too short we
		will get an error.

		👉🏻 Any operation between two integer type variables which are smaller than int, will always results in
		an int.

What are Unary Binary and Ternary operators?
		Unary Operators are the operators which operate on only one operand.
		Binary Operators operate on two operands and Ternary operators operate on Three operands.

		👉🏻 We have Arithmetic, Assignment, Relational, Logical, Bitwise, Shift Operators which takes
		two operands to operate on.

Explain Unary operators.
		Unary operators are such operators which needs only one operand and are used to increment decrement
		value or inverting the value.

		1. Unary plus + : used for giving positive values.
		2. Unary minus - : used for negating the values

		3. Increment operator ++ : increments the value by 1.
							There two ways in which we can use this operator,
									-> Post-increment and Pre-increment
															a++;	++a;
															Post	pre

	-> What is the difference between ++a and a++ under increment operators?
				In post increment the value gets incremented by 1 after computing the result.

		4. Decrement operator -- : decrements value by 1.
							Two ways to use this, post decrement and pre decrement.

		5. Logical not operator ! : which is used for inverting a boolean value.

What is Assignment Operator, and what are Compound Assignment operators?
		Assignment operator: '='
				This operator is used to assign a value to any variable.
				It assigns value given on the right hand side of the operator to the left hand side variable.

				variable = value;

		Compound Assignement :
				Combining Assignment operator with other operators.
				These are compound statements:
					+=, -=, *=, /=, %=

Which operators are used to compare the primitives with each other?
		Relational Operators.
		These operators are used compare two operands. like, if an element is equals to another or not. Such operators return boolean result.

		These are some relational operators:

		1. == (equal to): returns true if left hand side value is equal to right one.

					a= 10, b= 20
					System.out.println((a==b));		prints false

		2. != (Not equal to): returns true if left side value is not equal to right one.

					System.out.println((a!=b));		prints true

		3. < (less than): returns true if left side value is less than the right one.

					System.out.println((a<b));		prints true

		4.  > (greater than)

		5. <= (less than or equals to) : this will return true if the value at left side is either less than
				or equal to the value at right side.

		6. >= (greater than or equal to)

What is the difference between the statement a = a+b and a+=b?
		This compound assignment [+=] implicitly cast the result of addition into the type of variable used
		to hold the result.

Can we cast an int value into byte variable?
		Yes we can cast.
				int a = 10;
				byte b = (byte) a;

What will happen if the value of int is larger than the byte?
		An int is 32 bit long, while byte is 8 bit long. When we cast an int to byte, the higher 24 bits
		will be lost as byte can only hold value from -128 to 128.

What is difference between equal to (==) and .equals() ?
		The equality operator is a binary operator which is provided by java to compare primitives and objects.
		Whereas .equals() is a method defined by Object class, which is used to compare objects.

		In order to compare objects:
		Equality operator (==) returns true only if both objects references points to the same object.
		while equals() returns true if both have same value.

What will this return : 3*0.1 == 0.3? True or False?
		Logically this should return true, But This will return false.
		Because some floating point numbers can not be represented exactly.

What are logical operators?
		Logical operators are used to perform the logical AND and logical OR operations.
				Operands with logical statements are conditions, which results into true or false.

		1. && (Logical AND): returns true when both conditions are true.

		2. || (Logical OR) : This returns true either the condition present in left side returns true or
												 condition at right returns true.

		👉🏻 Relational operators and Logical operators are used mostly in looping statements and conditional
			 statements.

What are Bitwise Logical Operators in java?
		Bitwise operators are used to perform operations on individual bits of number for example,
		These are the bitwise operators:

		1. Bitwise AND Operator & : which returns bit by bit AND of input values.
		2. Bitwise OR Operator | : which returns bit by bit OR of input values.
		3. Bitwise XOR Operator ^ : which returns bit by bit XOR of input values.
		4. Bitwise Complement Operator ~ : the unary operator which returns one-s complement representation
		 																	 of input value.

		We can use these operators with any of the integer type.

		We can also use Bitwise OR and Bitwise AND operators in conditional statements.

What is difference between Logical OR and Bitwise OR?
		While operating, The logical OR operator does not check second condition if first condition is true.
		It checks second condition only if first condition is false.
		Whereas the bitwise OR operator always checks both conditions, whether first condition is true or not.

What is Ternary Operator (Conditional) in java?
		In java, Ternary operator is a shorter version of if-else statement.
		It has three operands:

		Condition ? If true : if false

Explain Shift operators in java.
		There are two types of Shift operators:
		Left Shift <<
		Right Shift >>

		The Left shift operator in java is used to shift all the bits in a value to the left side of a
		specified number of times.

		And Right shift operator is used to move left operands value to the right by the number of bits
		specified by the right operand.

What is the difference between >>(Bitwise right shift operator) and >>>(bitwise zero fill right shift)?
		This '>>>' is also used to shift the bits towards right. But it is different from the regular '>>',
		as it does not protect the sign bit of the number, while '>>' protects the sign bit.
		👉🏻 '>>>' this always fills 0 in the sign bit.

What is the precedence of operators available in java?
		When it comes to hybrid equations, which have more than one or two operators,
		then the operators which have higher precedence are solved first.

What is instanceof operator?
		This operator is used to check if an object is an instance of a Class or a subclass.

				object instanceof class/subclass/interface

		-> This operator is used for Type Checking.


