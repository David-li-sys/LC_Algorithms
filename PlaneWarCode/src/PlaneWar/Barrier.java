package PlaneWar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Barrier extends JPanel{
	private int x,y;
	private int r;
	private int HP;
	Random ran;
	private final static Image barrier=new ImageIcon("images/enemyplane2.png").getImage();
	public Barrier() {
		r=25;
		ran=new Random();
		x=ran.nextInt(480-2*r);
		y=ran.nextInt(60)-60;
		HP=3;
	}
	
	public void draw(Graphics g) {
		g.drawImage(barrier, x, y, 2*r, 2*r,this);
		g.setColor(Color.white);
		g.drawRect(x, y, 2*r, 5);
		g.setColor(Color.red);
		if(HP==3){
			g.fillRect(x, y, (2*r), 5);
		}
		if(HP==2){
			g.fillRect(x, y, 15, 5);
		}
		if(HP==1){
			g.fillRect(x, y, 7, 5);
		}
		
		
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public void move() {
		y++;
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
}
