package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

//The following because we are not going to be deserialzing
//in another dimension any time soon.
@SuppressWarnings("serial")

public class TillPanel extends JPanel {
    GridBagLayout gridBag;
    GridBagConstraints cons;

	public void showHelp() {
		
	}
	
	public TillPanel(){
		gridBag = new GridBagLayout();
		cons = new GridBagConstraints();
		this.setLayout(gridBag);
		gridBag.layoutContainer(this);
		
		ItemPanel itemPanel = new ItemPanel(this);
		cons.fill = GridBagConstraints.BOTH;
        cons.gridx = 0;
        cons.gridy = 0;
        gridBag.setConstraints(itemPanel, cons);
		this.add(itemPanel);
		
		SummaryPanel summaryPanel = new SummaryPanel(this);
		cons.fill = GridBagConstraints.BOTH;
        cons.gridx = 1;
        cons.gridy = 0;
        gridBag.setConstraints(summaryPanel, cons);
		this.add(summaryPanel);
	}

}
