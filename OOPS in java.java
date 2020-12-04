
//Object Oriented Programming [OOP]

//Classes and Objects - Building Blocks of OOP

L1-00:45 What are classes and objects?
		A Class is a user-defined-blueprint from which objects are created, which has attributes and behavior.

L1-04:30 How can we create class?
		We can define a Class in java, using keyword "class".

			class <ClassName>
			{
				//Variables
				//Methods...
			}

		For example:

			class Fan{
				private boolean isOn;

				public void turnOn(){
				isOn = true;
				}

				public void turnOff(){
				isOn = false;
				}
			}

 		Class members: isOn [Data member], turnOn() turnOff() [Member functions]

L1-09:07 How to create objects?
		We create objects with the keyword 'new'.

			<classname> ref = new <classname>();

L1-13:41 How many classes we can create in a java file?
		We can create any number of classes in a java file.
		👉🏻 We can have only one Public Class in a java file.


//modifiers

L2-00:22 There are two types of modifiers present in java
    		1. Access modifiers
    		2. Non-Access Modifiers.

L2-00:29 What are the Access modifiers in java?
    		Access Modifiers are the keywords in object oriented language, which set the accessibility of classes
    		or methods or any members.

    		-> Using public modifier we specify that the Class can be accessed everywhere.

L2-01:13 How many access modifiers are there in java?
    		1. public
    		2. private
    		3. protected
    		4. <default>

    	public:
    			 public members can be accessed anywhere, in any class, present in any Package.

    	default:
    			 When there is no modifier used, then the component has default accessibilities.
    			 -> Classes with no modifier said to be default classes. The scope for the default classes
    		   and default Class members is within their Package.

    	private:
    			 Private members cannot be accessed anywhere except in the Class itself where they are declared.

    	protected:
    			 Protected members can be accessed within the same Package and in its subclass,
    			 but it cannot be accessed in the other packages excepts its child classes.

    			 So their scope is limited to its Package and its subclasses.

L3-00:02 What is a Package?
    		A Package is a mechanism to keep all classes, interfaces and sub-packages;
    		which has similar functionalities, at the same place.

    		Packages provides a folder structure to organize our classes-interfaces, so that one can easily
    		search and use them.

L3-01:12 How can we access a Class outside its Package?
    		To use a Class outside its Package we must Import it, using the 'import' keyword.
    		For example,

    		import com.basicsstrong.oops.<theclassname>;

L3-01:55 Can we declare a Top level Class private?
    		Answer is no, A Class can be public or default.

    		Inner class: Class defined in a class.

    		Inner classes can be declared as private or protected as they are the members of the class.
    		-> Top level Class can not be private or protected.

L3-03:10 Which access modifier is the least restrictive and which is the most restrictive?
    		Least Restrictive Modifier: Public access modifier
    				-> It is also known as Universal Access Modifier.

    		Most Restrictive access modifier : private.

L4-00:04 What are non-access modifiers in java?
    		1. Static :
    						static keyword is used to specify whether the member is a Class member or an instance member.
    						If a member is defined static, then it is said to be Class member.

    		2. Final :
    						final specifier is used to restrict further modifications on any class, any method or any
    						variable.
    						-> if any primitive variable is final, we cannot change its value in whole program.

    		3. Abstract :
    						abstract specifier is used to mark the method or Class to be incomplete and to must be
    						modified further by other classes.

    		4. Synchronized :
    						This is used to achieve thread safety in multithreaded environment which is about executing
    						tasks simultaneously with different threads.

L4-06:35 Can a Class or a method be abstract and final at the same time?
    		A Class or a method cannot be abstract or final at the same time.
    		-> Final restricts the component to be modified further.
    		-> abstract make component available to be modified further.

L4-06:56 What do you mean by abstract classes?
    		A Class with abstract specifier is a abstract class.

    		If a Class is abstract it is not fully implemented and if a method is abstract, it does not have
    		any implementation.

    		👉🏻 abstract methods can only be defined in abstract class.

L4-07:32 what is abstract method?
    		A method without any implementation or definition is an Abstract method.
    		Abstract method are declared with the keyword abstract.

L4-09:33 Can we define an abstract method in a non-abstract class?
    		We can not declare any abstract method in a non-abstract class.

L4-09:50 Can an abstract method be declared as private?
    		No, abstract method cannot be declared as private, as they are meant to be used in other classes,
    		so they must be public, or default or protected.

L4-10:48 Can we instantiate abstract classes?
    		Answer is No, since abstract classes are not fully implemented that is why we cannot create objects
    		of them.

L4-11:29 Can we define top level Class as static?
    		Answer is No. static keyword is applicable only for Class members.

L4-12:09 Why do we define members as static?
    		Static keyword is used to define the members independent from any instance.
    		Static members exist independently of any instances created for the class.

    		-> Defining a method static will make it independent of any instance.
    		We can call static members without creating objects, by just invoking them with the classname..


//variables, Methods, Constructors

L6-00:11 What is a variable? What are the types of variable in java?
    		Variable is a name which is given to a memory shell. It is a container that used to store data values.
    		Variable can store primitives or objects.

    		Class can have these variables:

    		Instance Variable [defined inside class, outside the method]
    		Local Variable 		[defined inside a method or block or constructor]
    		Class Variables		[defined in Class and outside any method but with static keyword]

    		//What is the difference between Instance variables , Local variables and Static variables?

L6-04:33 When are static variables loaded in memory?
    		Static variables are loaded in memory at the time of Class loading. i.e,
    		When we load the class, the static members are the first to load.

L6-04:53 Are there any global variables in java?
    		Global variables are generally those variable which can be accessed by other part of program or
    		outside the class.

    		Java does not allow to have global variables. As it does not fit good with the oops.

L6-05:32 Can we declare final variable without initialization?
    		Yes, we can declare final variable without initialisation.
    		-> Such variables are called as Blank Final Variable.
    			 Blank final variable can be static or non-static..

    		This is how we declare blank final variables:

    				private static final int blank_final;

    		We have to initialize  blank final varables before any usage.

    		static blank final variables can be initialised in static block..

L6-08:45 Can we make the local variable final?
    		Yes, we can define a local variable as final.
    		👉🏻 It is the only modifier which is acceptable to a local variable.

L6-09:08 What is Constructor?
    		Constructor is a special kind of method which is used to initialise objects.
    		The name of constructor is same as of its class.

    				class Fan{
    				    Fan(){
    				      //this is constructor.
    				    }
    				}

L6-09:38 What are the various types of constructors?
    		There are three types of constructors..
    		1. default Constructor: if we do not write constructor in program, then this constructor is called automatically.
    		2. Non-Parameterised Constructor : the constructor with no-arguments
    		3. Parameterised Constructor : the constructor with arguments is called as parameterised.

L6:10:56 When constructors are called?
    		Constructor are called at the time we create objects using 'new' keyword.

    		👉🏻 If we have not written any constructor in program then it takes default constructor automatically
    		and initialise the data members with their default values.

L6-16:06 Can a constructor be final or static or abstract?
    		No, Constructor cannot have any Non-access modifiers.

    		-> The constructor can not be final because once we create anything final, then that method cannot
    		be modified by other class, and as the Constructor already can not be overridden or modified by any
    		class, there is no need of final keyword.

    		-> abstract method does not have body. They have only declaration.
    		But constructor cannot lack a body, thats why constructor can not be abstract.

    		-> static members always belong to class, not to any objects. Therefore constructor cannot be static
    		as, they are invoked every time we create objects.

L6-16:57 Can we have return type or any return statement with constructor?
    		No, we cannot have these.

L6-17:06 What is the use of private constructor in Java?
    		private members can only be accessed inside the class, where they are defined. So if we define
    		constructors private, then we can create objects of the Class only in inside that Class internally.
    		No other classes can create object for that.

    		-> So using private constructor we can restrict the caller from creating objects.

L6-19:19 Can a Constructor return any value ?
    		As we know constructors do not have any return type, So a constructor cannot return any explicit value.
    		However constructor returns the instance of the Class implicitly.

L6-19:47 Can an Abstract Class have a constructor?
    		Yes, an abstract Class can have a constructor.

L6-20:01 How we define a method in java?
    		Method is block of code which can be invoked by its name whenever required. In java we write method as,

    		<modifier> <return type> <method name>(datatype args){
    			//method body
    		}

L6-20:30 What is Method signature?
    		The method name and the data type of parameters it have is called as method signature. Like:
    		Method signature for method is,
    				findSum(int a ,int b).

L6-21:06 Does return type of the method is a part of method signature?
    		No, method signature only contain method name and type of arguments.

L6-22:02 What are Static methods?
    		We use static keyword to define static methods. Static methods are used to access static members.

    			Public static int get(){
    			}

    		-> To call static method:
    		 				Addition.get();

L6-22:22 Can we access instance variables inside Static methods?
    		Answer is No, we cannot access instance variable inside static blocks, static methods.
    		Static methods and static blocks can only access static members.

L6-23:24 What are method declarations?
    		When we do not define the body of method, and end it with a semi-colon then that is called method
    		declaration.

    		-> Method declarations are only used in abstract classes and interfaces.

L6-24:15 What are interfaces?
    		An Interface is actually blueprint of a class, which specifies what a Class must do. (not how)
    		i.e, Interfaces does not have implementations of methods, There are only method declarations
    		and all the methods are abstract and public by default.

    				interface InterfaceDemo{
    					void method1();
    					void method2();	//this is method declaration.
    				}

L6-25:57 What is a native method?
    		A native method is a method which is implemented in a non-java language, and is targeted for a
    		single machine type.

L6-26:35 Can we define any method as final?
    		Yes. Methods can be made as final.
    		-> You can define any method final if you want to restrict others to modify the implementation of the
    		 method.

L6-26:53 Can we create object for final class?
    		Yes, we can definitely create an object for final class.
    		Example is class:String. It is a final class.

//OOPS

L7-00:13 What is OOPS?
    OOPS stands for Object Orieted programming System.
    Object oriented programming is a Programming paradigm to write programs based on real world
    objects, in that world, the states and behaviour of an object are the variable and methods.

L7-01:15 What are the advantages of OOPS?
    These are the major advantages of OOPS:
    1. Simplicity:
    	   Since OOPS consists real world objects, so the program structure remains clear to everyone without
         any complexity.
    2. Modularity:
    	   In object oriented paradigm, each object forms a separate entity. For each object, their state,
         behaviour and other internal workings are decoupled from other parts of system.
    3. Modifiability:
    	   With OOPs programming it is easy to change the data representation and methods. Changes inside
         any particular Class do not affect any other part of the program.
    4. Extensibility:
    	   This is about adding New features by modifying some existing modules. OOPs allows to do that.
    5. Maintainability:
    	   The objects can be maintained by fixing problems easier.
    6. Reusability:
    	   Objects can be reused in different programs.

L7-02:37 What are the core concepts of oops?

    1. Data Hiding : hiding the internal data, Securing the internal data
    2. Abstraction : way to segregate implementations from other entities (Hiding internal implementation)
    3. Encapsulation : Grouping of data member and member functions together
    4. Inheritance : Inheritance is the process of creating a new Class from the existing class(Inheriting properties from a class)
    5. Association
    6. Composition
    7. Aggregation
    8. Polymorphism : a particular method that behaves different in different contexts

L8-00:02 What is the difference between Abstraction and Encapsulation?

    Abstraction is implemented using interfaces and abstract classes and Encapsulation is about wrapping
    data members and member functions. This is implemented using private, protected keywords.

    Encapsulation is a concept that is a mix of data hiding and Abstraction. We hide Data from
    unauthenticated access, and implementations from outside world.
    Abstraction is about not showing the internal implementations directly to any other class.

L8-01:04 What is difference between Abstract Class and Interface?

    1. In abstract class, we can have both abstract and concrete methods where as in Interface,
       we can only have abstract methods, they cannot have concrete methods.
       However we can have static, default and private methods in interface.

    2. We can extend only one Abstract Class at a time where as in case of interfaces, we can implement
       any number of interfaces at a time.

    3. In abstract class ‘abstract’ keyword is used to declare a method as abstract, where as in Interface
       all the methods are abstract by default, so no keyword is required to declare methods.

    4. Abstract Class can have static, final or static final variables with any access specifier
       where as in Interface, we can have only static final variable by default.

    So we can use interfaces, when we want to create a service requirement specification for any class.
    and we can use abstract classes to provide a base for subclasses to extend and implement the abstract
    methods and use the implemented methods which are defined in abstract class.

L8-04:09 How can we write static, private and default methods in interface?

L9-00:02 Can we have an abstract class without any abstract method?
    yes.

L9-00:21 Can we have a non-abstract class with abstract methods?
    No.

L9-00:39 Can we create constructor in abstract class?
    Yes. We can create constructor in abstract class. It does not give any compilation error,
    but as we cannot instantiate an Abstract Class so there is no use of creating it.

L9-00:58 What are the various types of inheritance?
    These are the types of inheritance:

    1. Single Inheritance: a single Class extends another class.

        class A{}
        class B extends A{}

    2. Multilevel Inheritance: in this there are multiple level of inheritance.

        class A{}
        class B extends A{}
        class C extends B{}

    3. Multiple Inheritance: A single Class extends more than 1 class.

    👉🏻 Java does not support this type of inheritance, because if a class extends more than one class. then there is chance
       of ambiguity problem if there is any method present with the same name.

       However we may implement more than one interfaces, so multiple inheritance is possible with
       interfaces.

    4. Hierarchical Inheritance: This is about having single base class, and multiple implementation
       classes. i.e, single parent multiple Child classes.

        class A{}
        class B extends A{}
        class C extends A{}

      Java allows this type of inheritance. We can extend a Class in more than one classes.

    5. Hybrid Inheritance: This is the combination of more than one type of inheritance. It is about having
       multiple base and multiple implementation classes.

       👉🏻 It is not supported in java, as we know multiple classes can extend a single Class but a
          single Class can not extend multiple classes.

    6. Cyclic inheritance: A Class extends itself. it is not available in java and not actually required.
       class A extends B{}
       class B extends A{}

       -> all the methods or attributes will be available for use to each other.
       Instead of doing this, one may merge these two classes. So Cyclic inheritance is not required.

L9-04:02 What is Diamond Problem in inheritance?
    In case of multiple inheritance, if a Class extends two classes, then there is chance of ambiguity
    problem. This ambiguity problem is called as Diamond Access problem.

L9-04:32 Why do not we have ambiguity problem with interfaces in case of multiple inheritance?
    We can implement more than one interface. So multiple inheritance is possible as interfaces
    only have declaration of methods, not implementation. If two interfaces have methods with same name,
    then these are only multiple declarations of that method. The implementation will be only one.
    So there is no chance of ambiguity problem.

L9-05:12 What happens when we have default methods of same signatures while implementing multiple interfaces?
    To resolve default method calls,
    We can explicitly specify which default method is to be used, in implementing class.

L9-07:21 What is the difference between Late Binding and Early Binding?
    Binding is the association of a method call with the method definition.
    i.e, when a method is called in java, the program control binds to the memory address where that
    method is defined.

    There are two types of binding in java,
    -> Early Binding | Static Binding
    -> Late Binding | Dynamic Binding

    👉🏻 The Early Binding happens at Compile time, and late binding at Runtime.

    👉🏻 In early binding the method definition and the method call are linked during compile time.
      And that can only happen when all information needed to call a method is available at the compile
      time only.
      -> private, static, and final methods - at compile time.

    👉🏻 In early binding, the Reference Type information is used to resolve method calls, whereas in
       Late binding object information is used.

    👉🏻 As method calls are resolved before run time, Static Binding results in faster execution of a
       program while Dynamic binding results in somewhat slower execution of code.

       However the major advantage of Dynamic binding or method overriding is its flexibility, as a single
       method can handle different type of objects at run time.
       This reduces the size of base code and makes code more readable.

L10-00:02 Can we overload and override static methods?
    Yes we can overload static methods. But we cannot override them. We can define same method with same
    method signature in other Class but that will not be Method overriding.
    Because static method calls are resolved statically, i.e, at compile time.
    And in method overriding, method calls are resolved dynamically.

L10-00:29 What is constructor overloading?
    Constructor overloading allows to have more than one constructor inside the class.
    So in Constructor overloading we have multiple constructors with different signatures, i.e,
    with different arguments.

L10-01:45 What is this keyword in java? ⭐️
    'this' Keyword in java is a reference variable that refers to the current object.
    It holds the current state and behaviour for an object.

L10-05:47 What is super keyword?
    Super keyword is used to refer to Parent Class objects.
    -> When a Derived Class and Base Class has same data members then we may use super keyword to access
       the parent classMembers. same with the methods, we use super keyword with method calls to specify
       that parent Class method will be invoked.

L10-06:24 What is Constructor Chaining in java? ⭐️
    In java, we can call one constructor from another. This is called Constructor Chaining.
    We have this and super keywords for that.
    -> this() is used to call another constructor from a constructor.
    -> super() is used to call the constructor of the super class from the constructor of base class.

L11-00:01 Can we overload main method?
    Apart from the fact that JVM always looks for the main method to launch the program, main method is
    just like other methods.
    We can overload main method too, But JVM never gonna call that overloaded method.
    -> To execute that method we need to call that from the main method only.

        public static void main(){
        //any implementation
        }

        public static void main(String[] args){
        	obj.main();
        }

L11-01:26 Can a final method be overloaded in java?
    Yes, final method can be overloaded but cannot be overridden.

L11-01:36 What is IS-A and HAS-A relationship?
    IS-A relationship implies inheritance. i.e, if class 'A' extends class 'B', then A is-a B.
    For example,

    -> There is a 'Teacher' Class which extends a 'Person'. So here a person is a teacher. and it is
    transitive, like if another class 'MathTeacher' extends 'Teacher' class, then also
    MathTeacher is-a Person.

    -> when a class 'A' has-a member reference variable of type 'B' then A has-a B. for Example,
    College has-a Teacher. This is also known as Aggregation.

L11-02:54 What is Stronger association: Composition or Aggregation?
    Composition is the stronger association than aggregation. Because in composition, the entities are
    highly dependent on each other.

L11-03:09 How OOPs is different than Procedural programming?
    -> Procedural language is based on functions but object oriented language is based on objects.

    -> Procedural language exposes the data for that program, whereas Object oriented language
    encapsulates the data.

    -> Procedural language follows top down programming paradigm, but OOp language follows bottom up
    programming paradigm.

    -> Procedural language is complex in nature, so it is difficult to modify, extend and maintain.
    but OOP language is less complex in nature so it is easier to modify, extend and maintain.

    -> Procedural language provides less scope of code reuse but object oriented language provides more
    scope of code reuse.
