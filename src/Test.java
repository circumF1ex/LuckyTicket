public class Test {
	
	public static void oneMill() {
		
		Ticket ticket = new Ticket();
		int counter = 0;
		
		for (int i = 1; i < 1000000; i++) {
			
			if (ticket.setTicketNumber(i)) {
				
				if (ticket.checkLuck()) {
					System.out.print(String.format("%06d", ticket.getTicketNumber()) + " ");
					counter++;
				
					if (counter % 10 == 0) {
						System.out.print("\n");
					}
				}
				
			}
			
			else {
				continue;
			}
		}
		System.out.println("\nLucky Tickets in 1'000'000 iterations: " + counter);
	}
}