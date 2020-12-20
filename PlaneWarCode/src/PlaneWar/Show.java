package PlaneWar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Show extends JPanel{
	
	private int score;
	private int y1;
	private int y2;
	private int y3;
	
	
	private final static Image start=new ImageIcon("images/start7.png").getImage();
	private final static Image exit=new ImageIcon("images/start7.png").getImage();
	private final static Image welcome=new ImageIcon("images/bg.png").getImage();
	private final static Image game=new ImageIcon("images/map.jpg").getImage();
	private final static Image game2=new ImageIcon("images/map.jpg").getImage();
	private final static Image bossmap=new ImageIcon("images/map2.jpg").getImage();
	private final static Image gameover=new ImageIcon("images/gameover1.png").getImage();
	private final static Image gamewin=new ImageIcon("images/success1.png").getImage();
	
	
	
	private Attribute at;
	public Show() {
		
		y1=0;
		y2=-852;
		y3=-852;
	}
	public Show(Attribute at) {
		this.score=at.getScore();
	}
	
	public void drawWelcome(Graphics g) {
		
		
		
//		Font f=new Font("宋体",Font.BOLD,20);
//		g.setFont(f);
//		g.setColor(Color.red);
//		g.drawString("点击↑开始游戏", 100, 440);
//		g.drawString("点击Enter键暂停或继续游戏游戏", 100, 460);
//		g.drawString("点击ESC键退出游戏", 100, 480);	
		g.drawImage(welcome, -10, -50, 470, 802,this);
		g.drawImage(start, 170,390,100,50, this);
		g.drawImage(exit, 170,460,100,50, this);
		Font f=new Font("宋体",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("开始游戏", 180, 420);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("退出游戏", 180, 490);
		g.setColor(Color.green);
		Font o=new Font("宋体",Font.BOLD,10);
		g.setFont(o);
		g.drawString("点击Enter键暂停或继续游戏游戏", 145, 710);
		g.drawImage(exit, -10,760,500,30, this);
		g.setColor(Color.red);
		Font s=new Font("宋体",Font.BOLD,10);
		g.setFont(s);
		g.drawString("制作团队-雷霆plus", 180, 775);
	}
	
	
	public void drawGame(Graphics g) {
		g.drawImage(game, 0, 0, 480, 852,this);
	}
	
	public void drawGame2(Graphics g) {
		g.drawImage(game, 0, y1, 480, 852,this);
		g.drawImage(game2, 0, y2, 480, 852,this);
	}
	public void drawBoss(Graphics g) {
		g.drawImage(game2, 0, y2, 480, 852,this);
		g.drawImage(bossmap, 0, y3, 480, 852,this);
	}
	
	public int getY3() {
		return y3;
	}
	public void setY3(int y3) {
		this.y3 = y3;
	}
	public void drawGameover(Graphics g) {
		g.drawImage(gameover, 140, 330, 180, 60,this);
//		Font f=new Font("宋体",Font.BOLD,20);
//		g.setFont(f);
//		g.setColor(Color.red);
//		g.drawString("点击ESC键退出游戏", 140, 400);
		g.drawImage(exit, 180, 420, 100,50,this);
		Font f=new Font("宋体",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("退出游戏", 190, 450);
	}
	
	public void drawGameWin(Graphics g) {
		g.drawImage(gamewin, 140, 320, 180, 80,this);
//		Font f=new Font("宋体",Font.BOLD,20);
//		g.setFont(f);
//		g.setColor(Color.red);
//		g.drawString("点击ESC键退出游戏", 140, 420);
		g.drawImage(exit, 180, 430, 100,50,this);
		Font f=new Font("宋体",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("退出游戏", 190, 460);
		
	}
	
	

	public int getY1() {
		return y1;
	}

	public void setY1(int y) {
		this.y1 = y;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
}
