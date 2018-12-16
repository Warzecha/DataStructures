package BinaryTree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    Tree tree;


    Node A;
    Node B;
    Node C;
    Node D;
    Node E;
    Node F;
    Node G;
    Node H;
    Node I;

    @BeforeEach
    void setup()
    {
        A = new Node("A");
        B = new Node("B");
        C = new Node("C");
        D = new Node("D");
        E = new Node("E");
        F = new Node("F");
        G = new Node("G");
        H = new Node("H");
        I = new Node("I");

        F.setLeft(B);
        B.setLeft(A);
        B.setRight(D);
        D.setLeft(C);
        D.setRight(E);
        F.setRight(G);
        G.setRight(I);
        I.setLeft(H);

        tree = new Tree(F);
    }

    @org.junit.jupiter.api.Test
    void getHead() {
        assertSame(F, tree.getHead());
    }


    @org.junit.jupiter.api.Test
    void preOrderString() {

        assertEquals("FBADCEGIH", tree.toStringPreOrder());
    }

    @org.junit.jupiter.api.Test
    void inOrderString() {

        assertEquals("ABCDEFGHI", tree.toStringInOrder());
    }

    @org.junit.jupiter.api.Test
    void postOrderString() {

        assertEquals("ACEDBHIGF", tree.toStringPostOrder());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        assertEquals(4, tree.getHeight());
    }
}