
public class Program14 {
	
		  public static void main(String[] args) {

		    Encap p1 = new Encap();		  
		    p1.setAge(22);//accessing method to change private field value
		    System.out.println("My age is " + p1.getAge());
		  }
		
}
class Encap {

	  private int age;

	  public int getAge() {
	    return age;
	  }
	  
	  public void setAge(int age) {
	    this.age = age;
	  }
	}