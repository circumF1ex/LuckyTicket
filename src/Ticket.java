public class Ticket {
	
	private int ticketNumber;
	
	public boolean setTicketNumber(int tn) {
		
		if (tn < 1001 || tn > 999999) {
			return false;
		}
		
		else {
			this.ticketNumber = tn;
			return true;
		}
	}
	
	public int getTicketNumber() {
		return this.ticketNumber;
	}
	
	public boolean checkLuck() {
		int fHalf = this.getTicketNumber() / 1000;
		int sHalf = this.getTicketNumber() % 1000;
		int fHalfSum = fHalf / 100 + (fHalf / 10 % 10) + (fHalf % 100 % 10);
		int sHalfSum = sHalf / 100 + (sHalf / 10 % 10) + (sHalf % 100 % 10);
		
		if (sHalfSum == fHalfSum) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
}