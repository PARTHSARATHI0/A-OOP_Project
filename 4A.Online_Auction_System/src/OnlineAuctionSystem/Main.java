package OnlineAuctionSystem;

//Main.java
public class Main {
 public static void main(String[] args) {
     Auction auction = new Auction();

     // Create bidders
     Bidder bidder1 = new Bidder("Bidder 1");
     Bidder bidder2 = new Bidder("Bidder 2");
     Bidder bidder3 = new Bidder("Bidder 3");

     // Bidders subscribe to auction notifications
     auction.subscribe(bidder1);
     auction.subscribe(bidder2);

     // Auction events
     auction.setAuctionEvent("Auction for item ABC started.");
     auction.setAuctionEvent("Bidder 1 placed a bid.");

     // Bidder 3 subscribes to auction notifications
     auction.subscribe(bidder3);

     // Another auction event
     auction.setAuctionEvent("Auction for item ABC ended.");

     // Bidder 1 unsubscribes from auction notifications
     auction.unsubscribe(bidder1);

     // Final auction event
     auction.setAuctionEvent("Auction closed.");
 }
}
