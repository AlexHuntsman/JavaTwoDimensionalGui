package morning.controller;

import morning.model.CardBox;
import morning.view.CardBoxFrame;
import java.awt.Color;

public class My2DController 
{
	private CardBoxFrame baseFrame;
	private CardBox [][] myBox;

	public My2DController()
	{
		myBox = new CardBox [3][3];
		setupArray();
		baseFrame = new CardBoxFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row< myBox.length; row++)
		{
			for(int col = 0; col< myBox.length; col++)
			{
				myBox[row][col] = new CardBox();
				if(col % 2 == 0)
				{
					myBox[row][col].setNumberOfDecks(col+5);
				}
				else
				{
					myBox[row][col].setCardBoxColor(Color.YELLOW);
				}
			}
		}
	}
	
	public CardBox [][] getMyCardBox()
	{
		return myBox;
	}
}
