package PlaneWar;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Bullet extends JPanel{
	
	private int x,y;
	private int r;
	private int HP;
	private int arr;
	
	
	private final static Image fire=new ImageIcon("images/bullet6.png").getImage();
	private final static Image fire2=new ImageIcon("images/bullet7.png").getImage();
	private final static Image epfire=new ImageIcon("image/epFire.gif").getImage();
	
	public Bullet() {
		
	}
	
	
	public Bullet(int x, int y, int r,int arr) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.arr=arr;
		this.HP=3;
		
	}


	
	public void draw(Graphics g) {
		if(arr==0) {
			g.drawImage(epfire, x,y, 2*r, 2*r,this);
		}
		if(arr==1) {
			g.drawImage(fire, x,y, 2*r, 2*r,this);
		}
		if(arr==2) {
			g.drawImage(fire2, x,y, 4*r, 2*r,this);
		}
		
	}
	



	public void move() {
		if(arr==0) {y++;}
		if(arr==1||arr==2) {y--;}
		
	}
	
	
	
	public int getArr() {
		return arr;
	}


	public void setArr(int arr) {
		this.arr = arr;
	}
	
	
	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
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
