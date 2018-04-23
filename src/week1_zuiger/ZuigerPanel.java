package week1_zuiger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ZuigerPanel extends JPanel implements Observer, Runnable {

	/**
	 * posX en posY zijn de coordinaten van het panel De zuiger wordt meegegeven
	 * vanuit de hoofdApplicatie. Het panel is de observable van de zuiger. Als er
	 * iets verandert aan de hoogte van de zuiger, dan zal het panel deze tekenen.
	 * BOTTOM_POSITION en ZUIGER_WIDTH bepalen de bodem en de breedte van de zuiger
	 */
	private int posX = 10, posY = 10;
	private Zuiger zuiger;
	private static final int BOTTOM_POSITION = 430;
	private static final int ZUIGER_WIDTH = 130;
	private long speed = 1;
	private volatile boolean doorgaan;

	public ZuigerPanel(Zuiger zuiger) {

		this.zuiger = zuiger;
		doorgaan = false;
		zuiger.addObserver(this);
		zuiger.flipDeltaY();
		Thread t = new Thread(this);

		setBorder(BorderFactory.createTitledBorder(t.getName()));

		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// Change direction when clicked on
				doorgaan = true;
			}
		});

		addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub

				speed = speed + e.getWheelRotation();
				if (speed < 1) {
					speed = 1;
				}
			}
		});

		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Teken zuiger-bodem
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(posX, posY + 400, 140, 50);

		// Teken de zuiger
		g.setColor(Color.BLUE);
		g.fillRect(posX + 5, posY + (BOTTOM_POSITION - zuiger.getHeight()), ZUIGER_WIDTH, zuiger.getHeight());
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
	
	

	@Override
	public void run() {
		while (zuiger.isActive()) {
			zuiger.changeHeight();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException ie) {
				//
			}

		}
	}
}
