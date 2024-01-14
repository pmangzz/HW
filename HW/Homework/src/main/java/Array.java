/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제: 참조타입(배열,열거)
 */
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] score= {//주석6번: 참조타입 배열
    		   {100,100,100},
    		   {50,30,70},
    		   {85,98,42},
    		   {100,89,92},
    		   {58,98,42}
       };
       int KoreanTotal=0, EnglishTotal=0, MathTotal=0;
       System.out.println(" 학번  국아  영어  수학  총점  평균");
       System.out.println("===========================");
      
       for(int i=0; i<score.length; i++) {
    	   int sum=0;
    	   float average=0.00f;
    	   
    	   KoreanTotal += score[i][0];
    	   MathTotal += score[i][1];
    	   EnglishTotal += score[i][2];
    	   System.out.printf("%3d",i+1);
    	   
    	   for(int j=0; j<score[i].length; j++) {
    		   sum += score[i][j];
    		   System.out.printf("%5d",score[i][j]);
    	   }
    	   
    	   average=sum/(float)score[i].length;
    	   System.out.printf("%5d%5.1f%n",sum,average);
       }
       System.out.println("========================");
       System.out.printf("총점: %3d %4d %4d%n",KoreanTotal,MathTotal,EnglishTotal);
	}

}
