package adt;

import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeInterface<T> {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(T rootData) {
        root = new Node(rootData);
    }

    public boolean contains(T entry) {
        return getEntry(entry) != null;
    }

    public T getEntry(T entry) {
        return findEntry(root, entry);
    }

    private T findEntry(Node rootNode, T entry) {
        T result = null;

        if (rootNode != null) {
            T rootEntry = rootNode.data;

            if (entry.equals(rootEntry)) {
                result = rootEntry;
            } else if (entry.compareTo(rootEntry) < 0) {
                result = findEntry(rootNode.left, entry);
            } else {
                result = findEntry(rootNode.right, entry);
            }
        }
        return result;
    }

    public T add(T newEntry) {
        T result = null;

        if (isEmpty()) {
            root = new Node(newEntry);
        } else {
            result = addEntry(root, newEntry);
        }

        return result;
    }

    /**
     * Task: Adds newEntry to the nonempty subtree rooted at rootNode.
     */
    private T addEntry(Node rootNode, T newEntry) {
        T result = null;
        int comparison = newEntry.compareTo(rootNode.data);

        if (comparison == 0) {						// newEntry matches entry in root
            result = rootNode.data;
            rootNode.data = newEntry;
        } else if (comparison < 0) {				// newEntry < entry in root
            if (rootNode.left != null) {
                result = addEntry(rootNode.left, newEntry);
            } else {
                rootNode.left = new Node(newEntry);
            }
        } else {														// newEntry > entry in root
            if (rootNode.right != null) {
                result = addEntry(rootNode.right, newEntry);
            } else {
                rootNode.right = new Node(newEntry);
            }
        }
        return result;
    }

    public T remove(T entry) {
        ReturnObject oldEntry = new ReturnObject(null);

        Node newRoot = removeEntry(root, entry, oldEntry);

        root = newRoot;

        return oldEntry.get();
    }

    /**
     * Task: Removes an entry from the tree rooted at a given node.
     *
     * @param rootNode a reference to the root of a tree
     * @param entry the object to be removed
     * @param oldEntry an object whose data field is null
     * @return the root node of the resulting tree; if entry matches an entry in
     * the tree, oldEntry's data field is the entry that was removed from the
     * tree; otherwise it is null
     */
    private Node removeEntry(Node rootNode, T entry, ReturnObject oldEntry) {
        if (rootNode != null) {
            T rootData = rootNode.data;
            int comparison = entry.compareTo(rootData);

            if (comparison == 0) {      // entry == root entry
                oldEntry.set(rootData);
                rootNode = removeFromRoot(rootNode);
            } else if (comparison < 0) {  // entry < root entry
                Node leftChild = rootNode.left;
                Node subtreeRoot = removeEntry(leftChild, entry, oldEntry);
                rootNode.left = subtreeRoot;
            } else {                      // entry > root entry
                Node rightChild = rootNode.right;
                rootNode.right = removeEntry(rightChild, entry, oldEntry);
            }
        }

        return rootNode;
    }

    /**
     * Task: Removes the entry in a given root node of a subtree.
     *
     * @param rootNode the root node of the subtree
     * @return the root node of the revised subtree
     */
    private Node removeFromRoot(Node rootNode) {
        // Case 1: rootNode has two children
        if (rootNode.left != null && rootNode.right != null) {
            // find node with largest entry in left subtree
            Node leftSubtreeRoot = rootNode.left;
            Node largestNode = findLargest(leftSubtreeRoot);

            // replace entry in root
            rootNode.data = largestNode.data;

            // remove node with largest entry in left subtree
            rootNode.left = removeLargest(leftSubtreeRoot);
        } // end if
        // Case 2: rootNode has at most one child
        else if (rootNode.right != null) {
            rootNode = rootNode.right;
        } else {
            rootNode = rootNode.left;
        }

        // Assertion: if rootNode was a leaf, it is now null
        return rootNode;
    }

    /**
     * Task: Finds the node containing the largest entry in a given tree.
     *
     * @param rootNode the root node of the tree
     * @return the node containing the largest entry in the tree
     */
    private Node findLargest(Node rootNode) {
        if (rootNode.right != null) {
            rootNode = findLargest(rootNode.right);
        }

        return rootNode;
    }

    /**
     * Task: Removes the node containing the largest entry in a given tree.
     *
     * @param rootNode the root node of the tree
     * @return the root node of the revised tree
     */
    private Node removeLargest(Node rootNode) {
        if (rootNode.right != null) {
            Node rightChild = rootNode.right;
            Node root = removeLargest(rightChild);
            rootNode.right = root;
        } else {
            rootNode = rootNode.left;
        }

        return rootNode;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    @Override
    public Iterator<T> getInorderIterator() {
        return new InorderIterator();
    }

    @Override
    public Iterator<T> getPreorderIterator() {
        return new PreorderIterator();
    }

    @Override
    public Iterator<T> getPostorderIterator() {
        return new PostorderIterator();
    }

    @Override
    public T getSmallestValue() {
        if (!isEmpty()) {
            return findMinNode(root).data;
        } else {
            return null;
        }
    }

    private Node findMinNode(Node rootNode) {
        if (rootNode.left != null) {
            rootNode = findMinNode(rootNode.left);
        }
        return rootNode;
    }

    // ReturnObject is the type for method removeEntry's 3rd parameter, oldEntry,
    // which is used for returning the removed entry
    private class ReturnObject {

        private T item;

        private ReturnObject(T entry) {
            item = entry;
        }

        public T get() {
            return item;
        }

        public void set(T entry) {
            item = entry;
        }
    }

    private class Node {

        private T data;
        private Node left;
        private Node right;

        private Node() {
            this(null);
        }

        private Node(T dataPortion) {
            this(dataPortion, null, null);
        }

        private Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        private boolean isLeaf() {
            return (left == null) && (right == null);
        }

    }

    private class InorderIterator implements Iterator<T> {

        private QueueInterface<T> queue = new ArrayQueue<>();

        public InorderIterator() {
            inorder(root);
        }

        private void inorder(Node treeNode) {
            if (treeNode != null) {
                inorder(treeNode.left);
                queue.enqueue(treeNode.data);
                inorder(treeNode.right);
            }
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }

        public T next() {
            if (!queue.isEmpty()) {
                return queue.dequeue();
            } else {
                return null;
            }
        }

    }

    private class PreorderIterator implements Iterator<T> {

        private QueueInterface<T> queue = new ArrayQueue<>();

        public PreorderIterator() {
            preorder(root);
        }

        private void preorder(Node treeNode) {
            if (treeNode != null) {
                queue.enqueue(treeNode.data);
                preorder(treeNode.left);
                preorder(treeNode.right);
            }
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }

        public T next() {
            if (!queue.isEmpty()) {
                return queue.dequeue();
            } else {
                return null;
            }
        }
    }

    private class PostorderIterator implements Iterator<T> {

        private QueueInterface<T> queue = new ArrayQueue<>();

        public PostorderIterator() {
            postorder(root);
        }

        private void postorder(Node treeNode) {
            if (treeNode != null) {
                postorder(treeNode.left);
                postorder(treeNode.right);
                queue.enqueue(treeNode.data);
            }
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }

        public T next() {
            if (!queue.isEmpty()) {
                return queue.dequeue();
            } else {
                return null;
            }
        }
    }
}
