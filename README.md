# Thread_Runnable_Java

https://www.geeksforgeeks.org/java-lang-thread-class-java/

Java.lang.Thread class in Java
Thread a line of execution within a program. Each program can have multiple associated threads. Each thread has a priority which is used by thread scheduler to determine which thread must run first. Java provides a thread class that has various method calls inorder to manage the behaviour of threads.
Note: Every class that is used as thread must implement Runnable interface and over ride it’s run method.

Constructors:

Thread(): Allocates a new Thread object

Thread(Runnable target): Allocates a new Thread object

Thread(Runnable target, String name): Allocates a new Thread object

Thread(String name): Allocates a new Thread object

Thread(ThreadGroup group, Runnable target): Allocates a new Thread object

Thread(ThreadGroup group, Runnable target, String name): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group

Thread(ThreadGroup group, Runnable target, String name, long stackSize): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group, and has the specified stack size
Thread(ThreadGroup group, String name): CAllocates a new Thread object
Declaration:

public class Thread

    extends Object
    
    implements Runnable
    
Methods:

activeCount(): java.lang.Thread.activeCount() Returns an estimate of the number of active threads in the current thread’s thread group and its subgroups

Syntax:



 

public static int activeCount()

Returns:

an estimate of the number of active threads in the current

thread's thread group and in any other thread group that has 

the current thread's thread group as an ancestor



checkAccess(): java.lang.Thread.checkAccess() Determines if the currently running thread has permission to modify this thread

Syntax:

public final void checkAccess()

Throws:

SecurityException - if the current thread is not allowed to 

access this thread.

clone(): java.lang.Thread.clone() Throws CloneNotSupportedException as a Thread can not be meaningfully cloned

Syntax:

protected Object clone() throws CloneNotSupportedException

Throws:



CloneNotSupportedException - always

Returns:

a clone of this instance

currentThread(): java.lang.Thread.currentThread() Returns a reference to the currently executing thread object

Syntax:

public static Thread currentThread()

Returns:

the currently executing thread



dumpStack(): java.lang.Thread.dumpStack() Prints a stack trace of the current thread to the standard error stream

Syntax:

public static void dumpStack()

Description:

Prints a stack trace of the current thread to the standard

error stream. This method is used only for debugging



enumerate(Thread[] tarray): java.lang.Thread.enumerate(Thread[] tarray) Copies into the specified array every active thread in the 

current thread’s thread group and its subgroups


Syntax:

public static int enumerate(Thread[] tarray)

Parameters:

tarray - an array into which to put the list of threads

Returns:

the number of threads put into the array

Throws:

SecurityException - if ThreadGroup.checkAccess() 

determines that the current thread cannot 

access its thread group



getAllStackTraces(): java.lang.Thread.getAllStackTraces() Returns a map of stack traces for all live threads

Syntax:

public static Map getAllStackTraces()

Returns:

a Map from Thread to an array of StackTraceElement that represents 

the stack trace of the corresponding thread

Throws:

SecurityException - if a security manager exists and its checkPermission method 

doesn't allow getting the stack trace of thread



getContextClassLoader(): java.lang.Thread.getContextClassLoader() Returns the context ClassLoader for this Thread

Syntax:

public ClassLoader getContextClassLoader()

Returns:

the context ClassLoader for this Thread, or null indicating the system class loader 

(or, failing that, the bootstrap class loader)

Throws: 

SecurityException - if the current thread cannot get the context ClassLoader



getDefaultUncaughtExceptionHandler(): java.lang.Thread.getDefaultUncaughtExceptionHandler() Returns the default handler invoked when a

thread abruptly terminates due to an uncaught exception

Syntax:

public static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()

Returns:

the default uncaught exception handler for all threads



getId(): java.lang.Thread.getId() Returns the identifier of this Thread

Syntax:

public long getId()
Returns:
this thread's ID
getName(): java.lang.Thread.getName() Returns this thread’s name
Syntax:



 

public final String getName()
Returns:
this thread's name
getPriority(): java.lang.Thread.getPriority() Returns this thread’s priority
Syntax:

public final int getPriority()
Returns:
this thread's priority
getStackTrace(): java.lang.Thread.getStackTrace() Returns an array of stack trace elements representing the stack dump of this thread
Syntax:

public StackTraceElement[] getStackTrace()
Returns:
an array of StackTraceElement, each represents one stack frame
Throws:
SecurityException - if a security manager exists and its 
checkPermission method doesn't 
allow getting the stack trace of thread
getState(): java.lang.Thread.getState() Returns the state of this thread
Syntax:

public Thread.State getState()
Returns:
this thread's state
getThreadGroup(): java.lang.Thread.getThreadGroup() Returns the thread group to which this thread belongs
Syntax:

public final ThreadGroup getThreadGroup()
Returns:
this thread's thread group
getUncaughtExceptionHandler(): java.lang.Thread.getUncaughtExceptionHandler() Returns the handler invoked when this thread abruptly terminates due to an uncaught exception
Syntax:

public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler()
Returns:
the uncaught exception handler for this thread
holdsLock(Object obj): java.lang.Thread.holdsLock(Object obj) Returns true if and only if the current thread holds the monitor lock on the specified object
Syntax:

public static boolean holdsLock(Object obj)
Parameters:
obj - the object on which to test lock ownership
Returns:
true if the current thread holds the monitor lock 
on the specified object.
Throws:
NullPointerException - if obj is null
interrupt(): java.lang.Thread.interrupt() Interrupts this thread
Syntax:

public void interrupt() 
Throws:
SecurityException - if the current thread cannot modify this thread
interrupted(): java.lang.Thread.interrupted() Tests whether the current thread has been interrupted
Syntax:

public static boolean interrupted()
Returns:
true if the current thread has been interrupted; false otherwise
isAlive(): java.lang.Thread.isAlive() Tests if this thread is alive
Syntax:

public final boolean isAlive()
Returns:
true if this thread is alive; false otherwise
isDaemon(): java.lang.Thread.isDaemon() Tests if this thread is a daemon thread
Syntax:



 

public final boolean isDaemon()
Returns:
true if this thread is a daemon thread; false otherwise
isInterrupted(): java.lang.Thread.isInterrupted() Tests whether this thread has been interrupted
Syntax:

public boolean isInterrupted()
Returns:
true if this thread has been interrupted; false otherwise
join(): java.lang.Thread.join() Waits for this thread to die
Syntax:

public final void join() throws InterruptedException
Throws:
InterruptedException - if any thread has interrupted the 
current thread. The interrupted status of the current thread is 
cleared when this exception is thrown
join(long millis): java.lang.Thread.join(long millis) Waits at most millis milliseconds for this thread to die
Syntax:

public final void join(long millis) throws InterruptedException
Parameters:
millis - the time to wait in milliseconds
Throws:

IllegalArgumentException - if the value of millis is negative
InterruptedException - if any thread has interrupted the current thread.
The interrupted status of the current thread is cleared 
when this exception is thrown.
run(): java.lang.Thread.run() If this thread was constructed using a separate Runnable run object, then that Runnable object’s run method is called; otherwise, this method does nothing and returns
Syntax:

public void run()
Description:
If this thread was constructed using a separate Runnable run object,
then that Runnable object's run method is called; 
otherwise, this method does nothing and returns.

Subclasses of Thread should override this method.
yield(): java.lang.Thread.yield() A hint to the scheduler that the current thread is willing to yield its current use of a processor
Syntax:

public static void yield()
Description:
A hint to the scheduler that the current thread is willing 
to yield its current use of a 
processor. The scheduler is free to ignore this hint
toString(): java.lang.Thread.toString() Returns a string representation of this thread, including the thread’s name, priority, and thread group
Syntax:

public String toString()
Returns:
a string representation of this thread
start(): java.lang.Thread.start() Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread
Syntax:

public void start()
Throws:
IllegalThreadStateException - if the thread was already started.
sleep(long millis): java.lang.Thread.sleep(long millis) Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
Syntax:

public static void sleep(long millis) throws InterruptedException
Parameters:
millis - the length of time to sleep in milliseconds
Throws:
IllegalArgumentException - if the value of millis is negative
InterruptedException - if any thread has interrupted the 
current thread. The interrupted status of the current thread 
is cleared when this exception is thrown.
setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh): java.lang.Thread.setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh) Set the handler invoked when this thread abruptly terminates due to an uncaught exception
Syntax:

public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
Parameters:
eh - the object to use as this thread's uncaught exception handler. 
If null then this thread has no explicit handler.
Throws:
SecurityException - if the current thread is not allowed to
modify this thread.
setPriority(int newPriority): java.lang.Thread.setPriority(int newPriority) Changes the priority of this thread
Syntax:



 

public final void setPriority(int newPriority)
Parameters:
newPriority - priority to set this thread to
Throws:
IllegalArgumentException- If the priority is not in the range 
MIN_PRIORITY to MAX_PRIORITY
SecurityException - if the current thread cannot modify this thread.
setName(String name): java.lang.Thread.setName(String name) Changes the name of this thread to be equal to the argument name.
Syntax:

public final void setName(String name)
Parameters:
name - the new name for this thread.
Throws:
SecurityException - if the current thread cannot modify this thread.
setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh): java.lang.Thread.setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh) Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread
Syntax:

public static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
Parameters:
eh - the object to use as the default uncaught exception handler. 
If null then there is no 
default handler.
Throws:
SecurityException - if a security manager is present and 
it denies RuntimePermission ("setDefaultUncaughtExceptionHandler")
setDaemon(boolean on): java.lang.Thread.setDaemon(boolean on) Marks this thread as either a daemon thread or a user thread
Syntax:

public final void setDaemon(boolean on)
Parameters:
on - if true, marks this thread as a daemon thread
Throws:
IllegalThreadStateException - if this thread is alive
SecurityException - if checkAccess() determines that the current 
thread cannot modify this thread
setContextClassLoader(ClassLoader cl): java.lang.Thread.setContextClassLoader(ClassLoader cl) Sets the context ClassLoader for this Thread
Syntax:

public void setContextClassLoader(ClassLoader cl)
Parameters:
cl - the context ClassLoader for this Thread, or null indicating the 
system class loader (or, failing that, the bootstrap class loader)
Throws:
SecurityException - if the current thread cannot set the 
context ClassLoader
Methods inherited from class java.lang.Object

equals
finalize
getClass
hashCode
notify
notifyAll
toString
wait
Java program to demonstrate usage of Thread class

filter_none
edit
play_arrow

brightness_4
// Java program to demonstrate 
// method calls of Thread class 
package generic; 
class Helper implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            System.out.println("thread2 going to sleep for 5000"); 
            Thread.sleep(5000); 
        } catch (InterruptedException e)  
        { 
            System.out.println("Thread2 interrupted");} 
        } 
} 
  
public class Test implements Runnable 
{ 
    public void run() 
    { 
        //thread run() method 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        Helper obj2 = new Helper(); 
              
        Thread thread1 = new Thread(obj); 
        Thread thread2 = new Thread(obj2); 
          
        // moving thread to runnable states 
        thread1.start(); 
        thread2.start(); 
              
        ClassLoader loader = thread1.getContextClassLoader(); 
        Thread thread3 = new Thread(new Helper()); 
          
        // getting number of active threads 
        System.out.println(Thread.activeCount()); 
        thread1.checkAccess(); 
              
        // fetching an instance of this thread 
        Thread t = Thread.currentThread(); 
          
        System.out.println(t.getName()); 
              
        System.out.println("Thread1 name: "+thread1.getName()); 
        System.out.println("Thread1 ID: " + thread1.getId()); 
              
        // fetching the priority and state of thread1 
        System.out.println("Priority of thread1 = " + thread1.getPriority()); 
          
        System.out.println(thread1.getState()); 
      
        thread2 = new Thread(obj2); 
        thread2.start(); 
        thread2.interrupt(); 
        System.out.println("Is thread2 interrupted? " + thread2.interrupted() ); 
        System.out.println("Is thread2 alive? " + thread2.isAlive()); 
              
        thread1 = new Thread(obj); 
        thread1.setDaemon(true); 
        System.out.println("Is thread1 a daemon thread? " + thread1.isDaemon()); 
        System.out.println("Is thread1 interrupted? " + thread1.isInterrupted()); 
              
        // waiting for thread2 to complete its execution 
        System.out.println("thread1 waiting for thread2 to join"); 
        try
        { 
            thread2.join(); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
              
        // setting the name of thread1 
        thread1.setName("child thread xyz"); 
        System.out.println("New name set for thread 1" + thread1.getName()); 
              
        // setting the priority of thread1 
        thread1.setPriority(5); 
              
        thread2.yield(); 
              
        // fetching the string representation of thread1 
        System.out.println(thread1.toString()); 
              
        // getting list of active thread in current thread's group 
        Thread[] tarray = new Thread[3]; 
          
        Thread.enumerate(tarray); 
        System.out.println("List of active threads:"); 
        System.out.printf("["); 
        for(Thread thread : tarray) 
        { 
            System.out.println(thread); 
        } 
        System.out.printf("]\n"); 
              
        System.out.println(Thread.getAllStackTraces()); 
              
        ClassLoader classLoader = thread1.getContextClassLoader(); 
        System.out.println(classLoader.toString()); 
        System.out.println(thread1.getDefaultUncaughtExceptionHandler()); 
          
        thread2.setUncaughtExceptionHandler(thread1.getDefaultUncaughtExceptionHandler()); 
        thread1.setContextClassLoader(thread2.getContextClassLoader()); 
        thread1.setDefaultUncaughtExceptionHandler(thread2.getUncaughtExceptionHandler()); 
          
        thread1 = new Thread(obj); 
        StackTraceElement[] trace = thread1.getStackTrace(); 
        System.out.println("Printing stack trace elements for thread1:"); 
        for(StackTraceElement e : trace) 
        { 
            System.out.println(e); 
        } 
              
        ThreadGroup grp = thread1.getThreadGroup(); 
        System.out.println("ThreadGroup to which thread1 belongs " +grp.toString()); 
        System.out.println(thread1.getUncaughtExceptionHandler()); 
        System.out.println("Does thread1 holds Lock? " + thread1.holdsLock(obj2)); 
              
              
        Thread.dumpStack(); 
              
    } 
} 
Output:

3
main
Thread1 name: Thread-0
Thread1 ID: 10
Priority of thread1 = 5
RUNNABLE
Is thread2 interrupted? false
Is thread2 alive? true
Is thread1 a daemon thread? true
Is thread1 interrupted? false
thread1 waiting for thread2 to join
thread2 going to sleep for 5000 ms
thread2 going to sleep for 5000 ms
Thread2 interrupted
New name set for thread 1child thread xyz
Thread[child thread xyz, 5, main]
List of active threads:
[Thread[main, 5, main]
Thread[Thread-1, 5, main]
null
]
{Thread[Signal Dispatcher, 9, system]=[Ljava.lang.StackTraceElement;@33909752, 
Thread[Thread-1, 5, main]=[Ljava.lang.StackTraceElement;@55f96302, 
Thread[main, 5, main]=[Ljava.lang.StackTraceElement;@3d4eac69, 
Thread[Attach Listener, 5, system]=[Ljava.lang.StackTraceElement;@42a57993, 
Thread[Finalizer, 8, system]=[Ljava.lang.StackTraceElement;@75b84c92, 
Thread[Reference Handler, 10, system]=[Ljava.lang.StackTraceElement;@6bc7c054}
sun.misc.Launcher$AppClassLoader@73d16e93
null
Printing stack trace elements for thread1:
ThreadGroup to which thread1 belongs java.lang.ThreadGroup[name=main, maxpri=10]
java.lang.ThreadGroup[name=main, maxpri=10]
Does thread1 holds Lock? false
java.lang.Exception: Stack trace
    at java.lang.Thread.dumpStack(Unknown Source)
    at generic.Test.main(Test.java:111)

Reference:

Oracle
This article is contributed by Mayank Kumar. If you like GeeksforGeeks and would like to contribute, you can also write an article using contribute.geeksforgeeks.org or mail your article to contribute@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks.

Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.



 

Recommended Posts:
Implement Quartet Class with Triplet Class in Java using JavaTuples
Implement Pair Class with Unit Class in Java using JavaTuples
Implement Quintet Class with Quartet Class in Java using JavaTuples
Implement Decade Class from Ennead Class in Java using JavaTuples
Implement Octet Class from Septet Class in Java using JavaTuples
Implement Triplet Class with Pair Class in Java using JavaTuples
Implement Ennead Class from Octet Class in Java using JavaTuples
Implement Sextet Class from Quintet Class in Java using JavaTuples
Implement Septet Class from Sextet Class in Java using JavaTuples
Difference between Abstract Class and Concrete Class in Java
Using predefined class name as Class or Variable name in Java
Java.lang.Class class in Java | Set 1
Java.lang.Class class in Java | Set 2
Java.util.concurrent.Phaser class in Java with Examples
Java.util.BitSet class methods in Java with Examples | Set 2
