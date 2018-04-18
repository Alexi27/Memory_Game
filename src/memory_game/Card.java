package memory_game;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton {
	public int cardReturned;

	public int getCardReturned() {
		return cardReturned;
	}

	public void setCardReturned(int cardReturned) {
		this.cardReturned = cardReturned;
	}
	
}
