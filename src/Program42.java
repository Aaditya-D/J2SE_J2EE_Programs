import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Student {		
	 
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
}
public class Program42 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, 30, "Alpha"));
		students.add(new Student(25, 32, "Bravo"));
		students.add(new Student(26, 35, "Charlie"));
		students.add(new Student(27, 31, "Delta"));
		
		Comparator<Student> com = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				if(o1.getAge() > o2.getAge()) {	
					return 1; //swaps
				}else
					return -1; //doesn't swap
			}
		};
		
		Collections.sort(students,com);  //implement comparator to sort the user defined type list when Reference class is not accessible Ex- class from third party jar or lib | or to directly implement the sort logic in sort method.
		
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
}
