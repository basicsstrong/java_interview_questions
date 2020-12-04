-----JVM----

L1-00:40 What do you mean by Virtual Machine?
    A software program that simulates behaviour of a physical machine, which can perform operations
    like any other physical machine. For example,
    -> VMWare is the system based virtual machine
    -> JVM is the Application based virtual machine

L1-01:17 What is JVM?
    "Java Virtual Machine"
    Basically JVM provides runtime environment in which Java programs are executed.
    First the java programs get compiled and converted into byte code.
    JVM is responsible for loading Class files and executing that byte code.

-> What makes Java platform independent? Or what you mean by 'write once, run anywhere'?⭐️
    JVM converts the byte code to the machine specific code i.e,
    one java program can be executed on any type operating system because of JVM.
    That is why we need different kinds of JVM for different Operating systems.

L1-02:36 Is JVM, a compiler or interpreter ?⭐️
    JVM is an interpreter.

L1-02:45 What are JRE, JDK? how these are different from JVM?⭐️
    JRE: JRE stands for Java runtime environment and JVM is actually an implementation of JRE.
    It consists of set of libraries like jar files and other files that JVM uses at runtime.
    so it is different from JVM as it only contains the environment to execute java program.

    JDK: The Java development kit consists more than JRE, as it provides all the tools which
    are used to develop java applications along with tools and executable required to compile,
    debug and execute java program.

L1-04:25 How JVM works?⭐️
    We know, JVM is a runtime engine to run the java applications.. when we write a java file..
    the compiler creates the Class file having the byte code.. This .class file goes into various steps.

L2-00:17 What is Classloader?⭐️
    Class loader is a set of components which loads the classes during runtime into JVM.
    These classes are not loaded all at once, when the application requires that particular class or we can say
    when we try to use a Class, Java ClassLoader loads that class into memory.

L2-00:43 What activities are performed by the classloader subsystem?
    Class loader subsystem is responsible to perform these three activities:
	     1.Loading
	     2.Linking
	     3.Initialization

       Loading: The classloader reads the class and generates the binary data.
       This binary data get stored inside method area.
                Method area - class related data gets stored.
       With all the class info, JVM creates an object of Type : java.lang.Class for that loaded class in
       heap area.
       This 'java.lang.Class' class object provides complete information for that class.

02:30  -> If we call a class more than once, will there be more than one java.lang.Class object for that
       class?
            NO. Even though we call the class multiple times but in the heap area there will be only one
            Class class object, because one Class class object for that particular class is enough to
            provide information for that class. For any new object the class information will remain same.

        Linking: It consists of three activities..
                Verify
                Prepare
                Resolve

            Verification: Bytecode verifier ensures that code passed to java interpreter is in a fit state
            to be executed.
            This is also a reason why JAVA is secure..

            Preparation: JVM allocates memory to class level variables and assign default values to them.

            Resolution: JVM replaces symbolic names with original memory references from method area.
                        class Demo{
                          public static void public static void main(String[] args) {
                            String s = ...
                            Student s1 = new Student();
                          }
                        }

                    Constant Pool of Demo : Demo, String, Student
              In resolution, these names will get replaced with memory level references from method area.

        Initialization: -> Original value get assigned to the static variables.
                        -> Static blocks get executed from parent to child and top to bottom in this phase.

        Note: While loading linking initialisation any error occurs,
        then we will get runtime exception saying java.lang.linkage error.

L2-07:14 What are the different class loaders used by JVM?
    There are three diff class loaders, each of them has a predefined location from where they loads class.

    Bootstrap Class Loader | Primordial Class loader:

        It is responsible to load the classes which are present in bootstrap path (jdk->jre->lib->rt.jar)
        like, rt.jar..
        rt.jar -> core java apis.
        so this Class loader loads the core java api classes.

        This Class loader is parent of all other class loaders in java. It is not implemented in java.

    Extension Class Loader:

        This Class loader is responsible to load classes from the extension path. (jre/lib/ext/'*'.jar)
        Extension Class loader is the implementation of Bootstrap Class loader.
        It is implemented by sun.misc.Launcher$ExtClassLoader

    Application Class loader | System Class loader:

        It is responsible for loading the classes from the CLASSPATH environment variable.
        This is the child class of Extension Class loader.
        It is implemented by sun.misc.Launcher$AppClassLoader.

    Note: Except the bootstrap classloader which is only implemented in native languages not in java,
    all the classloader are implemented using java.lang.ClassLoader.

L2-09:28 How does JVM load the classes?⭐️
    The classloader subsystem works on the delegation principle. One classloader delegates the
    responsibility for loading the class to their parent and if it doesn't work, then they loads the class
    by themselves

 What is the difference between static and dynamic class loading?⭐️

L2-12:30 What is difference between Class.forName() and ClassLoader.loadClass()?⭐️
    Both methods try to load classes dynamically.

    The most common method is Class.forName(). By default the classes get initialised using this method.

    loadClass() is an instance method and requires a particular ClassLoader to load the class.

    By default the classes does not get initialised in this.

//Memory Areas
L3-00:12 What are the various memory areas present in JVM?⭐️
    JVM has 5 different memory areas ..
    1. Method area
    2. Stack area
    3. Heap area
    4. PC Registers
    5. Native method area

L3-00:30 Which memory area is used to store Static variables?
    JVM stores the Class level information in the Method area.
    Class level information consists Class name, parent Class name, Method info, Variables info,
    Constructors, Modifiers info, Constant pool info etc.

    Whenever we start JVM, a method area gets created,
    👉🏻 and that will be shared among all JVM threads.

L3-01:14 When are the static variables loaded in memory?
    Static variables get loaded at the time of Class loading and gets stored in the method area.

L3-01:31 What is Heap space in Java?⭐️
    Heap memory in JVM is used to store objects and corresponding instance variables.
    👉🏻 Whenever we create objects, it is always created in Heap space.

    Heap area gets created when we start JVM
    👉🏻 Heap area is shared among all the threads.

    Method and heap area need not be continuous.

L3-02:10 What is String pool?⭐️
    String pool or string intern pool is a special storage area in Heap space.
    When we create a string, it gets stored to the string pool, so that if any other string will get
    created which exists in the pool then instead of creating new object,
    the reference of existing string will be returned.

L3-03:04 What is Stack? What it stores?⭐️
    Stack is a part of memory that stores each method call performed by that thread including primitives
    and local variables.

    👉🏻 For every thread, a new runtime stack gets created..

L3-05:42 What is stack frame? What does it consist?
    Each entry in stack is called stack frame.
    1. Local Variable Array
            -> Which store local variables and corresponding values related to any method.
    2. Operand Stack
            -> It is a runtime workspace for JVM, to perform any intermediate operations.
    3. Frame data
            -> All symbols corresponding to any method are stored here.

    👉🏻 For every method call one stack frame is created.

How stack and heap are interrelated?⭐️
    We know Local variables are stored on the stack, and all the objects in java are stored on the
    Heap area.
    👉🏻 For every object on the heap, there is a pointer which is the reference to that object.
    This reference variable is also stored on the stack. This is how Stack and heap are interrelated..

How to get information about heap memory?
    We know the java application can communicate directly with JVM via runtime class.
    Runtime Class provides various methods from which we can get information about memory.

    We create Runtime instance via method getInstance(), because this Class is Singleton class.

    Runtime r = Runtime.getInstance();
    r.maxMemory();
    //this method returns the maximum amount of memory that the Java virtual machine will attempt to use.

    r.totalMemory()		//this returns the total amount of memory in the Java virtual machine.

    r.freeMemory();		//this returns the amount of free memory in the Java Virtual Machine.

What happens when there is not enough Heap Space for storing new objects?⭐️
    JVM tries to free up space but if it fails then JVM throws java.lang.OutOfMemoryError.

How to set minimum and maximum heap size??
    By using -Xmx we can specify the maximum heap size for any program..
    And -Xms to set the minimum heap size..

    $ java -Xms512m -Xmx1024m <classname>

Why do member variables have default values whereas local variables do not have any default value ?
    In java, ClassLoader is responsible to load the Class and while loading the Class they initialize
    the static variable and blocks.

    JVM does not have any idea about local variables at the time of Class loading, therefore
    local variables do not have any default values.

What PC registers are for?
    👉🏻 Every thread has separate PC register.
    PC registers is used to hold the address of current executing instruction. when the instruction gets
    executed the PC register will be updated with the next one.

What is Native Method Stack?
    It is another memory space of JVM which stores the native method information.
    👉🏻 for every thread, there will be a separated native method stack.

//Execution Engine

What is Execution engine? What it does?
    Execution engine is the component in JVM which is responsible to execute the byte code which is
    assigned to the runtime data area.

    It has following sub-components:
    1. Interpreter
    2. JIT compiler
    3. Garbage collector

What is Interpreter?
    Interpreter is a program that reads byte code in the sequential manner (line by line).
      it runs the application by accepting file name argument from the command line,

      java <compiled file name>

What are the limitations interpreter has?
    Interpreter interprets fast but executes slow!
    The limitation is, when a code of block or one method is called multiple times,
    every time a new interpretation is required.

What is JIT compiler?⭐️
    It stands for Just-in-time compiler.
    It compiles those byte code parts which are having similar functionality at the same time.

Sub components of JIT compiler:
    1. Intermediate code generator: it produces intermediate code.
    2. Code Optimizer: Responsible for optimizing that intermediate code.
    3. Target code generator: Responsible for generating native code!
    4. Profiler: Responsible for finding the hot code! It finds which method is called multiple times.

What is Garbage collector?
    It is the component of Execution engine which frees up the memory by collecting and removing
    the unreferenced objects.

//

What is garbage collection?
    Garbage is unused and unreferenced objects, and Garbage collection is the process inside JVM which
    identifies and discards those objects which are no longer required in the application.

    ->It is a mechanism of JVM to reclaim heap space from objects which are eligible for garbage collection.

Which objects are eligible for garbage collection?
    Any object on the heap which unreachable through a reference from the stack is eligible for garbage
    collection.

Is programmer responsible to destroy objects?⭐️
    No! In java programmer need not to worry for this. Garbage collector destroys the objects which are no
    longer in use.
    Before calling garbage collector, it is recommended to make the unused object available for garbage
    collection.

How to make an object available for garbage collection?⭐️
    There are 4 ways to do so,

    1. Nullifying the reference variable: by doing so the object in heap will be unreachable from the stack.

    2. Reassigning the reference variable: the variable gets assigned with new object and the older one gets
                                          unreferenced from stack..

    3. Object inside method: we know for every method call the stack has a stack frame, which consists of
                            all of its members. When a method is executed the stack frame is popped out from
                            stack and thus all of its members get unreferenced from the stack.

    4. Creating anonymous object: we know an anonymous object is not referenced, so it is eligible for
                                  garbage collection.

How to call garbage collector?
    The most common way to invoke garbage collector is by invoking gc method of system class.
          System.gc();

    Other way is to invoke gc method with Runtime class.
          Runtime.getRuntime().gc();

    This method suggests the JVM to recycle the unused objects in order to make the memory available for
    future allocation.

Can you guarantee that invoking gc will definitely call garbage collector?⭐️
    By invoking gc, we just request or suggest JVM to call garbage collector. But there is no guarantee
    that the Java virtual machine will do that. So answer is no!

If an object reference is set to null, will the Garbage Collector immediately free the memory held by
that object ?
    No, the object will be available for garbage collection in the next cycle of the garbage collector.

When should we call garbage collector to run?
    When we are executing multiple blocks of code and after executing one block
    -> if we want to free the memory so that the next block of code may execute more efficiently
    -> if you are trying to get more accurate evaluation and want to start those code block with the same
    state as we started the very first block..
    .. then we may call the gc.

Why is it bad idea to run gc?
    As we know we can not guarantee that the garbage collector will process when we call gc, so we should
    just do not bother to do it.
    Because when we call gc, Garbage collection temporarily stops all threads in our application for running.
    When garbage collection takes place our application is temporarily suspended.. and it would not resume
    until the gc process complete.
    This 'stops the world!' That is, running garbage collection can cause an unacceptable freeze in
    execution.

When is the finalize() method gets called? What is the purpose of calling it?
    Finalise method is a special method present in object class. That means every class can override this
    method.
    when we call the gc, it calls the finalise method before performing the clean up activity. This allows
    programmer to perform other clean up activities too
    -> like releasing any system resource, closing connections..

    So when it is called? It is called before performing garbage collection.

    However we can not be assured that the finalise method will be called when we call the gc..
    We don't have any idea that the method is going to be called or not or when this method will going to
    be called.

Why we should not use finalize() method?⭐️

    There is no assurance that finalize method will get called. Therefore it gets useless sometimes to put
    any clean up code in the finalise method.

So there is no use of finalize method?
    We can use this method to check that are the rosaries are closed or not?
    So you may not use finalize method to correct the problem but at least send out a warning that
    something could be wrong.

What are memory leaks? What are soft references?
    memory leak is a scenario that occurs when objects are no longer being used by the application,
    but the Garbage Collector is unable to remove them from working memory – because they’re still being referenced.
     As a result, the application consumes more and more resources – which eventually leads to OutOfMemoryError.

    Soft leaks: it may be possible that any objects are not being used for years but any third party API or
    any other thing is there for keeping it live.. these kind of objects should be garbaged but they are
    not because they are somehow referenced from stack.⭐️
