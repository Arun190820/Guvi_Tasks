package taskno04april28;
//question no.01
public class Student {

	int rollno;
	String name;
	int age;
	String course;
	public Student(int rollno, String name, int age, String course) {
		this.age= age;
		this.rollno= rollno;
		this.name = name;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
