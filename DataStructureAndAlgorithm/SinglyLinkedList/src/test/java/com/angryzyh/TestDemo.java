package com.angryzyh;

import org.junit.Test;

public class TestDemo {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    Node n1 = new Node(1, "a");
    Node n2 = new Node(2, "b");
    Node n3 = new Node(3, "hello");
    Node n4 = new Node(4, 3.14f);
    Node n5 = new Node(5, '啊');
    Node n6 = new Node(6, true);
    Node n23 = new Node(23, true);
    Node n45 = new Node(45, true);
    Node n136 = new Node(136, true);

    @Test
    //测试添加
    public void testAdd() {
        singlyLinkedList.add(n1);
        singlyLinkedList.add(n2);
        singlyLinkedList.add(n3);
        singlyLinkedList.add(n4);
        singlyLinkedList.add(n5);
        singlyLinkedList.add(n6);
        singlyLinkedList.list();
    }

    @Test
    //测试根据id大小顺序添加
    public void testAddById() {
        singlyLinkedList.addById(n45);
        singlyLinkedList.addById(n5);
        singlyLinkedList.addById(n3);
        singlyLinkedList.addById(n136);
        singlyLinkedList.addById(n6);
        singlyLinkedList.addById(n23);
        singlyLinkedList.addById(n2);
        singlyLinkedList.addById(n4);
        singlyLinkedList.addById(n1);
        singlyLinkedList.list();
    }

    @Test
    //测试修改方法
    public void testModify() {
        singlyLinkedList.add(n1);
        singlyLinkedList.add(n2);
        singlyLinkedList.add(n3);
        singlyLinkedList.add(n4);
        singlyLinkedList.add(n5);
        singlyLinkedList.add(n6);
        singlyLinkedList.list();
        System.out.println("============================");
        singlyLinkedList.modify(new Node(3, "被修改后的n3"));
        singlyLinkedList.list();
    }

    @Test
    //测试修改方法
    public void testDelete() {
        singlyLinkedList.add(n1);/*
        singlyLinkedList.add(n2);
        singlyLinkedList.add(n3);
        singlyLinkedList.add(n4);
        singlyLinkedList.add(n5);
        singlyLinkedList.add(n6);*/
        singlyLinkedList.list();
        System.out.println("删除后：============================");
        singlyLinkedList.delete(1);/*
        singlyLinkedList.delete(3);*/
        singlyLinkedList.list();
    }
}
