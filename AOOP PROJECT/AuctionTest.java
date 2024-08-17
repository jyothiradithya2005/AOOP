package auction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuctionTest {

	@Test
    void testPlaceBid() {
        Auction auction = new Auction();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auction.addBidder(bidder1);
        auction.addBidder(bidder2);

        auction.placeBid(bidder1, 100);
        assertEquals(100, auction.getHighestBid());

        auction.placeBid(bidder2, 150);
        assertEquals(150, auction.getHighestBid());
    }

}
