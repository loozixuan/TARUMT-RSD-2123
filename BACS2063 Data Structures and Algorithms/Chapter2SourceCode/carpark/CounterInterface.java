package carpark;

/**
 * CounterInterface.java An interface to represent a counter object.
 * @author Kat Tan
 * @version 1.0
 */
public interface CounterInterface {

  public int read();

  public void reset();

  public void increment();

  public void decrement();
}
