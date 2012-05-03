package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		
		} else if(actionCommand.equals("Pay")){
			if (true){//TODO: validate later...
				ArrayList<ArrayList<Integer>> items = new ArrayList<ArrayList<Integer>>();
				PayFrame payFrame = new PayFrame(items);
			}
			
			
		} else if(actionCommand.equals("Cancel")){
			
		} else {
			System.out.println("Unexpected Command");
		}
	}
}
