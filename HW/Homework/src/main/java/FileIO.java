/*
 객체지향 프로그래밍 과제
 학과:정보통신공학과
 학번:201704274
 이름:박병규
 과제 주제:파일 입/출력
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;

public class FileIO {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
       FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
       DataOutputStream dos = new DataOutputStream(fos);
       
       dos.writeUTF("박병규");
       dos.writeDouble(95.5);
       dos.writeInt(1);
       
       dos.writeUTF("감자탕");
       dos.writeDouble(90.9);
       dos.writeInt(2);
       
       dos.flush(); dos.close();
       
       FileInputStream fis =new FileInputStream("C:/Temp/primitive.db");
       DataInputStream dis =new DataInputStream(fis);
       
       for(int i=0; i<2; i++) {
    	   String name=dis.readUTF();
    	   double score = dis.readDouble();
    	   int order= dis.readInt();
    	   System.out.println(name+" : "+score+" : "+order);
    	   
       }
       dis.close();
	}

}
