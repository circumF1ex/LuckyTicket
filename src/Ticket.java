public class Ticket {
	
	private String ticketNumber;
	
	public void setTicketNumber(String tn) {
		
		if (validTicketNumber(tn)) {
			this.ticketNumber = tn;
		}
		
		else {
			throw new UnsupportedOperationException("Not valid ticket");
		}
	}
	
	public String getTicketNumber() {
		return this.ticketNumber;
	}
	
	public Boolean validTicketNumber(String tn) {
		if (Integer.parseInt(tn) > -1 || Integer.parseInt(tn) < 1000000) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static Boolean checkLuck(Ticket t) {
		Integer firstHalfOfNum = Integer.parseInt(t.getTicketNumber().substring(0, 3));
		Integer secondHalfOfNum = Integer.parseInt(t.getTicketNumber().substring(2));
		Integer sumOfFirstHalf = (firstHalfOfNum % 10) + ((firstHalfOfNum / 10) % 10) + (firstHalfOfNum / 100) % 10;
		Integer sumOfSecondHalf = (secondHalfOfNum % 10) + ((secondHalfOfNum / 10) % 10) + (secondHalfOfNum / 100) % 10;
		
		if (sumOfFirstHalf.compareTo(sumOfSecondHalf) == 0) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
}