
What is a design pattern ?
    Design patterns is the basket of pre-designed solutions to common problems in Object Oriented programming
    given by various programmers in the world.
    They promote reusability which leads to a more robust and maintainable code.

In how many catogories Design Patterns are classified?⭐️
    The Design patterns can be classified into three main categories:
    Creational Patterns
    Structural Patterns
    Behavioral Patterns

A Class Instance Can Be Created Using New Operator. Why Should We Use Creational Design Patterns To Create Objects?⭐️

    In scenarios where the nature of the object can change according to the nature of the program,
    that is where we are not sure about which class's object we are going to create each time.
    we use creational design patterns which offer flexible approach for creating class instances.

Which Object Oriented Method Is Used By The Creational Patterns To Instantiate Object?
    Creational patterns use inheritance.

What is Singleton Pattern in Java?⭐️
    Singleton pattern is a creational pattern which allows only one instance of a class to be created
    which will be available to the whole application.
    The major advantage of Singleton design pattern is that it always saves memory because
    the single instance is reused again and again. There is no need to create a new object at each request.
    For example, we can use a single database connection shared by multiple objects,
    instead of creating a database connection for every request.

    Java.lang.Runtime is a classical example of Singleton design pattern

How can we create thread-safe singleton in Java?
    There are multiple ways to write thread-safe singleton in Java
    e.g
    by writing singleton using double checked locking,
    by using static Singleton instance initialized during class loading.
    By using Java enum to create thread-safe singleton is most simple way.

What are the drawbacks of using singleton design pattern?
    The major drawbacks of using singleton design pattern are:
    a)Singleton causes code to be tightly coupled.

    b)They hide dependencies instead of exposing them.

    c)Singleton Pattern does not support inheritance.

    d)Singleton principle can be violated by techniques such as cloning.

How To Prevent Cloning Of A Singleton Object?
    Throw exception within the body of clone method.

Why and When Will You Use A Factory Pattern?
    Why:
    Factory classes provide flexibility in terms of design. Below are some of the benefits of factory class:
    •Factory design pattern results in more decoupled code as it allows us to hide creational logic from dependant code
    •It allows us to introduce an Inversion of Control container
    •Factory pattern’s main benefit is increased level of encapsulation while creating objects.
    If you use Factory to create object you can later replace original implementation of Products or classes
    with more advanced and high performance implementation without any change on client layer.

    When:
    - a class does not know which objects of class it must create
    - factory pattern can be used where we need to create an object of any one of sub-classes depending
    on the data provided

What is the difference between factory and abstract factory design pattern?⭐️
    Both factory and abstract factory are creational design patterns.

    The major difference between these two is, a factory pattern creates an object through inheritance
    and produces only one Product.
    On the other hand, an abstract factory pattern creates the object through composition
    and produce families of products.

What is observer design pattern in Java? When it is used?
    Observer design pattern is one of the behavioral design patterns
    which defines one-to-many dependencies between objects & is useful
    when we are interested in a state of an object and
    we want to get notified when there is any change in state of Object.
    In Observer design pattern, when one object changes its state,
    all its dependent objects are automatically notified,
    the object is called Subject and dependants are called Observers.
    Java provides libraries to implement Observer design pattern using java.util.Observable class
    & java.util.Observer interface.

Which design pattern will you use to create a complex object?
    Builder design pattern is used to construct a complex object.
    It is designed to solve the issues with factory and abstract design pattern.

Give example of decorator design pattern in Java ? Does it operate on object level or class level ?⭐️

    The decorator pattern, also known as a structural pattern is used to add additional functionality
    to a particular object at runtime. It wraps the original object through decorator object.
    For example, when you are buying a burger, you can customize it by adding extra filling and sauces,
    now the cost of these items have to be added to the final price.
    The customization will differ from customer to customer and offer from a shop.
    Creating different classes of burger with different fillings will end up creating a lot of classes.
    Decorator solves this problem by extending the functionality of single Burger class at runtime based
    on customer request.

What is the benefit of using prototype design pattern over creating an instance using the new keyword?⭐️
    Sometimes, object creation is heavyweight and requires a lot of resources,
    creating a new instance will impact the performance.
    In such cases, a prototype design pattern is used which refers to creating duplicate objects.
    In prototype design pattern, if a similar object is already present then
    cloning is done keeping performance in mind.

What is MVC design pattern ? Give one example of MVC design pattern ?
    MVC stands for Model-View-Controller Pattern. We can use this pattern for better organization of code.

    Model : Model layer is layer which interacts with datdabase. Model is the data layer.
    So, The model is responsible for managing the data of the application.

    view : The view means presentation of the model in a particular format.
    It is what the user interacts with (the Front-end ).

    Controller : user request first enters the controller  .
    Controller works between model and view..
    The controller responds to the user input and performs interactions on the data model objects.
    The controller receives the input, optionally validates it and then passes the input to the model.

What is FrontController design pattern in Java ? Give an example of front controller pattern ?
    The FrontController Design Pattern provides a centralized request handling mechanism
    so that, all the requests are handled by a single handler.

    FrontController is a centralized entry point for handling requests.

    So FrontController pattern is generally used to do the authentication or authorization or tracking of request and
    then pass the requests to corresponding handlers using the Dispatcher.
    FrontController redirects the request to dispatcher and dispatcher identifies the handler which can handle the request

What is Chain of Responsibility design pattern ?
    the chain of responsibility pattern creates a chain of receiver objects for a request.
    It is one of the behavior pattern in which a objects are chained together in a sequence.
    and a responsibility or we can say a request is provided in order to be handled by the group
    that means it decouples sender and receiver of a request based on type of request.
    So, In this pattern, normally each receiver contains reference to another receiver.
    If one object cannot handle the request then it passes the same to the next receiver and so on.

What is Adapter design pattern ?
    Adapater is actully used to facilitate the communication between two subjects,
    when they are not able to understand each other.

    Adapter design pattern works as a bridge between two incompatible interfaces.
    This pattern involves a single class called adaptor between two incompatible interfaces.

    Or

    Adapter allows two classes of a different interface to work together,
    without changing any code on either side.

Difference between strategy and state design pattern in Java?⭐️
    Strategy Design Pattern :
    Strategy design pattern used when we have multiple solution or algos to solve a specific task
    and at runtime client decides the specific implementation which is to be used.

    The Strategy pattern suggests keeping the implementation of each of the algorithms in a separate class.
    Each such algorithm encapsulated in a separate class is referred to as a strategy.
    An object that uses a Strategy object is often referred to as a context object.


    State Design Pattern :
    State design pattern used to alter an object's behaviour when its internal state changes.
    State Design pattern is useful,
    in the case of an object of a class that has some or all of its behaviour completely influenced
    by its current state or internal state.
    and that class is referred to as a Context class.
    A Context object can alter its behaviour when there is a change in its internal state and
    is also referred as a Stateful object.

What is null Object Pattern?
    In Null Object pattern, a null object replaces check of NULL object instance.
    Instead of using a null reference to convey absence of an object (for instance, a non-existent customer),
    one uses an object which implements the expected interface, but whose method body is empty.
    The advantage of this approach over a working default implementation is that
    a null object is very predictable and has no side effects: it does nothing.

Can you name few design patterns used in standard JDK library?⭐️

    Builder
    java.lang.StringBuilder#append()

    Factory method
    java.util.Calendar#getInstance()

    Prototype
    java.lang.Object#clone() (the class has to implement java.lang.Cloneable)

    Singleton
    java.lang.Runtime#getRuntime()
    java.lang.System#getSecurityManager()

    Decorator
    All subclasses of java.io.InputStream, OutputStream, Reader and Writer
    have a constructor taking an instance of same type.

    Observer (or Publish/Subscribe)
    All implementations of java.util.EventListener (practically all over Swing thus)

What Are J2ee Patterns?
    These design patterns are specifically concerned with the presentation tier.
    These patterns are identified by Sun Java Center.
