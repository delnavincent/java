package superkeyword;

public class DivisionResult extends AdditionResult {
	public int result()
	{
		int s=super.result();
		int d=s%10;
		return d;
	}

	public static void main(String[] args) {
		DivisionResult obj=new DivisionResult();
		int d=obj.result();
		if(d==0)
		{
			System.out.println("Divisable by 10");
		}
		else
		{
			System.out.println("Not divisable by 10");
		}
		

	}

}
