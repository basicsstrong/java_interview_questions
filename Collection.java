
What is Java Collection Framework?
    A java collection framework is a collection of interfaces and classes which are used to store and
    process data efficiently, as a Collection is something which is used to store Data objects.

    This framework was introduced in Java version 1.2.
    -> Reduced the development effort.
    -> Code quality is enhanced.

What are the basic interfaces of collection framework?

    1. Collection
    2. List
    3. Set
    4. Queue
    5. Map

Why Map Interface does not extend Collection interface?
    The Map is way different than collection. In Map there are no elements, it has key-value pairs.
    👉🏻 It does not fit into the Group of elements Paradigm.

    However there are many methods to retrieve keys and values as collection.

What is the difference between Collection and Collections?

Why Collection Interface does not extend Serializable and Cloneable interfaces?
    'There is no need to do it!'
    Collection is not supposed to do what Cloneable and Serializable interfaces do.

    What they do?
    They are just the marker interfaces which are actually empty interfaces.

    👉🏻 If Collection Interface implements these interfaces then it will mandate cloning and serialization
    in all implementation, which is less flexible and more restrictive.

When we had Array, Why do we need collection?
    We know Array is a group of primitives.. which holds homogeneous data.
    It has also some limitations like, arrays are always fixed in size.
    So to overcome these problems, collection were introduced.
    Collection, which can also be called a container, is a group of individual objects.

    How can it solve the problems that we had in array?

    Collections are grow-able in Nature,
    that means we aren't bound to declare size of any collection at declaration as we are with arrays.
    Size of collections can be increased or decreased on the base of our programming requirement.
    You can add or remove any number of elements in collection.

    hence collections solve the first limitation.

    And next,
    we only can have homogeneous type of data elements in array,
    But Collections can have any kind of data element. They can be homogeneous or heterogeneous.

when we should use arrays and when collection?
    Array are recommended to use if we know the size in advance..
    because Performance-wise Arrays are better to use than Collections.

    From Memory point of view, we should not use 'Arrays'..
    Suppose we take an array of 100 size. And if we only have 10 elements in it, so,
    here the rest of the memory blocks get wasted. Thats why arrays are not recommended to use in memory point of view.
    On the other hand, Collections are grow-able or resizable in nature, and it uses memory as per required only.

What is the difference between Array and ArrayList?
    The very first difference between Array and ArrayList is,
    Array can contain primitive or Objects whereas ArrayList can only contain Objects.
    next is
    Arrays are fixed in size whereas ArrayList size is dynamic.
    And, ArrayList accepts duplicate objects unlike arrays..
    Array does not provide a lot of features like ArrayList, such as add(), addAll(), removeAll() etc..

    So ArrayList is the obvious choice when we work on list.. But if the size of list is fixed and if we are using the list of primitives then we should use Arrays.. Although collection use auto boxing to reduce the coding effort but still it makes them slow.. so would use array with primitives.
    And if are working on multidimensional situation, then also using array [][] is way more easy than List<List<>>..

How LinkedList is different from ArrayList?
    ArrayList and LinkedList both implement the List interface but there are some differences between them..

    ArrayList is an indexed based data structure.. The underlying data structure for ArrayList is a resizable or growable Array.

    And LinkedList is a data structure which stores data and its address as list of nodes.. here, every node is linked to its previous and next node using pointers.. That is, the address part of the element points to the next element of the linked list.so see the address that the first node is having.. is actually the address of the next node.

    This is how we create ArrayList, and linkedLists

    ArrayList<String> al = new ArrayList<String>();
    //and to add elements.. these are the methods.. (explain the suggestions)
    al.add("John");
    al.add("Rohn");

    LinkedList<String> lList = new LinkedList<String>();
    lList.add("");

    Since ArrayList is index based data structure, it provides random access to its elements with the performance of O(1).. that is, we can access any element by the index.. Linked list also allows to get any element by index, but internally it traverse the list from start to read at the index node, then return the element. So the performance is O(n) which is slower than of arrayList. Therefore the ArrayList is recommended to use retrieving data..

    Next thing is, Insertion and removal of any element is faster in LinkedList compared to ArrayList. Because one insertion or deletion in middle requires n number of shifts.. So there is no concept of resizing array when element is added in middle..

    and in linkedList it requires only one change in the address pointer of the particular node to add or remove any element.

    Next is,
    LinkedList consumes more memory than ArrayList because every node in LinkedList stores reference of previous and next elements..'

What are the different ways to iterate over a list?
    To access or to get elements from collection there are many ways present in java.
    1. Loops (classic for loop)
    2. Cursors
        In java these are the cursors available for collections:
            1. Iterator
            2. ListIterator
            3. Enumeration

What is the difference between Iterator and ListIterator and Enumeration?

What are the legacy implementations?
    Vector is a legacy class.
    Legacy class: The classes that were already there before introducing collection framework.

    Sub Class of Vector -> Stack, is also a legacy class.

    Vector is implemented on a growable or a resizable array.
        -> It is an ordered collection
        -> allows duplicates.

    Vector v = new Vector();

    Stack implements the stack data structure. It is based on the principle of Last In First Out.
        👉🏻 element which is inserted in last, will be the first one to come out.

    Stack s = new Stack();

      -> to insert any object : push()
      -> to remove the top element : pop()

What are the similarities and difference between ArrayList and Vector?

Which collection classes provide random access of its elements?
    These are the collection classes which provide random access:
        ArrayList, Vector, Stack, HashMap, TreeMap, Hash-table.

What are Stack and Queue? How they are different?
    Stack and Queue are used to store data before processing them.

    Queue represents an ordered list of objects which is limited to insert elements
    at the end of the list and removing from the start..

    This is how we create a queue,

    Queue<Integer> q = new LinkedList<>();

    being an interface it needs the concrete classes to create objects,
    PriorityQueue and LinkedList are most common to use.

    And to add element,
    q.add(10);
    q.add(20);

    sysout(q);

    and the remove method will remove the head that is the first element

    int a = q.remove();		//return the removed element
    sysout("element removed- "+a)

    sysout(q);

    So Queue allows retrieval of element in First In First Out order. and it is different from stack as Stack allows elements to be retrieved in Last In First out order.

    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);

    To pop,
    st.pop();

    sysout(st);

    So thats the difference between Stack and queue.. Stack is a class and queue is an interface.

How can we sort Collections?
    There are some implementations of set and map which are used to store elements in a sorting order.
    -> SortedMap, SortedSet etc. - can be used to get a sorted collection(Map or Set).

    To sort List implementations, the Collections provides method sort().

    Collections.sort(): sorts list implementation passed to it.

    -> It does not return anything just sorts the collection.

How to make a collection read only?
    We can create a read only collection by using unmodifiableCollection method of Collections class.

    Collections.unmodifiableCollection(Collection c)

    -> if any operation occurs it will throw UnsupportedOperationException.

How can we make a collection thread-safe?
    There is a method in Collections class ->
    synchronizedCollection(Collection c) : used to get a synchronized or thread-safe collection.

What is the difference between Set and List?
    Both Set and List are used to store objects and provides convenient way to insert,
    remove and retrieve elements and also provides support for iteration.

    Fundamental differences between List and Set:
     1. Allowing Duplicate Elements
     2. Order

When should we use List and when to use Set??
    👉🏻 If we need to maintain insertion order and we can have duplicates too then we use List.
    👉🏻 If we want a collection of unique objects then we should use Set.

How does HashSet is implemented? How does it use Hashing?

What are Comparable and Comparator interface? When to use what?

Whats difference between TreeSet and LinkedHashSet and HashSet?
    These are the implementations of Set.

    Starting with TreeSet, the main feature of TreeSet is Sorting.
    Its the implementation class of sortedSet.
    So in TreeSet the insertion of elements is done on some sorting order.
    like we want to store all the Employee's object according to their EmployeeIds then we should
    go for SortedSet or TreeSet.
    Also in treeSet, we cannot put heterogeneous elements in it.
    Its about sorting as we cannot sort different type of objects so it is restricted to insert diff data types in treeSet.

    SortedSet<Integer> t = new TreeSet<>();

    It will creates an TreeSet object in which elements to be inserted in Default natural sorting order.
    Note that, If we are depending on the default natural sorting order, then our elemtns/object should be...
    homogeneous and comparable, otherwise we will get classCastException.

    So we can add integer only.
    t.add(10);
    t.add(5);
    sysout(t);

    This will add both elements in ascending order by default.

    And next is LinkedHashSet.. it was introduced in 1.4 version. It is the sub class of Hashset (no insertion order) where insertion order is preserved.
    And that's the main difference between HashSet and LinkedHashSet.

    We create linkedHashSet like,
    LinkedHashSet lhs = new LinkedHashSet();

    So all of the three, TreeSet, LinkedHashSet and HashSet doesn't allow to store duplicates.
    And none of these are thread-safe..
    But HashSet is the Fastest among them.
    LinkedHashSet comes second or can be similar to HashSet but
    TreeSet is slower because it performs sorting for each insertion.

    Next difference between these, is ordering.
    HashSet doesn't maintain any order while LinkedHashSet maintains insertion order
    and treeSet maintains sorting order of elements.

    And talking about internal implementations,
    HashSet is backed by HashMap..
    whereas LinkedHashSet is implemented using HashSet and LinkedList.
    And TreeSet, it is backed up by navigableMap and it internally uses TreeMap.

    Next difference is about way of comparing things,
    like HashSet and LinkedHashSet uses equals() for comparison
    and TreeSet uses compareTo() method for maintaining ordering.
    This was all about differences between them.

Can we add a null element to TreeSet and HashSet?
    We can add a null element in HashSet but not in treeSet.

    👉🏻 TreeSet uses compareTo() method to compare objects with each other, if any element will be null
    by any chance, it will throw NullPointerException.

What is difference between poll() and remove() methods of Queue?
    Both of these methods are used to remove element and returns the head of the queue. The difference is,

    -> if the queue is empty and we call the remove() method, then it will throw exception,
    but if we call poll() method, it will return null.

What is the difference between remove() method of Collection and remove() method of Iterator?
    Collection.remove() is used for removing object from collection, while not iterating.

    -> When we use this remove() method to remove element at the time of iteration then it may throw
    ConcurrentModificationException.

    -> Iterator.remove() is advised to use for remove element while iterating.

How HashMap works in Java?

Whats the difference between HashMap and HashTable?

Can we use a Custom object as a key in HashMap? If yes then How?
    Yes! we may create custom object key for HashMap.
    -> for that we need to override the equals() and hashcode() method to the Class which we want to use
    as key.

Why it is suggetsed to have immutable objects as keys in hashMap?
  //why string is popular hasmap key in java?
    -> if we want to use custom object as key, we need to ensure that the hashcode() of the key of hashMap
    does not change. If it happens then it is impossible to get object value from that key.

What is the contract of equals() and hashCode() method?
    👉🏻 If two objects are equal, then they must have the same hashcode.
    👉🏻 if two objects have the same hash code, then they may or may not be equal.

    //Equal objects must produce same hashcode
	   //a.equals(b) -> true    then  a.hashCode() = b.hashCode()

  	//unequal objects need not produce same hashcode
  	//a.equals(b) -> false    then  a.hashCode() = b.hashCode() -> true
  	//a.equals(b) -> false    then  a.hashCode() = b.hashCode() -> false

What is the NavigableMap?

What is the difference between HashMap and HashSet in java?
    👉🏻 HashMap is collection of key-value pairs whereas HashSet is an un-ordered collection of unique
    elements!

What are IdentityHashMap and WeakHashMap? How they are different?

When to use HashMap and when to use TreeMap?
    👉🏻 HashMap is the best implementation of Map for inserting, deleting, and locating elements.

    👉🏻 TreeMap is the better alternative if we need to traverse the keys in a sorted order.

    -> HashMap is faster than TreeMap; for sorted key traversal, it is faster way to add elements to a
    HashMap, and then convert the map to a TreeMap.


//Concurrent Collections
//java.util.concurrent v5

What is iterator's fail-fast property?
    While iterating over any collection, we cannot perform any modification on elements.
    Whenever we access the next element in collection, Iterator's fail fast property checks for any
    modification in the structure of that collection.'
    -> If any modifications found, it throws RuntimeException.

    👉🏻 Almost all the implementations of the iterator, are fail-fast by design.
      ** Except the concurrent collection classes.

What are Concurrent Collection classes? When does ConcurrentModificationException occur?
    The Concurrent Package [java.util.concurrent] which introduced in java 1.5,
    contains thread-safe collection classes called Concurrent Collection class:
    -> that allows collections to be modified while iterating.

    By design, iterator implementation are fail fast and throw the ConcurrentModificationException
    whenever we modify element while iterating.

    -> Iterator implementations in Concurrent Package allows us to do the modifications at runtime too.

    1. CopyOnWriteArrayList 2. ConcurrentHashMap 3. CopyOnWriteArraySet.

What is the difference between fail-fast and fail safe?

What is the difference between Synchronized Collection and concurrent collection?
    Synchronized collections classes, like Hashtable and Vector provides thread-safe implementation of Map
    and List.

    There are several factors which make them less suitable for use in highly concurrent applications.

    Performance: The synchronized collections are unsuitable because of their 'wide-locking mechanism'.
    They acquire lock on complete object whereas concurrent classes locks only a part.

When do we use ConcurrentHashMap in Java?

Can we replace HashTable with ConcurrentHashMap?
    Yes, we can replace the HashTable with ConcurrentHashMap.
    -> As the performance of ConcurrentHashMap is better than HashTable.

    We need to be careful with code which relies on locking behavior of Hashtable.
    Since Hashtable locks whole Map instead of a portion of Map, compound operations like
    if(Hashtable.get(key) == null) put(key, value) works in Hashtable but not in concurrentHashMap.

What is CopyOnWriteArrayList? How it is different than ArrayList?
    <lecture>

What is BlockingQueue?
    <lecture>
