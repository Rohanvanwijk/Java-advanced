package week1_threads;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StopButtonPanel extends JPanel implements ActionListener{

	PrintDraadje d,e,f,g,h;
	public StopButtonPanel() {
		
		setLayout(new GridLayout(1, 1));
		JButton button = new JButton("stop");
		button.setFocusable(false);
		button.addActionListener(this);
		add(button);
		
		//aantal print draadjes
		d = new PrintDraadje("+");
		e = new PrintDraadje("-");
		f = new PrintDraadje("f");
		g = new PrintDraadje("g");
		h = new PrintDraadje("2");
				
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {

		d.pleaseStop();
		e.pleaseStop();
		f.pleaseStop();
		g.pleaseStop();
		h.pleaseStop();
	
		
	}

}
