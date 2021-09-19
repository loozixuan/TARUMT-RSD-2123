package carpark;

/**
 * Counter.java Implementation class for a counter object.
 * @author Kat Tan
 * @version 1.0
 */
public class Counter implements CounterInterface {

  private int count;

  public Counter() {
    count = 0;
  }

  public int read() {
    return count;
  }

  public void reset() {
    count = 0;
  }

  public void increment() {
    count++;
  }

  public void decrement() {
    if (count > 0) {
      count--;
    }
  }
}
