package auction;

public class Main {
	   public static void main(String[] args) {
	        Auction auction = new Auction();

	        Bidder bidder1 = new Bidder("Alice");
	        Bidder bidder2 = new Bidder("Bob");

	        auction.addBidder(bidder1);
	        auction.addBidder(bidder2);

	        auction.placeBid(bidder1, 100);
	        auction.placeBid(bidder2, 150);
	    }
}
