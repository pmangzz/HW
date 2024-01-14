/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제:다형성
 */
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car car=null;
       FireEngine fe = new FireEngine();
       FireEngine fe2=null;
       
       fe.water();
       car =fe;
       fe2=(FireEngine)car;
       fe2.water();
	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive,달려!!!!");
	}
	void stop() {
		System.out.println("stop,멈춰!!!!!");
	}
}
class FireEngine extends Car{//주석2:클래스 상속
	void water() {
		System.out.println("water,뿌려!!!!!!");
	}
}
