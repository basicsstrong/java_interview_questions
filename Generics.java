
What is Generics in Java ? why we should use Generics?⭐️
    //benefits of using Generics?
    Simply stating generics is a mechanism for type checking at compile time
    Code that uses generics has many benefits over non-generic code:

    1) Stronger type checks at compile time:
    A Java compiler applies strong type checking to generic code
    and issues errors if the code violates type safety.
    Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

    2) Code Reusability

    3) Elimination of casts:
    prior to Java 5 , to get the element back from collection we had to cast it back to correct Type before using it.
    But now If you use generics, then explicit type casting is not required anywhere.

    4) Enabling programmers to implement generic algorithms:
    By using generics, programmers can implement generic algorithms that work on collections
    of different types, can be customized, and are type safe and easier to read.

Which exception we get if we cast an element to wrong type?
    ClassCastException

Can we generify a static method? Can we have a static varible of generic type?
    NO.

What are generic types?
    A generic type is a generic class or interface that is parameterized over types.

Can a generic type extend or implement a non-generic type?
    Yes.

    public class GenericClass<T> extends NonGenericClass{

    }

    public class GenericClass<T> implements NonGenericInterface{

    }

    public class GenericClass<T> extends RawTypeClass{

    }

    public class GenericClass<T> implements RawTypeInterface{

    }

Can a non-generic type extend or implement a generic type?
      Only if we parametrize the with a specific type.

      public class NonGenericClass extends GenericClass<T>{    ❌

      }

      public class NonGenericClass extends GenericClass<String>{  💯

      }


      public class NonGenericClass implements GenericInterface<T>{ ❌

      }

      public class NonGenericClass implements GenericInterface<String>{  💯

      }

What is a Raw-Type?⭐️
    Raw-Type is a generic-type without any type argument.
    ArrayList l = new ArrayList();

Difference between List<String> and raw type List.⭐️
    List listOfRawTypes = new ArrayList();
    listOfRawTypes.add("abc");
    listOfRawTypes.add(123); //compiler will allow this - exception at runtime
    String item = (String) listOfRawTypes.get(0); //explicit cast is required
    item = (String) listOfRawTypes.get(1); //ClassCastException because Integer can not be cast in String

    List<String> listOfString = new ArrayList<>();
    listOfString.add("abcd");
    listOfString.add(1234); //compiler error, better than runtime Exception
    item = listOfString.get(0); //no explicit casting is required - compiler auto cast

Can a generic Type have more than 1 type parameters?⭐️
    yes,  We can create classes having mutiple type parameters.
    a generic type can have multiple type parameters.
    Example: Hashmap<K,V>

Can we add elements of subtype to an object of super type?⭐️
    //Type compatibility  //Substitution Principle
    Yes , if the types are compatible, you can add the elemets or objects.
    Example:
    List<Number> l = new ArrayList<>();
    you can add integer to it. Because Integer is sub-type of Number.

Is sub-typing possible in java?⭐️⭐️
    //sub-typing
    As long as you do not vary the type argument, the subtyping relationship is preserved between the types
    else there is no such thing as sub-typing.

    ArrayList is a sub Type of List.

    List<Integer> list = ArrayList<Integer>();
    So,
    ArrayList<Integer> is also a SubType of List<Integer>
    because types are same.
    But,

    List<Number> list = ArrayList<Integer>();   ❌
    ArrayList<Integer> is not a sub type of List<Number>.

    Also,
    ArrayList<Number> al = Arraylist<Integer>(); ❌
    As we know this is also Not possible, Both Type Arguments should be same.

How to write a generic method? When should we use generic method?⭐️

    public <T> void GenericMethod(List<T> l){

    }
    When the class does not have multiple area to use the type parameter,
    i.e., when we are not needed to generify the whole class then we can generify the perticular method only.

Can we generify constructor?
  As constructors are also special kind of methods, we can generify them.

Can we use Generics with Array?
    No.

What are bounded types? How to Bound a Type parameter?⭐️
    There may be times when you'll want to restrict the kinds of types
    that are allowed to be passed to a type parameter.
    For example, a method that operates on numbers might only want to accept instances
    of Number or its subclasses. This is what bounded type parameters are for.

    To declare a bounded type parameter,
    While creating a generic type or a generic method,
    list the type parameter's name, followed by the extends keyword, followed by its upper bound.

    <Name extends UpperBound>


    Class:

    class MyClass<T extends Number>{}

    Interface:

    interface MyInterface<T extends Number>{}

    Method:

    public <T extends Number> void method(List<T> li){

    }

What is type inference?⭐️
    Type inference is a Java compiler's ability to look at each method invocation and corresponding
    declaration to determine the type argument (or arguments) that make the invocation applicable.
    The inference algorithm determines the types of the arguments and, if available, the type that
    the result is being assigned, or returned. Finally, the inference algorithm tries to find the
    most specific type that works with all of the arguments.

What are Wild Cards in generics?⭐️
    In generic code, the question mark (?), called the wildcard,
    It represents an unknown type.
    The wildcard can be used in a variety of situations:
    as the type of a parameter, field, or local variable; sometimes as a return type
    (though it is better programming practice to be more specific).

What is Bounded and Unbounded wildcards in Generics ?
    <?> represent unbounded type where there is no bound.

    Bounded Wildcards are those which impose bound on Type.
    there are two kinds of Bounded wildcards
    <? extends UpperBound> which impose an upper bound by ensuring that type must be sub class of UpperBound class and
    <? super LowerBound> where its imposing lower bound by ensuring Type must be super class of LowerBound class.

Can we have more than one Bound?
  With type parameters we can have more than one bound but with wildCards we can not.

What are the restrictions on wildcards?

can we use Type parameters and wildcards as return type?
  yes. But wildcard can not be used as the direct return type.

How Generics works in Java? What is type erasure?⭐️

Can you pass List<String> to a method which accepts List<Object>
    No,

    List<Object> objectList;
    List<String> stringList;

    objectList = stringList;  //compilation error incompatible types

Difference between List<Object> and raw-type List in Java?
    Main difference between raw type and parametrized type List<Object> is that,
    compiler will not check type-safety of raw type at compile time but it will do that
    for parametrized type and by using Object as Type it inform compiler that
    it can hold any Type of Object e.g. String or Integer.

Difference between List<?> and List<Object> in Java?
    List<?> is List of unknown type while List<Object> is essentially List of any Type.
    You can assign List<String>, List<Integer> to List<?> but you can not assign List<String> to List<Object>.

    List<?> listOfAnyType;
    List<Object> listOfObject = new ArrayList<Object>();
    List<String> listOfString = new ArrayList<String>();
    List<Integer> listOfInteger = new ArrayList<Integer>();

    listOfAnyType = listOfString; //legal
    listOfAnyType = listOfInteger; //legal
    listOfObjectType = (List<Object>) listOfString; //compiler error - in-convertible types
