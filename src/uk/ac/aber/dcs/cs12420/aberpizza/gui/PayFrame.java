package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")

public class PayFrame extends JFrame {
	private PayPanel payPanel = new PayPanel();
	
	public PayFrame(ArrayList<ArrayList<Integer>> items){
		setSize(500,200);
		setLocation(100,100);
		add(payPanel);
		setTitle("CS124 Individual Project - Take Payment");
		setVisible(true); 
	}

}
