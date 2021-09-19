package adt;

public interface DecisionTreeInterface<T> {

  public T getRootData();

  public boolean isEmpty();

  public void clear();

  /**
   * * Task: Gets the data in the current node. * * @return the data object in
   * the current node, or null if the current node is * null
   */
  public T getCurrentData();

  /**
   * * Task: Sets the data in the current node. Precondition: The current node
   * is * not null. * * @param newData the new data object
   */
  public void setCurrentData(T newData);

  /**
   * * Task: Sets the data in the children of the current node, creating them if
   * * they do not exist. Precondition: The current node is not null. * * @param
   * answerForNo the new data object for the left child * @param answerForYes
   * the new data object for the right child
   */
  public void setAnswers(T answerForNo, T answerForYes);

  /**
   * * Task: Sees whether the current node contains an answer. * * @return true
   * if the current node is a leaf, or false if it is a nonleaf
   */
  public boolean isAnswer();

  /**
   * * Task: Sets the current node to its left child. If the child does not
   * exist, * sets the current node to null. Precondition: The current node is
   * not null.
   */
  public void advanceToNo();

  /**
   * * Task: Sets the current node to its right child. If the child does not *
   * exist, sets the current node to null. Precondition: The current node is not
   * * null.
   */
  public void advanceToYes();

  /**
   * * Task: Makes the root of the tree the current node.
   */
  public void reset();
}
