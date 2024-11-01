package encapsulation;

public class Bank {
	private String name;
	private int accno;
	private int balance;
	public void setter(String name,int balance,int accno)
	{
		this.name=name;
		this.balance=balance;
		this.accno=accno;
	}
	public void getter()
	{
		System.out.println("Name:"+name);
		System.out.println("accont number:"+accno);
		System.out.println("balance:"+balance);
	}

}
