package section;

import java.util.ArrayList;

public class enrolledsect {
	public static int count;
	public String output;
	ArrayList<String> students = new ArrayList<String>();
	String stud="";
	public enrolledsect(){
		
	}
	 public void addStude(String student){
		 this.stud=student;
			students.add(stud);
			if(students.size()>40){
				//System.out.println("Exceeded number of students");
				output="Exceeded number of students";
			}
			else{
				//System.out.println("Enrolled");
				output="Enrolled";
			}
	 }
	public String getOutput(){
		
		return output;
	}

}
