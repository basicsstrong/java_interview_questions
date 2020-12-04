

1. Have you used Java 8 and Later? What the most important features added in Java 8.

Java 8 is a Major release from Oracle that changes the way of programming and some of the very powerful features added in Java 8 are -

Lambda Expressions & Functional Interface.
Java Stream API
forEach() method in Iterable interface
default and static methods in Interfaces
Java Date and Time API

2. So, What is Lambda Expression ?

And you may answer this Question By Explaining -

In Java Lambda Expressions is the anonymous functions that can be Passed into another method as argument. A function that can be created without belonging to any class. Lambda Expression facilitate passing Behavior or Functions
as parameter to another Functions. This also enables the programming language to be as functional programming language.

3. Now the Next and a bit important Questions That can come in two Ways -

   A) So how do you call / Invoke this Function without name called Lambda?
   B) What is Functional Interface

   The Answer is that, Every Lambda function in Java is Backed up by a Functional Interface. Java Implemented functional programming or
   Lambda Expressions using Interfaces to keep the language's backwards compatibility intact.
   Let me now take you through a full background in The following lecture so that you can understand and answer the Questions around Lambda and
   Functional Interfaces.


4. Can you Convert few Functions into Lambda - and the interviewer may put a function for you to convert that into Lambda.

You may Convert the lambda of functions like this -


Zero parameter:

() -> System.out.println("My without Parameter Lambda");

One parameter:�

(x) -> System.out.println("One parameter: " + x);

Multiple parameters :

(a,b) -> System.out.println("Multiple parameters: " + a + ", " + b);



5. What are Functional interfaces

Functional interfaces, are interfaces having only one abstract method and generally used to invoke Lambda Expression.



6. so what is the difference between anonymous classes and Lambda Expression?

So the main difference between anonymous inner classes and Lambda is

The compiler generates a class file for each anonymous inner class.
For example � AnonymousInnerClass$1.class
Like all classes, it needs to be loaded and verified at startup.

For Lambda compiler uses invoke Dynamic to call the Lambda so no extra class files are generated


7. Can you Name a few Functional Interfaces that are already there in Java 8 to use.

The answer of this question is there are 40+ predefined functional interfaces in Java, Some on the very important functional interfaces to remember are

Consumer  (This consumes the input) having a abstract Method Accept(Object obj)
Predicate (This Functional Interface is used to test some condition) having abstract method test(Object obj)
Supplier  only Supplies does not accept, or return anything back having Method get()
Function  Functional interface is used to apply some operation and return the object back, having method Object apply(Object obj)


8.  What is :: (Double Colun Operator) or Method reference.

   :: Operator of method reference can be used if we want to use an existing method available as Lambda.

   Like in String we want to use toUppercase - Let's see how we can use that

   import java.util.function.Function;

public class Parctice01 {

	public static void main(String[] args) {

		String s="BasicsStrong";
		// There is a method in String toUpperCase and we can refer this using
		// Functional Interface

		Function<String, String> fun = String::toUpperCase;

		String newString=fun.apply("basicsStrong");
		System.out.println(newString);
	}

}


9. Another most important Question the interview may ask is, What is Functional Programming.

In Functional programming Functions are the first class Citizens, Can be passed to another functions and can be returned from another
functions.

Functional Programming mainly supports

Methods Composition (one function returns another)
Passing the Method or behavior Dynamically
Pure Functions
Higher Order Functions

10. What is pure Function?

Pure Functions have below Characteristics.

			 ___________________
			|					|
Input----->	|		f(x)		| -----> OutPut
			|					|
			|___________________|

The return value of the pure func�tions solely depends on its arguments Hence, if you call the pure func�tions with the same set of argu�ments, you will always get the same return values.

They do not have any side effects like net�work or data�base calls

They do not mod�ify the argu�ments which are passed to them

With this pure functions comes with a Great Benefit and can be used fearlessly in Multithreaded programs as they will never Modify the
shared State or variables.

Example :

public static int sum(int a, int b) {
    return a + b;
}

This function, satisfies all the requirements of being pure.



At the same time ...

public static int sum(int a, int b) {
    return new Math.Random().nextInt() + a + b;
} // This is Impure becasue it Voilates the first Rule.


public static int sum(int a, int b) {
    writeSomethingToFile();
    return a + b;
}  // This is also impure because it voilates the second rule.


11. What are Higher Order Functions? or Functional Composition?

The Functions that return another Function is called Higher Order Functions, and applying these functions one by one like Fluid Operations are called Functional Composition

Let's understand this with an Example -

Look at this code closely this is returning a Function, so this can be called as Higher Order Function.

public static Comparator<String> reverse(Comparator<String> comp) {
    return (x, y) -> comp.compare(y, x);
}


12. What is Stream in Java.

A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. Stream connects to
the data source and convert that into a flow of Objects, that can be processed using methods one by one.
Let's take an Example -

public class Parctice02 {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,2,3,4,5,6,7,8,9);

		List is converted into Stream Here where the Elements will flow one by on and processed as per the operations applied.
		List evenList=list.stream()
			.filter(e -> e%2==0)
			.collect(Collectors.toList());

		System.out.println(evenList);

		// In this Example list of Integers has been converted into Stream
		// then Filter Method is applied and lambda is passed to filter only even items
		// then finally collect operation is called to collect the Items to another list
	}


}

13. What do you mean by Pipeline of Operations?

To perform a sequence of operations over the elements of the data source and process and get the results,

There are three things Required

Data source
Intermediate operation(s)
Terminal operation.

Data Source is the Dataset or collection to which the Stream will be created.

There are various operations in Stream that is Intermediate -

filter()
map()
flatMap()
distinct()
sorted()
peek()
limit()
skip()

Intermediate operations are lazy and will not be called until the Terminal operation is called. To identify if the operation is Intermediate
or not we can check

If the operation is returning another stream it is called intermediate operation.

The terminal operation is the final operations that will be called after triggering the Intermediate operations.

Some of the Example of Terminal operations are.

toArray()
collect()
count()
reduce()
forEach()
forEachOrdered()
min()
max()
anyMatch()
allMatch()
noneMatch()
findAny()
findFirst()

In the Example above - filter is a intermediate operation and collect is the terminal operation

List<Integer> list=Arrays.asList(1,2,2,3,4,5,6,7,8,9);

		List is converted into Stream Here where the Elements will flow one by on and processed as per the operations applied.
		List evenList=list.stream()
			.filter(e -> e%2==0)
			.collect(Collectors.toList());

		System.out.println(evenList);

14. What do you mean by Lazy evaluation?


Lazy evaluation is that Intermediate operations are not executed, until required, and JVM intelligently calls intermediate operations.

Let's prove this using an Example

package com.basicsstrong.apidesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parctice02 {

	public static void main(String[] args) {


		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John",36));
		persons.add(new Person("Erick",39));
		persons.add(new Person("Mickel",56));
		persons.add(new Person("Bob",33));

		// This is just a Intermediate Operation Let see if the get Method gets executed by
		// Putting a Debug code there

		Stream<Person> stream = persons.stream()
			   .filter(e -> e.getAge() <= 36);

		// Nothing Happenes.

		// Let's now add one terminal operation


		List<Person> newlist = persons.stream()
				   .filter(e -> e.getAge() <= 36)
				   .collect(Collectors.toList());
		// See the getMethod call takes place and Stream is filtered

		System.out.println(newlist);
	}

}

class Person{

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {

		System.out.println("I am in getAge Mthod of Persons");

		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}

15. What are parallel Streams :

Parallel Streams can take advantage of MultiCore processors, and get executed in parallel. But you should take care while using parallel streams



16. Why default methods got introduced in Java 8

For Making, Functional interfaces more Functional to support Composition and Higher Order functions. Functional interfaces needed to have Methods inside.
But Java Could not do that because of backward compatibility. If they could have add a method in existing interface all the application using
those interfaces had to implement That.

That's why Java introduced Default Methods. Others can override if they need their implementation else, default implementation would remain there.
