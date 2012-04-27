package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

//The following because we are not going to be deserialzing
//in another dimension any time soon.
@SuppressWarnings("serial")

public class ItemPanel extends JPanel {
	JButton pizzasButton, sidesButton, drinksButton;
    GridBagLayout gridBag;
    GridBagConstraints cons;
    
    public ItemPanel(TillPanel tillPanel){
    	TillPanelButtonListener buttonListener =
    		new TillPanelButtonListener(tillPanel);
    	
    	gridBag = new GridBagLayout();
    	cons = new GridBagConstraints();
    	this.setLayout(gridBag);
    	gridBag.layoutContainer(this);
    	
    	//Make a button, add to grid (0,0) and watch for it being clicked.
    	JButton pizzasButton = new JButton("Pizzas");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.NORTHWEST;
    	cons.gridx = 0;
    	cons.gridy = 0;
    	gridBag.setConstraints(pizzasButton, cons);
    	this.add(pizzasButton);
    	pizzasButton.addActionListener(buttonListener);
    	
    	//Make a button, add to grid (0,1) and watch for it being clicked.
    	JButton sidesButton = new JButton("Sides");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.NORTHWEST;
    	cons.gridx = 1;
    	cons.gridy = 0;
    	gridBag.setConstraints(sidesButton, cons);
    	this.add(sidesButton);
    	sidesButton.addActionListener(buttonListener);
    	
    	//Make a button, add to grid (0,2) and watch for it being clicked.
    	JButton drinksButton = new JButton("Drinks");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.NORTHWEST;
    	cons.gridx = 2;
    	cons.gridy = 0;
    	gridBag.setConstraints(drinksButton, cons);
    	this.add(drinksButton);
    	drinksButton.addActionListener(buttonListener);
    	
    	//Make a list, add to grid (1,0).
    	String[] itemListData = {" "};
    	JList itemList = new JList(itemListData);
    	cons.fill = GridBagConstraints.BOTH;
    	cons.gridx = 0;
    	cons.gridy = 1;
        cons.gridwidth = 3;
    	gridBag.setConstraints(itemList, cons);
    	this.add(itemList);
    }
}
