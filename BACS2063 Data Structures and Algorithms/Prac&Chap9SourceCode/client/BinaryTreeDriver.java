package client;

// Note: For this driver program, the tree objects are of type BinaryTree instead of

import adt.BinaryTree;

//       BinaryTreeInterface in order to invoke the method postorderTraverse() which
//       is not included as an abstract method in BinaryTreeInterface
public class BinaryTreeDriver {

  public static void main(String[] args) {
    BinaryTree<String> dTree = new BinaryTree<String>();
    dTree.setTree("D");
    BinaryTree<String> fTree = new BinaryTree<String>();
    fTree.setTree("F");
    BinaryTree<String> gTree = new BinaryTree<String>();
    gTree.setTree("G");
    BinaryTree<String> hTree = new BinaryTree<String>();
    hTree.setTree("H");
    BinaryTree<String> emptyTree = new BinaryTree<String>();

    BinaryTree<String> eTree = new BinaryTree<String>();
    eTree.setTree("E", fTree, gTree);		// subtree rooted at E

    BinaryTree<String> bTree = new BinaryTree<String>();
    bTree.setTree("B", dTree, eTree);		// subtree rooted at B

    BinaryTree<String> cTree = new BinaryTree<String>();
    cTree.setTree("C", emptyTree, hTree);		// subtree rooted at C

    BinaryTree<String> aTree = new BinaryTree<String>();
    aTree.setTree("A", bTree, cTree);		// subtree rooted at A

    // display root
    System.out.println("Root of tree contains " + aTree.getRootData());

    // display nodes in postorder
    System.out.println("\nA postorder traversal visits nodes in this order: ");
    aTree.postorderTraverse();

  }
}
