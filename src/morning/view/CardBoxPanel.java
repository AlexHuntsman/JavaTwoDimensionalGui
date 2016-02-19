package morning.view;

import javax.swing.*;
import javax.swing.table.*;
import morning.controller.My2DController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardBoxPanel extends JPanel
{
	private My2DController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentCardBoxLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable CardBoxTable;
	
	public CardBoxPanel(My2DController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(5);
		currentCardBoxLabel = new JLabel("the current Card Box");
		changeButton = new JButton("Change the incated Card Box");
		displayButton = new JButton("Display the indicated Card Box");
		
		
		setupTable();
		setupPanel();
		setupLayout();
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyCardBox(), columnHeaders);
		CardBoxTable = new JTable(tableModel);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(CardBoxTable);
		this.add(rowField);
		this.add(columnField);
		this.add(columnField);
		this.add(currentCardBoxLabel);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, CardBoxTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, CardBoxTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, CardBoxTable, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, CardBoxTable, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 6, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -60, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentCardBoxLabel, 6, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, currentCardBoxLabel, 16, SpringLayout.EAST, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, 213, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 0, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayButton, 0, SpringLayout.EAST, changeButton);
	}
}
