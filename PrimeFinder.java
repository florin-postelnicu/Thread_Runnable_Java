/*


Maven, a Yiddish word meaning accumulator of knowledge









String is immutable whereas StringBuffer and StringBuider are mutable classes.
StringBuffer is thread safe and synchronized whereas StringBuilder is not,
thats why StringBuilder is more faster than StringBuffer.
 String concat + operator internally uses StringBuffer or StringBuilder class.

 link:
 https://www.journaldev.com/538/string-vs-stringbuffer-vs-stringbuilder

String vs StringBuffer

Since String is immutable in Java, whenever we do String manipulation like concatenation, substring etc,
 t generates a new String and discards the older String for garbage collection.

These are heavy operations and generate a lot of garbage in heap. So Java has provided StringBuffer and
StringBuilder class that should be used for String manipulation.

StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring()
methods for String manipulation.


StringBuffer vs StringBuilder

StringBuffer was the only choice for String manipulation till Java 1.4 but it has one disadvantage
that all of its public methods are synchronized. StringBuffer provides Thread safety but on a performance cost.

In most of the scenarios, we don’t use String in a multithreaded environment, so Java 1.5 introduced a new class
tringBuilder that is similar to StringBuffer except thread safety and synchronization.

So if you are in a single threaded environment or don’t care about thread safety, you should use StringBuilder
else use StringBuffer. See this post for performance benchmarking between StringBuffer and StringBuilder.


String vs StringBuffer vs StringBuilder
1) String is immutable whereas StringBuffer and StringBuider are mutable classes.
2) StringBuffer is thread safe and synchronized whereas StringBuilder is not,
 that's why StringBuilder is more faster than StringBuffer.
3) String concat + operator internally uses StringBuffer or StringBuilder class.
4) For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.

That’s all for a quick roundup of difference between String vs StringBuffer vs StringBuilder.
In most of the scenarios for string manipulation, StringBuilder is better suited than StringBuffer.

References:

String API Doc : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
StringBuffer API Doc : https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
StringBuilder API Doc  https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
StringBuffer vs StringBuilder : https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
 */


public class PrimeFinder implements Runnable { // The Runnable interface is applied to PrimeFinder
    Thread go; // a Thread object (go) is created
    StringBuffer primes = new StringBuffer();
    int time = 0;

    //create a Constructor

    public PrimeFinder() {
        start();
        while (primes != null) {
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                // do nothing, or print something
            }
            time++;

        }
    }

    public void start() {
        //If the go object variable has a value of null, which indicates the thread
        //hasn’t been created yet, a new Thread object is created and stored in the variable. The
        //thread is started by calling the thread’s start() method, which causes the run() method
        //of the PrimeFinder class to be called
        if (go == null) {
            go = new Thread(this);
            go.start();
        }
    }
    public void run() {
        // The run() method looks for a sequence of prime numbers beginning with 2,
        //storing each one in the primes string buffer by calling its append() method
        int quantity = 100000;
        int numPrimes = 0;
        // candidate : the number that might be prime
        int candidate = 2;
        primes.append("\nFirst ").append(quantity).append(" primes:\n\n");
        //The PrimeFinder application does something unusual with the StringBuffer object's append()
        //method. A call to append() is followed by a period (.) character and another call to append().
        //This causes text to be appended in sequence. It's possible because a call to append() returns that
        //buffer, which then can be called again.
        while(numPrimes < quantity) {
            if ( isPrime(candidate)){
                primes.append(candidate).append(" ");
                numPrimes++;
            }
            candidate++;



            }
        System.out.println(primes);
        primes = null;
        System.out.println(" \n Time Elapsed :  " + time + " seconds");
    }
    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i= 2; i<= root; i++){
            if(checkNumber % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //However, because there’s no need to refer to that object again, storing it in a variable is not
        //necessary. Calling new to create the object causes the program to run.
        //It’s a good programming practice in Java to store objects in variables only when those objects are
        //needed after their creation.
        //However, because there’s no need to refer to that object again, storing it in a variable is not
        //necessary. Calling new to create the object causes the program to run.
        //It’s a good programming practice in Java to store objects in variables only when those objects are
        //needed after their creation.
        new PrimeFinder();
    }
}

