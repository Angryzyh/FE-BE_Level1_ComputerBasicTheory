package com.angryzyh;

/**
 * Singly linked list类释义
 *
 * @author Angryzyh
 * @since 2022 -06-17 12:36:00
 */
public class SinglyLinkedList {
    private final Node head = new Node(0, null, null);

    /**
     * Add 函数释义.
     *
     * @param node 入参释义
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
//添加节点
    public void add(Node node) {
        Node temp = head;
        //找到最后跳出循环
        //判断是否找到最后一个节点
        while (temp.next != null) {
            //没有找到最后，temp后移一位
            temp = temp.next;
        }
        //最后一个节点的next指向要添加的节点
        temp.next = node;
    }

    /**
     * Modify 函数释义.
     *
     * @param node 入参释义
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
//修改节点,根据id修改
    public void modify(Node node) {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
        }
        Node temp = head.next;
        boolean flag = false;
        while (temp != null) {
            if (temp.id.equals(node.id)) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.data = node.data;
        } else {
            System.out.printf("没有找到编号 %d 的节点\n", node.id);
        }
    }


    /**
     * Delete 函数释义.
     *
     * @param id 入参释义
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
//删除节点
    public void delete(Integer id) {
        Node temp = head;
        boolean flag = false;
        while (temp.next != null) {
            if (temp.next.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("不存在该节点 %d ，请重新尝试！", id);
        }
    }

    /**
     * List 函数释义.
     *
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
//遍历单链表
    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
        }
        //将临时变量接管链表
        Node temp = head.next;
        while (true) {
            //判断当前节点是否为存在，如果不存在跳出循环
            if (temp == null) {
                break;
            }
            //如果存在，输出节点
            System.out.println(temp);
            //指针后移，寻找下一个节点
            temp = temp.next;
        }
    }

    /**
     * Add by id 函数释义.
     *
     * @param node 入参释义
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
//根据id排序添加
    public void addById(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            //判断是否找到最后一个节点
            if (temp.next == null) {
                //找到最后跳出循环
                break;
            }
            //判断temp.next的节点的id 是否大于 要插入的节点id如果大于就跳出循环
            if (temp.next.id > node.id) {
                break;
            } else if (temp.next.id == node.id) {
                flag = true;//说明编号已经存在
                break;
            }
            //没有找到最后，temp后移一位
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("准备插入的英雄编号 %d 已经存在了,不能加入\n", node.id);
        } else {
            //新加入的节点的指针指向,temp的下一个节点
            node.next = temp.next;
            //temp的指针  指向新的节点
            temp.next = node;
        }
    }


    //获取单链表节点个数（不包含头节点）

    /**
     * Get length 函数释义.
     * @param a 入参释义
     * @return {@link int} 出参释义
     * @author Angryzyh
     * @since 2022 -06-17 12:35:25
     */
    public int getLength(int a) {
        return a;
    }

}

