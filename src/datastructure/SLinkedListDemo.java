package datastructure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    System.out.println(ll.size());
    ll.addFirst(10);
    System.out.println(ll.size());
    System.out.println(ll);

    SLinkedList<Integer> sll = new SLinkedList<>();
    System.out.println(sll.size());
    sll.addFirst(10);
    System.out.println(sll.size());
  }
}
