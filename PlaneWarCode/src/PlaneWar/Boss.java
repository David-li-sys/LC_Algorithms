package PlaneWar;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Boss extends JPanel{
	private int x,y;
	private int r;
	private int arr;
	private int forword=0;
	private int wedth=100;
	private int height=80;
	private final static Image boss=new ImageIcon("images/enemy5.png").getImage();
	
	public Boss() {
		x=160;
		y=-150;
		arr=0;
		r=30;
	}
	public Boss(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void move() {
		if(forword==0) {
			y++;
		}else {
			y--;
		}
		
		
		
		if(y>=100) {
			if(arr==0) {
				x++;
			}
			if(arr==1) {
				x--;
			}
		}
		
		
	}
	
	public int getForword() {
		return forword;
	}
	public void setForword(int forword) {
		this.forword = forword;
	}
	public void draw(Graphics g) {
		g.drawImage(boss, x, y,4*r, 4*r,this);
	}
	
	public int getWedth() {
		return wedth;
	}
	public void setWedth(int wedth) {
		this.wedth = wedth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getArr() {
		return arr;
	}
	public void setArr(int arr) {
		this.arr = arr;
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
