package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    	
    	//make a lable add to (00)
    	JLabel orderForLabel = new JLabel("Order For: ");
    	cons.gridx = 0;
    	cons.gridy = 0;
    	gridBag.setConstraints(orderForLabel, cons);
    	this.add(orderForLabel);
    	
    	//make input for customer name (01)
    	JTextField customerNameInput = new JTextField();
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.gridx=1;
    	cons.gridy=0;
    	cons.weightx=1.0;
    	gridBag.setConstraints(customerNameInput, cons);
    	this.add(customerNameInput);
    	
    	//make summary textbox
        JTextArea summaryArea = new JTextArea(5, 20);
        summaryArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(summaryArea);
        cons.fill = GridBagConstraints.BOTH;
        cons.gridx=0;
        cons.gridy=1;
        cons.weighty=1.0;
        cons.gridwidth = 2;
        gridBag.setConstraints(summaryArea, cons);
        this.add(summaryArea);
        
    	//make a lable add to (00)
    	JLabel discountLabel = new JLabel("Discounts: 0 ");
    	cons.gridx = 0;
    	cons.gridy = 2;
        cons.gridwidth = 2;
        cons.weighty=0;
    	gridBag.setConstraints(discountLabel, cons);
    	this.add(discountLabel);
    	
    	//make a lable add to (00)
    	JLabel totalLabel = new JLabel("Total: 0");
    	cons.gridx = 0;
    	cons.gridy = 3;
        cons.gridwidth = 2;
        cons.weighty=0;
    	gridBag.setConstraints(totalLabel, cons);
    	this.add(totalLabel);
    	
    	//Make a button, add to grid (4,1) and watch for it being clicked.
    	JButton cancelButton = new JButton("Cancel");
    	//cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.gridx = 0;
    	cons.gridy = 5;
    	gridBag.setConstraints(cancelButton,cons);
    	this.add(cancelButton);
    	cancelButton.addActionListener(buttonListener);
    	
    	//Make a button, add to grid (4,0) and watch for it being clicked.
    	JButton payButton = new JButton("Pay");
    	//cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.gridx = 0;
    	cons.gridy = 4;
    	gridBag.setConstraints(payButton,cons);
    	this.add(payButton);
    	payButton.addActionListener(buttonListener);
    }
}
