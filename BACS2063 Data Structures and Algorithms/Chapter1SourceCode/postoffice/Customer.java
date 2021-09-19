package postoffice;


import java.util.*;

/**
 * Customer.java An entity class that represents a customer at the post office.
 * @author Kat Tan
 * @version 1.0
 */
public class Customer {

  private int seqNo;
  private Calendar arrTime;
  private Calendar serveTime;
  private int counter;

  public Customer(int seqNo) {
    this.seqNo = seqNo;
    this.arrTime = new GregorianCalendar();
  }

  public int getSeqNo() {
    return seqNo;
  }

  public int getCounter() {
    return counter;
  }

  public void setServeTime(Calendar serveTime) {
    this.serveTime = serveTime;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public static String getTime(Calendar time) {
    return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
            time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
  }

  public int getWaitingTime() {
    return (int) ((serveTime.getTimeInMillis() - arrTime.getTimeInMillis()) / 1000);
  }

  public String toString() {
    return String.format("%-12d %-23s %-27s %-20s",
            seqNo, getTime(arrTime), getTime(serveTime), "Counter " + counter);
  }

}
