Java:-

JSE(java standard Edition ) JEE(Java Enterprise Edition) JME(Java Mobile Edition)
Core                        Advance                       Framework

javadoc *.java //for create doc in html format

Adavnce Java Session:-

Collection, JDBC, Servelet

Interview:
String Handling
Exception 
Threading 
Collection


java.util;
Collection Framework:
---------------------
JDK1.2 version
Achieve Datastructure

Framework--> set of API which work on the predefined algo and targeted to the specific domain.

Application Programming Interface(API):- interface, class & packages.

Framework-------------------------Specific Domain
1.collection                        D.S
2.JDBC                              D.B
3.JEE                               Web & Enterprise
4.Structs                           MVC
5.Hibernate                         ORM
6.Spring                            AOP & IOC



Array

Emp e[] = new Emp[100];


What is a Collection Framework?

We have our collection of objects, now we need an organized way to use these collections, therefore we need a framework. The Java Collection Framework, first introduced in JDK 1.2 ( Java Development Kit 1.2 ), is an architecture made up of interfaces and classes. In simple words, it is like a skeletal structure for components that is ready to use for various programming needs. It also offers different data operations like searching, sorting, insertion, deletion, and manipulation. All of the classes and interfaces of the collection framework are bundled into the java.util package.

Difference betwteen Class and Interface:
-----------------------------------------
Class:
1.A class is a user-defined prototype for building objects in Java.
2.It is used to define objects.
3.A class can have access modifiers public and default.
4.Classes can be concrete or abstract.
5.A class consists of constructors, methods and attributes. The methods are defined in a class.

Interface:
1.An interface is a user-defined blueprint that describes the structure of every class that implements it.
2.It cannot be used to define objects.
3.An Interface can have access modifiers public and default.
4.All interfaces are abstract.
5.An interface consists attributes and methods. The methods are not defined in an interface, it only contains their signature.

------------------------------------------------------------------------------------------------------------------------------

1.Iterable:
-----------
The iterable interface is the root of the entire collection hierarcy, which means that every class and interface implements it.The primary function of an iterator is to allow the user traverse through all the collection class objects as if they were simple sequences of data items.

------------------------------------------------------------------------------------------------------------------------------


2.Collection:
-------------
The Collection interface extends the Iterable interface.It has the basic method required for using all other collections in the framework to add, delete, and manipulate data. Since it is an interface it only has a method signature(i.e <return type> methodName(ArgumentList);) and no defination because every interface r class that implements this interface will have different types of elements to handle.But since they implement this interface there is uniformity and structure to the rest of the collection.The methos of the collection interface are given below all the interface and classes that extend or implement the Collection interface use these method along with their own added methods specific to them.

Commmand for show all the methods in Collection package:
---------------------------------------------------------
javap java.util.Collection



Collection Methods:
------------------
Compiled from "Collection.java"
public interface java.util.Collection<E> extends java.lang.Iterable<E> {
  public abstract int size();
  public abstract boolean isEmpty();
  public abstract boolean contains(java.lang.Object);
  public abstract java.util.Iterator<E> iterator();
  public abstract java.lang.Object[] toArray();
  public abstract <T> T[] toArray(T[]);
  public default <T> T[] toArray(java.util.function.IntFunction<T[]>);
  public abstract boolean add(E);
  public abstract boolean remove(java.lang.Object);
  public abstract boolean containsAll(java.util.Collection<?>);
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public default boolean removeIf(java.util.function.Predicate<? super E>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public default java.util.Spliterator<E> spliterator();
  public default java.util.stream.Stream<E> stream();
  public default java.util.stream.Stream<E> parallelStream();
}
-----------------------------------------------------------------------------------------------------------------------------

3.List:
-------
The list interface extends from the Collection interface.The elements in a list are ordered like a sequence.The user can use the index number to access a particular elements in the list, that is to say the user has comple control over which element is inserted wherein the list.



List methods from List:
-----------------------
Compiled from "List.java"
public interface java.util.List<E> extends java.util.Collection<E> {
  public abstract int size();
  public abstract boolean isEmpty();
  public abstract boolean contains(java.lang.Object);
  public abstract java.util.Iterator<E> iterator();
  public abstract java.lang.Object[] toArray();
  public abstract <T> T[] toArray(T[]);
  public abstract boolean add(E);
  public abstract boolean remove(java.lang.Object);
  public abstract boolean containsAll(java.util.Collection<?>);
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract boolean addAll(int, java.util.Collection<? extends E>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public default void replaceAll(java.util.function.UnaryOperator<E>);
  public default void sort(java.util.Comparator<? super E>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public abstract E get(int);
  public abstract E set(int, E);
  public abstract void add(int, E);
  public abstract E remove(int);
  public abstract int indexOf(java.lang.Object);
  public abstract int lastIndexOf(java.lang.Object);
  public abstract java.util.ListIterator<E> listIterator();
  public abstract java.util.ListIterator<E> listIterator(int);
  public abstract java.util.List<E> subList(int, int);
  public default java.util.Spliterator<E> spliterator();
  public static <E> java.util.List<E> of();
  public static <E> java.util.List<E> of(E);
  public static <E> java.util.List<E> of(E, E);
  public static <E> java.util.List<E> of(E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E...);
  public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>);
}

-----------------------------------------------------------------------------------------------------------------------------

3.List
-------
a.ArrayList:
------------
The ArrayList class implements the List interface. The objects of this class are dynamic arrays. The ArrayList is essentially a resizable implementation of List. It implements all of the List methods and allows all elements even null elements. The ArrayList objects have a capacity, which is initially equal to the size but increases dynamically as new elements are added. An ArrayList is unsynchronised, which means multiple threads can access them at the same time. A thread is a unit of sequential flow control that can be processed in the Operating System.

Syntax: ArrayList<?> arrayListName = new ArrayList<?>();

Example: Now we will take an example and perform some basic operations on an ArrayList. Here we instantiate an ArrayList named intArr. We use the add() method to add integers to intArr. The Integer class used in declaring intArr is a wrapper class for that basic datatype int. Wrapper classes extend from the Object class and they are used so that basic datatypes are compatible with other classes. Next, we print the ArrayList on the console. We use the remove() method to remove elements from the specified indices. We check if an element, 25 here, exists in intArr and print the appropriate message. Then we retrieve the element at index 1 using the get() method. As you can observe when an element is removed using remove() method the rest of the elements shift in sequence.


Program:
--------
// An example for ArrayList
// All of the classes and
// interfaces of the collection
// framework are bundled into 
// the java.util package
import java.util.*;
  
public class BasicArrayList {
  
    // main method
    public static void main(String[] args) {
          
        // Instantiate an ArrayList Object
        // Integer is a wrapper class for 
        // the basic datatype int
        ArrayList<Integer> intArr = new ArrayList<Integer>();
          
        // Add elements using add() method
        intArr.add(10);
        intArr.add(12);
        intArr.add(25);
        intArr.add(19);
        intArr.add(11);
        intArr.add(3);
          
        // Print the ArrayList on the console
        System.out.println(intArr);
          
        // Remove elements at index 1 and 4
        intArr.remove(1);
        intArr.remove(4);
          
        // Print the ArrayList on the console
        System.out.println(intArr);
          
        // Check if intArr contains the element 25
        if(intArr.contains(25))
        {
            System.out.println("The ArrayList contains 25");
        }
        else
        {
            System.out.println("No such element exists");
        }
          
        // Use get method to get the element at index 1
        int elementAt1 = intArr.get(1);
        System.out.println("The Element at index 1 now is " + elementAt1);
          
    }
  
}

------------------------------------------------------------------------------------------------------------------------------


Display Array list with the help of:

for loop
for each 
Iterator
List iterator
Enumeration

-----------------------------------------------------------------------------------------------------------------------------

Iterator:
---------
In Java, an Iterator is one of the Java cursors. Java Iterator is an interface that is practiced in order to iterate over a collection of Java object components entirety one by one. It is free to use in the Java programming language since the Java 1.2 Collection framework. It belongs to java.util package.

Though Java Iterator was introduced in Java 1.2, however, it is still not the oldest tool available to traverse through the elements of the Collection object. The oldest Iterator in the Java programming language is the Enumerator predated Iterator. Java Iterator interface succeeds the enumerator iterator that was practiced in the beginning to traverse over some accessible collections like the ArrayLists.

The Java Iterator is also known as the universal cursor of Java as it is appropriate for all the classes of the Collection framework. The Java Iterator also helps in the operations like READ and REMOVE. When we compare the Java Iterator interface with the enumeration iterator interface, we can say that the names of the methods available in Java Iterator are more precise and straightforward to use.

Advantages of Java Iterator:
----------------------------

1. The user can apply these iterators to any of the classes of the Collection 	     framework.
2. In Java Iterator, we can use both of the read and remove operations.
3. If a user is working with a for loop, they cannot modernize(add/remove) the    Collection, whereas, if they use the Java Iterator, they can simply update the    Collection.
4. The Java Iterator is considered the Universal Cursor for the Collection API.
5. The method names in the Java Iterator are very easy and are very simple to use.


Disadvantages of Java Iterator:
-------------------------------

1. The Java Iterator only preserves the iteration in the forward direction. In    simple words, the Java Iterator is a uni-directional Iterator.
2. The replacement and extension of a new component are not approved by the Java    Iterator.
3. In CRUD Operations, the Java Iterator does not hold the various operations like    CREATE and UPDATE.
4. In comparison with the Spliterator, Java Iterator does not support traversing    elements in the parallel pattern which implies that Java Iterator supports only    Sequential iteration.
5. In comparison with the Spliterator, Java Iterator does not support more    reliable execution to traverse the bulk volume of data.




Q. How to use Java Iterator?

When a user needs to use the Java Iterator, then it's compulsory for them to make an instance of the Iterator interface from the collection of objects they desire to traverse over. After that, the received Iterator maintains the trail of the components in the underlying collection to make sure that the user will traverse over each of the elements of the collection of objects.

If the user modifies the underlying collection while traversing over an Iterator leading to that collection, then the Iterator will typically acknowledge it and will throw an exception in the next time when the user will attempt to get the next component from the Iterator.



Java Iterator Methods:
----------------------
hasNext()
next()
remove()
forEachRemaining()

The forEachRemaining() method was added in the Java 8. Let's discuss each method in detail.

boolean hasNext():
-------------------
The method does not accept any parameter. It returns true if there are more elements left in the iteration. If there are no more elements left, then it will return false.
If there are no more elements left in the iteration, then there is no need to call the next() method. In simple words, we can say that the method is used to determine whether the next() method is to be called or not.

E next():
---------
It is similar to hasNext() method. It also does not accept any parameter. It returns E, i.e., the next element in the traversal. If the iteration or collection of objects has no more elements left to iterate, then it throws the NoSuchElementException.

default void remove(): 
----------------------
This method also does not require any parameters. There is no return type of this method. The main function of this method is to remove the last element returned by the iterator traversing through the underlying collection. The remove () method can be requested hardly once per the next () method call. If the iterator does not support the remove operation, then it throws the UnSupportedOperationException. It also throws the IllegalStateException if the next method is not yet called.


default void forEachRemaining(Consumer action): 
-----------------------------------------------
It is the only method of Java Iterator that takes a parameter. It accepts action as a parameter. Action is nothing but that is to be performed. There is no return type of the method. This method performs the particularized operation on all of the left components of the collection until all the components are consumed or the action throws an exception. Exceptions thrown by action are delivered to the caller. If the action is null, then it throws a NullPointerException.




Example of Java Iterator:
-------------------------

Now it's time to execute a Java program to illustrate the advantage of the Java Iterator interface. The below code produces an ArrayList of city names. Then we initialize an iterator applying the iterator () method of the ArrayList. After that, the list is traversed to represent each element.

JavaIteratorExample.java
    import java.io.*;  
    import java.util.*;  
        
    public class JavaIteratorExample {  
        public static void main(String[] args)  
        {  
            ArrayList<String> cityNames = new ArrayList<String>();  
        
            cityNames.add("Dang");  
            cityNames.add("Butwal");  
            cityNames.add("Pokhara");  
            cityNames.add("Kathmandu");  
            cityNames.add("Palpa");  
        
            // Iterator to iterate the cityNames  
            Iterator iterator = cityNames.iterator();  
        
            System.out.println("CityNames elements : ");  
        
            while (iterator.hasNext())  
                System.out.print(iterator.next() + " ");  
        
            System.out.println();  
        }  
    }  




ListIterator(Child of Iterator):
---------------------------------
ListIterator is one of the four java cursors. It is a java iterator which is used to traverse all types of lists including ArrayList, Vector, LinkedList, Stack etc. It is available since Java 1.2. It extends the iterator interface.

Some Important points about ListIterator:
-----------------------------------------
1. It is useful for list implemented classes.
2. Available since java 1.2.
3. It supports bi-directional traversal. i.e both forward and backward direction.
4. It supports all the four CRUD operations(Create, Read, Update, Delete) operations.


Interesting Fact about ListIterator
-----------------------------------
There is no current element in ListIterator. Its cursor always lies between the previous and next elements. The previous() will return to the previous elements and the next() will return to the next element. Therefore, for a list of n length, there are n+1 possible cursors.

Declaration:
------------
public interface ListIterator<E> extends Iterator<E>

Syntax to get a list Iterator on a list:
----------------------------------------
ListIterator<E> listIterator()  

Program Example:
---------------
// java program to show the usage of listIterator
  
import java.util.*;
  
public class ListIteratorDemo {
    public static void main(String[] args)
    {
          // create a list of names
        List<String> names = new LinkedList<>();
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");
  
        // Getting ListIterator
        ListIterator<String> namesIterator
            = names.listIterator();
  
        // Traversing elements
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
  
        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }
}

ListIterator is a bi-directional iterator. For this functionality, it has two kinds of methods:
-----------------------------------------------------------------------------------------------
1.  Forward direction iteration

    hasNext(): This method returns true when the list has more elements to traverse while traversing in the forward direction
    next(): This method returns the next element of the list and advances the position of the cursor.
    nextIndex(): This method returns the index of the element that would be returned on calling the next() function.

2.  Backward direction iteration

    hasPrevious(): This method returns true when the list has more elements to traverse while traversing in the reverse direction
    previous(): This method returns the previous element of the list and shifts the cursor one position backwards.
    previousIndex(): This method returns the index of the element that would be returned on calling the previous() function.

Example:
--------
// java program to traverse the list both in forward and
// backward direction using listIterator
import java.util.*;

public class GFG {
	public static void main(String[] args)
	{
		// list of names
		List<String> names = new LinkedList<>();
		names.add("learn");
		names.add("from");
		names.add("Geeksforgeeks");

		// Getting ListIterator
		ListIterator<String> listIterator
			= names.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Traversing elements, the iterator is at the end
		// at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}




------------------------------------------------------------------------------------------------------------------------------


Lambda Expression(java 8):
--------------------------
Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

Q) Why use Lambda Expression
 
1. To provide the implementation of Functional interface.
2. Less coding.

Syntax:
-------
(argument-list)->{body}

Java lambda expression is consisted of three components:

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.


Without Lambda Expression:
---------------------------

    interface Drawable{  
        public void draw();  
    }  
    public class LambdaExpressionExample {  
        public static void main(String[] args) {  
            int width=10;  
      
            //without lambda, Drawable implementation using anonymous class  
            Drawable d=new Drawable(){  
                public void draw(){System.out.println("Drawing "+width);}  
            };  
            d.draw();  
        }  
    }  





Java Lambda Expression Example:
-------------------------------
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  




------------------------------------------------------------------------------------------------------------------------------


LinkedList:
-----------
Linked List is a part of the Collection framework present in java.util package. This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach to a node we wish to access.



Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:
i.  Java LinkedList class can contain duplicate elements.
ii. Java LinkedList class maintains insertion order.
iii.Java LinkedList class is non synchronized.
iv. In Java LinkedList class, manipulation is fast because no shifting needs to occur.
v.  Java LinkedList class can be used as a list, stack or queue.

Constructors of Java LinkedList:
--------------------------------
LinkedList() //It is used to construct an empty list.
LinkedList(Collection<? extends E>c)
//It is used to construct a list containing the element of the specified collection, in the order, they are returned by the collection iterator.

Methods of Java LinkedList
---------------------------
Method: 	                                                 Description:
------                                                          -------------
boolean add(E e) 	                                 It is used to append the specified element to the end of a list.
void add(int index, E element) 	                         It is used to insert the specified element at the specified position index in a list.
boolean addAll(Collection<? extends E> c) 	         It is used to append all of the elements in the specified collection to the end of this list, in the order                                                          that they are returned by the specified collection's iterator.
boolean addAll(Collection<? extends E> c) 	         It is used to append all of the elements in the specified collection to the end of this list, in the order                                                          that they are returned by the specified collection's iterator.
boolean addAll(int index, Collection<? extends E> c) 	 It is used to append all the elements in the specified collection, starting at the specified position of the                                                          list.
void addFirst(E e) 	                                 It is used to insert the given element at the beginning of a list.
void addLast(E e) 	                                 It is used to append the given element to the end of a list.
void clear() 	                                         It is used to remove all the elements from a list.
Object clone() 	                                         It is used to return a shallow copy of an ArrayList.
boolean contains(Object o) 	                         It is used to return true if a list contains a specified element.
Iterator<E> descendingIterator() 	                 It is used to return an iterator over the elements in a deque in reverse sequential order.
E element() 	                                         It is used to retrieve the first element of a list.
E get(int index) 	                                 It is used to return the element at the specified position in a list.
E getFirst() 	                                         It is used to return the first element in a list.
E getLast() 	                                         It is used to return the last element in a list.
int indexOf(Object o) 	                                 It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list                                                          does not contain any element.
int lastIndexOf(Object o) 	                         It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list                                                          does not contain any element.
ListIterator<E> listIterator(int index) 	         It is used to return a list-iterator of the elements in proper sequence, starting at the specified position in                                                          the list.
boolean offer(E e) 	                                 It adds the specified element as the last element of a list.
boolean offerFirst(E e) 	                         It inserts the specified element at the front of a list.
boolean offerLast(E e)                        	         It inserts the specified element at the end of a list.
E peek() 	                                         It retrieves the first element of a list
E peekFirst() 	                                         It retrieves the first element of a list or returns null if a list is empty.
E peekLast() 	                                         It retrieves the last element of a list or returns null if a list is empty.
E poll() 	                                         It retrieves and removes the first element of a list.
E pollFirst() 	                                         It retrieves and removes the first element of a list, or returns null if a list is empty.
E pollLast() 	                                         It retrieves and removes the last element of a list, or returns null if a list is empty.
E pop() 	                                         It pops an element from the stack represented by a list.
void push(E e) 	                                         It pushes an element onto the stack represented by a list.
E remove() 	                                         It is used to retrieve and removes the first element of a list.
E remove(int index) 	                                 It is used to remove the element at the specified position in a list.
boolean remove(Object o) 	                         It is used to remove the first occurrence of the specified element in a list.
E removeFirst() 	                                 It removes and returns the first element from a list.
boolean removeFirstOccurrence(Object o) 	         It is used to remove the first occurrence of the specified element in a list (when traversing the list from                                                          head to tail).
E removeLast() 	                                         It removes and returns the last element from a list.
boolean removeLastOccurrence(Object o) 	                 It removes the last occurrence of the specified element in a list (when traversing the list from head to                                                          tail).
E set(int index, E element) 	                         It replaces the element at the specified position in a list with the specified element.
Object[] toArray() 	                                 It is used to return an array containing all the elements in a list in proper sequence (from first to the last                                                          element).
<T> T[] toArray(T[] a)  	                         It returns an array containing all the elements in the proper sequence (from first to the last element); the                                                          runtime type of the returned array is that of the specified array.
int size() 	                                         It is used to return the number of elements in a list.




Example: The following implementation demonstrates how to create and use a linked list. 

import java.util.*;

public class Test {

	public static void main(String args[])
	{
		// Creating object of the
		// class linked list
		LinkedList<String> ll
			= new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}

output:
-------
[D, A, E, B, C]
[A]


Example Book:
-------------

    import java.util.*;  
    class Book {  
    int id;  
    String name,author,publisher;  
    int quantity;  
    public Book(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    }  
    public class LinkedListExample {  
    public static void main(String[] args) {  
        //Creating list of Books  
        List<Book> list=new LinkedList<Book>();  
        //Creating Books  
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
        //Adding Books to list  
        list.add(b1);  
        list.add(b2);  
        list.add(b3);  
        //Traversing list  
        for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
    }  
    }  



------------------------------------------------------------------------------------------------------------------------------
Difference between ArrayList and LinkedList:
-------------------------------------------
ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.

However, there are many differences between ArrayList and LinkedList classes that are given below.



ArrayList	                                                                LinkedList
----------                                                                      -----------

1) ArrayList internally uses a dynamic array to store the elements.	        LinkedList internally uses a doubly linked list to store the elements.
	
2) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque                                                                                  interfaces.
3) ArrayList is better for storing and accessing data.	                        LinkedList is better for manipulating data.

4) Manipulation with ArrayList is slow because it internally uses an array.     Maniplation with LinkedList is faster than ArrayList because it uses doubly linked list
If any element is removed from the array, all the bits are shifted in memory.	,so no bit is required in memory.                                                                          
------------------------------------------------------------------------------------------------------------------------------

Vector:
-------
Vector is like the dynamic array which can grow or shrink its size. Unlike array, we can store n-number of elements in it as there is no size limit. It is a part of Java Collection framework since Java 1.2. It is found in the java.util package and implements the List interface, so we can use all the methods of List interface here.

It is recommended to use the Vector class in the thread-safe implementation only. If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.

The Iterators returned by the Vector class are fail-fast. In case of concurrent modification, it fails and throws the ConcurrentModificationException.

It is similar to the ArrayList, but with two differences:

1. Vector is synchronized.
2. Java Vector contains many legacy methods that are not the part of a collections framework.



Java Vector Constructors:
-------------------------
vector()                                            It constructs an empty vector with the default size as 10.
vector(int initialCapacity)                         It constructs an empty vector with the specified initial capacity and with its capacity increment equal to zero.
vector(int initialCapacity, int capacityIncrement)  It constructs an empty vector with the specified initial capacity and capacity increment. 	
Vector( Collection<? extends E> c)                  It constructs a vector that contains the elements of a collection c.


Java Vector Methods:
--------------------

1) 	add()        It is used to append the specified element in the given vector.

2) 	addAll()     It is used to append all of the elements in the specified collection to the end of this Vector.

3) 	addElement() It is used to append the specified component to the end of this vector. It increases the vector size by one.

4) 	capacity()   It is used to get the current capacity of this vector.

5) 	clear()      It is used to delete all of the elements from this vector.

6) 	clone()      It returns a clone of this vector.

7) 	contains()   It returns true if the vector contains the specified element.

8) 	containsAll()It returns true if the vector contains all of the elements in the specified collection.

9) 	copyInto()
	It is used to copy the components of the vector into the specified array.

10) 	elementAt()
	It is used to get the component at the specified index.

11) 	elements()
	It returns an enumeration of the components of a vector.

12) 	ensureCapacity()
	It is used to increase the capacity of the vector which is in use, if necessary. It ensures that the vector can hold at least the number of components specified by the minimum capacity argument.

13) 	equals()
	It is used to compare the specified object with the vector for equality.

14) 	firstElement()
	It is used to get the first component of the vector.

15) 	forEach()
	It is used to perform the given action for each element of the Iterable until all elements have been processed or the action throws an exception.

16) 	get()
	It is used to get an element at the specified position in the vector.

17) 	hashCode()
	It is used to get the hash code value of a vector.

18) 	indexOf()
	It is used to get the index of the first occurrence of the specified element in the vector. It returns -1 if the vector does not contain the element.

19) 	insertElementAt()
	It is used to insert the specified object as a component in the given vector at the specified index.

20) 	isEmpty()
	It is used to check if this vector has no components.

21) 	iterator()
	It is used to get an iterator over the elements in the list in proper sequence.

22) 	lastElement()
	It is used to get the last component of the vector.

23) 	lastIndexOf()
	It is used to get the index of the last occurrence of the specified element in the vector. It returns -1 if the vector does not contain the element.

24) 	listIterator() 	It is used to get a list iterator over the elements in the list in proper sequence.

25) 	remove()
	It is used to remove the specified element from the vector. If the vector does not contain the element, it is unchanged.

26) 	removeAll()
	It is used to delete all the elements from the vector that are present in the specified collection.

27) 	removeAllElements()
	It is used to remove all elements from the vector and set the size of the vector to zero.

28) 	removeElement()
	It is used to remove the first (lowest-indexed) occurrence of the argument from the vector.

29) 	removeElementAt()
	It is used to delete the component at the specified index.

30) 	removeIf() 	It is used to remove all of the elements of the collection that satisfy the given predicate.
31) 	removeRange() 	It is used to delete all of the elements from the vector whose index is between fromIndex, inclusive and toIndex, exclusive.

32) 	replaceAll()
	It is used to replace each element of the list with the result of applying the operator to that element.

33) 	retainAll()
	It is used to retain only that element in the vector which is contained in the specified collection.

34) 	set() 	It is used to replace the element at the specified position in the vector with the specified element.

35) 	setElementAt() 	It is used to set the component at the specified index of the vector to the specified object.

36) 	setSize() 	It is used to set the size of the given vector.

37) 	size() 	It is used to get the number of components in the given vector.

38) 	sort() 	It is used to sort the list according to the order induced by the specified Comparator.

39) 	spliterator() 	It is used to create a late-binding and fail-fast Spliterator over the elements in the list.

40) 	subList() 	It is used to get a view of the portion of the list between fromIndex, inclusive, and toIndex, exclusive.

41) 	toArray() 	It is used to get an array containing all of the elements in this vector in correct order.

42) 	toString() 	It is used to get a string representation of the vector.

43) 	trimToSize() 	It is used to trim the capacity of the vector to the vector's current size.    



Example:
-------
    import java.util.*;  
    public class VectorExample1 {  
           public static void main(String args[]) {  
              //Create an empty vector with initial capacity 4  
              Vector<String> vec = new Vector<String>(4);  
              //Adding elements to a vector  
              vec.add("Tiger");  
              vec.add("Lion");  
              vec.add("Dog");  
              vec.add("Elephant");  
              //Check size and capacity  
              System.out.println("Size is: "+vec.size());  
              System.out.println("Default capacity is: "+vec.capacity());  
              //Display Vector elements  
              System.out.println("Vector element is: "+vec);  
              vec.addElement("Rat");  
              vec.addElement("Cat");  
              vec.addElement("Deer");  
              //Again check size and capacity after two insertions  
              System.out.println("Size after addition: "+vec.size());  
              System.out.println("Capacity after addition is: "+vec.capacity());  
              //Display Vector elements again  
              System.out.println("Elements are: "+vec);  
              //Checking if Tiger is present or not in this vector         
                if(vec.contains("Tiger"))  
                {  
                   System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
                }  
                else  
                {  
                   System.out.println("Tiger is not present in the list.");  
                }  
                //Get the first element  
              System.out.println("The first animal of the vector is = "+vec.firstElement());   
              //Get the last element  
              System.out.println("The last animal of the vector is = "+vec.lastElement());   
           }  
    }  




------------------------------------------------------------------------------------------------------------------------------



Set:
----
A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.

The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.

Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ.


Method & Description:
--------------------

1 add( )	 Adds an object to the collection.

2 clear( )       Removes all objects from the collection.

3 contains( )    Returns true if a specified object is an element within the collection.

4 isEmpty( )     Returns true if the collection has no elements.

5 iterator( )    Returns an Iterator object for the collection, which may be used to retrieve an object.

6 remove( )      Removes a specified object from the collection.

7 size( )        Returns the number of elements in the collection.



------------------------------------------------------------------------------------------------------------------------------

HashSet:
--------
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

1. HashSet stores the elements by using a mechanism called hashing.
2. HashSet contains unique elements only.
3. HashSet allows null value.
4. HashSet class is non synchronized.
5. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
6. HashSet is the best approach for search operations.
7. The initial default capacity of HashSet is 16, and the load factor is 0.75.

Difference between List and Set
A list can contain duplicate elements whereas Set contains unique elements only.

Hierarchy of HashSet class
The HashSet class extends AbstractSet class which implements Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.


HashSet class declaration:
public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  


Constructors of Java HashSet class:

SN	Constructor	                       Description
1)	HashSet()	                           It is used to construct a default HashSet.
2)	HashSet(int capacity)	                   It is used to initialize the capacity of the hash set to the given integer value capacity. The capacity grows                                                    automatically as elements are added to the HashSet.
3)	HashSet(int capacity, float loadFactor)	   It is used to initialize the capacity of the hash set to the given integer value capacity and the specified load                                                    factor.
4)	HashSet(Collection<? extends E> c)	   It is used to initialize the hash set by using the elements of the collection c.


Methods of Java HashSet class:


SN	Modifier & Type	Method	                                          Description
1)	boolean	   add(E e)                                It is used to add the specified element to this set if it is not already present.
2)	void	   clear()                                 It is used to remove all of the elements from the set.
3)	object	   clone()                                 It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
4)	boolean	   contains(Object o)                      It is used to return true if this set contains the specified element.
5)	boolean    isEmpty()                               It is used to return true if this set contains no elements.
6)	Iterator<E> iterator()                             It is used to return an iterator over the elements in this set.
7)	boolean	    remove(Object o)                       It is used to remove the specified element from this set if it is present.
8)	int  	    size()                                 It is used to return the number of elements in the set.
9)	Spliterator<E>	spliterator()                      It is used to create a late-binding and fail-fast Spliterator over the elements in the set.


Java HashSet Example
Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.

import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  


Java HashSet example to remove elements
Here, we see different ways to remove an element

public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);  
           //Removing specific element from HashSet  
           set.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);  
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           //Removing elements on the basis of specified condition  
           set.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set);  
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
}  


Java HashSet from another Collection:

import java.util.*;  
class HashSet4{  
 public static void main(String args[]){  
   ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");  
             
           HashSet<String> set=new HashSet(list);  
           set.add("Gaurav");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  


Java HashSet Example: Book
Let's see a HashSet example where we are adding books to set and printing all the books.

import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class HashSetExample {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  

-----------------------------------------------------------------------------------------------------------------------------

Java LinkedHashSet class:
-------------------------
Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

The important points about Java LinkedHashSet class are:

1.Java LinkedHashSet class contains unique elements only like HashSet.
2.Java LinkedHashSet class provides all optional set operation and permits null elements.
3.Java LinkedHashSet class is non synchronized.
4.Java LinkedHashSet class maintains insertion order.


Hierarchy of LinkedHashSet class
The LinkedHashSet class extends HashSet class which implements Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.

LinkedHashSet class declaration
Let's see the declaration for java.util.LinkedHashSet class.
public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable 


Constructors of Java LinkedHashSet class:
Constructor	                                     Description
HashSet()	                                It is used to construct a default HashSet.
HashSet(Collection c)	                        It is used to initialize the hash set by using the elements of the collection c.
LinkedHashSet(int capacity)	                It is used initialize the capacity of the linked hash set to the given integer value capacity.
LinkedHashSet(int capacity, float fillRatio)	It is used to initialize both the capacity and the fill ratio (also called load capacity) of the hash set from its                                                 argument.

-----------------------------------------------------------------------------------------------------------------------------

Java TreeSet class:
-------------------
Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

1.Java TreeSet class contains unique elements only like HashSet.
2.Java TreeSet class access and retrieval times are quiet fast.
3.Java TreeSet class doesn't allow null element.
4.Java TreeSet class is non synchronized.
5.Java TreeSet class maintains ascending order.

Hierarchy of TreeSet class:
Java TreeSet class implements the NavigableSet interface. The NavigableSet interface extends SortedSet, Set, Collection and Iterable interfaces in hierarchical order.

TreeSet class declaration
Let's see the declaration for java.util.TreeSet class.
public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable


Constructors of Java TreeSet class:

Constructor	                                       Description
TreeSet()	                                It is used to construct an empty tree set that will be sorted in ascending order according to the natural order of the                                                 tree set.
TreeSet(Collection<? extends E> c)	        It is used to build a new tree set that contains the elements of the collection c.
TreeSet(Comparator<? super E> comparator)	It is used to construct an empty tree set that will be sorted according to given comparator.
TreeSet(SortedSet<E> s)	                        It is used to build a TreeSet that contains the elements of the given SortedSet.


Methods of Java TreeSet class:

Method	                                             Description
boolean add(E e)	                        It is used to add the specified element to this set if it is not already present.
boolean addAll(Collection<? extends E> c)	It is used to add all of the elements in the specified collection to this set.
E ceiling(E e)	                                It returns the equal or closest greatest element of the specified element from the set, or null there is no                                                             such element.
Comparator<? super E> comparator()	        It returns comparator that arranged elements in order.
Iterator descendingIterator()	                It is used iterate the elements in descending order.
NavigableSet descendingSet()	                It returns the elements in reverse order.
E floor(E e)	                                It returns the equal or closest least element of the specified element from the set, or null there is no such element.
SortedSet headSet(E toElement)	                It returns the group of elements that are less than the specified element.

NavigableSet headSet(E toElement, boolean inclusive)	
It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.

E higher(E e)	                                It returns the closest greatest element of the specified element from the set, or null there is no such element.
Iterator iterator()	                        It is used to iterate the elements in ascending order.
E lower(E e)	                                It returns the closest least element of the specified element from the set, or null there is no such element.
E pollFirst()	                                It is used to retrieve and remove the lowest(first) element.
E pollLast()	                                It is used to retrieve and remove the highest(last) element.
Spliterator spliterator()	                It is used to create a late-binding and fail-fast spliterator over the elements.

NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)	
It returns a set of elements that lie between the given range.

SortedSet subSet(E fromElement, E toElement))	It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
SortedSet tailSet(E fromElement)	        It returns a set of elements that are greater than or equal to the specified element.

NavigableSet tailSet(E fromElement, boolean inclusive)	
It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.

boolean contains(Object o)	                It returns true if this set contains the specified element.
boolean isEmpty()	                        It returns true if this set contains no elements.
boolean remove(Object o)	                It is used to remove the specified element from this set if it is present.
void clear()	                                It is used to remove all of the elements from this set.
Object clone()	                                It returns a shallow copy of this TreeSet instance.
E first()	                                It returns the first (lowest) element currently in this sorted set.
E last()	                                It returns the last (highest) element currently in this sorted set.
int size()	                                It returns the number of elements in this set.



Java TreeSet Examples:

import java.util.*;  
class TreeSet1{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  


Java TreeSet Example 2:
Let's see an example of traversing elements in descending order.

import java.util.*;  
class TreeSet2{  
 public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
 }  
}  


Java TreeSet Example 3:
Let's see an example to retrieve and remove the highest and lowest Value.

import java.util.*;  
class TreeSet3{  
 public static void main(String args[]){  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15);  
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
 }  
}  

Java TreeSet Example 4:
In this example, we perform various NavigableSet operations.

import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false));  
 }  
}  

Java TreeSet Example 4:
In this example, we perform various SortedSetSet operations.

import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println("Intial Set: "+set);  
           
         System.out.println("Head Set: "+set.headSet("C"));  
          
         System.out.println("SubSet: "+set.subSet("A", "E"));  
           
         System.out.println("TailSet: "+set.tailSet("C"));  
 }  
}  



Java TreeSet Example: Book
Let's see a TreeSet example where we are adding books to set and printing all the books. The elements in TreeSet must be of a Comparable type. String and Wrapper classes are Comparable by default. To add user-defined objects in TreeSet, you need to implement the Comparable interface.

import java.util.*;  
class Book implements Comparable<Book>{  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(Book b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class TreeSetExample {  
public static void main(String[] args) {  
    Set<Book> set=new TreeSet<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  

-----------------------------------------------------------------------------------------------------------------------------

Comparable interface:
--------------------
Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

compareTo(Object obj) method
public int compareTo(Object obj): It is used to compare the current object with the specified object.It returns

	1.positive integer, if the current object is greater than the specified object.
	2.negative integer, if the current object is less than the specified object.
	3.zero, if the current object is equal to the specified object.

We can sort the elements of:

1.String objects
2.Wrapper class objects
3.User-defined class objects

Collections class
Collections class provides static methods for sorting the elements of collections. If collection elements are of Set or Map, we can use TreeSet or TreeMap. However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.

Method of Collections class for sorting List elements
public void sort(List list): It is used to sort the elements of List. List elements must be of the Comparable type.


Java Comparable Example
Let's see the example of the Comparable interface that sorts the list elements on the basis of age.

//Student.java
class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}  

//TestSort1.java
import java.util.*;  
public class TestSort1{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
Collections.sort(al);  
for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  




Java Comparable Example: reverse order
Let's see the same example of the Comparable interface that sorts the list elements on the basis of age in reverse order.

// File: Student.java
class Student implements Comparable<Student>{    
 int rollno;    
 String name;    
 int age;    
 Student(int rollno,String name,int age){    
 this.rollno=rollno;    
 this.name=name;    
 this.age=age;    
 }    
     
 public int compareTo(Student st){    
 if(age==st.age)    
 return 0;    
 else if(age<st.age)    
 return 1;    
 else    
 return -1;    
 }    
 }    

//File: TestSort2.java
import java.util.*;    
public class TestSort2{    
public static void main(String args[]){    
ArrayList<Student> al=new ArrayList<Student>();    
al.add(new Student(101,"Vijay",23));    
al.add(new Student(106,"Ajay",27));    
al.add(new Student(105,"Jai",21));    
    
Collections.sort(al);    
for(Student st:al){    
System.out.println(st.rollno+" "+st.name+" "+st.age);    
}    
}    
}    

-----------------------------------------------------------------------------------------------------------------------------

Comparator interface:
---------------------
Java Comparator interface is used to order the objects of a user-defined class.
This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member, for example, rollno, name, age or anything else.


Methods of Java Comparator Interface:


	Method	                                                   Description
public int compare(Object obj1, Object obj2)	It compares the first object with the second object.
public boolean equals(Object obj)	        It is used to compare the current object with the specified object.
public boolean equals(Object obj)	        It is used to compare the current object with the specified object.


Collections class
Collections class provides static methods for sorting the elements of a collection. If collection elements are of Set or Map, we can use TreeSet or TreeMap. However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements also.

Method of Collections class for sorting List elements
public void sort(List list, Comparator c): is used to sort the elements of List by the given Comparator.


Java Comparator Example (Non-generic Old Style)
Let's see the example of sorting the elements of List on the basis of age and name. In this example, we have created 4 java classes:

Student.java
AgeComparator.java
NameComparator.java
Simple.java


Student.java
This class contains three fields rollno, name and age and a parameterized constructor.

class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  

AgeComparator.java
This class defines comparison logic based on the age. If the age of the first object is greater than the second, we are returning a positive value. It can be anyone such as 1, 2, 10. If the age of the first object is less than the second object, we are returning a negative value, it can be any negative value, and if the age of both objects is equal, we are returning 0.

import java.util.*;  
class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


NameComparator.java
This class provides comparison logic based on the name. In such case, we are using the compareTo() method of String class, which internally provides the comparison logic.

import java.util.*;  
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  

Simple.java
In this class, we are printing the values of the object by sorting on the basis of name and age.

import java.util.*;  
import java.io.*;  
  
class Simple{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new NameComparator());  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Student st=(Student)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
  
}  
}  


Java Comparator Example (Generic)

Student.java

class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  


AgeComparator.java

import java.util.*;  
class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


NameComparator.java
This class provides comparison logic based on the name. In such case, we are using the compareTo() method of String class, which internally provides the comparison logic.

import java.util.*;  
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  


Simple.java
In this class, we are printing the values of the object by sorting on the basis of name and age.
import java.util.*;  
import java.io.*;  
class Simple{  
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new NameComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  

-----------------------------------------------------------------------------------------------------------------------------

Map Inteface:
-------------
A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.

A Map is useful if you have to search, update or delete elements on the basis of a key.

Java Map Hierarchy

There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.

A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

Class	                                        Description
HashMap	                           HashMap is the implementation of Map, but it doesn't maintain any order.
LinkedHashMap	                   LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains                                   insertion order.
TreeMap	                           TreeMap is the implementation of Map and SortedMap. It maintains ascending order.

Useful methods of Map interface
-------------------------------
Method	                                    Description
V put(Object key, Object value)	            It is used to insert an entry in the map.

void putAll(Map map)	                    It is used to insert the specified map in the map.

V putIfAbsent(K key, V value)	            It inserts the specified value with the specified key in the map only if it is                                            not already specified.
V remove(Object key)	                    It is used to delete an entry for the specified key.

boolean remove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.

Set keySet()	                            It returns the Set view containing all the keys.

Set<Map.Entry<K,V>> entrySet()	            It returns the Set view containing all the keys and values.

void clear()	                            It is used to reset the map.

V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	
It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).

V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	
It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.

V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	
It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
boolean containsValue(Object value)	        This method returns true if some value equal to the value exists within the map,                                            else return false.
boolean containsKey(Object key)	            This method returns true if some key equal to the key exists within the map,                                            else return false.
boolean equals(Object o)	                It is used to compare the specified Object with the Map.

void forEach(BiConsumer<? super K,? super V> action)	
It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.

V get(Object key)	                        This method returns the object that contains the value associated with the key.

V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped, or defaultValue if                                            the map contains no mapping for the key.
int hashCode()	                            It returns the hash code value for the Map

boolean isEmpty()	                        This method returns true if the map is empty; returns false if it contains at                                            least one key.

V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	
If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.

V replace(K key, V value)	                        It replaces the specified value for a specified key.

boolean replace(K key, V oldValue, V newValue)	    It replaces the old value with the new value for a specified key.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)	
It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

Collection values()	                                 It returns a collection view of the values contained in the map.

int size()	                                         This method returns the number of entries in the map.


Map.Entry Interface:

Entry is the subinterface of Map. So we will be accessed it by Map.Entry name. It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value.


Methods of Map.Entry interface

Method	                                        Description
K getKey()	                               It is used to obtain a key.

V getValue()	                           It is used to obtain value.

int hashCode()	                           It is used to obtain hashCode.

V setValue(V value)	                       It is used to replace the value corresponding to this entry with the specified                                           value.
boolean equals(Object o)	               It is used to compare the specified object with the other existing objects.

static <K extends Comparable<? super K>,V> Comparator<Map.Entry<K,V>> comparingByKey()	
It returns a comparator that compare the objects in natural order on key.

static <K,V> Comparator<Map.Entry<K,V>> comparingByKey(Comparator<? super K> cmp)	
It returns a comparator that compare the objects by key using the given Comparator.

static <K,V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue()	
It returns a comparator that compare the objects in natural order on value.

static <K,V> Comparator<Map.Entry<K,V>> comparingByValue(Comparator<? super V> cmp)	
It returns a comparator that compare the objects by value using the given Comparator.


Java Map Example: Non-Generic (Old Style)
   
ccx   //Non-generic  
    import java.util.*;  
    public class MapExample1 {  
    public static void main(String[] args) {  
        Map map=new HashMap();  
        //Adding elements to map  
        map.put(1,"Amit");  
        map.put(5,"Rahul");  
        map.put(2,"Jai");  
        map.put(6,"Amit");  
        //Traversing Map  
        Set set=map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" "+entry.getValue());  
        }  
    }  
    }  
	
	
	Java Map Example: Generic (New Style)
	    
	import java.util.*;  
    class MapExample2{  
     public static void main(String args[]){  
      Map<Integer,String> map=new HashMap<Integer,String>();  
      map.put(100,"Amit");  
      map.put(101,"Vijay");  
      map.put(102,"Rahul");  
      //Elements can traverse in any order  
      for(Map.Entry m:map.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
     }  
    }  
	
	Java Map Example: comparingByKey()
	
	import java.util.*;  
class MapExample3{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Amit");    
      map.put(101,"Vijay");    
      map.put(102,"Rahul");   
      //Returns a Set view of the mappings contained in this map        
      map.entrySet()  
      //Returns a sequential Stream with this collection as its source  
      .stream()  
      //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByKey())  
      //Performs an action for each element of this stream  
      .forEach(System.out::println);  
 }  
}  

Java Map Example: comparingByKey() in Descending Order

    import java.util.*;  
    class MapExample4{  
     public static void main(String args[]){  
    Map<Integer,String> map=new HashMap<Integer,String>();          
          map.put(100,"Amit");    
          map.put(101,"Vijay");    
          map.put(102,"Rahul");    
          //Returns a Set view of the mappings contained in this map    
          map.entrySet()  
          //Returns a sequential Stream with this collection as its source  
          .stream()  
          //Sorted according to the provided Comparator  
          .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
          //Performs an action for each element of this stream  
          .forEach(System.out::println);  
     }  
    }  
---------------------------------------------------------------------------------------------------------------------------	
	
Java HashMap:
-------------
Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key. It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in the java.util package.

HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class and implements the Map interface.

Points to remember

1. Java HashMap contains values based on the key.
2. Java HashMap contains only unique keys.
3. Java HashMap may have one null key and multiple null   values.
4. Java HashMap is non synchronized.
5. Java HashMap maintains no order.
6. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.


Hierarchy of HashMap class:
---------------------------
HashMap class extends AbstractMap class and implements Map interface.

HashMap class declaration

Let's see the declaration for java.util.HashMap class.
public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

HashMap class Parameters

Let's see the Parameters for java.util.HashMap class.

    K: It is the type of keys maintained by this map.
    V: It is the type of mapped values.


Constructors of Java HashMap class:

Constructor	                                     Description
HashMap()	                                     It is used to construct a default HashMap.
HashMap(Map<? extends K,? extends V> m)	         It is used to initialize the hash map by using the elements of the given                                                 Map object m.
HashMap(int capacity)	                         It is used to initializes the capacity of the hash map to the given integer                                                 value, capacity.
HashMap(int capacity, float loadFactor)	         It is used to initialize both the capacity and load factor of the hash map                                                 by using its arguments.
-----------------------------------------------------------------------------------------------------------------------------

Methods of Java HashMap class:
-------------------------------

Method	                                 Description
void clear()	                             It is used to remove all of the mappings from this map.

boolean isEmpty()	                         It is used to return true if this map contains no key-value mappings.

Object clone()	                             It is used to return a shallow copy of this HashMap instance: the keys and     										values themselves are not cloned.
Set entrySet()	                             It is used to return a collection view of the mappings contained in this map.

Set keySet()	                             It is used to return a set view of the keys contained in this map.

V put(Object key, Object value)	             It is used to insert an entry in the map.

void putAll(Map map)	                     It is used to insert the specified map in the map.

V putIfAbsent(K key, V value)	             It inserts the specified value with the specified key in the map only if it is 											not already specified.
V remove(Object key)	                     It is used to delete an entry for the specified key.

boolean remove(Object key, Object value)	 It removes the specified values with the associated specified keys from the map.

V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	
It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).

V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	
It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.

V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	
It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is presentand non-null.

boolean containsValue(Object value)	         This method returns true if some value equal to the value exists within the
											 map, else return false.

boolean containsKey(Object key)	             This method returns true if some key equal to the key exists within the map,  		                                      else return false.

boolean equals(Object o)	                 It is used to compare the specified Object with the Map.

void forEach(BiConsumer<? super K,? super V> action)	
It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.

V get(Object key)	                        This method returns the object that contains the value associated with the key.

V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped, or defaultValue if 											 the map contains no mapping for the key.

boolean isEmpty()	                        This method returns true if the map is empty; returns false if it contains at  											 least one key.

V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	
If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.

V replace(K key, V value)	                     It replaces the specified value for a specified key.

boolean replace(K key, V oldValue, V newValue)	 It replaces the old value with the new value for a specified key.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)	
It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

Collection<V> values()	                          It returns a collection view of the values contained in the map.

int size()	                                      This method returns the number of entries in the map.


Java HashMap Example

Let's see a simple example of HashMap to store key and value pair.
    import java.util.*;  
    public class HashMapExample1{  
     public static void main(String args[]){  
       HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
       map.put(1,"Mango");  //Put elements in Map  
       map.put(2,"Apple");    
       map.put(3,"Banana");   
       map.put(4,"Grapes");   
           
       System.out.println("Iterating Hashmap...");  
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
       }  
    }  
    }  
	
	In this example, we are storing Integer as the key and String as the value, so we are using HashMap<Integer,String> as the type. The put() method inserts the elements in the map.

To get the key and value elements, we should call the getKey() and getValue() methods. The Map.Entry interface contains the getKey() and getValue() methods. But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.

-----------------------------------------------------------------------------------------------------------------------------
Java LinkedHashMap class:

Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

Points to remember

    Java LinkedHashMap contains values based on the key.
    Java LinkedHashMap contains unique elements.
    Java LinkedHashMap may have one null key and multiple null values.
    Java LinkedHashMap is non synchronized.
    Java LinkedHashMap maintains insertion order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

LinkedHashMap class declaration
public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V> 

LinkedHashMap class Parameters

Let's see the Parameters for java.util.LinkedHashMap class.

    K: It is the type of keys maintained by this map.
    V: It is the type of mapped values.

Constructors of Java LinkedHashMap class

Constructor	                                           Description

LinkedHashMap()	                                It is used to construct a default LinkedHashMap.

LinkedHashMap(int capacity)	                    It is used to initialize a LinkedHashMap with the given capacity.

LinkedHashMap(int capacity, float loadFactor)	It is used to initialize both the capacity and the load factor.

LinkedHashMap(int capacity, float loadFactor, boolean accessOrder)	
It is used to initialize both the capacity and the load factor with specified ordering mode.

LinkedHashMap(Map<? extends K,? extends V> m)	It is used to initialize the LinkedHashMap with the elements from the given                                                Map class m.

Methods of Java LinkedHashMap class

Method	                                               Description

V get(Object key)	                               It returns the value to which the specified key is mapped.

void clear()	                                   It removes all the key-value pairs from a map.

boolean containsValue(Object value)	               It returns true if the map maps one or more keys to the specified value.

Set<Map.Entry<K,V>> entrySet()	                   It returns a Set view of the mappings contained in the map.

void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all                                                        entries have been processed or the action throws an exception.
V getOrDefault(Object key, V defaultValue)	       It returns the value to which the specified key is mapped or defaultValue                                                   if this map contains no mapping for the key.

Set<K> keySet()	                                   It returns a Set view of the keys contained in the map

protected boolean removeEldestEntry(Map.Entry<K,V> eldest)	            It returns true on removing its eldest entry.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)	
It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

Collection<V> values()	                      It returns a Collection view of the values contained in this map.

-----------------------------------------------------------------------------------------------------------------------------

Java TreeMap class:
Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value pairs in sorted order.

The important points about Java TreeMap class are:

    Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
    Java TreeMap contains only unique elements.
    Java TreeMap cannot have a null key but can have multiple null values.
    Java TreeMap is non synchronized.
    Java TreeMap maintains ascending order.

TreeMap class declaration:
    public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable  
	
TreeMap class Parameters
Let's see the Parameters for java.util.TreeMap class.


    K: It is the type of keys maintained by this map.
    V: It is the type of mapped values.


Constructors of Java TreeMap class

Constructor	                                         Description
TreeMap()	                                   It is used to construct an empty tree map that will be sorted using the  		                                     natural order of its key.
TreeMap(Comparator<? super K> comparator)	   It is used to construct an empty tree-based map that will be sorted using the                                               comparator comp.
TreeMap(Map<? extends K,? extends V> m)	       It is used to initialize a treemap with the entries from m, which will be 		                                       sorted using the natural order of the keys.
TreeMap(SortedMap<K,? extends V> m)	           It is used to initialize a treemap with the entries from the SortedMap sm, 		                                        which will be sorted in the same order as sm.	


Methods of Java TreeMap class

Method	                                               Description
Map.Entry<K,V> ceilingEntry(K key)	                 It returns the key-value pair having the least key, greater than or 													 equal to the specified key, or null if there is no such key.
K ceilingKey(K key)	                                 It returns the least key, greater than the specified key or null if 											         there is no such key.
void clear()	                                     It removes all the key-value pairs from a map.
Object clone()	                                     It returns a shallow copy of TreeMap instance.
Comparator<? super K> comparator()	                 It returns the comparator that arranges the key in order, or null if 						                              the map uses the natural ordering.
NavigableSet<K> descendingKeySet()	                 It returns a reverse order NavigableSet view of the keys contained in 													   the map.
NavigableMap<K,V> descendingMap()	                 It returns the specified key-value pairs in descending order.
Map.Entry firstEntry()	                             It returns the key-value pair having the least key.
Map.Entry<K,V> floorEntry(K key)	                 It returns the greatest key, less than or equal to the specified key, 			                                           or null if there is no such key.
void forEach(BiConsumer<? super K,? super V> action) It performs the given action for each entry in the map until all                                                     entries have been processed or the action throws an exception.
SortedMap<K,V> headMap(K toKey)	                     It returns the key-value pairs whose keys are strictly less than toKey.
NavigableMap<K,V> headMap(K toKey, boolean inclusive)It returns the key-value pairs whose keys are less than (or equal to if                                                     inclusive is true) toKey.
Map.Entry<K,V> higherEntry(K key)	                 It returns the least key strictly greater than the given key, or null  	                                               if there is no such key.
K higherKey(K key)	                                 It is used to return true if this map contains a mapping for the 			                                          specified key.
Set keySet()	                                     It returns the collection of keys exist in the map.
Map.Entry<K,V> lastEntry()	                         It returns the key-value pair having the greatest key, or null if there                                                     is no such key.
Map.Entry<K,V> lowerEntry(K key)	                 It returns a key-value mapping associated with the greatest key            									     strictly less than the given key, or null if there is no such key.
K lowerKey(K key)	                                 It returns the greatest key strictly less than the given key, or null 													   if there is no such key.
NavigableSet<K> navigableKeySet()	                 It returns a NavigableSet view of the keys contained in this map.
Map.Entry<K,V> pollFirstEntry()	                     It removes and returns a key-value mapping associated with the least  		                                              key in this map, or null if the map is empty.
Map.Entry<K,V> pollLastEntry()	                     It removes and returns a key-value mapping associated with the greatest                                                     key in this map, or null if the map is empty.
V put(K key, V value)	                             It inserts the specified value with the specified key in the map.
void putAll(Map<? extends K,? extends V> map)	     It is used to copy all the key-value pair from one map to another map.
V replace(K key, V value)	                         It replaces the specified value for a specified key.
boolean replace(K key, V oldValue, V newValue)	     It replaces the old value with the new value for a specified key.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)	
It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)	
It returns key-value pairs whose keys range from fromKey to toKey.

SortedMap<K,V> subMap(K fromKey, K toKey)	It returns key-value pairs whose keys range from fromKey, inclusive, to toKey,  		                                  exclusive.
SortedMap<K,V> tailMap(K fromKey)	        It returns key-value pairs whose keys are greater than or equal to fromKey.

NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)	
It returns key-value pairs whose keys are greater than (or equal to, if inclusive is true) fromKey.

boolean containsKey(Object key)	            It returns true if the map contains a mapping for the specified key.
boolean containsValue(Object value)	        It returns true if the map maps one or more keys to the specified value.
K firstKey()	                            It is used to return the first (lowest) key currently in this sorted map.
V get(Object key)	                        It is used to return the value to which the map maps the specified key.
K lastKey()	                                It is used to return the last (highest) key currently in the sorted map.
V remove(Object key)	                    It removes the key-value pair of the specified key from the map.
Set<Map.Entry<K,V>> entrySet()	            It returns a set view of the mappings contained in the map.
int size()	                                It returns the number of key-value pairs exists in the hashtable.
Collection values()	                        It returns a collection view of the values contained in the map.


Java TreeMap Example:
---------------------
    import java.util.*;  
    class TreeMap1{  
     public static void main(String args[]){  
       TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(100,"Amit");    
          map.put(102,"Ravi");    
          map.put(101,"Vijay");    
          map.put(103,"Rahul");    
            
          for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }    
     }  
    }  
	

Java TreeMap Example: remove()

    import java.util.*;  
    public class TreeMap2 {  
       public static void main(String args[]) {  
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(100,"Amit");    
          map.put(102,"Ravi");    
          map.put(101,"Vijay");    
          map.put(103,"Rahul");    
          System.out.println("Before invoking remove() method");  
          for(Map.Entry m:map.entrySet())  
          {  
              System.out.println(m.getKey()+" "+m.getValue());      
          }  
          map.remove(102);      
          System.out.println("After invoking remove() method");  
          for(Map.Entry m:map.entrySet())  
          {  
              System.out.println(m.getKey()+" "+m.getValue());      
          }  
          }  
    }  
	
	
Java TreeMap Example: NavigableMap
    
	import java.util.*;  
    class TreeMap3{  
     public static void main(String args[]){  
       NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(100,"Amit");    
          map.put(102,"Ravi");    
          map.put(101,"Vijay");    
          map.put(103,"Rahul");    
          //Maintains descending order  
          System.out.println("descendingMap: "+map.descendingMap());  
          //Returns key-value pairs whose keys are less than or equal to the specified key.  
          System.out.println("headMap: "+map.headMap(102,true));  
          //Returns key-value pairs whose keys are greater than or equal to the specified key.  
          System.out.println("tailMap: "+map.tailMap(102,true));  
          //Returns key-value pairs exists in between the specified key.  
          System.out.println("subMap: "+map.subMap(100, false, 102, true));   
     }  
    }  	
	
Java TreeMap Example: SortedMap

    import java.util.*;  
    class TreeMap4{  
     public static void main(String args[]){  
       SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(100,"Amit");    
          map.put(102,"Ravi");    
          map.put(101,"Vijay");    
          map.put(103,"Rahul");    
          //Returns key-value pairs whose keys are less than the specified key.  
          System.out.println("headMap: "+map.headMap(102));  
          //Returns key-value pairs whose keys are greater than or equal to the specified key.  
          System.out.println("tailMap: "+map.tailMap(102));  
          //Returns key-value pairs exists in between the specified key.  
          System.out.println("subMap: "+map.subMap(100, 102));    
     }  
    }  
	
What is difference between HashMap and TreeMap?

HashMap	                                        TreeMap
1) HashMap can contain one null key.	       TreeMap cannot contain any null key.
2) HashMap maintains no order.	               TreeMap maintains ascending order.


Java TreeMap Example: Book
   
   import java.util.*;    
    class Book {    
    int id;    
    String name,author,publisher;    
    int quantity;    
    public Book(int id, String name, String author, String publisher, int quantity) {    
        this.id = id;    
        this.name = name;    
        this.author = author;    
        this.publisher = publisher;    
        this.quantity = quantity;    
    }    
    }    
    public class MapExample {    
    public static void main(String[] args) {    
        //Creating map of Books    
        Map<Integer,Book> map=new TreeMap<Integer,Book>();    
        //Creating Books    
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
        //Adding Books to map   
        map.put(2,b2);  
        map.put(1,b1);  
        map.put(3,b3);  
          
        //Traversing map  
        for(Map.Entry<Integer, Book> entry:map.entrySet()){    
            int key=entry.getKey();  
            Book b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
        }    
    }    
    }    
	
	
	-------------------------------------------------------------------------------------------------------------------------
	
Java Hashtable class

Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.
Points to remember

    A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
    Java Hashtable class contains unique elements.
    Java Hashtable class doesn't allow null key or value.
    Java Hashtable class is synchronized.
    The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.

Hashtable class declaration
public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable

Hashtable class Parameters

Let's see the Parameters for java.util.Hashtable class.

    K: It is the type of keys maintained by this map.
    V: It is the type of mapped values.


Constructors of Java Hashtable class

Constructor	                                          Description
Hashtable()	                               It creates an empty hashtable having the initial default capacity and load factor.

Hashtable(int capacity)	                   It accepts an integer parameter and creates a hash table that contains a 			                              specified initial capacity.
Hashtable(int capacity, float loadFactor)  It is used to create a hash table having the specified initial capacity and 											 loadFactor.

Hashtable(Map<? extends K,? extends V> t)  It creates a new hash table with the same mappings as the given Map.


---------------------------------------------------------------------------------------------------------------------------

Java Collections class

Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

The important points about Java Collections class are:

    Java Collection class supports the polymorphic algorithms that operate on collections.
    Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.

Collections class declaration

Let's see the declaration for java.util.Collections class.

    public class Collections extends Object 
	
	