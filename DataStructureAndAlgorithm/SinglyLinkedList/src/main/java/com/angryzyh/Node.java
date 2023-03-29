package com.angryzyh;

import java.util.Objects;

public class Node {
    public Integer id;
    public Object data;
    public Node next;

    public Node() {
    }

    public Node(Integer id, Object data) {
        this.id = id;
        this.data = data;
    }

    public Node(Integer id, Object data, Node next) {
        this.id = id;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", data=" + data+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(id, node.id) && Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }
}
