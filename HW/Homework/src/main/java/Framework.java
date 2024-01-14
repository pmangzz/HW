/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제:컬렉션 프레임워크
 */
import java.util.*;
public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       final int LIMIT=10;
       String word="ajdsjashdjashfk;jna;sbfkb12124sdasdansl8fjja9";
       int length=word.length();
       List list = new ArrayList(length/LIMIT+10);//주석7:컬렉션 프레임워크
       for(int i=0; i<length; i+=LIMIT) {
    	   if(i+LIMIT<length)
    		   list.add(word.substring(i,i+LIMIT));
    	   else
    		   list.add(word.substring(i));
       }
       for(int i=0; i<list.size(); i++) {
    	   System.out.println(list.get(i));
       }
	}

}
