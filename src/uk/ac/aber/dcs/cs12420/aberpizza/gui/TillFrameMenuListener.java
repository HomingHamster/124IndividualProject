package uk.ac.aber.dcs.cs12420.aberpizza.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TillFrameMenuListener implements ActionListener {
	private TillPanel tillPanel;

	public TillFrameMenuListener(TillPanel tillPanel){
		this.tillPanel = tillPanel;
	}

	public void actionPerformed(ActionEvent actionEvent)
	{
		String actionCommand = actionEvent.getActionCommand();
	
		if(actionCommand.equals("Quit")){
			System.exit(0);
		}
	
		else if (actionCommand.equals("Save")){
			//SaveAndOpen.save(diagramPanel.controller, diagramPanel);
		}
	
		else if (actionCommand.equals("Open")){
			//this.diagramPanel.loadIn(SaveAndOpen.open(this.diagramPanel));
		}
	
		else if (actionCommand.equals("New")){
		}
	
		else if (actionCommand.equals("Help")){
			//The parent of this should probably be the frame itself,
			//but i have a link to the diagramPanel here and available
			//this.tillPanel.showHelp();
		}
	}
}
