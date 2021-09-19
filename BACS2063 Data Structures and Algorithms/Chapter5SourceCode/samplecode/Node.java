package samplecode;

public class Node<T> {

  private T data; // entry in list
  private Node next; // link to next node

  public Node(T data) {
    this.data = data;
    next = null;
  }

  public Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

}
