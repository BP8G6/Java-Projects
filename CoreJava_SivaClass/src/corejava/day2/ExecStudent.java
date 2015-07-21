package corejava.day2;

public class ExecStudent {

	public static void main(String[] args)
	{
		Student student = new Student();
		student.setName("Balakrishna");
		student.setCourse("JAVA");
		student.setRollNumber(16177831);
		System.out.println("Name of the student is: "+student.getName());
		System.out.println("Name of the Course is: "+student.getCourse());
		System.out.println("Rollnumber of Student is: "+student.getRollNumber());
		
		System.out.println("==================2nd Student============================");
		//For 2nd Student
		
		
		
		Student student2 = new Student();
		student2.setName("Ponnam");
		student2.setCourse("J2EE");
		student2.setRollNumber(16177842);
		System.out.println("Name of the student2 is: "+student2.getName());
		System.out.println("Name of the Student2 Course is: "+student2.getCourse());
		System.out.println("Rollnumber of Student2 is: "+student2.getRollNumber());
	}
}
