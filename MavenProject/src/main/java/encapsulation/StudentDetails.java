package encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj=new Student();
		
		obj.setName("Riya");
		System.out.println(obj.getName());
		
		obj.setDept("CS");
		System.out.println(obj.getDept());
		
		obj.setMark(456);
		System.out.println(obj.getMark());
	}
}
