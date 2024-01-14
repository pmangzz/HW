/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제: 예외 처리
 */
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=100;
       int result=0;
       
       for(int i=0; i<10; i++) {
    	   try {//주석4: 예외 처리
    		   result=num/(int)(Math.random()*10);
    		   System.out.println(result);
    	   } catch (ArithmeticException e) {
    		   System.out.println("0");
    	   }
       }
	}

}
