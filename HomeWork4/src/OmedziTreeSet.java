public class OmedziTreeSet<E> {
    private int size;
    private Node root = null;
    private class Node {
        public E elem;
        public Node left = null;
        public Node right = null;
        public Node(E elem) {
            this.elem =  elem;
        }
    }

    public void add(E elem) {
        if (root == null) {
            root = new Node(elem);
        } else if (!contains(elem)) {
            addHelper(root, elem);
        }
    }
    private E addHelper(Node node, E elem) {
        Comparable<? super E> k = (Comparable<? super E>) elem;
        int cmp = k.compareTo(node.elem);
        if (cmp < 0) {
            if (node.left == null) {
                node.left = new Node(elem);
                size++;
                return null;
            }
            return addHelper(node.left, elem);
        }
        if (cmp > 0) {
            if (node.right == null) {
                node.right = new Node(elem);
                size++;
                return null;
            }
            return addHelper(node.right, elem);
        }
        node.elem = elem;
        return null;
    }
    public E get(Object element) {
        Node node = findNode(element);
        if (node == null) return null;
        return node.elem;
    }
    public boolean contains(Object o) {
        Node node = findNode(o);
        if (node == null) return false;
        return true;
    }
    private Node findNode(Object o) {
        Comparable<E> e = (Comparable<E>) o;
        Node node = root;
        while (node != null) {
            int cmp = e.compareTo(node.elem);
            if (cmp < 0) {
                node = node.left;
            }
            if (cmp > 0) {
                node = node.right;
            }
            if (cmp == 0) return node;
        }
        return null;
    }
    private Node findParent(Object o) {
        Comparable<E> e = (Comparable<E>) o;
        Node node = root;
        Node parent = root;
        while (node != null) {
            int cmp = e.compareTo(node.elem);
            if (cmp < 0) {
                parent = node;
                node = node.left;
            }
            if (cmp > 0) {
                parent = node;
                node = node.right;
            }
            if (cmp == 0) return parent;
        }
        return null;
    }
    public E remove(Object o) {
        E oldElem = get(o);
        if (o == root.elem) root = delRecursive(o);
        else {
            delRecursive(o);
        }
        return oldElem;

    }
    private Node delRecursive(Object o) {
        Node node = findNode(o);
        Node parent = findParent(o);
        if (node.left == null && node.right == null) {
            if ( node == parent.left) parent.left = null;
            if ( node == parent.right) parent.right = null;
            size--;
            return parent;
        }
        if (node.right == null) {
            if ( node == parent.left) parent.left = node.left;
            if ( node == parent.right) parent.right = node.left;
            size--;
            return parent;
        }
        if (node.left == null) {
            if ( node == parent.left) parent.left = node.right;
            if ( node == parent.right) parent.right = node.right;
            size--;
            return parent;
        }
        Node tempNode = findSmallest(node.right);
        delRecursive(tempNode.elem);
        node.elem = tempNode.elem;
        return parent;
    }
    private Node findSmallest(Node node) {
        if (node.left == null) return node;
        else {
            return findSmallest(node.left);
        }
    }
    public void printOmedziTree() {
        printHelper(root);
        System.out.println("_________________________");
    }
    public void printHelper(Node node) {
        if (node.left != null) printHelper(node.left);
        System.out.println(node.elem);
        if (node.right != null)printHelper(node.right);
    }
}