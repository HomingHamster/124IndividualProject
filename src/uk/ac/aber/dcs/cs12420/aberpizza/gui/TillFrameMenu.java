package uk.ac.aber.dcs.cs12420.aberpizza.gui;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//The following because we are not going to be deserialzing
//in another dimension any time soon.
@SuppressWarnings("serial")

public class TillFrameMenu extends JMenuBar {
	/*
	* Define the layout of the menu.
	*/
	private JMenu fileMenu = new JMenu("File");
	private JMenu adminMenu = new JMenu("Admin");
	private JMenu helpMenu = new JMenu("Help");

	private JMenuItem newOption = new JMenuItem("New");
	private JMenuItem save = new JMenuItem("Save");
	private JMenuItem open = new JMenuItem("Open");
	private JMenuItem quit = new JMenuItem("Quit");
	
	private JMenuItem adminItem = new JMenuItem("thing...");

	private JMenuItem helpItem = new JMenuItem("thing...");

	public TillFrameMenu(TillPanel tillPanel) {
		this.add(fileMenu);
		this.add(adminMenu);
		this.add(helpMenu);
		setVisible(true);
	
		/*
		* Reference the custom listener for the menu buttons
		*/
		TillFrameMenuListener menuListener = new TillFrameMenuListener(tillPanel);

		fileMenu.add(newOption);
		newOption.addActionListener(menuListener); //Adds listener to button.
	
	    fileMenu.add(save);
	    save.addActionListener(menuListener); //Adds listener to button.
	    
	    fileMenu.add(open);
	    open.addActionListener(menuListener); //Adds listener to button.
	    
	    fileMenu.add(quit);
	    quit.addActionListener(menuListener); //Adds listener to button.
	    
	    adminMenu.add(adminItem);
	    adminItem.addActionListener(menuListener); //Adds listener to button.
	
	    helpMenu.add(helpItem);
	    helpItem.addActionListener(menuListener); //Adds listener to button.
	}
}
