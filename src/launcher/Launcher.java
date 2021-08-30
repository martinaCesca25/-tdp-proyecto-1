package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student student= new Student (129252, "Cesca", "Martina", "marticesca25@gmail.com", "https://github.com/martinaCesca25/tdp-proyecto-1", "/images/foto.png");
            	SimplePresentationScreen presentacion= new SimplePresentationScreen(student);
            	presentacion.setVisible(true);
            }
        });
    }
}