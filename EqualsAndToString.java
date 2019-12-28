class Employee2{
	private int empid;
	private String ename;
	private double salary;
	
	public Employee2(){}

	public Employee2(int empid, String ename, double salary){
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void setEmpid(int empid){
		this.empid = empid;
	}
	
	public void setEname(String ename){
		this.ename = ename;
	}
	
	public void setSalary(double salary){
	this.salary = salary;
	}
	
	public int getEmpid(){
		return empid;
	}
	
	public String getEname(){
		return ename;
	}
	
	public double getSalary(){
		return salary;
	}
	
	 @Override
    public boolean equals(Object o) { 
        if (o == this) 
            return true; 
  
        if (o == null || o.getClass() != this.getClass()) 
            return false; 
		
        Employee2 c = (Employee2) o; 
        return empid == c.empid;
    } 
	
	 @Override
    public int hashCode() { 
        return this.empid; 
    } 
}

class Department{
	private String deptName;
	private int deptNo;
	private Employee2[] e;
	
	public Department(){}

	public Department(String deptName, int deptNo, Employee2[] e){
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.e = e;
	}

	public void setDeptNo(int deptNo){
		this.deptNo= deptNo;
	}
	
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
	
	public void setEmployee(Employee2 e[]){
	this.e = e;;
	}
	
	public int getDeptNo(){
		return deptNo;
	}
	
	public String getDeptName(){
		return deptName;
	}
	
	public Employee2[] getEmployee(){
		return e;
	}
	
	 @Override
    public boolean equals(Object o) { 
        if (o == this) 
            return true; 
  
        if (o == null || o.getClass() != this.getClass()) 
            return false; 
		
        Department c = (Department) o; 
        return deptNo == c.deptNo;	
    } 
	
	 @Override
    public int hashCode() { 
        return this.deptNo; 
    } 
}
public class EqualsAndToString {
	public static void main(String args[]){
		Employee2[] e1 = {new Employee2(101, "Ajay", 25000),
						 new Employee2(102, "Bhanu", 22200),
						 new Employee2(103, "Abhishek", 30000),
						 new Employee2(104, "Babu", 20000)};
		Department d = new Department("Sales", 10, e1);
		
		System.out.print("\n Deptno   = " + d.getDeptNo());
		System.out.print("\n DeptName = " + d.getDeptName());
		System.out.print("\n Employee details \n");
		Employee2 e2[] = d.getEmployee();
		for(int i  = 0;i < e2.length ; i++){
			System.out.print("\n Empid 	  = " + e2[i].getEmpid());
			System.out.print("\n Ename    = " + e2[i].getEname());
			System.out.print("\n Salary   = " + e2[i].getSalary() + "\n");
		}
		
	}
}
