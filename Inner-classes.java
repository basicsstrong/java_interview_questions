
What is Inner class?
    Any Class which is not a top level Class or any Class which is declared inside another Class
    is Inner class.

    class OuterClass{
    	class InnerClass{
    	    public void display(){
            System.out.println("Inner class.");
          }
    	}
    }

What are the types of Inner classes?⭐️
    There are following types of such classes:
    1. Member Inner class | Regular Inner class
    2. Local Inner class
    3. Anonymous Inner Class
    4. Static Nested Class

What is Member Inner Class?⭐️
    Member Inner Class is just regular inner Class which is not static member of the outer class.
    It acts as other instance member of that class.

    class OuterClass{
      class InnerClass{
          public void display(){
            System.out.println("Inner class.");
          }
      }
    }

    -> Class Inner behaves as instance member of this Class Outer.
    -> To access this class, we must create the object of Outer Class.

    The Member inner classes can be private protected public final <default> abstract etc.

What is the difference between Static nested Class and Member Inner class?⭐️

    Static Nested Class is the Class which is declared inside another Class with static modifier.

    class Demo{
    	static class Nested{
    		public void method(){
          System.out.println("Static Nested class.");
        }
    	}
    }

    👉🏻 To create the instance of Member Inner class, an instance of Outer Class is required.
      Whereas static nested Class does not require any outer Class instances. It can be Accessed just
      like other static members of that class.

    Demo.Nested obj = new Demo.Nested();
    Obj.method();

    👉🏻 In Member Inner class/ Non-static Nested class, we can access all the static and instance variables of the outer class.
       Whereas, inside static nested class, we can only access the static variables of outer class.

    👉🏻 We can not declare static methods inside Regular inner classes whereas in static nested classes,
       we can do so.
       So we can declare main method in static nested class, whereas in regular inner classes we cannot.

    👉🏻 We can Import Nested Static Class with static import, whereas we normally Import the non
       static nested classes.

What are Local Inner Classes?⭐️
    Local inner classes are those classes which are declared inside a code block or a method.

    class Main{
    	private String info = "Outer Class Member";

    	public void method1(){
    	   class Printer{
    		public void printInfo(){
    			System.out.println(info);
    		}
    	   }
    	}
    }

    -> Local inner classes can be used to define specific required functionality for that particular method.

    👉🏻 Local Inner Class is a member of the method, so their scope is limited to that particular
       method only; Local inner classes are the most rarely used inner classes.

Can we access local variable of the wrapping method inside local inner class?
    Yes, we can access final or non-final local variables in local inner class, But We can not modify them.
    If we Try to modify them, compiler will raise error.

What access modifiers can be used with Local inner classes?
    Local inner is the local member of method, so it can not be declared as public private protected.
    👉🏻 Local inner classes can only be final or abstract.

What is Anonymous Inner class?⭐️⭐️
    Anonymous Inner Class is a Class which does not have name to reference and initialised at the same
    place where it gets created.
    👉🏻 For anonymous inner classes, only a single object is created.

    Note: An Anonymous Inner Class always extend a Class or implement an interface.

When should we use Anonymous inner classes?
    -> An Anonymous Inner Class can be used while making an instance of an object with certain additional
    functionalities such as overloading methods of a class, or interface, without having actually any
    subclass.

    For example, Anonymous inner classes are common to extend Thread Class in order to override run method.

    Similarly we can also create anonymous inner class, by implementing runnable interface.

    -> Also Anonymous inner classes can be frequently used in GUI based applications for event handling.
       We can write implementation classes for listener interfaces in graphics programming using them..

Can we create constructor in anonymous inner class?
    We know the constructor has the same name as of the class. We can create constructor explicitly in
    all other types of inner classes and static nested class.

    But in the case of Anonymous inner class, we do not have the name of the class.
    👉🏻 We cannot write any constructor explicitly in anonymous inner class.

What are differences between an Anonymous Inner Class and a normal class?
    Both are different in many ways:

    1. A normal Class can extend one Class and implement many interfaces at the same time, whereas
       the Anonymous Inner Class can either extend one Class or implement one Interface at a time.

    2. We write constructors in normal class, which are invoked at the time of instance creation.
       But we cannot write any constructor in anonymous inner class.
       👉🏻 These classes are initialised at the time of creation itself with the default constructor.

    3. We write normal classes for our standard requirements whereas we write anonymous inner classes
       when we do not need any separate Class for some temporary requirements,
       or when we need to provide implementations to methods for a single object.

Can we have static members inside anonymous inner classes?
    No, we cannot declare static data members or static member function inside anonymous inner class.
      -> In-fact we can not define any static member inside any inner class. we can do so only in
      Static nested classes.

What are the ways of creating Anonymous inner classes?⭐️
    Ways to Create anonymous inner classes,
    1. By extending a class:

        Thread t = new Thread(){
      		public void run(){
      			System.out.println("Anonymous inner Thread");
      		}
      	  };
      	t.start();

    2. By implementing an interface:

      	Runnable r = new Runnable() {
      		@Override
      		public void run() {
      			System.out.println("Runnable");
      		}
      	} ;
      	Thread th = new Thread(r);
      	th.start();

    3. Defining inside any method or constructor argument:

      	Thread t = new Thread(new Runnable(){
      		public void run(){
          			System.out.println("Child Thread");
      	}
      	}}).start();

What are the advantages of inner classes?
    We use nested Class when it is useful to only one class. So keeping them together helps in the
    packaging of the classes.

    By using Inner classes we develop more readable and maintainable code, because it logically
    groups the classes in one place.

    With inner classes we can access outer Class private members and at the same time we can hide
    inner Class from the outer world. Inner classes implements encapsulation.

    We also optimize the code by writing inner classes as it requires less code to write.

Can we write Nested Interface inside an Interface?
    Answer is Yes.
    When an Interface is required for one Interface only then we may write Interface inside Interface.

    for example,
    In Map Interface we have the Interface Entry, which is used for Map only.
    Entry represents a key-value pair inside map.

    👉🏻 The inner interfaces which are declared inside Interface are always public and static,
       even if we do not make them public or static explicitly.

    👉🏻 Inner interfaces can be implemented independently.

Is it possible to define Interface inside Class or Class inside interface?
    Answer is Yes. Both cases are possible.

    If we define Interface inside class, it is always static.
    We can declare it as private public or protected according to our requirement.

          class Demo{
          	public interface Inner{
          	}
          }

    And if any Class is closely associated with any Interface then it may be defined inside the interface.

    For example, class EmailDetails is required for the interface EmailService.
    So we can define it inside this interface.

        interface EmailService{
        	public void sendMail(EmailDetails e);
        	class EmailDetails{
        	..
        	..
        	}
        }

    Note: If we implement the Interface with its own inner Class then it is called as its default implementation.
