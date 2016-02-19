package morning.model;

import java.awt.Color;

public class CardBox 
{
	private int numberOfDecks;
	private Color cardBoxColor;
	
	public CardBox()
	{
		this.numberOfDecks = 1;
		this.cardBoxColor = Color.BLACK;
	}
	
	public CardBox(int numberOfPockets, Color cardBoxColor)
	{
		this.numberOfDecks = numberOfDecks;
		this.cardBoxColor = cardBoxColor;
	}
	
	public String toString()
	{
		String CardBoxDescription = "This backpack has " + numberOfDecks
				+ " pockets, and its color is " + cardBoxColor;
		return CardBoxDescription;
	}
	
	public int getNumberOfDecks() 
	{
		return numberOfDecks;
	}

	public void setNumberOfDecks(int numberOfDecks) 
	{
		this.numberOfDecks = numberOfDecks;
	}

	public Color getCardBoxColor() 
	{
		return cardBoxColor;
	}

	public void setCardBoxColor(Color cardBoxColor) 
	{
		this.cardBoxColor = cardBoxColor;
	}
}
