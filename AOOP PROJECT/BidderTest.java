package auction;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;


class BidderTest {

	   private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	    @BeforeEach
	    void setUp() {
	        System.setOut(new PrintStream(outputStreamCaptor));
	    }

	    @Test
	    void testBidderCreation() {
	        Bidder bidder = new Bidder("Alice");
	        assertEquals("Alice", bidder.getName());
	    }

	    @Test
	    void testUpdate() {
	        Bidder bidder = new Bidder("Bob");
	        bidder.update(200);
	        assertEquals("Bob has been notified of the new highest bid: $200", outputStreamCaptor.toString().trim());
	    }
}
