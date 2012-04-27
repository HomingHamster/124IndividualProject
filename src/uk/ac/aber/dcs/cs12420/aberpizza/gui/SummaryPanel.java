package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//The following because we are not going to be deserialzing
//in another dimension any time soon.
@SuppressWarnings("serial")

public class SummaryPanel extends JPanel {
	JButton pizzasButton, sidesButton, drinksButton;
    GridBagLayout gridBag;
    GridBagConstraints cons;
    
    public SummaryPanel(TillPanel tillPanel){
    	TillPanelButtonListener buttonListener =
    		new TillPanelButtonListener(tillPanel);
    	
    	gridBag = new GridBagLayout();
    	cons = new GridBagConstraints();
    	this.setLayout(gridBag);
    	gridBag.layoutContainer(this);
    	
    	//Make a button, add to grid (0,0) and watch for it being clicked.
    	JButton pizzasButton = new JButton("summary pannel p/h");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.NORTHWEST;
    	cons.gridx = 0;
    	cons.gridy = 0;
    	cons.weightx = 1.0;
    	gridBag.setConstraints(pizzasButton,cons);
    	this.add(pizzasButton);
    	pizzasButton.addActionListener(buttonListener);
    }
}
