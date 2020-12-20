package PlaneWar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gain extends JPanel{
	
	private int x,y;
	private int r;
	private int kind;
	
	private Random ran;
	private final static Image gain1=new ImageIcon("images/gain3.png").getImage();
	private final static Image gain2=new ImageIcon("images/gain1.png").getImage();
	
	
	public Gain(int x, int y, int r,int kind) {
		ran=new Random();
		this.x = x;
		this.y = y;
		this.r = r;
		this.kind=kind;
		
	}
	
	

	public void draw(Graphics g) {
		if(kind==0) {
			g.drawImage(gain1, x, y,2*r,2*r, this);
		}
		if(kind==1) {
			
			g.drawImage(gain2, x, y,2*r,2*r, this);
		}
	}
	public void move() {
		y++;
	}
	
	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
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
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Gain() {
		// TODO Auto-generated constructor stub
	}
	
	
}
