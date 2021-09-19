
import samplecode.Node;

public class Exercise5_1 {

    public static void main(String[] args) {
        Node<String> node1 = new Node<>("Data");
        Node<String> node2 = new Node<>("Structures");
        Node<String> node3 = new Node<>("I");
        Node<String> node4 = new Node<>("love");

        node1.setNext(node2);
        Node<String> tempNode = node1;
        while (tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getNext();
        }
//        Second Part
        System.out.println("");
        node3.setNext(node4);
        node4.setNext(node1);

        for (tempNode = node3; tempNode != null; tempNode = tempNode.getNext()) {
            System.out.print(tempNode.getData() + " ");
        }

        found();
    }

    public static void found() {
        boolean found = false;
        System.out.println(!found);
    }
}
