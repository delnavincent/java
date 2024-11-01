package aggregation;

public class Student {
	String name;
	int rollNo;
	char division;
	Address add;
	
	public Student(String name,int rollNo,char division,Address add)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.division=division;
		this.add=add;
	}
	public void details()
	{
		System.out.println("name is"+ name);
		System.out.println("Roll no is"+ rollNo);
		System.out.println("Division is"+ division);
		System.out.println("House name is"+ add.houseName);
		System.out.println("House no is"+ add.houseNo);
		System.out.println("District is"+ add.district);
	}
	public static void main(String[] args) {
		Address obj=new Address("vakayil",34,"Thrissur");
		Student obj1=new Student("neena",12,'A',obj);
		obj1.details();
		
		
		
	}
	
	

}
