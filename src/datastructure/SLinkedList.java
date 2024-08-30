package datastructure;

public class SLinkedList<E> {
  private Node<E> head;
  private int size;

  public SLinkedList() {
    head = null;
    size = 0;
  }
  // 탐색, 삽입, 삭제 , size 를 구하는 메서드 구현
  int size() {
    return size;
  }

  void addFirst(E e){
    // 1단계
    Node<E> newNode = new Node<E>();
    newNode.e = e;
    newNode.next = head;
    // 2단계
    head = newNode;
    // 3단계
    size++;
  }


  private class Node<E> {
    E e;
    Node<E> next;
  }
}

