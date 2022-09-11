import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{		//implement comparable interface to sort the user defined type list when Reference class is accessible
	 
	int rollNo,age;
	String Name;
	
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		Name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", Name=" + Name + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		if(this.getAge() > o.getAge()) {	//sort by age ascending
			return 1;
		}else
			return -1;
	}
		
//		if(this.getName().length() > o.getName().length()) {	//sort by name length ascending
//			return 1;
//		}else
//			return -1;
//	}
	
}
public class Program41 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, 30, "Alpha"));
		students.add(new Student(25, 32, "Bravo"));
		students.add(new Student(26, 35, "Charlie"));
		students.add(new Student(27, 31, "Delta"));
		
		Collections.sort(students);
		
		for (Student stu : students) {
			System.out.println(stu);
		}
	}

}
