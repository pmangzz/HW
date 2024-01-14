/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제: 클래스 상속
 */
public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Point[] p = { new Point (100,100), new Point(140,50), new Point(200,100)
	};
	Triangle t = new Triangle(p);
	Circle c = new Circle(new Point(150,150),50);
	
	t.draw();//삼각형 그리기
	c.draw();//원 그리기

  }
}
class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point{
	int x,y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	Point(){
		this(0,0);
	}
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{//주석2: 클래스 상속
	Point center;//원 원점좌표
	int r;//원 반지름
	
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	void draw() {//원 정보 출력
		System.out.printf("[center=(%d,%d),r=%d,color=%s]%n",center.x,center.y,r,color);
	}
}

class Triangle extends Shape{
	Point[]p= new Point[3];
	Triangle(Point[]p) {
		this.p = p;
	}
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}
