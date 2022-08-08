//Write a Program to Calculate Percentage of a gain Student in Class Bord Exam His Mars From 5 Students Past be Taken as input From the eybprd
/*import java.util.Scanner;
public class Percentage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       double Student=0, Student1=0, Student2=0,totalMark=0;
       float percentage;
       System.out.println("Enter Student Mark :");
       Student=input.nextDouble();
       System.out.println("Enter Student Mark :");
       Student1=input.nextDouble();
       System.out.println("Enter Student Mark :");
       Student2=input.nextDouble();
       
       System.out.println("Enter Total Mark:");
       totalMark=input.nextDouble();
       percentage=(float)((Student*100)/totalMark);
       percentage=(float)((Student1*100)/totalMark);
       percentage=(float)((Student2*100)/totalMark);
       System.out.println("percentage is:"+percentage+"%");
	}

}*/
import java.util.Scanner;
public class Percentage{
	public static void main(String[] args) {
		float Java,Python,Php;
		double total,avrage,percentage;
		Scanner op=new Scanner(System.in);
		System.out.println("Enter the Subject Mark:");
		System.out.println("Enter Marks of Java:");
		Java=op.nextFloat();
		System.out.println("Enter Mark of Python:");
		Python=op.nextFloat();
		System.out.println("Enter Mark of Php:");
		Php=op.nextFloat();
		total=Java+Python+Php;
		avrage=(total/5.0);
		percentage=(total/500.0)*100;
		System.out.println("Enter a Total Mark:");
		System.out.println("Total Mark="+total);
		System.out.println("Total Avrange="+avrage);
		System.out.println("Total Percentage="+percentage);
	}
		
		
		
	}
	