package BinaryTree;

import java.io.OutputStream;
import java.io.PrintStream;

public class Node {

    private Object value;
    private Node left = null;
    private Node right = null;

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }


    public String toStringPreOrder() {
        String out = "";
        out += value.toString();
        if(left != null)
            out += left.toStringPreOrder();
        if(right != null)
            out += right.toStringPreOrder();

        return out;
    }

    public String toStringInOrder() {
        String out = "";
        if(left != null)
            out += left.toStringInOrder();
        out += value.toString();
        if(right != null)
            out += right.toStringInOrder();

        return out;
    }

    public String toStringPostOrder() {
        String out = "";
        if(left != null)
            out += left.toStringPostOrder();
        if(right != null)
            out += right.toStringPostOrder();
        out += value.toString();

        return out;
    }


    public int getHeight() {
        int leftHeight = 0;
        int rightHeight = 0;

        if(left != null)
            leftHeight = left.getHeight();

        if(right != null)
            rightHeight = right.getHeight();

        return (Math.max(leftHeight, rightHeight) + 1);

    }




}

