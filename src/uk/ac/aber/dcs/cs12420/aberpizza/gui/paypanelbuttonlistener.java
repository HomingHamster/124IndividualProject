package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.event.ActionEvent;

public class PayPanelButtonListener {
	private PayPanel payPanel;

	public PayPanelButtonListener(PayPanel payPanel) {
		this.payPanel = payPanel;
	}
	
	public void actionPerformed(ActionEvent actionEvent){
		String actionCommand = actionEvent.getActionCommand();
	
		if(actionCommand.equals("Evaluate Payment")) {

			//this.tillPanel.command();
			
		} else if(actionCommand.equals("Complete Order")){

			//this.tillPanel.command();
			
		} else if(actionCommand.equals("Return to Order")){
			
		} else if(actionCommand.equals("Cancel Order")){
			
		} else {
			System.out.println("Unexpected Command");
		}
	}

}
