package PlaneWar;

import java.awt.Graphics;
import java.util.Vector;



public class AllBossBullet {
	private Vector<bossBullet> allbossbullets=new Vector<bossBullet>();
	public AllBossBullet(int x,int y) {
		
		for(int i=0;i<7;i++) {
			bossBullet bbBossBullet=new bossBullet(i);
			bbBossBullet.setX(x);
			bbBossBullet.setY(y);
			allbossbullets.add(bbBossBullet);
		}
	}
	public void move() {
		for(int i=0;i<allbossbullets.size();i++) {
			bossBullet bb=allbossbullets.elementAt(i);
			bb.move();
		}
	}
	public void draw(Graphics g) {
		for(int i=0;i<allbossbullets.size();i++) {
			bossBullet bb=allbossbullets.elementAt(i);
			bb.draw(g);
		}
	}
	public void getX() {
		for(int i=0;i<allbossbullets.size();i++) {
			bossBullet bb=allbossbullets.elementAt(i);
			System.out.println(bb.getX());
		}
	}
}
