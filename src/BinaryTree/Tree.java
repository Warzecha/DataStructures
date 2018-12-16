package BinaryTree;

import java.io.OutputStream;
import java.io.PrintStream;

public class Tree {

    private Node head = null;

    public Tree(Node h) {
        head = h;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public String toStringPreOrder() {
        return head.toStringPreOrder();
    }

    public String toStringInOrder() {
        return head.toStringInOrder();
    }

    public String toStringPostOrder() {
        return head.toStringPostOrder();
    }

    public int getHeight() {
        return head.getHeight();
    }

}
