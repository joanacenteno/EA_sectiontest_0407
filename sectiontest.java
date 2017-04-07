package section;

import static org.junit.Assert.*;

import org.junit.Test;

public class sectiontest {
	

	@Test
	public void isSameSchedule() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		assertEquals(s1.getSubject(),s2.getSubject());
		
		
	}
	@Test
	public void isSameSchedule2() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		comparison com =new comparison(s1,s2);
		com.compare();
		
		String expected1 = com.result();
		String result1="no";
		assertEquals(expected1, result1);
		
		
	}
	@Test
	public void isNotSameSchedule2() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.PM1130to1, Days.TueFri);
		comparison com =new comparison(s1,s2);
		com.compare();
		//com.result();
		String expected1 = com.result();
		String result1="yes";
		assertEquals(expected1, result1);
		
		
	}
	/*
	@Test
	public void MaxUnits(){
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		Units unit=new Units();
		units.addUnit(Subject.CS010);
	}
	*/
	@Test
	public void isMoreThan40(){
	
		enrolledsect s1 = new enrolledsect();
		//more than 40 students
		
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		s1.addStude("stud1");
		String expected=s1.getOutput();
		String result="Exceeded number of students";
		assertEquals(expected, result);
	}
	@Test
	public void isNotMoreThan40(){
		enrolledsect s1 = new enrolledsect();
		s1.addStude("stud1");
		String expected=s1.getOutput();
		String result="Enrolled";
		assertEquals(expected, result);
	}
}
