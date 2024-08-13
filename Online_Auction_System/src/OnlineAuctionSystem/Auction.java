package OnlineAuctionSystem;

//Auction.java
import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
 private List<Observer> bidders;
 private String auctionEvent;

 public Auction() {
     this.bidders = new ArrayList<>();
 }

 @Override
 public void subscribe(Observer observer) {
     bidders.add(observer);
     System.out.println(observer + " has subscribed to auction notifications.");
 }

 @Override
 public void unsubscribe(Observer observer) {
     bidders.remove(observer);
     System.out.println(observer + " has unsubscribed from auction notifications.");
 }

 @Override
 public void notifyObservers() {
     for (Observer bidder : bidders) {
         bidder.update(auctionEvent);
     }
 }

 public void setAuctionEvent(String auctionEvent) {
     this.auctionEvent = auctionEvent;
     notifyObservers();
 }
}

