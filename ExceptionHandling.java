
What is Exception in Java?⭐️
    Exception is an error event that can happen during the execution of a program
    and disrupts it’s normal flow.

What is the difference between Exception and Error?
    An Error "indicates serious problems that a reasonable application should not try to catch."
    An Exception "indicates conditions that a reasonable application might want to catch."

What are Compile Time Errors, Compile Time Exception, Runtime errors and Runtime Exceptions ?⭐️⭐️
   So on this question let me be very specific..because a lot of people get confused when they listen these terms .
   If you see the exception heirarchy
   all the classes are child of Throwable and see..we have Exception and error.

What is difference between Checked and Unchecked Exception in Java ? Explain Exception heirarchy.
    Main difference between Checked and Unchecked Exception lies in their handling.
    Checked Exception requires to be handled at compile time using try, catch and finally keywords
    or else compiler will flag error.
    This is not a requirement for Unchecked Exceptions.
    Also all exceptions derived from java.lang.Exception classes are checked exception,
    exception those which extends RuntimeException, these are known as unchecked exception in Java.
    You can also check next article for more differences between Checked and Unchecked Exception.

    All Exceptions are Java Objects and falls under Throwable class.
    Other than the exception class there is another subclass called Error which
    is derived from the Throwable class.
    Errors are abnormal conditions that happen in case of severe failures, these
    are not handled by the Java programs.
    For example the Exception class has these subclasses:
    IOExceptionclass, AWTException class, SQLException class,
    InterruptedExceptionclass and RuntimeException Class.

    Again Note that : Errors are also unchecked Exceptions because we can't handle them.⭐️

What is similarity between NullPointerException and ArrayIndexOutOfBoundException in Java?
    Both of them are example of unchecked exception and derived form RuntimeException.

Which of the following combinations are correct or incorrect?

What is difference between throw and throws keyword in Java?
    throw keyword is used to throw exception explicitly from any method or static block
    while throws keyword is used in method declaration, it denotes which exception can possiblly be thrown by this method.
    throw is followed by an instance while throws is followed by exception class name.

How exception is propagated? What is default exception handling?⭐️
    An exception is first thrown from the top of the stack, if it is not caught,
    it drops down the call stack to the previous method and so on until they are caught or until they reach the very bottom of the call stack that means up to main method.
    This is called exception propagation.

What is Exception chaining in Java?
    Exception chaining is a popular exception handling concept in Java,
    where another exception is thrown in response of an exception and creating a chain of Exceptions.
    This technique mostly used to wrap a checked exception into an unchecked or RuntimeException.

How to write custom Exception in Java?why we use custom or user defined exceptions?⭐️
    Customized exceptions or user defined exceptions are the exceptions which are created by Programmer to achieve programming requirements.
    In java we can create our own exceptions, by creating class under Exception hirearchy, and throw them on a particular condition.
    We can define exceptions checked or unchecked, by extending Exception or RuntimeException.
    Making custom exception checked, will bound us to handle those exceptions.
    And if Custom exception are unchecked, we can simply throw them, hence these exceptions should be defined as unchecked.

Does code form finally executes if method returns before finally block or JVM exits ?
     finally block in Java executes even when return keyword is used in try block.
     but when you call System.exit(0) from try block, it will not execute.

What is difference in final, finalize and finally keyword in Java?⭐️
    Final class can't be inherited,
    final method can't be overridden and
    final variable value can't be changed.

    Finally is used to place important code,
    it will be executed whether exception is handled or not.

    Finalize is used to perform clean up processing just before object is garbage collected.

What is the purpose of using multiple catch Blocks? can we catch Exception before FileNotFoundException?
    We can catch different exceptions by using multiple catch blocks in a proper hierarchy.
    For example you have to handle more than one Exception
    that may be thrown from the code written inside the try block,
    then that can be handled by two diff catch blocks,

    we can not catch exception first because its higher in heirarchy than FlieNotFoundException.
    So we catch the most specific first.
    In case, there is not parent-child relation or if Exceptions we are catching are at same level in heirarchy
    then order does not matter.

What is Java 7's multi-catch block?
    if we catch a lot of exception in a single try block, the catch block code looks very ugly,
    That is why, to reduce length of code,
    we can use a single catch with multiple exception seperated by single pipelines if handling for all of
    those exceptions is going to be same.
    This is taken as an improvent or enhancement in java 1.7.
    Hence, Single catch block can be written to handle different type of exceptions
    and it is called multi-catch block.

What is Java 7's automatic resource management Feature?⭐️
    Basically try with resources is a try statement that declares one or more resources.
    It ensures that each resource that we used in our program is closed at the end of try block.
    so it is like an alternate of finally block, which we use for the same purpose.
    In ARM We are not responsible to close the resource.

What best practices you follow while doing Exception handling in Java ?⭐️
    1. is To clean up the resources gracefully after using them.
    2. Always correctly wrap the exceptions in custom exceptions so that stack trace is not lost
    3. Exception handling should be used wisely -no overuse
    4. we can Either log the exception or throw it but never do the both.
    5. Logging Exception
    6. define exception handling strategy at the design time
    7. Know when to Throw checked and when to throw unchecked exception
    8. Throw exception as early as possible
    9. Catch late / catch as early as we know how to handle the issue properly

    DeliverGifts
      packGifts
        giftSelector
          GiftManufecturer

What is wrong with following code in Java:

    public class SuperClass {
        public void start() throws IOException{
            throw new IOException("can't operate on file");
        }
    }

    public class SubClass extends SuperClass{
        public void start() throws Exception{
            throw new Exception("Not able to start");
        }
    }

    In this code compiler will complain on sub class where start() method gets overridden.
    As per rules of method overriding in Java, an overridden method can not throw Checked Exception
    which is higher in hierarchy than original method.
    Since here start() is throwing IOException in super class, start() in sub class can only
    throw either IOException or any sub class of IOException but not super class of IOException e.g. Exception.

What is wrong with following Java Exception code:

    public static void start(){
       System.out.println("Executing start!");
    }

    public static void main(String args[]) {
       try{
          start();
       }catch(Exception e){
          e.printStackTrace();
       }
    }

    IOException is a checked Exception
    and start() method doesn't throw IOException,
    so compiler will flag error as "exception java.io.IOException is never thrown in body of corresponding try statement",
    but if you change IOException to Exception compiler error will disappear
    because Exception can be used to catch all RuntimeException which doesn't require declaration in throws clause
    because compiler can not check for RuntimeExceptions.
