package prob04;

public class Depart extends Employee {

	String dept = null;
	
	public Depart(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름 : " + this.getName() + " | 연봉 : " + this.getSalary() + " | 부서 : " + dept );
	}
	
	
	
}
