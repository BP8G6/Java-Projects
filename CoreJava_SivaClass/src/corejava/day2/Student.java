package corejava.day2;

public class Student {
	private int rollnumber;
	private String course;
	private String name;
	
	public void setRollNumber(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollNumber()
	{
		return rollnumber;
	}
	
	public String getCourse()
	{
		return course;
	}

	public String getName()
	{
		return name;
	}
	
}
