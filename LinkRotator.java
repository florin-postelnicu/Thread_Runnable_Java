
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class LinkRotator extends JFrame implements  Runnable, ActionListener {

    //This statement creates the LinkRotator class as a subclass of the JFrame class, a simple
    //graphical user interface that consists of an empty frame. The statement also indicates that two
    //interfaces are supported by this class: Runnable and ActionListener. By implementing the
    //Runnable class, you are able to use a run() method in this program to make a thread begin
    //running. The ActionListener interface enables the program to respond to mouse clicks.


    String[] pageTitle = new String[6];// 6-element array of String objects(holding the titles
    // of the six websites diplayed
    URI[] pageLink = new URI[6];// 6 -element array of URI objects( stores the value of a website address.
    // URI has all the attributes and methods needed it to keep track of
    // a web address.

    int current = 0;// it keeps track of which website is being displayed
    Thread runner;// the Thread object this programm runs.
    // You call methods of the runner object when tou start(), stop(), and pause() the operation
    // of the program

    JLabel siteLabel = new JLabel();

    // THE CONSTRUCTOR
    /*
    The program’s constructor automatically is executed when the program is run. This method
is used to assign values to the arrays pageTitle and pageLink. It also is used to create
a clickable button that appears on the user interface. The method includes the following
statements:
     */



    //The title of each page is stored in the six elements of the pageTitle array, which is initialized
    //using six strings. The elements of the pageLink array are assigned a value returned by the
    //getURI() method, yet to be created.

    public LinkRotator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(siteLabel);
        pageTitle = new String[] {
                "Oracle's Java site",
                "Server Side",
                "JavaWorld",
                "Java in 24 Hours",
                "Sams Publishing",
                "Workbench"

        };
        pageLink[0] = getURI("https://www.oracle.com/java/");
        pageLink[1] = getURI("http://www.theserverside.com");
        pageLink[2] = getURI("http://www.javaworld.com");
        pageLink[3] = getURI("http://www.java24hours.com");
        pageLink[4] = getURI("http://www.samspublishing.com");
        pageLink[5] = getURI("http://workbench.cadenhead.org");
        Button visitButton = new Button("Visit Site");
        visitButton.addActionListener(this);
        add(visitButton);
        setVisible(true);
        start();

    }
    private URI getURI (String urlText){
        URI pageURI = null;
        try {
            pageURI = new URI(urlText);
        } catch (URISyntaxException ex){
            //do nothing
        }
        return pageURI;
    }

    public void start(){
        if (runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run(){
        Thread thisThread = Thread.currentThread();
        while( runner == thisThread) {
            current++;
            if ( current > 5){
                current = 0;
            }
            siteLabel.setText(pageTitle[current]);
            repaint();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exc){
                //do nothing
            }
        }
    }
    public void actionPerformed( ActionEvent event){
        Desktop desktop = Desktop.getDesktop();
        if (pageLink[current] != null) {
            try{
                desktop.browse(pageLink[current]);
                runner = null;
                System.exit(0);
            } catch (IOException exc){
                //do nothing
            }
        }
    }

    public static void main(String[] arguments) {
        new LinkRotator();
    }



}
