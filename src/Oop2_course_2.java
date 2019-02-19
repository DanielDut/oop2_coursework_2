import java.util.ArrayList;
import java.util.Scanner;

public class Oop2_course_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> courses = new ArrayList<String>();
	      Scanner nam=new Scanner(System.in);
	      System.out.println("Enter students name(Enter exit when done)");
	      int x=1;
	      while(true){
	      System.out.println("Enter students name: " +x);
	      String y=nam.next();
	      if(y.toLowerCase().equals("exit"))
	          break;
	      else
	      {
	          int mark[] = new int [6];
	     int i;
	     String grd;
	     float sum=0, avg;
	     Scanner scan = new Scanner(System.in);
	     System.out.println("enter your 1st course: ");
	     String fc =scan.next();
	     courses.add(fc);
	     
	     System.out.println("enter your 2nd course");
	     String sc =scan.next();
	     courses.add(sc);
	     
	     System.out.println("enter your 3rd course");
	     String tc =scan.next();
	     courses.add(tc);
	     
	     System.out.println("enter your 4th course");
	     String ffc =scan.next();
	     courses.add(ffc);
	     
	     System.out.println("enter your 5th course");
	     String fffc =scan.next();
	     courses.add(fffc);
	     
	     System.out.println("enter your 6th course");
	     String ssc =scan.next();
	     courses.add(ssc);
	     
	     System.out.println("Enter students marks now....");
	     for (i=0; i< 6; i++)
	     {
	    	 System.out.println("Enter " + courses.get(i) + " marks: ");
	         mark[i] = scan.nextInt();
	         sum = sum + mark[i];
	     }
	     avg = sum/6;
	     System.out.println("your average grade is" +avg);
	          name.add(y);
	          x++;
	      }
	      }
	}

}
