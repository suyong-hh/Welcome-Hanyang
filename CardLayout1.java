package han_proj;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout1 extends Frame{

	CardLayout card = new CardLayout();
	Panel panel[] = new Panel[5];
	Color color[] = {Color.red, Color.blue, Color.yellow, Color.green, Color.cyan};
	
	public CardLayout1(String str) {
		super(str);
		setLayout(card);
		MouseHandle mouse = new MouseHandle();
		
		for(int i=0; i<5; i++) {
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse);
			add(""+(i+1), panel[i]);
		}
		
		setSize(200,200);
		setVisible(true);
	}
	
	public class MouseHandle extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			card.next(CardLayout1.this);
		}
	}
	public static void main(String[] args) {
		new CardLayout1(null);

	}

}
