package PlaneWar;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class EnemyPlane extends JPanel{
	private int x,y;
	private int r;
	private int enhance;
	private final static Image general=new ImageIcon("images/enemy5.png").getImage();
	private final static Image enhan=new ImageIcon("images/boos.png").getImage();
	private final static Image boom=new ImageIcon("images/airplane2.png").getImage();
	public EnemyPlane() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EnemyPlane(int x, int y, int r,int enhance) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.enhance=enhance;
	}



	public void draw(Graphics g) {
		if(enhance==0) {
			g.drawImage(general, x,y, 2*r, 2*r,this);
		}
		if(enhance==1) {
			g.drawImage(enhan, x,y, 2*r, 2*r,this);
		}
	}
	public void drawBoom(Graphics g) {
		g.drawImage(boom, x,y, 2*r, 2*r,this);
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
