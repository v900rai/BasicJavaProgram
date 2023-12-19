package garaph;

public class atmMachine 
{
	public static void main(String []args) {
		int dbpin=1234;
		int dbbal=3000;
		int pin=1234;
		if(pin==dbpin) {
			int amount=2500;
			{
				if(amount<=dbbal) {
					System.out.println("transaction successfull");
					System.out.println("avalibal balance ==" +(dbbal-amount));
				}else {
					System.out.println("insuficant found");
					
				}
				
			}
		}
	}

}
