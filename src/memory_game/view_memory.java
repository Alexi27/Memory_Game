package memory_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_memory {
	JButton Button1 = new JButton();
	JButton Button11 = new JButton();
	JButton Button2 = new JButton();
	JButton Button22 = new JButton();
	JButton Button3 = new JButton();
	JButton Button33 = new JButton();
	JButton Button4 = new JButton();
	JButton Button44 = new JButton();
	JButton Button5 = new JButton();
	JButton Button55 = new JButton();
	JButton Button6= new JButton();
	JButton Button66 = new JButton();
	JButton memoire = new JButton();
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	Card card = new Card();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_memory window = new view_memory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view_memory() {
		
		initialize();		
		allCardReturned();
		randomCard();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][]", "[][][][]"));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button1.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button1;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button1); return;}
			}
		});
		Button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button11.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1);  memoire = Button11;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button11); return;}
			}
		});
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button2.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/2.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button2;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button2); return;}
			}
		});
		Button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button22.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/2.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button22;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button22); return;}
			}
		});
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button3.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button3; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button3); return;}
			}
		});
		Button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button33.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button33 ;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button33); return;}
			}
		});
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button44.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button4; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button4); return;}
			}
		});
		Button44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button44.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button44; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button44); return;}
			}
		});
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button5.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button5; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button5); return;}
			}
		});
		Button55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button55.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button55; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button55); return;}
			}
		});
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button6.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button6; return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2);checkSameCard(Button6); return;}
			}
		});
		Button66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button66.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
				if (card.getCardReturned() == 0) {card.setCardReturned(1); memoire = Button66;return;}
				if (card.getCardReturned() == 1) {card.setCardReturned(2); checkSameCard(Button66);return;}
			}
		});
	}
	private void allCardReturned() {
		Button1.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button11.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button2.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button22.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button3.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button33.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button4.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button44.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button5.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button55.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button6.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
		Button66.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/0.png"));
	}

	private JButton random(double min, double max) {
	    int i = (int) (min + Math.random() * (max - min));
	    if (i==1 ) return Button1;
	    if (i==2) return Button11;
	    if (i==3) return Button2;
	    if (i==4) return Button22;
	    if (i==5) return Button3;
	    if (i==6) return Button33;
	    if (i==7) return Button4;
	    if (i==8) return Button44;
	    if (i==9) return Button5;
	    if (i==10) return Button55;
	    if (i==11) return Button6;
	    if (i==12) return Button66;
		return null;
}
	private void randomCard() {
	frame.getContentPane().add(random(1,12), "cell 0 1");
	frame.getContentPane().add(random(1,12), "cell 0 2");
	frame.getContentPane().add(random(1,12), "cell 0 3");
	frame.getContentPane().add(random(1,12), "cell 0 0");
	frame.getContentPane().add(random(1,12), "cell 1 0");
	frame.getContentPane().add(random(1,12), "cell 1 1");
	frame.getContentPane().add(random(1,12), "cell 1 2");
	frame.getContentPane().add(random(1,12), "cell 1 3");
	frame.getContentPane().add(random(1,12), "cell 2 0");
	frame.getContentPane().add(random(1,12), "cell 2 1");
	frame.getContentPane().add(random(1,12), "cell 2 2");
	frame.getContentPane().add(random(1,12), "cell 2 3");
	}
	
	private void checkSameCard(JButton ButtonI) {
		if (memoire == Button1 && ButtonI == Button11 || memoire == Button11 && ButtonI == Button1) win(); 
		else if (memoire == Button2 && ButtonI == Button22 || memoire == Button22 && ButtonI == Button2) win();
		else if (memoire == Button3 && ButtonI == Button66 || memoire == Button33 && ButtonI == Button3) win();
		else if (memoire == Button4 && ButtonI == Button44 || memoire == Button44 && ButtonI == Button4) win();
		else if (memoire == Button5 && ButtonI == Button55 || memoire == Button55 && ButtonI == Button5) win();
		else if (memoire == Button6 && ButtonI == Button11 || memoire == Button66 && ButtonI == Button6) win();
		else {card.setCardReturned(0); allCardReturned();}
		
	}
	private void win() {Button1.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button11.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button2.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button22.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button3.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button33.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button4.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button44.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button5.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button55.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button6.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	Button66.setIcon(new ImageIcon("/home/alexi/eclipse-workspace/memory_game/src/1.png"));
	}
}