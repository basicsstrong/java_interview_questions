
L1-01:00 What is enum?
    Enum is a special type in java that is used to define collection of constants.
    Enum of colours:

      enum Color{
	       Red,Green,Blue,White,Black;
      }

      This is how we declare enum.
      -> Semicolon is not mandatory if we are having only constants in enum.
      -> By using enum, we can create our own data type.
          👉🏻 Data type of Red is 'Color'.

L1-01:40 Where can we declare 'enum' type?
    Enum can be declared outside the class, and also inside the class.
    Note: Inside method we cannot create enum.

L1-01:55 How to access Enum constants?
    Every 'enum' constant is static, so We access 'enum' constants using the Enum name.

      System.out.println(Color.Red);

L1-02:14 How to get all constants of enum?
    For that we have values() method, that can be invoked with the enum name or enum instance.

    Color[] colors = Color.values();
    for(Color c : colors){
	     System.out.println(c);
     }

    👉🏻 Enum provides values() method implicitly. It is not present in Enum Class or Object class.

L1-02:41 Whats difference between the enum, Enum, and Enumeration?
    1. enum: It is a keyword to declare group of constants.

    2. Enum: It is base Class for all enums.
       👉🏻 Every 'enum' is direct child Class of Enum class.

    3. Enumeration: It is an Interface present in java.util Package.
                    It is a cursor that is used to get objects one by one from collection.

L1-05:33 Can an 'enum' be declared as final?
    No. enum is implicitly final. They can not be declared final explicitly.

L1-05:47 What modifiers are allowed to be used with enum?
    'enum' can be public, <default>, strictfp.
    If it is declared inside the class, then it can also be private, protected and static.

    👉🏻 'enum' can not be abstract as they are implicitly final.

L1-06:08 Can an 'enum' extend any class?
    No. Every 'enum' is direct subClass of java.lang.Enum class.
    -> Since java does not provide support for multiple inheritance hence,
    👉🏻 It is not possible to extend Class with enum.

L1-06:26 Can 'enum' have implementation classes?
    No. enum cannot have subclasses because they are final implicitly.

06:44 Can 'enum' implement interfaces?
    Yes. enum is a type just like Class and interfaces.
    👉🏻 'enum' can implement interfaces.

L1-07:03 Can we have Constructor in enum?
    Answer is yes! We can have Constructors as well as methods and variables inside the enum.

    Consider an enum Week, it can have constructor, other data members and methods:

      enum Week{
      	Sun,Mon,Tue,Wed,Thu,Fri,Sat;
      	int a;
      	Week(){

      	}
      	public void m1(){}
      }

L1-07:38 How constructors are invoked in enum?
    Answer is, every time we load the enum, the constructor is invoked.

    Every 'enum' constant is considered as 'enum' object.
    Whenever 'enum' gets loaded, for every 'enum' Constant, constructor will be invoked.

L2-00:00 Can we create 'enum' object explicitly?
    No. We can not create 'enum' object with new keyword.
    Because if we want to create any new object w of type Week enum, then we can declare w as enum constant! So there is no need of creating enum object explicitly ..
    -> Week w:
                enum Week{
                  Sun,Mon,Tue,Wed,Thu,Fri,Sat,w;
                }

                Week w = new Week(); ❌

L2-00:32 Can we create parameterised constructors in enum? If yes then how to pass value to constructor?
    Yes, we can create parameterised constructors in enum.
        Sun("Holiday")

L2-04:18 Can 'enum' have abstract methods?
    No. Because Enum are final.

L2-04:37 Can we override toString() method for enum?
    Yes. We can override toString in Enum like any other class.
    -> But there is no need to overriding it, because Enum Class has already overridden the toString
    for every enum.

    Week w2 = Week.Wed;
    w2.toString();

    👉🏻 There is no need to call toString explicitly, because if we print any 'enum' constant,
       then by default it takes .toString() internally.

L2-05:43 Can we create 'enum' constant outside of enum?
    Answer is no, we can only create 'enum' constant inside its enum.

L2-06:08 Can constructors be public in enums?
    No constructors can not be public or protected either.

L2-06:18 What does ordinal() method do?
    Ordinal method returns order of the 'enum' constant.

L2-07:09 Can we use Enum with TreeSet or TreeMap in Java?
    Yes. We know we can use comparable types with treeSet or treeMap.
    👉🏻 Since Enum by default impalements Comparable interface, they can be used inside TreeSet or TreeMap.

L2-07:33 Can we use Enum in switch case in Java?
    Yes. Enum instances are constants so we can use them inside switch case.

      switch(Week){
                  case Sun:
                      System.out.println("Peaceful day");
                      break;
                  case Mon:
                      System.out.println("Back to work.");
                      break;
                  case Sat :
                      System.out.println("Party Time!");
                      break;
      	          default:
      		            System.out.println("Work Work Work.");
                  }

L2-08:07 Is Enum serializable in java?
    Yes, Java enums are automatically serializable as Enum Class implements Serializable interface.

L2-08:32 How to convert a String to Enum in Java?
    The String can be converted to 'enum' by using valueOf() method.
    The 'enum' type provides valueOf() method which takes a String as an argument and returns
    corresponding 'enum' object.

L2-10:03 What are benefits of using 'enum' in java?
    👉🏻 'enum' are type safe, We cannot assign anything else other than those predefined constants of enum.

    👉🏻 'enum' has its own namespace.

    👉🏻 We can use 'enum' with switch case..
