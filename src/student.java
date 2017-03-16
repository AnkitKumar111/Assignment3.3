/*student result processing system.
 Displaying the details and result of three students.
 */
import java.io.*;
class student
{
	int i;
	String name[] = new String[3];
	int roll_no[] = new int[3];
	int sub1[] = new int[3];
	int sub2[] = new int[3];
	int total;
	float per;
	void getdata() throws IOException
	{
		for(i=0; i<3; i++)
		{
			//creating object for BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //taking input form user using object of BufferedReader object
		System.out.println ("Enter Name of Student"+" "+i+":");
		name[i] = br.readLine();
		System.out.println ("Enter Roll No. of Student"+" "+i+":");
		roll_no[i] = Integer.parseInt(br.readLine());	
		System.out.println ("Enter marks out of 100 of 1st subject");
		sub1[i] = Integer.parseInt(br.readLine());
		System.out.println ("Enter marks out of 100 of 2nd subject");
		sub2[i] = Integer.parseInt(br.readLine());		
		}
	}
	void show()
	{
		for(i=0; i<3; i++)
		{	
			//calculating total percentage and showing the details of student
		total=sub1[i]+sub2[i];
		per=(total*100)/200;
		System.out.println ("-----------------------");
		System.out.println ("Roll No. = "+roll_no[i]);
		System.out.println ("Name = "+name[i]);
		System.out.println ("Marks of 1st Subject = "+sub1[i]);
		System.out.println ("Marks of 2nd Subject = "+sub2[i]);
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+per+"%");
		System.out.println ("-----------------------");
		}
	}
	public static void main(String args[]) throws IOException
	{
		// TODO Auto-generated method stub
		
		//creating object for class student
		student s=new student();
		//invoking method with the help of object
		s.getdata();
		s.show();
	}
}