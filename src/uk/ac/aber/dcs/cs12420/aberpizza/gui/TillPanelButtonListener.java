package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TillPanelButtonListener implements ActionListener {
	private TillPanel tillPanel;

	public TillPanelButtonListener(TillPanel tillPanel){
		this.tillPanel = tillPanel;
	}

	public void actionPerformed(ActionEvent actionEvent){
		String actionCommand = actionEvent.getActionCommand();
	
		if(actionCommand.equals("Pizzas")) {

			//this.tillPanel.command();
			
		} else if(actionCommand.equals("Sides")){

			//this.tillPanel.command();
			
		} else if(actionCommand.equals("Drinks")){
			
		} else {
			System.out.println("Unexpected Command");
		}
	}
}
