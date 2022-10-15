import javax.swing.JFrame;
import javax.swing.JPanel;

public class gameclass {
	JFrame frame = new JFrame(); 
	public static final int HEIGHT = 1000;
	public static final int WIDTH = 1000;
	JPanel panel = new JPanel(); 
	
	gameclass() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel); 
		frame.setVisible(true);
		frame.pack();

	}

	void setup() {
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);

	}
}

	

