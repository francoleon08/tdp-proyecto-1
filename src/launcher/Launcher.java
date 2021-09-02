package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen a = new SimplePresentationScreen(new Student(12345,"UNS","Juan Carlos","juan.carlos.uns@cs.uns.edu.ar","https://github.com/juancarlosuns","/images/User.png"));
            	a.setVisible(true);
            }
        });
    }
}