
L1-00:19 What is MultiThreading and its Purpose?
  Its a way to achieve multi-tasking in java.

  Multi-tasking is acheived in 2 ways:
  1. Process Based
  2. Thread Based is Multi-MultiThreading

 What is Thread? ⭐️
  Thread is separate path of execution in program.
  Threads are, Light weight,They share the same address space. creating thread is simple
  when compared to process because creating thread requires less resources when compared to
  process.

How to create a Thread? How to acheive Multi-Threading programmatically using Threads?
  1. By extending Thread Class
  2. By implementing Runnable Interface

Which approach is better? ⭐️
  implementing Runnable is a better approach.

What is Main Thread?
  Thread responsible to execute the main method.

why we call start method? can't we directly call run method? ⭐️
  If we directly call run method..
  then we are calling a normal method without creating a new thread.
  that is run method will behave as normal method and now child thread will not get started
  and there will only be main thread that will execute this run method.

  Start Method:
  Registering the thread with Thread Scheduler
  Perform all the mandatory activities
  invoke run

Can we overload the run method?
  yes ,but that start method written in Thread class invokes the no argument run method.
  so if you overload the run method,
  the run method that will get invoked by the start method will
  only be the one with no arguments.

Can we override the start method?
  It will not execute the necessary steps that thread class start method is having.
  Thats why you should not override the start method.
  still if you want to override the start method,
  you can first call the super of Thread class using super.start() and then can give additional implementation.

What is Thread Scheduler?
  It is a part of JVM.
  It is responsible for the order in which the threads get executed
  and there is no assurity of the algorithm used by the scheduler to order
  the threads. It varies from JVM to JVM

Explain the life-cycle of a Thread?
    A thread can be in any of the five states :
    New : When the instance of thread is created it will be in New state.
    Ex : Thread t= new Thread();
    In the above example t is in new state.
    The thread is created but not in active state to make it active,
    we need to call start() method on it.


    Runnable state : A thread can be in the runnable state in either of the following
     two ways :
     When the start method is invoked or
     A thread can also be in runnable state after coming back from blocked or sleeping
     or waiting state.

    Running state : If thread scheduler allocates cpu time, then the thread will be
    in running state.

    Blocking/ Waiting / sleeping states : In this state the thread can be made temprorily
    inactive for a short period of time
    the above state in any of the following ways:
    1) The thread waits to acquire lock of an object.
    2) The thread waits for another thread to complete.
    3) The thread waits for notification of other thread.

    Dead State : A thread is in dead state when thread’s run method execution
    is complete. It dies automatically when thread’'s run method execution is completed
    and the thread object will be garbage collected.

//sleep(), yield(), join(), Thread name, Thread Groups, Thread Priorities....

What are thread priorities and importance of thread priorities in java?
  Thread priorities determine which thread to run. Every thread has a priority.
  A thread inherits priority of its parent thread.
  By default thread has normal priority of 5.
  Thread scheduler uses thread priorities to decide when each thread is allowed to run.
  Thread scheduler runs higher priority threads first.

Explain different types of thread priorities ?
    Every thread in java has priority in between 1 to 10.
    By default priority is 5 (Thread.NORM_PRIORITY).
    The maximum priority would be 10 and minimum is 1.
    Thread class defines the following constants(static final variables) to define properties.
    Thread. MIN_PRIORITY = 1;
    Thread.NORM_PRIORITY=5;
    Thread. MAX_PRIORITY=10;

How to change the priority of thread or how to set priority of thread?
    Thread class has a set method to set the priority of thread
    Signature : final void setPriority(int value);
    The setPriority() method is a request to JVM to set the priority. JVM may or may not oblige the request.
    We can get the priority of current thread by using getPriority() method of Thread class.
    final int getPriority() {
    }

If two threads have same priority which thread will be executed first ?
    We are not guaranteed which thread will be executed first when there are threads with equal priorities.
    It depends on thread scheduler that which thread to execute.

What all methods are used to prevent thread execution ?
    There are three methods in Thread class which prevents execution of thread.
    1) yield()
    2) join()
    3) sleep()

Explain yield() method in thread class ?
    Yield() method makes the current running thread to move in to runnable state from running state
    giving chance to remaining threads of equal priority which are in waiting state.
    yield() makes current thread to sleep for a specified amount of time.T
    here is no guarantee that moving a current running thread from runnable to running state.
    It all depends on thread scheduler it doesn’t guarantee anything.

Explain how join method works?
    A thread can invoke the join() method on other thread to wait for other thread to complete its
    execution. Assume we have two threads, t1 and t2 threads .
    A running thread t1 invokes join() on thread t2 then t1 thread will wait in to waiting state until t2 completes.
    Once t2 completes the execution, t1 will continue.
    join() method throws Interrupted Exception so when ever we use join() method
    we should handle Interrrupted Exception by throws or by using try catch block.

Explain purpose of sleep() method in java?
    sleep() method causes current running thread to sleep for specified amount of time .
    Now lets see the syntaX:
    first one: public static native void sleep(long ms). //its a native one not written in java
    second one: public static void sleep(long ms,int ns).

    there is no sleep method with no argument..with sleep there must be the interval for which we want to
    make the thread sleep.

Explain about interrupt() method of thread class ?
    If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
    calling the interrupt() method on the thread, breaks out the sleeping or waiting state
    throwing InterruptedException. This is reason we need to handle interrupted exception with throws
    or try/ catch block.

What is Race Condition and when it occur?⭐️
    when more than one thread operate on same object without proper synchronization
    then the thread operations interleaves on each other.
    that is, one thread is modifying the object data and in some intermediate state where
    the updation is not yet completed some other thread performs modification on
    the intermediate data resulting to data inconsistency.
    and this condition is called race condition.
    this happens when the operations that the threads are performing
    are non-atomic and this is why thread operation interleaves on each other.

What are atomic and non atomic operations? Can volatile make a non-atomic operation to atomic?
    Atomic operations take place in one step.
    where as non-atomic operations takes place in multiple steps internally.
    java provides volatile keyword to make assignment or read or write operations atomic.
  	we can use volatile before long and double and boolean to avoid data inconsistency.
  	but you can't do anything compound such as incrementing it safely, because that's a read/modify/
  	write cycle.

What is Synchronization?
	we can guard the critical section to avoid data inconsistency so that only one thread have access or execute
  this section of the code at a time.
	that is only one thread enters this section at at a time
  and when it exits other thread can enter this section.

what is critical section?
	A critical section in java multithreading is a piece of code that access shared resources.
	that is why there are chances of data inconsistency or race condition if multiple threads operate simultaneously.

What are the ways to acheive synchronization?
  Two ways:
  1.Synchronized methods
  2.Synchronized blocks

When a thread is executing synchronized methods ,
then is it possible to execute other synchronized methods simultaneously by other threads on the same object?
      No it is not possible to execute synchronized methods by other threads on the same object
      when a thread is inside a synchronized method.

      example:

      Student s = new Student();

      class Student{
        synchronized public void method1(){    //can only be executed on s by the thread having the lock of s

        }

        synchronized public void method2(){   //can only be executed on s by the thread having the lock of s

        }

        public void method3(){                //any thread can execute this method on s.

        }
      }

When a thread is executing synchronized methods ,
then is it possible to execute other synchronized methods simultaneously by other threads on different objects?
	 yes, its is possible. Other threads are only restricted to execute the synchronized methods on the
   object whose lock is already aquired by the thread.

Can we synchronize static methods in java?
    Every class in java has a unique lock associated with it.
    If a thread wants to execute static synchronize method it need to acquire class level lock.
    When a thread was executing static synchronized method no other thread can execute
    static synchronized method of class since lock is acquired on class.
    But it can execute the following methods simultaneously :
    1) Normal static methods
    2) Normal instance methods
    3) Synchronized instance methods

    class Student{

      synchronized public static void staticMethod1(){  //can only be executed by the thread having the lock of class Student

      }

      public static void staticMethod2(){  //can be executed by any thread

      }


      synchronized public void method1(){    //can only be executed by any thread

      }

      synchronized public void method2(){   //can only be executed by any thread

      }

      public void method3(){               //can only be executed by any thread

      }
    }

Can we use synchronized block for primitives?

    Student s = new Student();

    synchronized (s){

    }

    class Student{

           public static void staticMethod1(){
              //can only be executed by the thread having the lock of class Student

              synchronized(Student.class){

              }

          }

          public static void staticMethod2(){  //can be executed by any thread

          }


           public void method1(){
                 //can only be executed by any thread

                 synchronized (this){

                 }

          }

          synchronized public void method2(){   //can only be executed by any thread

          }

          public void method3(){               //can only be executed by any thread

          }
        }

      Synchronized blocks are applicable only for objects. If we try to use
      synchronized blocks for primitives we get compile time error.

Why we use explicit lock?
    It provides additional features

//Inter-Thread communication

Explain about inter-thread communication and how it takes place in java?
    Usually threads are created to perform different unrelated tasks but
    there may be situations where they may perform related tasks or they need to communicate to other threads.
    one of the example of this is Producer Consumer problem. Inter-thread communication
    in java is done with the help of following three methods :
    1) wait()
    2) notify()
    3) notifyAll()

Explain wait(), notify() and notifyAll() methods of object class ?
  	wait() : wait() method releases the lock on object until some other thread acquires the lock and calls notify().
  	notify() :notify() method wakes up the thread that called wait on the same object.
  	notfiyAll() :notifyAll() method wakes up all the threads that called wait() on the same object.
    The highest priority threads will run first.
  	All the above three methods are in object class and are called only in synchronized context.
  	All the above three methods must handle InterruptedException by using throws clause or by using try
    catch clause.

Write code to solve the Produce consumer problem in Java? ⭐️

when wait(), notify(), notifyAll() methods are called does it releases the lock or holds the acquired lock?
  	when the thread enter in synchronized context thread acquires the lock on current object. When
  	wait(), notify(), notifyAll() methods are called lock is released on that object.

Explain why wait(), notify() and notifyAll() methods are in Object class rather than in thread class?
  	wait() , notify(), notifyAll() methods are object level methods they are called on same object.
  	these methods are called on an shared object so they are kept in object class rather than thread
  	class.

Explain IllegalMonitorStateException and when it will be thrown?
  	IllegalMonitorStateException is thrown when wait(), notify() and notifyAll() are called in non
  	synchronized context. Wait(), notify(),notifyAll() must always be called in synchronized context
  	other wise we get this run time exception.
  	whenever we call these methods lock is acquired or released on that object so they must be called
    from within synchronized area.

//other

Explain which of the following methods releases the lock when invoked?
  	yield()    No
  	join()     No
  	sleep()    No
  	wait()     Yes
  	notify()   Yes
  	notifyAll()  Yes


Can we restart a dead thread in java?
  	 If we try to restart a dead thread by using start method, we will get run time exception since the
     thread is not alive.

Can one thread block the other thread?
  	No, one thread cannot block the other thread in java. It can block the current thread that is running.
  	for example if we yield a thread..it blocks itself to give chance to other thread..but we can't
    block other thread.

Can we restart a thread already started in java?
    We start a thread using start() method in java.
    If we call start method second time once it is started it will cause RunTimeException(IllegalThreadStateException).
    A runnable thread cannot be restarted.


//liveness problems, Daemon Threads, Immutable Objects (Thread Safety)

What is liveness? What are liveness problems?
  	A concurrent application's ability to execute in a timely manner is known as its liveness.
  	Liveness problems include:
  	Deadlock,
  	Starvation,
  	Livelock

What is deadlock? ⭐️
  	When two or more threads are waiting for each other to release the resource or lock
  	and get stuck for infinite time, the situation is called deadlock.

Write a program which will result in a deadlock? How will you fix deadlock in Java?⭐️

How many types of threads are there in Java?
    Java offers two types of threads:
    1.user threads
    2.daemon threads.

What are daemon threads in java?⭐️
    Daemon threads are threads which run in background.
    Daemon thread is mostly created by JVM.
    For example: Garbage collector
    These are service threads and works for the benefit of other threads.
    If parent thread is daemon, child thread also inherits daemon nature of thread.
    JVM will force daemon thread to terminate if all user threads have finished their execution
    but The user thread is closed by itself.

How to make a non daemon thread as daemon?
    By default all threads are non daemon.
    We can make non daemon thread daemon using setDaemon() method.
    we call setDaemon() only before start() method.
    If we call setDaemon() after start() method an IllegalThreadStateException will be thrown.

Can we make main() thread as daemon?
    Main thread is always non daemon.
    We cannot make it daemon.

How immutability simplify the concurrency?
  	Immutable objects are by default thread-safe because there state can not be modified once created.
  	So we do not have to take care of data inconsistency in case of immutable objects.
  	For example: All the Wrapper classes (Integer, Long, Byte, Double, Float, Short),String class

//Advanced Multithreading

What is Thread Group? Why it’s advised not to use it?
    Thread group is a collection of threads or sub thread groups
    that are responsible for doing something similar and Java provides a convenient way to group multiple
    threads in a single object .The advantage of using thread group is that we can perform common operation on the whole
    group so in other words programmer can group the threads in thread group based on their functions to
    be performed.
    But ThreadGroup API is weak and it doesn’t have any functionality that is not provided by Thread.
    Two of the major feature it had are to get the list of active threads in a thread group
    and to set the uncaught exception handler for the thread.
    So ThreadGroup is obsolete and hence not advised to use anymore.

What is Thread Pool? How can we create Thread Pool in Java?
    A thread pool manages the pool of threads, it contains a queue that keeps tasks waiting to get executed.
    java.util.concurrent.Executors provide implementation of java.util.concurrent.
    Executor interface to create the thread pool in java.

What is Callable?⭐️
    Callable is an interface with single abstract method call().
    Java 5 introduced java.util.concurrent.Callable interface in concurrency package
    that is similar to Runnable interface but it can return any Object and is able to throw Exception.
    Callable interface use Generic to define the return type of Object.

What is ExecutorService?⭐️
    The Java ExecutorService is a construct that allows you to pass a task to be executed by a thread asynchronously.
    The executor service creates and maintains a reusable pool of threads for executing submitted tasks.

How to create executor service?
    ExecutorService executorService =
        new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>());

    ExecutorService executor = Executors.newFixedThreadPool(10);

    ExecutorService executor = Executors.newSingleThreadExecutor();

    ExecutorService executor = Executors.newCachedThreadPool();

    ExecutorService executor = Executors.newScheduledThreadPool(5);

    ExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    ExecutorService executor = Executors.newWorkStealingPool();

How do you execute a callable from executorservice?
    We pass the callable task inside the submit method
    and invoke the submit on the created ExecutorService.

How do you execute runnable task from executorservice?
    We pass the runnable in the execute method and invoke it on the ExecutorService.

What is Future?⭐️
    Executors class provide useful methods to execute Callable in a thread pool.
    Since callable tasks run in parallel, we have to wait for the returned Object.
    Callable tasks return java.util.concurrent.Future object.
    Using Future we can find out the status of the Callable task and get the returned Object.
    It provides get() method that can wait for the Callable to finish and then return the result.
    So, Future is basically a placeholder for the object which is going to be
    returned by the callable task at any time in future.

What is ThreadLocal?
    Java ThreadLocal is used to create thread-local variables. i.e., variables local to each thread.
    We know that all threads on an Object share it’s variables, so if the variable is not thread safe,
    we can use synchronization but if we want to avoid synchronization, we can use ThreadLocal variables.
    If the same code runs in different threads, these executions will not share the value, instead of that, each
    thread has its own variable that is local to the thread and they can use it’s get() and set() methods
    to get the default value or change it’s value local to Thread.
    ThreadLocal instances are typically private static fields in classes that wish to associate state with a thread.

What is Java Thread Dump, How can we get Java Thread dump of a Program?
    Thread dump is list of all the threads active in the JVM,
    thread dumps are very helpful in analyzing bottlenecks in the application
    and analyzing deadlock situations.
    There are many ways using which we can generate Thread dump –
    Using Profiler, Kill -3 command, jstack tool etc.

How to schedule a task to run after specific interval?
    java.util.TimerTask is an abstract class that implements Runnable interface
    and we need to extend this class to create our own TimerTask that can be scheduled using java Timer class and
    java.util.Timer class can be used to schedule a task to
    be run one-time or to be run at regular intervals at certain time in future.

What is context switching in multithreading ?
    Context Switching is the process of storing and restoring of CPU state
    so that Thread execution can be resumed from the same point at a later point of time.
    Context Switching is the essential feature for multitasking operating system and
    support for multi-threaded environment.

What is fork join pool?⭐️
  fork join

What is completable future?
  completable Future

What is FutureTask Class?
    FutureTask is the base implementation class of Future interface
    and we can use it with Executors for asynchronous processing.
    Most of the time we don’t need to use FutureTask class but it comes real handy
    if we want to override some of the methods of Future interface and want to keep most of the base implementation.
    We can just extend this class and override the methods according to our requirements.


//Concurrent Collection And Concurrent Utilities

What are Concurrent Collection Classes?
    Java Collection classes are fail-fast which means that if the Collection is changed while
    some thread is traversing over it using iterator, the iterator.next() will throw ConcurrentModificationException.
    Concurrent Collection classes support full concurrency of retrievals and
    adjustable expected concurrency for updates.
    Major classes are ConcurrentHashMap, CopyOnWriteArrayList and CopyOnWriteArraySet, LinkedBlockingQueue etc.

Briefly explain concurrentHashMap. How is it better than HashMap and HashTable in terms of concurrency?

Briefly explain CopyOnwriteArraylist. Can we perform remove operation on CopyOnwriteArraylist while iterating?

explain CopyOnwriteArraySet.

What is CountDownLatch? When we use CountDownLatch?

What is CyclicBarrier? What is the difference between CountDownLatch and CyclicBarrier?

What is BlockingQueue? How can we implement Producer-Consumer problem using Blocking Queue?

What is Exchanger? How do exchanger work?

Briefly explain Semaphore.

List the implementations of BlockingQueue.
    ArrayBlockingQueue,
    DelayQueue,
    LinkedBlockingQueue,
    PriorityBlockingQueue,
    and SynchronousQueue.
