public class Employee1 {
	int id;
	String name;
	String branch;
	String usn;
	public Employee1() {
		
	}
	public Employee1(int id,String name,String branch,String usn) {
		this.id= id;
		this.name=name;
		this.branch=branch;
		this.usn=usn;
	}
	public Employee1(int id) {
		this.id=id;
	}
	public String toString() {
		String str = "("+id+","+name+","+branch+","+usn+")";
		return str;
		
	}

	



	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.id=101;
		e1.name = "CoD";
		e1.branch="ME";
		e1.usn = "1hm15me092";
		System.out.println(e1.toString());
		Employee1 e2 = new Employee1(103,"EaArts","CS","1hm15cs092");
		System.out.println(e2.toString());
		Employee1 e3 = new Employee1(103);
	}
		
	


	}
	

