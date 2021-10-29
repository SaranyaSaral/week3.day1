package week3.day1;

public class Students {
	public Students() {
	// TODO Auto-generated constructor stub
}
	public void getStudentsInfo(int id ) {
System.out.println("emp "+id);
	} 
	public void getStudentsInfo(  int id,   String name, String email, int phno) {
		System.out.println("emp" +id);
		System.out.println("emp"+name);
		System.out.println("emp"+email);
		System.out.println("emp"+phno);

}
	public void getStudentsInfo(int pin, String adadress) {
		System.out.println("per" +pin);
		System.out.println("per"+adadress);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentsInfo(123);
		obj.getStudentsInfo(465454,"saran", "saranya@gamil .com", 687878908);
	}
	}