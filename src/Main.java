public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello, MMTR!");
		String formattedNumber = new String();
		Ticket ticket = new Ticket();
		int counter = 0;
		
		for (int i = 0; i < 999999; i++) {
			formattedNumber = String.format("%06d", i);
			ticket.setTicketNumber(formattedNumber);
			
			if (Ticket.checkLuck(ticket)) {
				System.out.print(ticket.getTicketNumber() + " ");
				counter++;
				
				if (counter % 10 == 0) {
					System.out.print("\n");
				}
			}
			
		}
		System.out.println("\nLucky Tickets in 1'000'000 iterations: " + counter);
		
	}
}