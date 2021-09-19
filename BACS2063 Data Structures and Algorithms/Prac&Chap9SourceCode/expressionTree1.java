
import adt.BinaryTree;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loo Zi Xuan P9Q1
 */
public class expressionTree1 {

    public static BinaryTree<String> buildExpTree(String postfixExpr) {
        Stack<BinaryTree<String>> myStack = new Stack<>();

        for (int i = 0; i < postfixExpr.length(); i++) {
            char ch = postfixExpr.charAt(i);
            if (!Character.isWhitespace(ch)) {
                if (isOperator(ch)) {
                    BinaryTree<String> rightSubtree = myStack.pop();
                    BinaryTree<String> leftSubtree = myStack.pop();
                    BinaryTree<String> subtreeRoot = new BinaryTree<>();
                    subtreeRoot.setTree(ch + "", leftSubtree, rightSubtree);
                    myStack.push(subtreeRoot);
                    System.out.println("operator " + ch);
                } else {
                    BinaryTree<String> operandTree = new BinaryTree<>();
                    operandTree.setTree(ch + "");
                    myStack.push(operandTree);
                    System.out.println("letter " + ch);
                }
            }
        }
        return myStack.pop();
    }

    public static boolean isOperator(char ch) {
        boolean isOperator = false;
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '=':
                isOperator = true;
                break;
        }
        return isOperator;
    }

    public static void main(String[] args) {
        BinaryTree<String> exprTree = buildExpTree("ab+c*");
        System.out.println("\nPostorder expression: ");
        exprTree.postorderTraverse();
    }
}
