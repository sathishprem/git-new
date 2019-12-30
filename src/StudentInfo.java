
public class StudentInfo extends Employee{
	
	@Override
		public void empId() {
		System.out.println("mani");
		}

public void studentId(String name) {
	System.out.println();
}
public void studentId(String email,int ph) {
	System.out.println(email+ph);
}
public void studentId(int dob,String add) {
System.out.println(add);
}
public static void main(String[] args) {
	StudentInfo I=new StudentInfo();
	
	
	I.studentId("a" );
	I.studentId(null);
	I.studentId(22, "add");
	
	I.empId();
}
}
