public class Program4 {

	int real, image;
	
	public Program4(int r1, int i1) {
		this.real=r1;
		this.image=i1;
	}
	public void showC()
    {
        System.out.println(this.real +"+i "+ this.image);
    }
	public static Program4 add(Program4 n1,Program4 n2){
		
		Program4 temp1= new  Program4(0, 0);
		System.out.println(temp1);
		temp1.real = n1.real + n2.real;
        temp1.image = n1.image + n2.image;
		return temp1 ;
	}
	public static void main(String []arg) {
		Program4 p41 = new Program4(472,178);
		p41.showC();
		Program4 p42 = new Program4(240,921);
		p42.showC();
		Program4 temp = add(p41, p42);
		System.out.println(temp);
		temp.showC();
	}
}


