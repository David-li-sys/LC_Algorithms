package PlaneWar;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Plane extends JPanel{
	
	private int x,y;
	private int r;
	private final static Image img=new ImageIcon("images/hero.png").getImage();
	
	public Plane() {
		x=220;
		y=450;
		r=20;
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, x,y, 2*r, 2*r,this);
	}
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
