/**
* @author Felix Farquharson (fef)
* This class is the main swing frame of the application, it
* sets the size, and title etc.
*/

package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import javax.swing.*;

//The following because we are not going to be deserialzing
//in another dimension any time soon.
@SuppressWarnings("serial")

public class TillFrame extends JFrame {
	private TillPanel tillPanel = new TillPanel();
	
	public TillFrame(){
		/*
		* make sure the application actually quits when we
		* close it from the frame.
		*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		* The following assigns a menubar defines in
		* TillFrameMenu to the frame.
		*/
		JMenuBar menuBar = new TillFrameMenu(tillPanel);
		setJMenuBar(menuBar);
	}
}
