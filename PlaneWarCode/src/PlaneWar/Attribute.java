package PlaneWar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Attribute {
	private int score;
	private int HP;
	private int bossHP;
	
	public Attribute() {
		HP=100;
		bossHP=1000;
	}
	
	public int getBossHP() {
		return bossHP;
	}

	public void setBossHP(int bossHP) {
		this.bossHP = bossHP;
	}

	public void drawScore(Graphics g) {			
		Font f=new Font("宋体",Font.BOLD,20);
		g.setFont(f);
		g.drawString("你的分数"+score, 30,40 );
		
	}
	
	public void drawHP(Graphics g) {	
		g.drawRect(30, 50, 100, 10);
		g.setColor(Color.red);
		g.fillRect(30, 50, HP, 10);
		
	}
	public void drawBossHP(Graphics g) {	
		g.drawRect(30, 80, 100, 10);
		g.setColor(Color.yellow);
		g.fillRect(30, 80, bossHP/10, 10);
		
	}
	
	
	
	public Attribute(int score, int hP) {
		super();
		this.score = score;
		HP = hP;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	
}
