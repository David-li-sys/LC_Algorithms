package PlaneWar;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlaneWarPanel extends JPanel implements Runnable,MouseListener,MouseMotionListener,KeyListener{
	
	private int max1=100;
	private int max2=200;
	
	
	private boolean ispause=false;
	private Show show;
	private Attribute at;
	private int width=480;
	private int height=820;
	private Plane plane;
	private int enemyCount=14;
	private boolean isFire=false;
	private AllHit allhit;
	private Random ran;
	private String type;
	private Boss boss;
	private Vector<Gain> allgains;
	private Vector<Bullet> allBullets;
	private Vector<Bullet> allShootBullets;
	private Vector<Bullet> bossBullets;
	private Vector<Bullet> strBullets;
	private Vector<EnemyPlane> allEnemys;
	private Vector<EnemyPlane> allstrEnemys;
	private Vector<Barrier> allBarriers;
	
	
	
	public PlaneWarPanel() {
		
		
		
		allgains=new Vector<Gain>();
		allBarriers=new Vector<Barrier>();
		type="welcome";
		boss=new Boss();
		ran=new Random();
		at=new Attribute();
		show=new Show();
		at=new Attribute();
		plane=new Plane();
		allhit=new AllHit();
		allBullets=new Vector<Bullet>();
		allShootBullets=new Vector<Bullet>();
		bossBullets=new Vector<Bullet>();
		strBullets=new Vector<Bullet>();
		allEnemys=new Vector<EnemyPlane>();
		allstrEnemys=new Vector<EnemyPlane>();
		for(int i=0;i<enemyCount;i++) {
			EnemyPlane enemyplane=new EnemyPlane(ran.nextInt(width-30),ran.nextInt(120)-160,15,0);
			allEnemys.add(enemyplane);
		}
		for(int i=0;i<enemyCount;i++) {
			EnemyPlane strenemyplane=new EnemyPlane(ran.nextInt(width-30),ran.nextInt(120)-160,15,1);
			allstrEnemys.add(strenemyplane);
		}
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		//-----------------------------
		if(type.equals("welcome")) {
			show.drawWelcome(g);
		}
		//---------关卡1---------------------
		
		if(type.equals("playgame")) {
			show.drawGame(g);
			at.drawHP(g);
			at.drawScore(g);
			plane.draw(g);
			
			for(int i=0;i<allBullets.size();i++) {
				Bullet bullet=allBullets.elementAt(i);
				bullet.draw(g);
			}
			
			for(int i=0;i<allEnemys.size();i++) {
				EnemyPlane enemyplane=allEnemys.elementAt(i);
				
				enemyplane.draw(g);
			}
			
			for(int i=0;i<allgains.size();i++) {
				Gain gain=allgains.elementAt(i);
				gain.draw(g);
			}
			
			for(int i=0;i<strBullets.size();i++) {
				Bullet strbullet=strBullets.elementAt(i);
				strbullet.draw(g);
			}
		}
		//-------------关卡2--------------------
		
		if(type.equals("playgame2")) {
			
			show.drawGame2(g);
			plane.draw(g);
			at.drawHP(g);
			at.drawScore(g);
			for(int i=0;i<allEnemys.size();i++) {
				EnemyPlane enemyplane=allEnemys.elementAt(i);
				enemyplane.draw(g);
			}
			for(int i=0;i<allstrEnemys.size();i++) {
				EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
				strenemyplane.draw(g);
			}
			for(int i=0;i<allBullets.size();i++) {
				Bullet bullet=allBullets.elementAt(i);
				bullet.draw(g);
			}
			for(int i=0;i<allBarriers.size();i++) {
				Barrier barrier=allBarriers.elementAt(i);
				barrier.draw(g);
			}
			
			for(int i=0;i<allgains.size();i++) {
				Gain gain=allgains.elementAt(i);
				gain.draw(g);
			}
			for(int i=0;i<strBullets.size();i++) {
				Bullet strbullet=strBullets.elementAt(i);
				strbullet.draw(g);
			}
		}
		repaint();
		//-------------------boss-----------------
		if(type.equals("boss")) {
			super.paint(g);
				
				show.drawBoss(g);
				at.drawHP(g);
				at.drawBossHP(g);
				boss.draw(g);
				for(int i=0;i<bossBullets.size();i++) {
					Bullet bossbullet=bossBullets.elementAt(i);
					bossbullet.draw(g);
				}
				
				for(int i=0;i<allShootBullets.size();i++) {
					Bullet bullet=allShootBullets.elementAt(i);
					bullet.draw(g);
				}
				for(int i=0;i<allstrEnemys.size();i++) {
					EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
					strenemyplane.draw(g);
				}
				
				
				
				
				plane.draw(g);	
		}
		repaint();
		
		//-------------------------------------------------
		if(type.equals("gameover")) {
			super.paint(g);
			show.drawGameover(g);
		}
		repaint();
		
		if(type.equals("win")) {
			super.paint(g);
			show.drawGameWin(g);
		}
		repaint();
		
	}


	
	
	
	@Override
	public void run() {
		int interval=0;
		int a=5;
		int b=10;
		int bossbulletcount=0;
		while(true) {
			System.out.println(type);
			if(!ispause) {
				if(type.equals("playgame")) {
				//发射子弹
					if(isFire&&interval%30==0&&at.getScore()<=max1) {
						Bullet bullet=new Bullet(plane.getX(), plane.getY(), 10,1);
						allBullets.add(bullet);
					}
					if(at.getScore()<max1-3) {
						if(interval%500==0) {
							Gain gain=new Gain(ran.nextInt(width-30),-50,15,ran.nextInt(2));
							allgains.add(gain);
						}
					
					}
						
						for(int i=0;i<allgains.size();i++) {
							Gain gain=allgains.elementAt(i);
							if(gain.getY()>height) {
								allgains.remove(i);
							}
							gain.move();
						}
						//吃奖励
						for(int i=0;i<allgains.size();i++) {
							Gain gain=allgains.elementAt(i);
							if(allhit.eatgain(gain, plane)) {
								if(gain.getKind()==0) {
									if(at.getHP()<=100) {
										at.setHP(at.getHP()+10);
									}
									allgains.remove(i);
								}
								if(gain.getKind()==1) {							
									Bullet bullet=new Bullet(plane.getX(), plane.getY(), 25,2);
									strBullets.add(bullet);	
									allgains.remove(i);
								}			
							}
							
						}
					
					
					
					//增强子弹
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						for(int j=0;j<allEnemys.size();j++) {
							EnemyPlane enemyplane=allEnemys.elementAt(j);
							if(allhit.shootdown(strbullet, enemyplane)) {
								
								enemyplane.setY(0);
								enemyplane.setX(ran.nextInt(width-enemyplane.getR())+enemyplane.getR());
								at.setScore(at.getScore()+1);
							}
						}
					}
					
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						if(strbullet.getY()<0) {
							strBullets.remove(i);
						}
						strbullet.move();
					}
					
					//处理子弹
					for(int i=0;i<allBullets.size();i++) {
						Bullet bullet=allBullets.elementAt(i);
						if(bullet.getY()<0) {
							allBullets.remove(i);
						}
						bullet.move();
					}
					//处理敌机
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						if(enemyplane.getY()>height) {
							enemyplane.setY(0);
							enemyplane.setX(ran.nextInt(width-enemyplane.getR())+enemyplane.getR());
						}
						enemyplane.move();
					}
					//避免敌机聚集
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane ep1=allEnemys.elementAt(i);
						for(int j=0;j<allEnemys.size()&&j!=i;j++) {
							
							EnemyPlane ep2=allEnemys.elementAt(j);
							if(allhit.near(ep1, ep2)&&ep2.getX()+1<width) {
								ep2.setX(ep2.getX()+1);
							}
						}
						
					}
					//击落敌机
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						for(int j=0;j<allBullets.size();j++) {
							Bullet bullet=allBullets.elementAt(j);
							if(allhit.shootdown(bullet,enemyplane)) {
								
								allBullets.remove(j);
								enemyplane.setY(0);
								enemyplane.setX(ran.nextInt(width));
								at.setScore(at.getScore()+1);
								
							}
						}
					}
					//调整gain和enemyplane的位置
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						for(int j=0;j<allgains.size();j++) {
							Gain gain=allgains.elementAt(j);
							if(allhit.adjust(enemyplane, gain)) {
								if(enemyplane.getX()+enemyplane.getR()+1<width) {
									enemyplane.setX(enemyplane.getX()+1);
								}
								
								
							}
						}
					}
					
					//被撞击
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						if(allhit.hit(plane, enemyplane)) {
							enemyplane.setY(0);
							enemyplane.setX(ran.nextInt(width));
							at.setHP(at.getHP()-10);
						}
					}
					//关卡升级
					if(at.getScore()<max2&&at.getScore()>max1) {
						type="playgame2";
//						
					}
					
					//死亡
					if(at.getHP()<=0) {
						type="gameover";
					}
					
					
					try {
						Thread.sleep(8);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					interval++;
					repaint();
				}
				
			}
			//---------------关卡2-------------
			if(!ispause) {
				
				if(type.equals("playgame2")) {
					if(allEnemys.size()==0&&show.getY2()==0) {
						//障碍
						if(interval%120==0) {
							Barrier barrier=new Barrier();
							allBarriers.add(barrier);
						}
						
						//障碍吃子弹
						for(int i=0;i<allBullets.size();i++) {
							Bullet bullet=allBullets.elementAt(i);
							for(int j=0;j<allBarriers.size();j++) {
								Barrier barrier=allBarriers.elementAt(j);
								if(allhit.stone(bullet, barrier)) {
									allBullets.remove(i);
									if(barrier.getHP()>0) {
										barrier.setHP(barrier.getHP()-1);
									}
									
								}
							}
						}

						for(int i=0;i<allBarriers.size();i++) {
							Barrier barrier=allBarriers.elementAt(i);
							if(allhit.BarrierhitPlane(plane, barrier)) {
								if(barrier.getHP()<1) {
									allBarriers.remove(i);
								}else {
									barrier.setHP(barrier.getHP()-1);
								}
								at.setHP(at.getHP()-20);
								
							}
						}
						for(int i=0;i<allBarriers.size();i++) {
							Barrier barrier=allBarriers.elementAt(i);
							if(barrier.getHP()<1) {
								allBarriers.remove(i);
							}
						}
						//发射子弹
						if(isFire&&interval%60==0) {
							Bullet bullet=new Bullet(plane.getX(), plane.getY(), 10,1);
							allBullets.add(bullet);
						}
						
						if(interval%1200==0&&at.getScore()<max2-3) {
							Gain gain=new Gain(ran.nextInt(width)+15,-50,15,ran.nextInt(2));
							allgains.add(gain);
						}
						
						
						
						//吃奖励
						for(int i=0;i<allgains.size();i++) {
							Gain gain=allgains.elementAt(i);
							if(allhit.eatgain(gain, plane)) {
								if(gain.getKind()==0) {
									if(at.getHP()<=100) {
										at.setHP(at.getHP()+10);
									}
									allgains.remove(i);
								}
								if(gain.getKind()==1) {							
									Bullet bullet=new Bullet(plane.getX(), plane.getY(), 25,2);
									strBullets.add(bullet);	
									allgains.remove(i);
								}			
							}
							
						}
						
					}
					for(int i=0;i<allBarriers.size();i++) {
						Barrier barrier=allBarriers.elementAt(i);
						if(barrier.getY()>height) {
							allBarriers.remove(i);
						}
						barrier.move();
					}
					for(int i=0;i<allgains.size();i++) {
						Gain gain=allgains.elementAt(i);
						if(gain.getY()>height) {
							allgains.remove(i);
						}
						gain.setY(gain.getY()+2);;
					}
					
					
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						for(int j=0;j<allBarriers.size();j++) {
							Barrier barrier=allBarriers.elementAt(j);
							if(allhit.shootbrrier(barrier, strbullet)) {
								if(strbullet.getHP()<=0) {
									strBullets.remove(i);
								}else {
									strbullet.setHP(strbullet.getHP()-1);
								}
								if(barrier.getHP()<=0) {
									allBarriers.remove(i);
									at.setScore(at.getScore()+1);
								}else {
									barrier.setHP(barrier.getHP()-1);
								}
								
							}
						}
					}
					
					//增强子弹
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						for(int j=0;j<allEnemys.size();j++) {
							EnemyPlane enemyplane=allEnemys.elementAt(j);
							if(allhit.shootdown(strbullet, enemyplane)) {
								
								enemyplane.setY(0);
								enemyplane.setX(ran.nextInt(width-enemyplane.getR())+enemyplane.getR());
								if(strbullet.getHP()<=0) {
									strBullets.remove(i);
								}else {
									strbullet.setHP(strbullet.getHP()-1);
								}
								at.setScore(at.getScore()+1);
							}
						}
					}
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						for(int j=0;j<allstrEnemys.size();j++) {
							EnemyPlane strenemyplane=allstrEnemys.elementAt(j);
							if(allhit.shootdown(strbullet, strenemyplane)) {
								
								strenemyplane.setY(0);
								strenemyplane.setX(ran.nextInt(width-strenemyplane.getR())+strenemyplane.getR());
								if(strbullet.getHP()<=0) {
									strBullets.remove(i);
								}else {
									strbullet.setHP(strbullet.getHP()-1);
								}
								at.setScore(at.getScore()+1);
							}
						}
					}
					
					
					
					//子弹移动
					for(int i=0;i<allBullets.size();i++) {
						Bullet bullet=allBullets.elementAt(i);
						if(bullet.getY()<0) {
							allBullets.remove(i);
						}
						bullet.move();
					}
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						if(allhit.hit(plane, enemyplane)) {
							allEnemys.remove(i);
						}
					}
					//处理上一关敌机
					for(int i=0;i<allEnemys.size();i++) {
						EnemyPlane enemyplane=allEnemys.elementAt(i);
						if(enemyplane.getY()>=height) {
							allEnemys.remove(i);
						}
						enemyplane.setY(enemyplane.getY()+2);
					}
					//敌机出现
					if(allEnemys.size()==0&&show.getY2()==0) {
						for(int i=0;i<allstrEnemys.size();i++) {
							EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
							if(strenemyplane.getY()>height) {
								strenemyplane.setY(0);
								strenemyplane.setX(ran.nextInt(width-strenemyplane.getR())+strenemyplane.getR());
							}
							strenemyplane.move();
						}
					}
					
					//均匀
					for(int i=0;i<allstrEnemys.size();i++) {
						EnemyPlane strep1=allstrEnemys.elementAt(i);
						for(int j=0;j<allstrEnemys.size()&&j!=i;j++) {
							
							EnemyPlane strep2=allstrEnemys.elementAt(j);
							if(allhit.near(strep1, strep2)&&strep2.getX()+1<width) {
								strep2.setX(strep2.getX()+1);
							}
						}
						
					}
					
					//撞击
					for(int i=0;i<allstrEnemys.size();i++) {
						EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
						if(allhit.hit(plane, strenemyplane)) {
							strenemyplane.setY(0);
							strenemyplane.setX(ran.nextInt(width));
							
							at.setHP(at.getHP()-10);
						}
					}
					//击落敌机
//					for(int i=0;i<allBullets.size();i++) {
//						Bullet bullet=allBullets.elementAt(i);
//						for(int j=0;j<allstrEnemys.size();j++) {
//							EnemyPlane strenemyplane=allstrEnemys.elementAt(j);
//							if(allhit.shootdown(bullet, strenemyplane)) {
//								allBullets.remove(i);
//								strenemyplane.setX(ran.nextInt(width-strenemyplane.getR()));
//								strenemyplane.setY(0);
//								at.setScore(at.getScore()+2);
//							}
//						}
//					}
					
					for(int i=0;i<allstrEnemys.size();i++) {
						EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
						for(int j=0;j<allBullets.size();j++) {
							Bullet bullet=allBullets.elementAt(j);
								if(allhit.shootdown(bullet, strenemyplane)) {
									allBullets.remove(j);
									strenemyplane.setX(ran.nextInt(width-strenemyplane.getR()));
									strenemyplane.setY(0);
									at.setScore(at.getScore()+2);
								}
						}
					}
					
					
					
					
					
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						for(int j=0;j<allBarriers.size();j++) {
							Barrier barrier=allBarriers.elementAt(j);
							if(allhit.stone(strbullet, barrier)) {
								if(barrier.getHP()>0) {
									barrier.setHP(barrier.getHP()-1);
								}else {
									allBarriers.remove(j);
									at.setScore(at.getScore()+2);
								}
								if(strbullet.getHP()<=0) {
									strBullets.remove(i);
								}else {
									strbullet.setHP(strbullet.getHP()-1);
								}
								
								
							}
						}
					}
					
					for(int i=0;i<strBullets.size();i++) {
						Bullet strbullet=strBullets.elementAt(i);
						if(strbullet.getY()<0) {
							strBullets.remove(i);
						}
						strbullet.move();
					}
					
					
					if(at.getScore()>=max2) {
						type="boss";
					}
					if(at.getHP()<=0) {
						type="gameover";
					}
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(show.getY1()<820) {
						show.setY1(show.getY1()+1);
					}
					if(show.getY1()>=820) {
						show.setY1(820);
					}
					if(show.getY2()<0) {
						show.setY2(show.getY2()+1);
					}
					if(show.getY2()>=0) {
						show.setY2(0);
					}
					
					interval++;
					repaint();
					
				}
			}
			
			
			
	/*-----------------Boss--------------------	*/	
			if(!ispause) {
				
				if(type.equals("boss")) {
					//System.out.println(bossready);
					
					
					
					
					
					
						
					for(int i=0;i<allstrEnemys.size();i++) {
						EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
						if(strenemyplane.getY()>height) {
							allstrEnemys.remove(i);
						}
						strenemyplane.setY(strenemyplane.getY()+2);
					}
					for(int i=0;i<allstrEnemys.size();i++) {
						EnemyPlane strenemyplane=allstrEnemys.elementAt(i);
						if(allhit.hit(plane, strenemyplane)) {
							allstrEnemys.remove(i);
							
						}
					}
					if(allstrEnemys.size()==0&&show.getY3()==0) {
						
						
						
						if(boss.getY()>=100) {
							if(boss.getX()<0) {
								boss.setArr(0);
							}
							if(boss.getX()>582-2*boss.getWedth()) {
								boss.setArr(1);
							}
						}
											
						if(boss.getY()==100) {
							boss.setForword(0);
							
						}if(boss.getY()==200) {
							boss.setForword(1);
						}
						boss.move();
					}
					
						//
						if(boss.getY()>=100&&bossbulletcount%30==0) {
							Bullet bu=new Bullet((int)(boss.getX()+0.5*boss.getWedth()), (int)(boss.getY()+0.5*boss.getHeight()), 10,0);
							bossBullets.add(bu);
						}
						
						
						
							for(int i=0;i<bossBullets.size();i++) {
								Bullet bossbullet=bossBullets.elementAt(i);
								if(bossbullet.getY()<0) {
									bossBullets.remove(i);
								}
								bossbullet.move();
								
							}
						
						
						
						if(boss.getY()>=100&&isFire&&interval%30==0) {
							Bullet bullet=new Bullet(plane.getX(), plane.getY(), 10,1);
							allShootBullets.add(bullet);
						}
						
						for(int i=0;i<allShootBullets.size();i++) {
							Bullet bullet=allShootBullets.elementAt(i);
							if(bullet.getY()<0) {
								allShootBullets.remove(i);
							}
							bullet.move();
						}
						
						
						for(int i=0;i<bossBullets.size();i++) {
							Bullet bossbullet=bossBullets.elementAt(i);
							if(allhit.beshootdown(bossbullet, plane)) {
								bossBullets.remove(i);
								at.setHP(at.getHP()-30);
							}	
						}
						
						for(int i=0;i<allShootBullets.size();i++) {
							Bullet bullet=allShootBullets.elementAt(i);
							if(allhit.shoot(bullet, boss)) {
								allShootBullets.remove(i);
								at.setBossHP(at.getBossHP()-50);
							}
						}
						
						
						if(at.getHP()<=0) {
							type="gameover";
						}
						
						if(at.getBossHP()<=0) {
							type="win";
						}
						if(type.equals("win")||type.equals("gameover")) {
							try {
								Thread.sleep(100000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(show.getY2()<820) {
							show.setY2(show.getY2()+1);
						}
						if(show.getY2()>=820) {
							show.setY2(820);
						}
						if(show.getY3()<0) {
							show.setY3(show.getY3()+1);
						}
						if(show.getY3()>=0) {
							show.setY3(0);
						}
						interval++;
						bossbulletcount++;
						
						repaint();
						
					
					
					
				}
				
			}
			
			
			
		}
		
	}
	
	
	


	//--------------------------------
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getX()<width-plane.getR()&&e.getX()>0&&e.getY()<height-plane.getR()&&e.getY()>0&&!ispause) {
			plane.setX(e.getX()-plane.getR());
			plane.setY(e.getY()-plane.getR());	
		}
		repaint();
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getX()<width-plane.getR()&&e.getX()>0&&e.getY()<height-plane.getR()&&e.getY()>0&&!ispause) {
			plane.setX(e.getX()-plane.getR());
			plane.setY(e.getY()-plane.getR());	
		}
		repaint();
	}

//-----------------------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		isFire=true;
		if(e.getX()>=170&&e.getX()<270&&e.getY()>420&&e.getY()<470&&type.equals("welcome")) {
			type="playgame";
		}
		
		if(e.getX()>=170&&e.getX()<270&&e.getY()>490&&e.getY()<540&&type.equals("welcome")) {
			System.exit(-1);
		}
		if(e.getX()>=180&&e.getX()<280&&e.getY()>450&&e.getY()<500&&type.equals("gameover")) {
			System.exit(-1);
		}
		if(e.getX()>=180&&e.getX()<280&&e.getY()>460&&e.getY()<510&&type.equals("win")) {
			System.exit(-1);
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		isFire=false;
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

//-----------------------------------------------
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
//		if(e.getKeyCode()==KeyEvent.VK_UP) {
//			if(type.equals("gameover")||type.equals("win")||type.equals("welcome")) {
//				type="playgame";
//			}
//			
//		}
//		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
//			ispause=true;
//		}
//		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
//			ispause=false;
//		}
		if(e.getKeyCode()==10) {
			if(ispause==false) {
				ispause=true;
			}else {
				ispause=false;
			}
			
		}
//		if(e.getKeyCode()==27) {
//			if(type.equals("welcome")||type.equals("gameover")||type.equals("win")) {
//				System.exit(-1);
//			}
//			
//		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
}
