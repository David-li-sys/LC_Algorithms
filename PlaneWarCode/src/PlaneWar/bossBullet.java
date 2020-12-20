package PlaneWar;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class bossBullet extends JPanel{
	private int x,y;
	private int r;
	private int arr;
	private final static Image epfire=new ImageIcon("image/epFire.gif").getImage();
	
	public bossBullet( int arr) {
		this.x=200;
		this.y=300;
		this.r=20;
		this.arr=arr;
	}
	
	public void draw(Graphics g) {	
		g.drawImage(epfire, x,y, 2*r, 2*r,this);
	}
	public void move() {
		if(arr==0) {
			y++;
		}
		if(arr==1) {
			x--;
			y=y+2;
		}
		if(arr==2) {
			x--;
			y++;
		}
		if(arr==3) {
			x=x-2;
			y++;
		}
		if(arr==4) {
			x++;
			y=y+2;
		}
		if(arr==5) {
			x++;
			y++;
		}
		if(arr==6) {
			x=x+2;
			y++;
		}
		
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
	public int getArr() {
		return arr;
	}
	public void setArr(int arr) {
		this.arr = arr;
	}
	
}
