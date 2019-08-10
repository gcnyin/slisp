package com.github.rigophypheriveri.slisp.compiler.instructions.node.binary;

import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;

public abstract class BinaryNode extends Node {
    protected Node node1;
    protected Node node2;

    public BinaryNode(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    public BinaryNode() {
    }
}
