package auction;

import java.util.ArrayList;
import java.util.List;

public class Auction {
	private List<Bidder> bidders = new ArrayList<>();
    private int highestBid = 0;

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void placeBid(Bidder bidder, int amount) {
        if (amount > highestBid) {
            highestBid = amount;
            notifyBidders();
        }
    }

    private void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(highestBid);
        }
    }

    public int getHighestBid() {
        return highestBid;
    }

}
