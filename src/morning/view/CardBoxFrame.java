package morning.view;

import javax.swing.*;
import morning.controller.My2DController;
import morning.view.CardBoxPanel;

public class CardBoxFrame  extends JFrame
{
	private My2DController baseController;
	private CardBoxPanel basePanel;
	
	public CardBoxFrame (My2DController baseController)
	{
		this.baseController = baseController;
		basePanel = new CardBoxPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setTitle("My 2D project");
		this.setVisible(true);
	}
}
