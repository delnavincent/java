package encapsulation;

public class BankAtm {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validPin(int pin)
	{
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("Valid pin");
			System.out.println("user can withdraw amount");
		}	
			else
			{
				System.out.println("Invalid pin");
				System.out.println("User can't withdraw amount");
			}
		}
		
	}



