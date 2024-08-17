package auction;

public class Bidder {
	 private String name;

	    public Bidder(String name) {
	        this.name = name;
	    }

	    public void update(int newBid) {
	        System.out.println(name + " has been notified of the new highest bid: $" + newBid);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print(name + ", would you like to place a higher bid? Enter amount or 0 to pass: ");
	        int userBid = scanner.nextInt();

	        if (userBid > newBid) {
	            System.out.println(name + " has placed a new bid of $" + userBid);
	        } else {
	            System.out.println(name + " has passed.");
	        }
	    }

	    public String getName() {
	        return name;
	    }
}
	