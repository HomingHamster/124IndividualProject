package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PayPanel extends JPanel {
	JButton evaluatePayment, completeOrder,
				returnToOrder, cancelOrder;
    GridBagLayout gridBag;
    GridBagConstraints cons;
    
	public PayPanel(){
    	PayPanelButtonListener buttonListener =
    		new PayPanelButtonListener(this);
    	
    	gridBag = new GridBagLayout();
    	cons = new GridBagConstraints();
    	this.setLayout(gridBag);
    	gridBag.layoutContainer(this);
    	
    	//make a label
    	JLabel paymentAmountLabel = new JLabel("Enter amount recieved: ");
    	cons.gridx = 0;
    	cons.gridy = 0;
    	gridBag.setConstraints(paymentAmountLabel, cons);
    	this.add(paymentAmountLabel);
    	
    	//make a input
    	JTextField paymentAmountEntry = new JTextField();
    	cons.gridx = 1;
    	cons.gridy = 0;
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.weightx = 1.0;
    	gridBag.setConstraints(paymentAmountEntry, cons);
    	this.add(paymentAmountEntry);
    	
    	//make a label
    	JLabel changeLabel = new JLabel("Change: £");
    	cons.gridx = 0;
    	cons.gridy = 1;
    	gridBag.setConstraints(changeLabel, cons);
    	this.add(changeLabel);
    	
    	//make a label
    	JLabel changeAmountLabel = new JLabel("0.00 ");
    	cons.gridx = 1;
    	cons.gridy = 1;
    	gridBag.setConstraints(changeAmountLabel, cons);
    	this.add(changeAmountLabel);
	}
}
