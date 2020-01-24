package IGInfotech;

public class EncapsulationDemo {

	 private int empid;
	
	 private String ename ;
	
	 private String edept;
	
	public String getName() {
		
		return ename;
	}
	
	public int getId() {
		
		return empid;
	}
	public String getDept() {
		
		return edept;
	}
	
	public void setEname(String newValue) {
		
		ename = newValue;
	}

	public void setEno(int empno) {
		
		empid=empno;
		
	}
	public void setEdept(String newValue) {
		edept = newValue;
		
	}
	
		
	public static void main(String[] args) {
		
		EncapsulationDemo dn = new EncapsulationDemo();
		
		dn.setEdept("CSE");
		dn.setEname("Ram");
		dn.setEno(555);
		
		System.out.println("DeptName "+dn.getDept());
		
		System.out.println("Eno "+dn.getId());
		
		System.out.println("Ename "+dn.getName() );
	}

}
