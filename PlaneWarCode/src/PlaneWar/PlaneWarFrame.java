package PlaneWar;

import javax.swing.JFrame;

public class PlaneWarFrame {
	
	private JFrame frame;
	private PlaneWarPanel pwp;
	Thread t;
	
	public PlaneWarFrame() {
		frame=new JFrame();
		pwp=new PlaneWarPanel();
		t=new Thread(pwp);
	}
	
	public void show() {
		frame.setVisible(true);
		frame.setSize(480,820);
		frame.setResizable(false);
		frame.setTitle("飞机大战");
		frame.add(pwp);
		frame.addMouseMotionListener(pwp);
		frame.addMouseListener(pwp);
		frame.addKeyListener(pwp);
		frame.setDefaultCloseOperation(3);
		t.start();
	}
	
	public static void main(String[] args) {
		new PlaneWarFrame().show();
	}
}
