package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		myButton = new JButton("Click here!!");
		wordsLabel = new JLabel("such words!");
		baseLayout = new SpringLayout();
		dropDown = new JComboBox(baseController.getHipsters());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -119, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, myButton, -131, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 79, SpringLayout.SOUTH, wordsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 74, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String selectedText = baseController.getHipsters()[dropDown.getSelectedIndex()].toString();
				wordsLabel.setText(selectedText);
			}
		});
	}
}
