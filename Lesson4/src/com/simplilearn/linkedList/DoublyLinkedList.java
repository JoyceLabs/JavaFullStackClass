package com.simplilearn.linkedList;

public class DoublyLinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next, previous;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.previous = null;
		if (head != null)
			head.previous = new_Node;
		head = new_Node;
	}
	
	void append(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;

		Node last = head;
		if (head == null) {
			new_node.previous = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.previous = last;
	}
	
	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.previous;
		}
	}
	public void InsertAfter(Node prev_Node, int new_data) {
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data);

		new_node.next = prev_Node.next;

		prev_Node.next = new_node;

		new_node.previous = prev_Node;

		if (new_node.next != null)
			new_node.next.previous = new_node;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.append(10);//null <- 10 -> null
		doublyLinkedList.append(20);// null <- 10 ->20 -> null
		doublyLinkedList.append(30);//null <- 10 ->20 -> 30 -> null
		doublyLinkedList.push(60);//null <- 60 <-10 ->20 -> 30 -> null
		doublyLinkedList.printlist(doublyLinkedList.head);
		doublyLinkedList.InsertAfter(doublyLinkedList.head.next, 100);//null <- 60 <-10 -> 100 ->20 -> 30 -> null
		doublyLinkedList.printlist(doublyLinkedList.head);
	}

}
