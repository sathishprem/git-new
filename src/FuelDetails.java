
public class FuelDetails extends Employee {
	public void petrol() {
    System.out.println("38");
}
	@Override
	public void empId() {
		super.empId();
	}
	@Override
	public void empName(int a) {
		super.empName(a);
	}
	public static void main(String[] args) {
		FuelDetails F=new FuelDetails();
		F.petrol();
		F.empId();
		F.empName(0 );
	}
}
