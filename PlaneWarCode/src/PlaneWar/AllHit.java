package PlaneWar;



public class AllHit {
	public boolean shootdown(Bullet p, EnemyPlane b) {
		boolean isHit = false;
		if(p.getArr()==1) {
			if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		}
		if(p.getArr()==2) {
			if((b.getX()>=p.getX()&&b.getX()<=p.getX()+4*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+4*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+4*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+4*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+4*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		}
		return isHit;

	}
	public boolean hit(Plane p, EnemyPlane b) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean beshootdown(Bullet b,Plane p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean shoot(Bullet b,Boss p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean near(EnemyPlane b,EnemyPlane p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	
	public boolean BarrierhitPlane(Plane b,Barrier p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean stone(Bullet b,Barrier p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean adjust(EnemyPlane b,Gain p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean shootbrrier(Barrier b,Bullet p) {
		boolean isHit = false;
		if((b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()>=p.getX()&&b.getX()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()>=p.getY()&&b.getY()<=p.getY()+2*p.getR())
				||(b.getX()+2*b.getR()>=p.getX()&&b.getX()+2*b.getR()<=p.getX()+2*p.getR())&&(b.getY()+2*b.getR()>=p.getY()&&b.getY()+2*b.getR()<=p.getY()+2*p.getR())) {
				isHit = true;
			}
		return isHit;

	}
	public boolean eatgain(Gain g,Plane p) {
		boolean isHit = false;
		int bx1 = g.getX() + g.getR();
		int by1 = g.getY() + g.getR();

		// 勾股定理
		if (bx1 > p.getX() && bx1 <p.getX() +p.getR() * 2 && by1 > p.getY() && by1 < p.getY() + p.getR() * 2) {
			isHit = true;
		}
		return isHit;

	}
}
