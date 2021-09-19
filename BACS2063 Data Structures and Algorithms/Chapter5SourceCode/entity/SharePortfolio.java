package entity;

import adt.LinkedQueue;
import adt.QueueInterface;
import java.util.Iterator;

/**
 * SharePortfolio.java An entity class that represents a SharePortfolio. This
 * class is extended from Frank M. Carrano's StockLedger as follows: 
 * a. Refactored identifier names to local context. 
 * b. Added the following two methods to illustrate the use of iterators:
 *    - countTotalUnitShares()
 *    - getSharePortfolioCapital()
 *
 * @author Frank M. Carrano, Kat Tan
 * @version 3.0
 */
public class SharePortfolio {

  private QueueInterface<SharePurchase> portfolio;

  public SharePortfolio() {
    portfolio = new LinkedQueue<SharePurchase>();
  }

  /**
   * * Task: Records a stock purchase in the portfolio.
   *
   * *
   * @param sharesBought the number of shares purchased
   * @param pricePerShare the price per share
   */
  public void buy(int sharesBought, double pricePerShare) {
    for (; sharesBought > 0; sharesBought--) {
      SharePurchase purchase = new SharePurchase(pricePerShare);
      portfolio.enqueue(purchase);
    }
  }

  /**
   * * Task: Removes from the portfolio any shares that were sold and computes
   * the capital gain or loss. * * @param sharesSold the number of shares sold
   *
   *
   * @param pricePerShare the price per share * @return the capital gain (loss)
   */
  public double sell(int sharesSold, double pricePerShare) {
    double saleAmount = sharesSold * pricePerShare;
    double totalCost = 0;
    while (sharesSold > 0) {
      SharePurchase share = portfolio.dequeue();
      double shareCost = share.getCostPerShare();
      totalCost = totalCost + shareCost;
      sharesSold--;
    }
    return saleAmount - totalCost; // profit or loss  
  }

  public int countTotalUnitShares() {
    Iterator<SharePurchase> iterator = portfolio.getIterator();
    int numberOfUnits = 0;
    while (iterator.hasNext()) {
      iterator.next();
      numberOfUnits++;
    }
    return numberOfUnits;
  }

  public double getSharePortfolioCapital() {
    Iterator<SharePurchase> iterator = portfolio.getIterator();
    double capital = 0.0;
    while (iterator.hasNext()) {
      capital += iterator.next().getCostPerShare();
    }
    return capital;
  }
}
